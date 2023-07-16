package com.example.barilliant.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.Model.Comment;
import com.example.barilliant.R;
import com.example.barilliant.Utilities.Constants;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder> {

    private List<Comment> commentsList;
    private FirebaseUser currentUser;
    private String songPosition;


    public CommentAdapter(List<Comment> commentsList,String songPosition) {
        this.commentsList = commentsList;
        this.currentUser = FirebaseAuth.getInstance().getCurrentUser();
        this.songPosition=songPosition;
    }

    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.comment_item, parent, false);
        return new CommentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Comment comment = commentsList.get(position);
        String userName=comment.getUserName();
        holder.en_LBL_userName.setText(userName+":");
        holder.en_LBL_comment.setText(comment.getComment());
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }

    public void addComment(String comment) {
        String userName = getCurrentUserName();

        Comment commentData = new Comment(userName, comment);

        DatabaseReference usersRef = FirebaseDatabase.getInstance().getReference()
                .child(Constants.DBKeys.USERS);

        usersRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot userSnapshot : dataSnapshot.getChildren()) {
                    String userId = userSnapshot.getKey();
                    DatabaseReference commentsRef = FirebaseDatabase.getInstance().getReference()
                            .child(Constants.DBKeys.USERS)
                            .child(userId)
                            .child(Constants.DBKeys.SONGS)
                            .child(songPosition)
                            .child(Constants.DBKeys.COMMENTS);

                    commentsRef.push().setValue(commentData);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle the error
            }
        });
    }


    private String getCurrentUserName() {
        if (currentUser != null) {
            if (currentUser.getEmail().equals(""))
                return currentUser.getPhoneNumber();
            else
                return currentUser.getEmail();
        }
        return "Unknown User";
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder {
        MaterialTextView en_LBL_userName;
        MaterialTextView en_LBL_comment;

        public CommentViewHolder(View itemView) {
            super(itemView);
            en_LBL_userName = itemView.findViewById(R.id.en_LBL_userName);
            en_LBL_comment = itemView.findViewById(R.id.en_LBL_comment);
        }
    }
}
