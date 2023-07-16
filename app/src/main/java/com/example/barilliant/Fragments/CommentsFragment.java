package com.example.barilliant.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.Adapters.CommentAdapter;
import com.example.barilliant.Model.Comment;
import com.example.barilliant.R;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


import java.util.ArrayList;
import java.util.List;

public class CommentsFragment extends Fragment {

    private RecyclerView recyclerViewComments;
    private CommentAdapter commentAdapter;
    private List<Comment> commentsList;
    private MaterialButton en_BTN_post;
    private AppCompatEditText en_ET_comment;
    private String songPosition;

    public CommentsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.comments_fragment, container, false);
    }

    public void setComments(List<Comment> comments) {
        commentsList.clear();
        commentsList.addAll(comments);
        commentAdapter.notifyDataSetChanged();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        if (bundle != null) {
            songPosition = bundle.getString("songPosition");
        }

        // Initialize RecyclerView and adapter
        recyclerViewComments = view.findViewById(R.id.recyclerViewComments);
        recyclerViewComments.setLayoutManager(new LinearLayoutManager(getContext()));
        commentsList = new ArrayList<>();
        commentAdapter = new CommentAdapter(commentsList,songPosition);
        recyclerViewComments.setAdapter(commentAdapter);

        // Add a comment
        en_BTN_post = view.findViewById(R.id.en_BTN_post);
        en_ET_comment = view.findViewById(R.id.en_ET_comment);
        en_BTN_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String comment = en_ET_comment.getText().toString().trim();
                if (!comment.isEmpty()) {
                    commentAdapter.addComment(comment);
                    en_ET_comment.setText("");
                }
            }
        });
    }
}
