package com.example.barilliant.Utilities;

import com.example.barilliant.Model.Song;

import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song()
                .setTitle("One More Light")
                .setYear(2017)
                .setImage("https://149361674.v2.pressablecdn.com/wp-content/uploads/2017/05/Music-Review-Linkin-Park.jpg")
                .setDuration(255)
                .setStreams(41)
                .setFavorite(true)
                .setId("0")
                .setAlbum("One More Light")
                .setArtist("Linkin Park")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=3kaUvGSLMew")
        );

        songs.add(new Song()
                .setTitle("Mr. Brightside")
                .setYear(2003)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeRpuZQcx7j5ayzLKeN-0mRUBQfPTXTeBaqw&usqp=CAU")
                .setDuration(223)
                .setStreams(526)
                .setFavorite(true)
                .setId("1")
                .setAlbum("Hot Fuss")
                .setArtist("The Killers")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=gGdGFtwCNBE")
        );
        songs.add(new Song()
                .setTitle("Hotline Bling")
                .setYear(2015)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTecy4lAk25p-l__qXLPu9uPjENjniAVRjcLg&usqp=CAU")
                .setDuration(267)
                .setStreams(1900)
                .setFavorite(false)
                .setId("2")
                .setAlbum("Views")
                .setArtist("Drake")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=uxpDa-c-4Mc")
        );

        songs.add(new Song()
                .setTitle("Kids")
                .setYear(2008)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4B1TEqL2CUxzmxhgJaY03Eqg6rBLuF6bpRw&usqp=CAU")
                .setDuration(210)
                .setStreams(173)
                .setFavorite(false)
                .setId("3")
                .setAlbum("Oracular Spectacular")
                .setArtist("MGMT")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=fe4EK4HSPkI")
        );
        songs.add(new Song()
                .setTitle("Smells Like Teen Spirit")
                .setYear(1991)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbAjxyOYHz4aLtd6lx5r28RR9DTo6h-Gg2oQ&usqp=CAU")
                .setDuration(301)
                .setStreams(1600)
                .setFavorite(true)
                .setId("4")
                .setAlbum("Nevermind")
                .setArtist("Nirvana")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=hTWKbfoikeg")
        );
        songs.add(new Song()
                .setTitle("Mrs. Robinson")
                .setYear(1968)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhWozt4mBMyctIOhbn4QoCBiPUrxn5PdhkoA&usqp=CAU")
                .setDuration(242)
                .setStreams(97)
                .setFavorite(false)
                .setId("5")
                .setAlbum("Bookends")
                .setArtist("Simon & Garfunkel")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=9C1BCAgu2I8")
        );
        songs.add(new Song()
                .setTitle("Good Riddance (Time of Your Life)")
                .setYear(1997)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQW0iju1n8_L7RSqwWD9bYPyLaudUDLsp7TPg&usqp=CAU")
                .setDuration(148)
                .setStreams(91)
                .setFavorite(false)
                .setId("6")
                .setAlbum("Nimrod")
                .setArtist("Green Day")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=CnQ8N1KacJc")
        );
        songs.add(new Song()
                .setTitle("Deep Purple")
                .setYear(1971)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaT0FQU50ON3wwyLGCVwFnbxERlqgfW786FQ&usqp=CAU")
                .setDuration(341)
                .setStreams(123)
                .setFavorite(false)
                .setId("7")
                .setAlbum("Machine Head")
                .setArtist("Green Day")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=zUwEIt9ez7M")
        );
        songs.add(new Song()
                .setTitle("Under The Bridge")
                .setYear(1992)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3QOIyGaYvLlU7u70LFCLoXS6erfQj3VYULA&usqp=CAU")
                .setDuration(264)
                .setStreams(261)
                .setFavorite(true)
                .setId("8")
                .setAlbum("Blood Sugar Sex Magik")
                .setArtist("Red Hot Chili Peppers")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=GLvohMXgcBo")
        );
        songs.add(new Song()
                .setTitle("Wake Me Up")
                .setYear(2013)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiz99rlwC4c76bwpu12U5e9O78zWxYwOCgew&usqp=CAU")
                .setDuration(249)
                .setStreams(2200)
                .setFavorite(false)
                .setId("9")
                .setAlbum("True")
                .setArtist("Avicii")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=IcrbM1l_BoI")
        );
        songs.add(new Song()
                .setTitle("Sorry, Blame It on Me")
                .setYear(2007)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlcnQspC6CBMHOsC7caiaDOdbhT1DUyco4uA&usqp=CAU")
                .setDuration(295)
                .setStreams(393)
                .setFavorite(true)
                .setId("10")
                .setAlbum("Konvicted")
                .setArtist("Akon")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=ynMk2EwRi4Q")
        );
        songs.add(new Song()
                .setTitle("Sunflower")
                .setYear(2018)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTf_BnqvfVqThj1SPEKGWq_MVBR41ltFSoWWw&usqp=CAU")
                .setDuration(158)
                .setStreams(2100)
                .setFavorite(false)
                .setId("11")
                .setAlbum("No Album")
                .setArtist("Post Malone, Swae Lee")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=ApXoWvfEYVU")
        );
        songs.add(new Song()
                .setTitle("Where Is My Mind?")
                .setYear(1988)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU_wbgAfm6CN3877d79CA8OQp2dL-TdAQi-g&usqp=CAU")
                .setDuration(233)
                .setStreams(12)
                .setFavorite(true)
                .setId("12")
                .setAlbum("Surfer Rosa")
                .setArtist("Pixies")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=OJ62RzJkYUo")
        );
        songs.add(new Song()
                .setTitle("Fix You")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqSzwpxd33c4Ued2GupN_MRspVzm5UPjaENw&usqp=CAU")
                .setDuration(277)
                .setStreams(593)
                .setFavorite(true)
                .setId("13")
                .setAlbum("X&Y")
                .setArtist("Coldplay")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=k4V3Mo61fJM")
        );
        songs.add(new Song()
                .setTitle("Big in Japan")
                .setYear(1984)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1RMv1gJt62x3_DKv7ufvxh59cX4ocsS3RAQ&usqp=CAU")
                .setDuration(232)
                .setStreams(47)
                .setFavorite(false)
                .setId("14")
                .setAlbum("Forever Young")
                .setArtist("Alphaville")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=tl6u2NASUzU")
        );
        songs.add(new Song()
                .setTitle("Welcome to the Black Parade")
                .setYear(2006)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKZ-qakcvNpqH_-_2_KBZr1p37ggqJpEqvwA&usqp=CAU")
                .setDuration(277)
                .setStreams(301)
                .setFavorite(false)
                .setId("15")
                .setAlbum("The Black Parade")
                .setArtist("My Chemical Romance")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=RRKJiM9Njr8")
        );
        songs.add(new Song()
                .setTitle("Stan")
                .setYear(2000)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShSKgG9LTP6T_ZplKJVhqVlfInR0riSuvH2g&usqp=CAU")
                .setDuration(404)
                .setStreams(126)
                .setFavorite(true)
                .setId("16")
                .setAlbum("The Marshall Mathers LP")
                .setArtist("Eminem")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=aSLZFdqwh7E")
        );
        songs.add(new Song()
                .setTitle("Little Wing")
                .setYear(1967)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRd0jUBuudbABiamxSrM4K4fvIn_rRxxxf64A&usqp=CAU")
                .setDuration(144)
                .setStreams(2)
                .setFavorite(false)
                .setId("17")
                .setAlbum("Axis: Bold as Love")
                .setArtist("Jimi Hendrix")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=ZUrPZmWBbPQ")
        );
        songs.add(new Song()
                .setTitle("Creep")
                .setYear(1992)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVGdG4bdI_7EvEorcEVaxlavSMwzDgXWcsvQ&usqp=CAU")
                .setDuration(241)
                .setStreams(850)
                .setFavorite(false)
                .setId("18")
                .setAlbum("Pablo Honey")
                .setArtist("Radiohead")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=XFkzRNyygfk")
        );
        songs.add(new Song()
                .setTitle("Like a Prayer")
                .setYear(1989)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTev_adf5QPRpjPTUaNEHxQEjISHF0YY9DLpg&usqp=CAU")
                .setDuration(319)
                .setStreams(257)
                .setFavorite(false)
                .setId("19")
                .setAlbum("Like a Prayer")
                .setArtist("Madonna")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=79fzeNUqQbQ")
        );
        songs.add(new Song()
                .setTitle("I Found a Way")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToX6GCU3Gm8EtldApjas1nIHiLaZUmKRxJuw&usqp=CAU")
                .setDuration(179)
                .setStreams(7)
                .setFavorite(true)
                .setId("20")
                .setAlbum("Telegraph")
                .setArtist("Drake Bell")
                .setInfo("Telegraph")
                .setYoutubeUrl("https://www.youtube.com/watch?v=mYMLFiBRD3U")
        );
        songs.add(new Song()
                .setTitle("Pumped Up Kicks")
                .setYear(2010)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgCA41SWq0pkjH8kOcNDtn1zXitZ2yxt8ZSg&usqp=CAU")
                .setDuration(240)
                .setStreams(964)
                .setFavorite(false)
                .setId("21")
                .setAlbum("Torches")
                .setArtist("Foster the People")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=SDTZ7iX4vTQ")
        );
        songs.add(new Song()
                .setTitle("Lego House")
                .setYear(2011)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOisBgDXsjQp3O8ZcwXqSckg4ce9Y9J-rGvg&usqp=CAU")
                .setDuration(183)
                .setStreams(315)
                .setFavorite(false)
                .setId("22")
                .setAlbum("+")
                .setArtist("Ed Sheeran")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=c4BLVznuWnU")
        );
        songs.add(new Song()
                .setTitle("Swimming Pools (Drank)")
                .setYear(2012)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeTwMsm18MzxhcPIwd4j9OJSRfQZbcBv64PA&usqp=CAU")
                .setDuration(247)
                .setStreams(166)
                .setFavorite(false)
                .setId("23")
                .setAlbum("Good Kid, M.A.A.D City")
                .setArtist("Kendrick Lamar")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=B5YNiCfWC3A")
        );
        songs.add(new Song()
                .setTitle("Song 2")
                .setYear(1997)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfDumtjWyEHOkgK-bF3LoKVvP4IUoICi8gZQ&usqp=CAU")
                .setDuration(122)
                .setStreams(167)
                .setFavorite(false)
                .setId("24")
                .setAlbum("Blur")
                .setArtist("Blur")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=SSbBvKaM6sk")
        );
        songs.add(new Song()
                .setTitle("Holiday")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkLlGxpnn4QQfUZRae8yevU_dJ7xXZSwImPQ&usqp=CAU")
                .setDuration(232)
                .setStreams(122)
                .setFavorite(true)
                .setId("25")
                .setAlbum("American Idiot")
                .setArtist("Green Day")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=A1OqtIqzScI")
        );
        songs.add(new Song()
                .setTitle("Cry Me A River")
                .setYear(2002)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcrcNjCW8hdjUG7uZywtvDWx9JD0pmEp5Wug&usqp=CAU")
                .setDuration(288)
                .setStreams(481)
                .setFavorite(false)
                .setId("26")
                .setAlbum("Justified")
                .setArtist("Justin Timberlake")
                .setInfo("")
                .setYoutubeUrl("https://www.youtube.com/watch?v=DksSPZTZES0")
        );
//        songs.add(new Song()
//                .setTitle("")
//                .setYear()
//                .setImage("")
//                .setDuration()
//                .setStreams()
//                .setFavorite(false)
//                .setId("25")
//                .setAlbum("")
//                .setArtist("")
//                .setInfo("")
//                .setYoutubeUrl("")
//        );

        return songs;
    }
}