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
                .setFavorite(false)
                .setId("0")
                .setAlbum("One More Light")
                .setArtist("Linkin Park")
                .setInfo("Behind the song \"One More Light\" by Linkin Park:\n" +
                        "\n" +
                        "The album \"One More Light\" was released in 2017 and ultimately became the band's last album, as lead vocalist Chester Bennington tragically took his own life a few months after its release, on what would have been Chris Cornell's 53rd birthday.\n" +
                        "\n" +
                        "The song was written about one of Chester's friends, Amy Zaret, who worked at Warner Brothers Studios and passed away earlier that year after battling cancer.\n" +
                        "\n" +
                        "The first verse addresses the feeling of losing someone you love and questions whether you did everything you could to help them. Did you truly appreciate the moments of joy and happiness you shared?\n" +
                        "\n" +
                        "The chorus serves as a critique of society, as there are currently 7 billion people living on Earth. Every day, we hear about millions of deaths through various media outlets. It often passes us by and doesn't concern us until it personally affects us through the loss of a close family member or friend. According to the song, it's only in such cases that we realize that every person is a whole world, and their loss is significant.\n" +
                        "\n" +
                        "The second verse explores the feeling of the day after, the day after that person passes away, and the emptiness and unfairness that arise. It conveys anger and a sense of injustice.\n" +
                        "\n" +
                        "Ultimately, the song likely served as a red flag regarding Chester's emotional state during that period. The suicide of Chris Cornell, which was previously mentioned, occurred two months before Chester's own suicide and likely exacerbated those feelings. There is a music video, which is a tribute performance to Chris Cornell by Linkin Park, you can see Chester crying during the song, struggling to finish it, and how deeply personal this loss affected him.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=3kaUvGSLMew")
        );

        songs.add(new Song()
                .setTitle("Mr. Brightside")
                .setYear(2003)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeRpuZQcx7j5ayzLKeN-0mRUBQfPTXTeBaqw&usqp=CAU")
                .setDuration(223)
                .setStreams(526)
                .setFavorite(false)
                .setId("1")
                .setAlbum("Hot Fuss")
                .setArtist("The Killers")
                .setInfo("\"Mr. Brightside\" by The Killers - The Story Behind the Song\n" +
                        "\n" +
                        "The Killers are an indie rock band formed in 2002 by lead vocalist Brandon Flowers and guitarist Dave Keuning. To date, the band has released four albums, and the song in question was released in 2003 as their first single. It was also included on the band's debut album.\n" +
                        "\n" +
                        "The song is influenced by a personal story of The Killers' lead singer, Brandon Flowers, who suspected his partner of infidelity. It portrays feelings of jealousy and paranoia while delivering an optimistic message.\n" +
                        "\n" +
                        "The first verse speaks about a man who separates from his significant other after a serious relationship. Typically, in such a situation, people tend to isolate themselves at home and not actively seek new directions. He talks about being ready to leave his \"cage\" for the first time and wanting to meet someone new. However, he wants to be sure before falling for someone again because he wants to start a new relationship.\n" +
                        "\n" +
                        "When he arrives at the place, he sees his ex-girlfriend kissing another man. This sight triggers thoughts of the betrayal he suspects and how the evening will unfold for her. Based solely on witnessing the kiss, his thoughts take him through a mental script where they continue their relationship and eventually go home together.\n" +
                        "\n" +
                        "It's important to note that this scenario is not actually happening, as he has no solid evidence for what the future holds. However, this is how he imagines the betrayal and how the thought of it affects him.\n" +
                        "\n" +
                        "The chorus delves into the central theme of the song - jealousy. It discusses how jealousy can drive a person to act, and even the most perfect individuals can sometimes succumb to it. It seems to be the price he must pay for his past mistakes and naivety. He continues to say that if it happened, it must have been the destiny of their relationship, and he needs to move on. In the end, this story has awakened him, and one can interpret an optimistic message that it's not the end of the world.\n" +
                        "\n" +
                        "The use of the phrase \"Mr. Brightside\" is ambiguous. It can refer to someone who always sees things positively, and in that sense, it could be interpreted as him falling asleep while being optimistic that it couldn't happen to him. However, it can also be seen from another perspective, where he intends to take the positive aspects of this separation and use the time to strengthen himself as an individual.\n" +
                        "\n" +
                        "Ultimately, I believe that everyone can interpret the song in different ways. Regardless of the interpretation, the final product is remarkable in my personal opinion.")
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
                .setInfo("Behind the song \"Hotline Bling\" by Drake:\n" +
                        "\n" +
                        "Drake is a highly successful Canadian-Jewish rapper and producer associated with some of the biggest hits in the hip-hop and American rap scene in recent years. He is also an avid basketball fan and holds shares in his hometown basketball team, the Toronto Raptors.\n" +
                        "\n" +
                        "\"Hotline Bling\" was released in 2015 as a bonus track on the album \"Views,\" which came out in 2016. It became Drake's best-selling song, reaching over 1.6 billion views on YouTube and currently ranks among the top 80 most-viewed videos on YouTube of all time. One of the reasons for the song's popularity is its music video, which spawned many parodies, including one featuring former US President Donald Trump. The video shows Drake dancing and singing the song.\n" +
                        "\n" +
                        "Drake, like many artists in the hip-hop world, is known for sampling other songs in his beats. Personally, I believe that every song should be original and not try to mimic another song. However, considering that Drake often takes relatively unknown songs and turns them into worldwide hits, it does transform the song into something else. Otherwise, the original song would not have received the same exposure.\n" +
                        "\n" +
                        "\"Hotline Bling\" is essentially a sample of a song called \"Why Can't We Live Together\" by Timmy Thomas, which was released in 1972 and was a major hit in the United States and the UK, reaching the top of the charts. However, when the song was first released, it was presented on the radio as a remix of the rap artist DRAM's song \"Cha Cha,\" which he had published earlier that year, due to their similarity. The song \"Cha Cha\" gained significant exposure following videos of Beyoncé dancing to the song in the background. It seemed like Drake's song would be overshadowed by it, but \"Hotline Bling\" ultimately prevailed.\n" +
                        "\n" +
                        "By the way, DRAM drew inspiration for \"Cha Cha\" from the song \"Star World\" featured in the Super Mario video game. It may seem a bit confusing, but it appears that in this chain, no song was entirely original on its own.\n" +
                        "\n" +
                        "The lyrics of the song talk about one of Drake's companions, rumored to be a girl named Nebby, whom he also mentioned in the songs \"Look What You've Done\" and \"Best I Ever Had.\" He was in love with her, and when she would call him in the middle of the night, he would drop everything and come to her. It becomes clear that he no longer receives those calls, and he starts to become jealous and wonder if she decided to replace him with someone else. Interestingly, if you pay attention to the way Drake created the song, the original song dealt with a person singing to their partner, asking why they can't live together and wanting to come back. In contrast, Drake, in his song, expresses his anger and mocks the girl for her behavior.\n" +
                        "\n" +
                        "Timmy Thomas's response to the sampling of his song was that he was glad his song was back in the spotlight, even if it was in different contexts than he intended in the original song. DRAM's response to the matter was that one time when he performed in Toronto, everything people talked about afterward was the similarities between the songs, and he didn't particularly like that, in his own words.\n" +
                        "\n" +
                        "Feel free to let us know in the comments which song you think is most similar in melody to \"Hotline Bling.\"")
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
                .setInfo("MGMT is a band that was formed in 2002 by the duo Ben Goldwasser and Andrew VanWyngarden under the name \"The Management.\" However, after releasing two demo albums, they discovered that there was already a band using that name, so they decided to change it to MGMT (an abbreviation of the name).\n" +
                        "\n" +
                        "The song \"Kids\" was released as the third and final single from the band's debut album. One of the things that contributed to its publicity was a music video created by students at South California University. The video was uploaded to YouTube without any commercial intentions, but it gained tens of millions of views and even led the band to invite those students to participate in the filming of another music video for a different single from the same album, \"Electric Feel.\" The song achieved commercial success, earned the band Grammy nominations, and even made it onto the playlist of the popular video game FIFA 2009.\n" +
                        "\n" +
                        "An interesting fact about the song is that former French President Nicolas Sarkozy used it in his election campaign without the band's permission. Afterward, he offered them a settlement agreement for the unauthorized use of the song in exchange for a nominal fee of one euro. The band was satisfied with the exposure the song received but still sued the political party, claiming that they presented an anti-piracy policy in their campaign without seeking permission to use the song. In the end, the band won the lawsuit and received $38,000.\n" +
                        "\n" +
                        "Now, let's dive into the story behind the song. \"Kids\" focuses on the quality of the environment and the damage humans inflict upon nature.\n" +
                        "\n" +
                        "The first verse tries to remind the listener of the childhood period when every child used to play outside in nature, in gardens and parks. The pride one feels for exploring the outside world is essentially for \"Mother Earth\" as they discover the world around them. This is the band's perception of how we should look at nature. Later on, the song addresses the damage humans cause to the quality of the environment, giving the example of using pesticides in agriculture to repel pests. Today's world demands immediate results without delay, without considering the consequences, driven by economic interests rather than what is good for nature.\n" +
                        "\n" +
                        "The chorus is simple and conveys the message of utilizing nature and only taking what is needed without being greedy and taking more than necessary.\n" +
                        "\n" +
                        "The second verse speaks about the short memory of humans. Humans have already proven in the past that they don't know how to manage the use of the world's resources properly, yet they still haven't learned from their mistakes. They think that it won't cause significant damage, but they will eventually discover that it does.\n" +
                        "\n" +
                        "The official music video also reflects the song's theme. In the video, a child is surrounded by monsters trying to capture him and reach out to him. This is essentially an imagery of how humans behave towards nature.\n" +
                        "\n" +
                        "In conclusion, everyone can interpret the song in their own way, but personally, regardless of the interpretation, the final product is amazing.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=fe4EK4HSPkI")
        );
        songs.add(new Song()
                .setTitle("Smells Like Teen Spirit")
                .setYear(1991)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbAjxyOYHz4aLtd6lx5r28RR9DTo6h-Gg2oQ&usqp=CAU")
                .setDuration(301)
                .setStreams(1600)
                .setFavorite(false)
                .setId("4")
                .setAlbum("Nevermind")
                .setArtist("Nirvana")
                .setInfo("\"The Anthem of an Entire Generation\" - Behind the song \"Smells Like Teen Spirit\" by Nirvana\n" +
                        "\n" +
                        "The song \"Smells Like Teen Spirit\" was released in 1991 and is the opening track of the second album by the American grunge band Nirvana, which was one of the biggest rock bands of the 90s.\n" +
                        "\n" +
                        "The title of the song was conceived after an evening when the band's frontman, Kurt Cobain, went out to spray graffiti on a pregnant girls' center in Seattle with Kathleen Hanna, the lead singer of the band \"Bikini Kill.\" After they did that, they continued to drink all night until they eventually arrived at Cobain's apartment, where he lost consciousness.\n" +
                        "\n" +
                        "During Cobain's state of unawareness, Kathleen wrote on the wall of his home the sentence \"Kurt Smells Like Teen Spirit,\" referring to the fact that at that time, Kurt was sleeping with his bandmate Tobi Vail, who used a deodorant called \"Teen Spirit.\" When Cobain regained consciousness, he saw the sentence written on the wall and thought it was a punk-rock expression of rebellion and anarchy (similar to the phrases they had sprayed earlier that evening). He decided to name the song he had written that way. Only after the song was released did he discover that the reference was actually to deodorant, and that his commercial endorsements increased dramatically as a result, which disappointed Cobain as he realized he had unwittingly advertised a commercial product.\n" +
                        "\n" +
                        "A few weeks before Nirvana entered the studio to record their second album, Cobain played the opening and chorus of the song to the rest of the band members. After bassist Krist Novoselic claimed it sounded silly, Cobain forced him and drummer Dave Grohl to play the opening of the song for an hour and a half until they eventually came up with a different version, making it the only song on the album that was written by all the band members.\n" +
                        "\n" +
                        "Cobain revealed that in creating the song, he was actually trying to imitate the Pixies, who often played quiet verses and loud choruses in their songs. In general, he aimed to create the \"ultimate pop song.\"\n" +
                        "\n" +
                        "The opening line of the song, \"Load up on guns, bring your friends,\" uses \"guns\" as a metaphor for drugs, referring to the drug use or other substances people consume.\n" +
                        "\n" +
                        "The opening line of the chorus, \"With the lights out, it's less dangerous,\" presents an argument that what you don't see won't harm you. It can also be interpreted as many people preferring to be in the dark to avoid noticing the flaws of their significant other (referring to love and sexual desire later in the chorus).\n" +
                        "\n" +
                        "The song concludes with the repeated words \"A denial,\" expressing Kurt's anger towards his generation, whom he believed were spoiled and focused on momentary pleasures, showing indifference to their surroundings. This also connects to the album's name, \"Nevermind,\" and its cover image, featuring a baby swimming after a dollar bill as if it were bait, symbolizing the pursuit of money and materialism from the moment we are born.\n" +
                        "\n" +
                        "In the music video for the song, a dancing janitor can be seen, which can be interpreted as a symbol for Cobain himself, who dropped out of high school and became the janitor.\n" +
                        "\n" +
                        "On August 27, 1991, the song was released as a single to radio stations as the lead single from the album. Although it did not achieve much success beyond Nirvana's fan base, with the release of the music video, it started gaining popularity on MTV and eventually became a worldwide hit. It was hailed as \"The Anthem of an Entire Generation\" along with the entire album.\n" +
                        "\n" +
                        "Despite (and perhaps because of) the song's immense success, Nirvana tried to play it as little as possible during live performances (as evidenced by its absence from the famous \"Unplugged\" performance). They claimed that they had many songs that were equally good or even better than it.")
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
                .setInfo("Behind the song \"Mrs. Robinson\" by Simon & Garfunkel\n" +
                        "\n" +
                        "Paul Simon and Art Garfunkel, known as Simon & Garfunkel, were a popular Jewish-American musical duo in the 1960s and were prominent figures in the folk rock genre.\n" +
                        "\n" +
                        "The song \"Mrs. Robinson\" was featured on the soundtrack of the 1967 film \"The Graduate\" and tells the story of Mrs. Robinson, an older woman who starts a romantic relationship with Benjamin Braddock, a recent college graduate. Mrs. Robinson's husband and Benjamin's parents were close friends, and shortly after the affair begins, her husband suggests that Benjamin date their daughter Elaine. Mrs. Robinson vehemently opposes this and forbids Benjamin from seeing her daughter, resulting in an agreement between them that Benjamin will deliberately ruin the date. Eventually, they end up kissing, and a romance also develops between Benjamin and Elaine. However, we will stop there in terms of the plot to avoid spoiling the movie for those who wish to watch it.\n" +
                        "\n" +
                        "Interestingly, in the popular Israeli TV show \"The Friends of Naor,\" there is an episode that serves as an homage to the film (link to the episode included at the end). For those interested, a shorter version of the episode is available to watch. The song itself appeared in the film in 1967, but the album it was featured on, \"Bookends,\" was released in 1968. Due to the success of the film, the song quickly climbed the charts.\n" +
                        "\n" +
                        "Ironically, despite the storyline we described in the film, the initial thought was that the song was written about Mrs. Robinson. However, the song was not written with the film's atmosphere in mind. In fact, it was originally intended to be called \"Mrs. Roosevelt\" after Eleanor Roosevelt, the wife of the 32nd President of the United States, Franklin D. Roosevelt, and the cousin of the 26th President of the United States, Theodore Roosevelt. The song was not intended for the film's purpose, but the film's director was not satisfied with the songs written by Simon & Garfunkel for the film and preferred to choose this song and change its name to that of one of the characters to fit the film.\n" +
                        "\n" +
                        "Eleanor Roosevelt was a dominant political figure in the United States who worked to promote women's rights and the rights of minorities. Many believed that she was the one who actually ran the country (sound familiar?). In 1920, her husband contracted a disease that paralyzed his legs, but despite that, Eleanor insisted that he continue his political career and not retire from it. In 1946, during his presidency, Franklin Roosevelt passed away, yet Eleanor continued her activism and represented the United States in the United Nations until she passed away in 1962 due to cancer.\n" +
                        "\n" +
                        "The song actually serves as a tribute and appreciation for Mrs. Roosevelt, who, despite all the difficulties along the way, remained steadfast in her path and served the country with dignity.\n" +
                        "\n" +
                        "The mention of the song to the former baseball player Joe DiMaggio, known as \"Jolting Joe,\" did not occur for a specific reason. According to Garfunkel, the mention was simply because the name fit the rhythm. However, after DiMaggio's death in 1993, Simon mentioned in another interview that the mention of DiMaggio was because he represented values on which the United States was built.\n" +
                        "\n" +
                        "Another interesting fact is that the song begins with about 30 seconds of whistling that includes the phrase \"toot, toot, toot.\" This was done because the original melody included an introduction, and to avoid leaving that part empty of lyrics, they filled it with whistling.")
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
                .setInfo("Behind the song \"Good Riddance (Time of Your Life)\" by Green Day\n" +
                        "\n" +
                        "The song \"Good Riddance,\" also known by its alternate title \"Time of Your Life,\" was written and composed by Billie Joe Armstrong, the lead vocalist and guitarist of the American punk rock band Green Day. It was released as part of their fifth album, \"Nimrod,\" in 1997.\n" +
                        "\n" +
                        "The song was actually written in 1993 after Armstrong experienced a difficult breakup with his girlfriend, Amanda, who left him and moved to Ecuador (several other songs by the band were written about her on their various albums, including \"She,\" \"Whatsername,\" and even the song \"Amanda\" on the album \"¡Dos!\" released in 2012, which expresses his apology to her years after their separation). Armstrong later played the song for the other band members during the recording sessions for their third album, \"Dookie,\" but it sounded too different from their other songs, and even the producer, Rob Cavallo, wasn't sure how to fit it into the album, so it was eventually left out.\n" +
                        "\n" +
                        "The song also failed to find its place on the band's next album, \"Insomniac,\" and was only released as a demo version as a B-side to the \"Brain Stew/Jaded\" double single, without achieving much success.\n" +
                        "\n" +
                        "It was only on their fifth album, \"Nimrod,\" that the song finally found its place. Armstrong decided to record it again, and the producer, Rob Cavallo (who had also worked with the band on their previous two albums), decided to add string instruments to the song. According to him, this decision, which took about half an hour to execute, made him realize that the song was going to be a big hit (which turned out to be true).\n" +
                        "\n" +
                        "Armstrong mentioned that when he wrote the song, he tried to be \"sarcastically bittersweet\" about Amanda's departure, although he was actually very angry about it. Therefore, he ultimately decided to name the song \"Good Riddance\" to express that anger that he couldn't express in the song itself.\n" +
                        "\n" +
                        "Because of its different nature compared to the band's other songs up until that point and the fact that it broke the band's promise never to release an acoustic song, many fans accused the band of selling out. This accusation was previously made about the album it was originally supposed to be released on, \"Dookie,\" which was their first album to be released on a major record label rather than an independent one, and was seen by many as a betrayal of the punk scene they came from. It even led to their banning from the club they used to perform at (which is mentioned in the song \"No Pride\" released on the album that followed). However, Green Day always continued to support the same community from which they emerged and did not turn their backs on it.\n" +
                        "\n" +
                        "After its release, \"Good Riddance (Time of Your Life)\" became the band's most successful single from the album and one of their biggest songs to date. It has been featured in numerous TV shows and even became part of the closing montage of the TV series \"Seinfeld,\" which aired in one of the episodes right before the series finale. Despite the song being about parting ways, it is now often played ironically at weddings and various events with a meaning opposite to separation.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=CnQ8N1KacJc")
        );
        songs.add(new Song()
                .setTitle("Smoke On The Water")
                .setYear(1971)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaT0FQU50ON3wwyLGCVwFnbxERlqgfW786FQ&usqp=CAU")
                .setDuration(341)
                .setStreams(123)
                .setFavorite(false)
                .setId("7")
                .setAlbum("Machine Head")
                .setArtist("Deep Purple")
                .setInfo("Behind the song \"Smoke on the Water\" by Deep Purple\n" +
                        "\n" +
                        "Deep Purple is a British rock band that was formed in 1968 by band members Ian Paice, Ritchie Blackmore, John Lord, and Nick Simper. The band is considered a pioneering force in the heavy metal genre and is one of the greatest rock bands of all time.\n" +
                        "\n" +
                        "The song \"Smoke on the Water\" was released in 1972 and is included in the album \"Machine Head.\" It is primarily known for its iconic guitar riff that appears at the beginning and after the chorus, which has become one of the most recognizable riffs in rock history.\n" +
                        "\n" +
                        "The original plan of the band was to record the album in the mobile studio of The Rolling Stones, which was located in the Montreux Casino complex. The song tells a true story that happened during a concert by Frank Zappa at the same casino and was supposed to be the last show before the place closed for a winter break, during which the band members were scheduled to start recording the album. At a certain point near the end of the concert, someone in the audience fired a flare gun towards the wooden ceiling, causing a massive fire to break out. The band members, who were in their hotel room at that time, witnessed the entire fire from there. Since their recording studio had burned down as a result of this incident, the band members had to search for a new location for about a week until they found the Grand Hotel in Montreux, where they turned the staircases and corridors of the hotel into a recording studio and recorded most of the songs for the album there.\n" +
                        "\n" +
                        "Ironically, the only song that was not fully recorded in that location was \"Smoke on the Water,\" as parts of its vocals were recorded elsewhere. In the end, the band decided to write a song about this bizarre story, and it became their most famous song.\n" +
                        "\n" +
                        "The chosen title, \"Smoke on the Water,\" is a metaphor for the massive smoke created by the fire around Lake Geneva, and the band members described it as the biggest fire they had ever seen in their lives.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=zUwEIt9ez7M")
        );
        songs.add(new Song()
                .setTitle("Under The Bridge")
                .setYear(1992)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3QOIyGaYvLlU7u70LFCLoXS6erfQj3VYULA&usqp=CAU")
                .setDuration(264)
                .setStreams(261)
                .setFavorite(false)
                .setId("8")
                .setAlbum("Blood Sugar Sex Magik")
                .setArtist("Red Hot Chili Peppers")
                .setInfo("Behind the song \"Under the Bridge\" by Red Hot Chili Peppers\n" +
                        "\n" +
                        "The band Red Hot Chili Peppers was formed in 1983 in Los Angeles, California, by four high school friends: Anthony Kiedis, Michael \"Flea\" Balzary, Hillel Slovak (who was born in Israel), and Jack Irons. Originally, they were called \"Tony Flow and the Miraculously Majestic Masters of Mayhem.\" The band was initially formed for a one-time performance at a local pub for an audience of 30 people, but due to the success of the show, they continued to perform afterwards, and after a few gigs, the members decided to change their name to \"Red Hot Chili Peppers.\"\n" +
                        "\n" +
                        "Slovak and Irons, who were also members of another band called \"?What is This,\" saw Red Hot Chili Peppers as a side project and left during the recording of their first album. However, they eventually returned for subsequent albums. The band achieved moderate success with those albums, but during that time, Kiedis and Slovak developed a severe addiction to cocaine and heroin, which caused producer Rick Rubin to refuse to work with them.\n" +
                        "\n" +
                        "On June 25, 1988, the band experienced their most difficult event when guitarist Hillel Slovak died from a heroin overdose. As a result, Kiedis fled to Mexico, Jack Irons left the band (and later joined Pearl Jam), and the future of the band was uncertain. After some time, Kiedis returned from Mexico, drug-free, and together with Flea, they began searching for new drummer and guitarist. Eventually, the band reestablished itself with guitarist John Frusciante (who was a dedicated fan of the band) and drummer Chad Smith, and they entered the studio to record their fourth album, \"Mother's Milk.\" The album became their most successful to that point, and several of its songs received extensive radio and MTV airplay, but their true breakthrough came with their next album, \"Blood Sugar Sex Magik.\"\n" +
                        "\n" +
                        "In 1990, the band hired producer Rick Rubin for their next album and he decided to record it differently than usual. He sent all the band members to live in a place called \"The Mansion\" that he owned and turned it into a recording studio. The period at The Mansion contributed greatly to the bonding between the band members.\n" +
                        "\n" +
                        "During the album's recording sessions, Rubin was flipping through Kiedis' notebook in search of new lyrics for the album and came across a different text that Kiedis had written. The lyrics told the story of Kiedis' difficult period when he was addicted to drugs, injecting drugs with strangers under a bridge. When Kiedis wrote the song, he felt that his bandmates, Flea and Frusciante, distanced themselves from him because they used to smoke marijuana together and ignored his difficult efforts to stay clean, making him feel that the city of Los Angeles was his only friend (as mentioned in the opening lines of the song). Kiedis emphasized in the song how much he didn't miss that period and that despite the feeling of loneliness, his new life without drugs was much better for him (as seen in the chorus of the song).\n" +
                        "\n" +
                        "Rubin was extremely enthusiastic about the new lyrics he read and asked Kiedis to show them to the rest of the band, but initially, Kiedis refused because he believed that the song \"didn't fit the band's vibe.\" Despite this, Kiedis eventually agreed to Rubin's request, and to his surprise, the other band members loved the song and started playing it together.\n" +
                        "\n" +
                        "On September 24, 1991, a few months after the completion of the recording and residence at The Mansion, the band's fifth album, \"Blood Sugar Sex Magik,\" was released on the same day as Nirvana's breakthrough album, \"Nevermind.\" The album achieved even greater success than its predecessors, selling millions of copies and establishing Red Hot Chili Peppers as one of the world's biggest rock bands. The song \"Under the Bridge,\" which the band did not expect to have much success, became a huge hit and remains one of their most recognizable and beloved songs to this day.\n" +
                        "\n" +
                        "Although nearly 30 years have passed since the song's release, Kiedis still refuses to disclose the exact location of the bridge he wrote about.")
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
                .setAlbum("false")
                .setArtist("Avicii")
                .setInfo("Today marks 7 years since the release of the famous song \"Wake Me Up\" by Avicii, and in honor of the occasion, we decided to dedicate this post to him.\n" +
                        "\n" +
                        "Tim Bergling, better known as Avicii, was a Swedish DJ and music producer who was one of the leading figures in the world of electronic music. Like other artists, he tragically passed away at a young age and became associated with the infamous \"27 Club\" (dying at the age of 28), which includes a list of many talented artists who met their demise at the age of 27, such as Kurt Cobain, Amy Winehouse, Jimi Hendrix, and Jim Morrison, among others.\n" +
                        "\n" +
                        "A few years ago, a documentary film was released about Avicii's life, titled \"Avicii: True Stories,\" which, in my personal opinion, is a must-watch. The film explores his life from his childhood, through his touring and the crises he faced. It portrays the decline in his well-being and how he continued to perform despite no longer enjoying it. The documentary presents a person who simply wanted to create music that people could enjoy. Avicii found solace in alcohol and reached a point where he had to drink before every performance just to be able to enjoy it. During one of his tours before a show in Australia, he didn't feel well and was hospitalized due to inflammation of the gallbladder. That's when he was told he had to stop drinking.\n" +
                        "\n" +
                        "From that moment on, Avicii began to suffer from the very existence of performances and decided to stop the tour immediately. He had to pay significant compensation and incurred substantial financial losses, in addition to not generating any income. I personally attended one of his concerts in my country in July 2016, and I was disappointed that he had a relatively short set in which I felt he only performed his well-known songs. It was only after watching the documentary that I understood why the concert was so short, and it did bother me to some extent that I contributed to someone doing something they didn't truly want to do.\n" +
                        "\n" +
                        "In the end, after the tour, Avicii returned to producing music from home. His income and fame decreased significantly, and his close circle gradually distanced themselves from him because when there's treasure, everyone wants to put their hands on it, but when the ship sinks, everyone will jump off. Avicii felt lonely and disappointed, which likely led him to put an end to his life.\n" +
                        "\n" +
                        "A year after his death in April 2019, it was announced that an album titled \"TIM\" would be released later that year, which Avicii had worked on before his death. One of the most well-known songs from that album is called \"SOS,\" which was likely written as an expression of distress. In the music video for the song released on YouTube, you can see comments from many fans around the world who loved and admired him, and how he changed their lives. One of the songs most associated with Avicii is \"The Nights,\" which he produced but did not write the lyrics for. The song speaks about the relationship between the singer's father, performing his parts, and his son, Nicholas \"Ras\" Furlong. The song contains a famous quote that is strongly associated with Avicii now after his death, which is: \"He said, 'One day you'll leave this world behind,' 'So live a life you will remember.'\"\n" +
                        "\n" +
                        "Indeed, Avicii left this world at a young age, but there's no doubt that in his short time, he fulfilled his dream and created music that many people enjoyed. He was one of the most influential and important musicians in the pop music scene over the past decade.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=IcrbM1l_BoI")
        );
        songs.add(new Song()
                .setTitle("Sorry, Blame It on Me")
                .setYear(2007)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlcnQspC6CBMHOsC7caiaDOdbhT1DUyco4uA&usqp=CAU")
                .setDuration(295)
                .setStreams(393)
                .setFavorite(false)
                .setId("10")
                .setAlbum("Konvicted")
                .setArtist("Akon")
                .setInfo("The rise and fall of the singer Akon -\n" +
                        "Behind the song \"Sorry, Blame It On Me\" by Akon\n" +
                        "\n" +
                        "Akon (or his full name, Aliaune Damala Badara Akon Thiam) is an R&B singer who was among the biggest in the world in the early 2000s. He was born in Senegal and later moved with his family to New Jersey in the United States.\n" +
                        "\n" +
                        "In 1999, Akon got involved in a situation that ultimately led him to spend three years in prison. In interviews, he mentioned being the leader of a car theft ring. Inspired by this experience, Akon wrote the song \"Locked Up,\" in which he talks about that period. He incorporates the sound of a prison cell door closing (which later became his signature sound, appearing in other songs, including the one we'll focus on in this post). In the music video for \"Locked Up,\" he is seen dressed as a prisoner. During his time in prison, Akon utilized the opportunity to work on his music. After his release, he had a major breakthrough when he was taken under the wing of music executive Devyne Stephens.\n" +
                        "\n" +
                        "Akon flourished and became one of the successful R&B artists between 2004 and 2008, achieving numerous accomplishments. His first two albums sold around 3 million copies, and many of his songs reached the top five on music charts worldwide, including \"Lonely,\" \"Smack That,\" \"I Wanna Love You,\" and \"Don't Matter.\" His second album received nominations in three different categories at the Grammy Awards, and he was the first and only artist at the time to simultaneously hold the number one and number two positions on the Billboard Hot 100 chart.\n" +
                        "\n" +
                        "The song \"Sorry, Blame It On Me\" was released in 2007 and was written in response to an incident that occurred during one of Akon's performances at a club in Trinidad. He engaged in a provocative dance with a fan on stage, only to later find out that she was a minor, just 15 years old. The incident generated significant public criticism worldwide and caused irreversible damage to Akon's career. Many sponsors, including Verizon, canceled their contracts with him, leading to the cancellation of planned performances and collaborations, such as with Gwen Stefani. Akon defended himself by claiming that he believed the club had a minimum age restriction of 21+ and that he didn't think there would be a minor in the audience. Ultimately, the club was closed following the incident.\n" +
                        "\n" +
                        "The song is divided into three verses, with each verse accepting blame for different things. In the first verse, Akon takes the blame for not being there for his wife and leaving her alone to raise their children while he traveled the world and performed. In the second verse, he accepts blame for the pain he caused to his mother by getting his brother involved in criminal activities and for the family falling apart after her divorce. In the third verse, he takes blame for the incident with the underage girl, expressing remorse for his actions and the embarrassment he caused her, but argues that responsibility should also fall on the club management and the parents of the young girl who allowed her to be in such places. At the end of the song, he says that despite thinking the blame should be on others, he takes it upon himself because he loves his fans.\n" +
                        "\n" +
                        "The song achieved great success, but Akon's popularity significantly declined afterward, with many attributing it to the incident. In 2010, he announced a hiatus from the music industry. During his break, numerous rumors circulated, including one suggesting he had died or returned to prison. In 2013, Akon made a comeback to the music scene, but without much success. He continues to release music to this day, although much of the public may not be aware of it. Additionally, in recent years, Akon has been involved in a project that provides electricity to 14 countries in Africa.")
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
                .setInfo("\"Sunflower\" is a song by Post Malone and Swae Lee. Austin Richard Post, known by his stage name Post Malone, is an American hip-hop artist, songwriter, and producer. He is widely recognized for his songwriting abilities and his unique style that blends various genres like country, R&B, alternative rock, and of course, hip-hop. Swae Lee is an American rapper, singer, and songwriter.\n" +
                        "\n" +
                        "The song \"Sunflower\" was released in late 2018 as the soundtrack for the film \"Spider-Man: Into the Spider-Verse.\" The movie tells the story of Miles Morales, a high school student who gets bitten by a radioactive spider and discovers that he has become Spider-Man. The plot becomes more complex when he realizes that he is not the only Spider-Man in the world, but I won't delve further to avoid spoiling it for those who haven't seen the film yet.\n" +
                        "\n" +
                        "The song achieved remarkable success, spending 33 weeks on the Billboard Hot 100 chart, including a spot in the top 10. It was one of only three songs to achieve this feat at the time.\n" +
                        "\n" +
                        "Now, let's explore the meaning behind the song title. \"Sunflower,\" which derives its name from the resemblance of the flower to the sun, is commonly known in Hebrew as \"Haman'ya\" (חמנייה), with its black seed-like fruits known as \"pituchim\" (פיצוחים). The history of the sunflower dates back to Greek mythology in the story of Apollo (the sun) and Clytie, a water nymph. Apollo was in love with Clytie, who happened to be his sister, and their forbidden romance led to complications. Clytie, jealous of her sister's relationship with Apollo, revealed their secret to their father. Upon hearing this, their father ordered Clytie to be burned alive. Apollo, enraged by Clytie's betrayal, refused to show her love in return. As punishment, Apollo transformed her into a sunflower, which forever turns its face toward the sun but cannot reach it. The sunflower became a symbol of steadfastness and longevity due to its ability to maintain its beauty despite growing in adverse environmental conditions that would hinder the growth of other flowers.\n" +
                        "\n" +
                        "So, why this long introduction? In the song, similar to the Greek mythology story, the sunflower symbolizes a person who displays perseverance despite a lack of reciprocated attention. Both artists speak about a person with whom they invest more effort in the relationship than they receive in return. Additionally, during its growth, the sunflower secretes substances into the soil that inhibit the growth of other plants. In the song, the artists convey that the person they are with constantly demands assistance and attention, and despite all their efforts, it is still not enough. Essentially, this person impedes their own growth.\n" +
                        "\n" +
                        "In an interview with Spring Aspers, the head of music at Sony Pictures (the company that produced the film), she described the song as both visual and emotional, precisely what a Spider-Man story needs. The song represents self-discovery, which aligns with Miles (Spider-Man) needing to uncover his hidden Spider-Man abilities.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=ApXoWvfEYVU")
        );
        songs.add(new Song()
                .setTitle("Where Is My Mind?")
                .setYear(1988)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU_wbgAfm6CN3877d79CA8OQp2dL-TdAQi-g&usqp=CAU")
                .setDuration(233)
                .setStreams(12)
                .setFavorite(false)
                .setId("12")
                .setAlbum("Surfer Rosa")
                .setArtist("Pixies")
                .setInfo("Pixies is an American alternative rock band. The band name was randomly chosen from the dictionary, and the definition of the word \"pixies\" is \"mischievous little elves.\" The band was active from 1986 to 1993, and although they didn't achieve significant commercial success during their active years, they were one of the most influential bands in the development of alternative rock. They had a profound impact on many bands that brought the genre to worldwide recognition, including Nirvana and Radiohead. Nirvana's frontman, Kurt Cobain, once quoted that his dream was for Nirvana to be like the Pixies. (You can read the post we wrote about it in the past.)\n" +
                        "\n" +
                        "The song \"Where Is My Mind\" was released in 1988 and gained recognition primarily due to the iconic guitar riff that appears at the beginning of the song and its inclusion in the famous film \"Fight Club\" (spoiler alert). In the film's closing scene, the main characters, Tyler Durden and Marla Singer, hold hands as they stand inside a building and watch as all the surrounding buildings explode and collapse, depicting the destruction of an entire city.\n" +
                        "\n" +
                        "Contrary to the song, the film was released in 1999, and it's important to note that \"Where Is My Mind\" had already garnered relative success before its inclusion in the movie, but its exposure in the film brought it wider publicity than it had previously received. In an interview with the band's guitarist, Joey Santiago, he revealed that the song's melody was written during a shared dinner with the band's frontman, Black Francis (Frank Black), where Francis introduced him to the melody he had composed. Upon hearing it, Santiago immediately stopped eating, grabbed a guitar, and joined in the writing process. In the same interview, Santiago also mentioned that, in his opinion, the song and scene in the movie constitute one of the best combinations ever made between a song and a film scene. According to him, the expectation for the scene, with an entire city crumbling, called for a high BPM song that would evoke a sense of destruction. It's precisely this contrast between the song's tempo and what happens in the scene that gives viewers a \"goosebumps\" effect. Personally, I agree with every word he said. Additionally, the song has received numerous accolades, and in Australia, it ranked at number 29 on the \"100 Greatest Songs of All Time\" chart.\n" +
                        "\n" +
                        "The song was inspired by a small Caribbean island that Francis encountered while scuba diving. One unofficial interpretation of the song is that the line \"way out in the water see it swimming\" refers to the performer's detachment from his former self. He became so disconnected from his previous version that he can only look at it from a distance. He was swept away so far to become who he is now. Ironically, this also relates to the story of the main protagonist in the film Fight Club.\n" +
                        "\n" +
                        "Another interpretation that exists regarding the song is that even the opening line, \"with your feet on the air and your head on the ground,\" describes the singer's confusion and disarray of thoughts, to the extent that he states the sentence in reverse. \"With your head in the clouds and your feet on the ground\" is the usual phrase, but he flips it around.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=OJ62RzJkYUo")
        );
        songs.add(new Song()
                .setTitle("Fix You")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqSzwpxd33c4Ued2GupN_MRspVzm5UPjaENw&usqp=CAU")
                .setDuration(277)
                .setStreams(593)
                .setFavorite(false)
                .setId("13")
                .setAlbum("X&Y")
                .setArtist("Coldplay")
                .setInfo("Coldplay is a British rock band that was formed in 1996 under the name \"Starfish.\" The name Coldplay belonged to a different band, friends of theirs, and when the original Coldplay band grew tired of their name, the members of Starfish (today's Coldplay) requested permission to take the name Coldplay in their place. The name Coldplay was taken from a collection of poems called \"Child's Reflections: Coldplay.\"\n" +
                        "\n" +
                        "Not many people know this, but the drummer Will Champion didn't actually know how to play drums and was brought into the band because he was a friend of the other members. At some point, when the band started gaining fame, mainly following the success of their song \"Yellow,\" he was fired with the claim that he wasn't skilled enough and up to the required standard. Later, he was reinstated with the argument that they didn't want the media and the praise to ruin them and that if that's how they became famous, then they should continue to exist that way.\n" +
                        "\n" +
                        "The song \"Fix You\" was released on September 5, 2005, as part of the band's third album called X&Y (named after the mathematical variables in an equation). The album became the best-selling album of 2005, with 8.3 million copies sold worldwide. The solo guitar that appears in the song is still used by the Montreal Canadiens hockey team to introduce players during home games, and the song was also played at the memorial service held by Apple for Steve Jobs after his death in 2011.\n" +
                        "\n" +
                        "According to most interpretations, the song was written by the band's lead vocalist, Chris Martin, dedicating it to his wife at the time and future ex-wife, actress Gwyneth Paltrow, following the death of her father several years prior. When writing the song, Chris wanted to use an organ from a church, and when he couldn't obtain one, he used an old keyboard that Gwyneth's father had bought shortly before his death. When he played it for the first time, its sounds entered him with inspiration, thus completing the circle.\n" +
                        "\n" +
                        "The central message that Chris tries to convey in the song is expressed in the chorus, where he states that he has no intention of trying to replace her father and step into his shoes, but he will try his best to compensate for the gap and be the \"guiding light\" for her and say that despite everything, everything will be alright.\n" +
                        "\n" +
                        "Personally, I think the content of the song, which speaks about dealing with difficulties and crises, has resonated with many people, and that's what made it so popular.\n" +
                        "\n" +
                        "The music video for the song, where Chris is seen wandering around London in a despondent state, is dedicated to the terrorist attacks that occurred on July 7, 2005, in London, where four suicide bombers simultaneously detonated bombs on major transportation routes in the London Underground. This attack was the deadliest in the UK in over 20 years, resulting in the death of over 50 people and injuring over 700. This story adds an additional tragic meaning to the song, which already holds a tragic significance.")
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
                .setInfo("The band Alphaville is a German synth-pop band that began its activity in the 1980s and is still active today. Their first hit song was \"Forever Young\" (ironically enough) and later changed their name to Alphaville. The name Alphaville was taken from a science fiction film with the same name released in 1965. The band has remained active since its formation and is considered one of the biggest pop bands of all time in the history of music.\n" +
                        "\n" +
                        "The song \"Big in Japan\" was released in 1984 and was the third song on Alphaville's debut album \"Forever Young.\" The title of the song was a kind of joke during that time. Many rock bands that were past their prime and no longer drawing crowds in the United States and Britain became popular in Japan. This phenomenon was also reflected in a documentary film released during that time called \"Spinal Tap,\" which parodied the documentary films made about rock bands during that period. The film featured the fictional band \"Spinal Tap\" trying to promote their new album, but most of their concert dates were canceled due to low ticket sales. In the end, they discover that one of the singles from their album became a hit in Japan, and they go on tour there. It should be noted that \"Big in Japan\" gained popularity despite its backstory, and it was not only heard in Japan.\n" +
                        "\n" +
                        "The specific expression \"Big in Japan\" was borrowed from a British band with the same name that also disbanded a few years later. Ironically, the bassist of that band was Holly Johnson, who at the time of the song's release was the lead singer of Frankie Goes To Hollywood, whose song \"Relax\" was at the top of the British charts during the same period that Alphaville's \"Big in Japan\" was released, knocking them off the top spot.\n" +
                        "\n" +
                        "The song itself, surprisingly and entirely different from its backstory, is about a couple trying to break free from their addiction (the \"Crystal bits\" of snowflakes) and all that accompanies it in order to experience true love without drugs and everything that comes with it. The story connects to the song title in the sense that, according to the band members' claim, you can be successful elsewhere, and if you're not, at least you can say you are because no one will check you on it. This escape is actually the way for that couple to escape reality and dream of a better world for themselves. Japan is so distant that it perfectly suits the story. The mention of a zoo in the song and whether it's worth staying there is a reference to the Berlin Zoo station, which was considered a place where most drug deals took place during that time.\n" +
                        "\n" +
                        "The composition of the song, combining electronic bell sounds and steady drums with background \"swings,\" reinforces the struggle to break free from addiction and the difficulties involved. The sound was considered modern and blended with the recognizable and well-known pop style of the 1980s.")
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
                .setInfo("In 2006 My Chemical Romance decided to create something big. They teamed up with producer Rob Cavallo (who had previously produced albums for Green Day, among others), and began working on a rock opera concept album called \"The Black Parade,\" which depicts the story of a terminally ill individual in his final moments of life.\n" +
                        "\n" +
                        "The album opens with a track influenced by Pink Floyd's \"The Wall\" and David Bowie's \"The Rise and Fall of Ziggy Stardust...\" called \"The End.\" Along with the following track, \"Dead!,\" it essentially reveals the ending of the story right from the start, as the speaker (the \"patient\") dies. This decision is illustrated excellently, in my opinion, by the familiar beeping sounds of an EKG machine at the beginning of the song \"The End,\" which blend into a prolonged beep at the start of \"Dead!,\" indicating that the patient is no longer among the living.\n" +
                        "\n" +
                        "The song \"Welcome to the Black Parade\" is the fifth track on the album and essentially represents the patient's thoughts in his final moments. It recounts his childhood memories with his father, who took him to \"the black parade\" and asked him to be \"the savior of the broken, the beaten, and the damned\" and lead the parade as he grows up. The father figure can also be interpreted as a reference to God, promising the patient a future in the afterlife if he uses his music to help the weak.\n" +
                        "\n" +
                        "In the first verse, the patient reveals that sometimes he feels like the devil is watching him and wonders if it would be better for him to pass on from the world. However, he continues in the chorus, stating that the world will carry on without him and his death won't change anything (\"We'll carry on\"). But this can also be interpreted as a statement that he himself will continue to live even after his death.\n" +
                        "\n" +
                        "In the climactic part of the song (which is repeated at the end), the patient declares, \"Do or die, you'll never make me. Because the world will never take my heart.\" He essentially states that he won't surrender to the disease and nothing will break him. He then adds that he's not a hero, just a boy singing the song, referring to the expectation placed on him to be \"the savior of the weak.\" Despite the patient's declaration, and as we already know from the beginning of the album, he fails to overcome the illness and ultimately succumbs to it.\n" +
                        "\n" +
                        "As part of the band's grand project of creating a rock opera, they also crafted an elaborate and unique music video for the song, showcasing the band performing in the parade, dressed in black outfits (inspired by The Beatles' \"Sgt. Pepper's Lonely Hearts Club Band\" album cover). The video gained popularity and contributed greatly to the success of the song and the album. It even topped MTV's \"100 Greatest Music Videos of the 21st Century\" countdown. The song became an anthem for the band and their most beloved and successful song among fans, propelling them to become one of the biggest rock bands in the world.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=RRKJiM9Njr8")
        );
        songs.add(new Song()
                .setTitle("Stan")
                .setYear(2000)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShSKgG9LTP6T_ZplKJVhqVlfInR0riSuvH2g&usqp=CAU")
                .setDuration(404)
                .setStreams(126)
                .setFavorite(false)
                .setId("16")
                .setAlbum("The Marshall Mathers LP")
                .setArtist("Eminem")
                .setInfo("At what stage does love of a fan turn into obsession?\n" +
                        "\n" +
                        "Behind the song \"Stan\" by Eminem\n" +
                        "\n" +
                        "Marshall Bruce Mathers III, known by his stage name Eminem (and sometimes by his alter ego Slim Shady), is a rapper, actor, and music producer. He is considered by many as one of the greatest rappers of all time due to his ability to stay relevant for such a long time without anyone challenging his position. He has released numerous songs and albums that have entered the mainstream consciousness, even among those who are not fans of the genre. Eminem has sold over 80 million albums worldwide, making him the best-selling hip-hop artist in the world. The name \"Eminem\" is derived from the brand of chocolate candy called M&M, which also comprises the initials of his first and last name. When he chose his stage name, he altered the spelling to a similar phonetic sound. There is much more to say about Eminem, but in this post, we will focus on the song itself rather than the artist.\n" +
                        "\n" +
                        "The song \"Stan\" tells the story of Stanley Mitchell, an obsessed fan of Eminem who writes him two letters and tells him about his life and how he fell in love with him. When he doesn't receive a response to his letters, and his pregnant girlfriend finds out about it, he becomes enraged and records a third message on tape while driving under the influence, with his girlfriend locked in the trunk. In the end, he crashes his car off a bridge and meets his death. The final verse of the song is Eminem's response letter, in which he addresses all the messages that Stan sent him. The song achieved great success worldwide and in Israel, where it was selected as the song of the year in Galgalatz's annual chart in 2000 and became the subject of many parodies, such as \"Chen\" by Assi and Guri and \"Baruch\" by \"HaYehudim Ba'im\" (which tells the story of Baruch Goldstein's massacre in the Cave of the Patriarchs). When Eminem released the song, he didn't expect it to be a great success because he thought people wouldn't want to listen to a 7-minute-long song.\n" +
                        "\n" +
                        "Eminem sampled the song \"Thank You\" by singer Dido, which appeared in the movie \"Sliding Doors\" with Gwyneth Paltrow (his wife, Chris Martin's, Coldplay if you remember from the previous post on the topic). Eminem heard the song for the first time when he saw the movie trailer, which featured the song in the background, and he connected with the line \"but your picture on my wall It reminds me, that it's not so bad\" (hanging a picture of the idol on the wall is something that every teenage fan does) and it inspired him to write his own song with that melody. Despite the song's appearance in the movie, it did not gain much popularity until three years later when Eminem released his version of the song. By the way, Dido revealed that she wrote her song in just a few minutes, and she just wanted to write a song about a person having a bad day and how her life looked better when this person came along. Two other interesting facts are that in the music video for the song \"Stan,\" the actress playing Stan's girlfriend is Dido herself. The second fact is that in 2012, when Dido gave birth to her first son, she decided to name him Stanley. According to her, the name was not chosen because of the song.\n" +
                        "\n" +
                        "As can be understood from the plot presented in the music video and the lyrics of the song, it is not a light content, which is why the song has undergone various versions and censorships. In the version broadcast on MTV, parts were censored where Stan is shown tying up his girlfriend and placing a gag on her mouth, her struggle inside the car to remove the gag, and the struggle to get air to breathe. Additionally, a scene showing Stan drinking vodka while driving was also censored. In the song itself, parts were censored where Stan mentions drinking vodka before starting the drive and parts where his girlfriend's screams from the trunk are heard, and Stan, in response, silences her and describes what he did to her. Moreover, parts of the last verse were also censored, where Eminem describes what he heard in the news about a drunk driver who fell off a bridge while his pregnant girlfriend was locked in the trunk. Since it was a very long song, MTV later created a shorter version in which they omitted parts such as the meeting between Eminem and Stan, where he tells him about his parents' relationship, and the part where Stan talks about getting a Slim Shady tattoo on his chest.\n" +
                        "\n" +
                        "The song sparked many reactions among people. Let's start with the fact that the song initiated a discussion about the question of where the line is crossed between adoration and obsession. There is something very comforting in connecting with the lyrics of a specific song and identifying with them, creating a sense that the listener is not alone in experiencing that feeling. In today's generation, with social media providing a glimpse into the lives of every celebrity, often presenting a more glamorous image than reality itself, sometimes the boundary becomes blurred, and people don't know how to make the distinction. Everyone wants to feel a bit of the spotlight and fame bestowed upon celebrities. The term \"Stan\" received a definition in the Oxford Dictionary as an obsessive fan of a famous person, and many artists, such as rappers Nas, Nicki Minaj, and Eminem himself, have used various interpretations of the term Stan in their songs.\n" +
                        "\n" +
                        "Many artists didn't like Eminem's song and argued that he should show support for his fans no matter what and that the song expresses a kind of indifference and lack of concern towards them. Rappers Lil Wayne, Canibus, and KJ52 released songs addressing this issue. Additionally, the song also received criticism from the LGBTQ+ community, perceiving Eminem as homophobic even before the release of the song, and the feeling only intensified due to the last verse in which Eminem tells Stan that if he loves him, maybe it's better if they don't meet (And what's this shit about us meant to be together? That type of shit'll make me not want us to meet each other). Elton John, who came out as gay, also received a lot of criticism from the LGBTQ+ community when he performed together with Eminem at the Grammy Awards during their performance of the song.\n" +
                        "\n" +
                        "In 2013, Eminem released a \"sequel\" to the song when he wrote the song \"Bad Guy,\" which tells the story of Stan's brother, Matthew, who is mentioned in the song as not receiving a signature from Eminem. He wants to seek revenge on Eminem for what happened to his brother and plans to kill him. After blaming him, he kidnaps Eminem and plans to murder him. Similar to the song \"Stan,\" there is also a car ride, but this time the police are chasing Matthew because he is driving at high speed, and when he has no choice, he jumps off the bridge with the car, just as his brother did, and commits suicide while Eminem is locked in the trunk.\n" +
                        "\n" +
                        "Regarding the central question that many people still ask: Is the song based on a true story? Well, the story itself is not true, but Eminem stated that he receives many \"crazy letters\" from fans. He released the song to make people distinguish between Eminem the human being and Slim Shady (his alter ego) and to show that even Eminem is human and that his idolization should not be taken to the extreme. Additionally, in Eminem's songs, there is an impression that he justifies violence, drugs, homophobia, and many other non-educational values, and it was important for him to make the distinction and show that he does not support such things and that people should not take what he says in his songs too seriously.")
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
                .setInfo("50 years since the death of the legendary guitarist and songwriter, Jimi Hendrix - Behind the song \"Little Wing\" by The Jimi Hendrix Experience:\n" +
                        "\n" +
                        "Jimi Hendrix was born as Johnny Allen Hendrix in Seattle, Washington, to a lower-middle-class family. When he was 15 years old, his mother passed away, and his father bought him a ukulele, followed by a cheap acoustic guitar for only five dollars. That's when Hendrix started playing the guitar. At the age of 18, he enlisted in the US Army as a paratrooper but was discharged a year later after being injured in a parachute jump accident. After his discharge, Hendrix began playing as a studio guitarist and performing as a sideman for various rhythm and blues artists.\n" +
                        "\n" +
                        "In 1966, Hendrix appeared as a backing guitarist for rhythm and blues singer Curtis Knight in a show at one of New York City's prominent nightclubs, The Cheetah Club. At that same performance, Linda Keith, the girlfriend of Rolling Stones guitarist Keith Richards, was in attendance and was very impressed by Hendrix's playing. The two became friends, and shortly after, Richards recommended him to the manager and producer of his band, but they didn't recognize his potential and turned him down.\n" +
                        "\n" +
                        "Around that time, Chas Chandler, the former bassist of the British rock band The Animals, had just left the band and became interested in artist management and production. Richards directed him to Hendrix. Chandler came to New York to see Hendrix perform with his band \"Jimmy James and the Blue Flames\" and was impressed by their rendition of Billy Roberts' song \"Hey Joe,\" which Chandler had seen Hendrix warm up to years earlier. He offered Hendrix to come to England with him and sign with him and Michael Jeffery (former manager of The Animals) as solo artists without his band. Hendrix struggled with the decision but ultimately agreed because he realized it was his chance to succeed.\n" +
                        "\n" +
                        "Upon their arrival in England, Hendrix and Chandler began searching for a bassist and drummer for Hendrix's new band, and after a short search, they formed \"The Jimi Hendrix Experience\" with Noel Redding on bass and Mitch Mitchell on drums. The trio started performing together throughout England and gaining momentum. Within two months, with the release of their debut single, a cover of \"Hey Joe,\" which had impressed Chandler when he saw Hendrix in the US, they topped the British charts and received widespread publicity across Britain.\n" +
                        "\n" +
                        "Despite their success in the UK, \"The Jimi Hendrix Experience\" had not yet received significant recognition in the US, where Hendrix had come from. Paul McCartney, who was very impressed with the band after seeing one of their performances in the UK, pressured the management of the Monterey Pop Festival in the US to allow them to perform. During their performance at the festival, Hendrix set his guitar on fire, creating one of the most famous moments in rock history and generating publicity for the band in the US. The band's album began to gain significant success in the US, and just seven months after its release, they released their second album, \"Axis: Bold as Love,\" which also achieved great success, even though the band hardly performed its songs live. One of the standout tracks from the album that the band regularly performed was \"Little Wing,\" which became one of their greatest and most recognized songs to this day.\n" +
                        "\n" +
                        "The song \"Little Wing\" is widely known for its guitar intro, which combines two simultaneous roles played by Hendrix himself. According to Hendrix, the intro was influenced by the playing style of Curtis Mayfield, whom he warmed up for in a performance several years earlier. He started writing the song in the summer of 1966 but only managed to complete it after that performance at the Monterey Pop Festival. He mentioned that he wanted to capture what he saw around him at the concert and convey it to a girl, hence the title \"Little Wing\" because he felt like everyone was flying around him, creating a positive atmosphere. The opening line of the song, \"She's walking through the clouds,\" can be interpreted as a reference to Hendrix's and the girl's marijuana smoking or as a metaphor for the girl as an angel. He then describes how the girl's mind is filled with butterflies, zebras, moonbeams, and fairy tales while she floats in the clouds, which can be interpreted as the things Hendrix imagined during the Monterey performance that he associated with the girl in the song. In the second verse, Hendrix tells that when he is sad, she encourages him, assuring him that everything is fine and that she will give him whatever he wants, which can be interpreted as his search for compensation for growing up without his late mother, feeling like no one was there to take care of him.\n" +
                        "\n" +
                        "On September 18, 1970, Hendrix died in a London hotel room after choking on his own vomit as a result of excessive alcohol consumption and sleeping pills (it should be noted that there are many controversies and conspiracies surrounding his death). He became widely regarded as the greatest guitarist of all time and had a profound influence on rock music and subsequent guitarists. \"Little Wing\" remained one of his monumental anthems and continues to be widely appreciated and listened to until this day.")
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
                .setInfo("The Israeli radio broadcaster who discovered Radiohead - Behind the song \"Creep\" by Radiohead:\n" +
                        "\n" +
                        "The song \"Creep\" was the debut single of the British rock band Radiohead, released in 1992. The song was written by the band's frontman, Thom Yorke, during his university studies in the late 1980s, about a girl Yorke had an unrequited crush on, who unexpectedly showed up at one of the band's shows without prior notice.\n" +
                        "\n" +
                        "According to Yorke, \"Creep\" tells the story of a self-destructive individual who tries to get the attention of the person they are infatuated with by stalking them. In the end, the protagonist lacks the self-confidence necessary to face the person and feels trapped in their own subconscious. When asked about the song in 1993, Yorke said, \"I have a real problem with anyone who feels the need to be masculine in society... To be yourself in a world that is trying to make you something else is the hardest thing... It's one of those things that I always try to do: present myself in a masculine way that doesn't seem weak. It comes out in the music we write, which is not feminine, but it's not in a brutal, aggressive, 'I'm a man' kind of way. It's one of those things that I'm always trying to find a balance with.\"\n" +
                        "\n" +
                        "The band recorded the song in one take and did not specifically plan to release it, but the record company was extremely enthusiastic about the result and decided to release it as the band's debut single. Upon its release, the song did not achieve much success and sold only around 6,000 copies. Towards the end of 1992, Israeli radio broadcaster Yoav Kutner began regularly playing the song on Israeli radio after discovering it through an Israeli representative of the record company that released it, and the song became a hit in Israel (at a time when it wasn't even a hit in Britain, where it was originally published).\n" +
                        "\n" +
                        "To capitalize on its success, the band scheduled three performances in Israel at the legendary Roxanne Club in Ramat HaHayal. During those performances, guitarist Jonny Greenwood met his future wife and mother of his children, Israeli artist Sharron Katan. Subsequently, the song began to be published similarly in other countries. After becoming a big hit in the United States, the band decided to re-release the song in the UK, which finally led to its success there, reaching number 7 on the UK Singles Chart.\n" +
                        "\n" +
                        "Over the years, the song has become one of the iconic songs of the 1990s and one of Radiohead's most beloved songs (the audience's obsession with the song even led the band not to perform it live for many years). The band was also sued by the members of \"The Hollies\" who claimed that the melody of \"Creep\" was copied from their song \"The Air That I Breathe,\" which was released almost 20 years prior, ultimately resulting in the original songwriters being credited as co-writers of \"Creep.\" The song was also the soundtrack for the first commercial on Israeli television, advertising a coat by Castro, in a cover version by Jeremy Kaplin (due to copyright issues).\n" +
                        "\n" +
                        "Since their initial performances in Israel, the band has returned to perform in the country several times, with their most recent and largest performance being at Hayarkon Park, where they performed the song that initially made them popular in Israel - \"Creep.\"")
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
                .setInfo("Behind the song \"Like A Prayer\" by Madonna:\n" +
                        "\n" +
                        "Madonna Louise Ciccone, known simply as Madonna, is an American singer-songwriter, fashion designer, actress, musical producer, and businesswoman. She is considered one of the most successful artists in history and has been dubbed the \"Queen of Pop\" by the media.\n" +
                        "\n" +
                        "So here's some background on the writing of the song - \"Like A Prayer\" was released in 1989 after Madonna had a musical hiatus in 1988 due to the failure of several projects she was involved in, such as the films \"Who's That Girl\" and \"Shanghai Surprise,\" and she was at a creative crossroads. Additionally, she had just divorced actor Sean Penn and celebrated her 30th birthday, the age at which her mother passed away. As a result, Madonna decided she wanted to record something different and that her next album would set the tone in the music world. She wanted to write about personal things she had never revealed to her fans and looked at her personal diaries from the past. She was raised in a Catholic household and therefore always felt a sense of guilt, as she never knew when she was sinning and when she wasn't.\n" +
                        "\n" +
                        "Initially, the essence of the song was to tell the story of a girl who is in love with God to the extent that she sees him as a romantic partner. Madonna's real intention was to provoke and capture the attention of her fans. However, the producers of the song were uncomfortable with the line associated with the song, \"When you call my name, It's like a little prayer, I'm down on my knees, I wanna take you there,\" as it gave the impression of a sexual act, but Madonna refused to change the line at all.\n" +
                        "\n" +
                        "In terms of the music video, Madonna also wanted to provoke. Throughout the video, she is seen witnessing a white woman being assaulted and murdered by a group of men, while a black man who tried to save her is falsely accused of the murder and sent to prison. In response, Madonna runs to the nearby church and gazes at a sacred statue resembling that black man. Subsequently, she falls asleep in the church, and in a dream, a woman comes to her and tells her she needs to set things right and do \"the right thing.\" She returns to the statue she had previously seen, which transforms into the man sent to prison, and he kisses her on the forehead. Following that, the provocative parts of the video begin, showing erotic scenes between Madonna and the \"sacred statue\" within the church while a choir sings around them. By the way, the video took four days to shoot because towards the end of filming, they realized that the statue did not resemble the actor, so they decided to reshoot everything.\n" +
                        "\n" +
                        "The song and video naturally stirred up a lot of angry reactions worldwide, including from the Vatican and Pope John Paul II, as the video portrayed a blunt use of Christian symbols, and they called for a boycott of the singer. Later on, the song was even used in a Pepsi commercial worth 5 million dollars, while devout Christians called for a boycott of the company and all its subsidiaries, including Pizza Hut and KFC. Pepsi did not withstand the pressure, and despite explaining that there was no connection between the song and the video, they decided to bury the commercial. By the way, the money remained with Madonna. An interesting Israeli aspect - Madonna performed the song at the Eurovision Song Contest held in Israel in 2019 and received criticism for delivering an unconvincing performance.\n" +
                        "\n" +
                        "Anyway, we also wanted to connect this story to the storm that is unfolding on social media regarding Adi Biti's provocative music video. We won't take sides in the story, but in the end, it should be remembered that Madonna didn't invent the wheel, and many artists did it before her, and many will do it after her. In today's era, I think it's easier to release such a video than in 1990 when there was zero awareness of these things. It just needs to make us understand and accept the proportion of how groundbreaking Madonna was in what she did.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=79fzeNUqQbQ")
        );
        songs.add(new Song()
                .setTitle("I Found a Way")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToX6GCU3Gm8EtldApjas1nIHiLaZUmKRxJuw&usqp=CAU")
                .setDuration(179)
                .setStreams(7)
                .setFavorite(false)
                .setId("20")
                .setAlbum("Telegraph")
                .setArtist("Drake Bell")
                .setInfo("Behind the song \"Found A Way\" by Drake Bell:\n" +
                        "\n" +
                        "Drake Bell is an American actor, comedian, voice actor, musician, and singer-songwriter best known for his role as Drake Parker in the series \"Drake & Josh\" - the beloved series that we all grew up with as kids and eagerly awaited every day at 3:40 p.m. for a new episode, wondering what would happen to them this time.\n" +
                        "\n" +
                        "An interesting fact that not many know is that at the end of 2005, when the series was at its peak, Drake was injured in a car accident. He and his friends were driving from Malibu to Los Angeles when a car rear-ended them while they were stopped at a red light. The injuries included a broken neck, a fractured spine, the loss of 7 teeth, and deep cuts to his face. He had to undergo over 70 stitches on his face and had to keep his jaw wired shut for two months, in addition to undergoing surgeries on his spine and mouth. A week later, he appeared on television in the successful movie \"Drake & Josh Go Hollywood,\" in which Drake finally received recognition and performed one of his songs live on MTV. Personally, I must mention that there is a certain irony here because one of the early episodes of the series is about Drake getting into a car accident with a dune buggy and trying to hide it from his parents. You could say that in this case, the prophecy came true.\n" +
                        "\n" +
                        "If you thought that the history of injuries ended there, you should think again. In 2015, Drake shared a photo on his Instagram account of his hand with a scar from surgery and stated that doctors told him he would never be able to play again in his life. Despite the pessimistic predictions, Drake eventually managed to overcome the injury and returned to playing. The injury occurred when he was at his brother's birthday party, and when he jumped into the shallow pool at the location, he hit the bottom with his hand and apparently suffered several fractures.\n" +
                        "\n" +
                        "I think it's impossible to talk about Drake without mentioning Josh Peck, who also starred in the well-known series. Their collaboration began with the show \"The Amanda Show,\" which aired between 1999 and 2002. One of the famous sketches on the show, which led to the decision to give them their own series, featured Drake and Josh stuck together with a piece of shrimp, and that sketch ultimately became the final scene in \"Drake & Josh.\" Their connection went beyond the show when Josh appeared in several music videos of Drake's and even did a cameo for him in some of his songs. In recent years, there have been rumors that their relationship has been strained, but later they managed to reconcile and have remained in contact to this day.\n" +
                        "\n" +
                        "Until today, the official reason for the end of the series was not announced, but one of the popular conspiracy theories is that actress Miranda Cosgrove, who played Megan, the younger sister, wanted to promote her new series, \"iCarly,\" and did not want to return for another season. By the way, Drake recorded with Miranda the theme song for her series, \"Leave It All To Me,\" with lyrics written by one of Drake's band members.\n" +
                        "\n" +
                        "His most well-known song, \"Found A Way,\" was released on his debut album, \"Telegraph.\" The song appears as the opening theme for the series and became an integral part of it. The actual line in the chorus is \"It's gonna take some time to realign,\" where \"realign\" means to straighten a line. Despite that, many people make the common mistake of singing \"realize,\" which means to understand. Drake has often stopped his performance in the middle to correct the audience on this matter, stating that the word \"realize\" does not rhyme with the rest of the song.\n" +
                        "\n" +
                        "To this day, Drake continues to release music, and it seems that he focuses more on it than on his acting career. However, the success of his acting career has brought a lot of exposure to his songs, so it's difficult to judge whether it's the right step for him or not.")
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
                .setInfo("Foster The People is an American indie-pop band named after its lead vocalist, Mark Foster. The song was released in 2010, initially as the band's debut single, but later included on their first album. The song was written and recorded by Mark Foster when he worked as a commercial jingle writer in Los Angeles. Despite its upbeat and optimistic rhythm, the lyrics describe the homicidal thoughts of a troubled young boy.\n" +
                        "\n" +
                        "The song tells the story of Robert, a young troubled cowboy known as \"the fast shooter.\" He is a boy who mainly grows up alone as his father comes home late from work every day. He finds a gun in his father's closet and imagines in his head how he kills his classmates at school (\"All the other kids with the pumped-up kicks\"). The song is written from the perspective of a conflicted and isolated teenager, and Foster tried to get into the mind of an isolated and psychotic child when he wrote it, aiming to raise awareness about the use of firearms among teenagers. He mentioned that he started reading about the growing trend of mental illnesses in adolescence and wanted to understand the psychology behind it. He was surprised to discover how prevalent mental health issues among teenagers had become since the beginning of the millennium. He feared seeing what would happen to future generations if the trend continues and argued that it primarily stems from a lack of family, love, and isolation.\n" +
                        "\n" +
                        "The subject matter was personally close to Foster since he experienced bullying himself in high school. Additionally, the band's bassist (formerly), Cubbie Fink, had a cousin who survived a massacre in 1999. Fink mentioned that his cousin was in the library at the time, and he traveled specifically to support her and be with her. He understood the impact such trauma has on young people, so he was also glad to have the opportunity to create a song about it.\n" +
                        "\n" +
                        "The process of creating the song was not easy for Foster. In various interviews, he mentioned that he encountered a writer's block and had to force himself to sit down and write the song until he eventually succeeded. He initially wrote the chorus, intending for the gun to serve as a metaphor for something that gives a sense of security, but he changed the meaning of the song when he started writing the verses. When he finished writing the song, he first wanted to create a demo where he played all the instruments and arranged the song in Logic Pro software. In the end, that demo became the final version that was released.\n" +
                        "\n" +
                        "Who is that Robert mentioned in the song? Well, many initially thought it referred to Robert Hawkins, who was responsible for a shooting at Westroads Mall in Nebraska in 2007. However, the band quickly denied any connection between them, stating that it was a complete coincidence.\n" +
                        "\n" +
                        "And what is the meaning of \"Pumped Up Kicks\"? Well, it refers to Reebok basketball shoes from the '80s and '90s. They can be considered the equivalent of Air Jordans, but they were less sought after. It's important to remember that there is documentation of 1,200 murder cases that occurred as a result of disputes over shoes. When kids couldn't afford Air Jordans, they settled for a \"knock-off\" Reebok, which was also snatched from the shelves. In general, shoes during that period symbolized status, and \"only those who had them were considered cool.\" They were also quite expensive. Additionally, shoe companies did not try to calm the frenzy surrounding the shoes. Even then and now, they are careful not to produce a large quantity of shoes to maintain their value and sell each pair for much more money. Therefore, the reference here is that those kids who bought the Reebok knock-offs made kids who wore \"Converse\" or \"Keds\" (the common brands at that time) jealous. Essentially, you can say that all these thoughts about murder stem from jealousy over shoes.\n" +
                        "\n" +
                        "Although this topic is less relevant to the Israeli public because the phenomenon of school shootings is almost non-existent here (thankfully), and it is more prevalent in the United States, we believe that now, as we approach the end of the series \"Blackspace\" (aired on Channel 13 and highly recommended for those who haven't seen it yet), which portrays a story of a school shooting in Israel, the topic of bullying and violence in Israeli schools will spark discussions in many homes. We believe that now, more than ever, the topic can resonate more strongly with the Israeli audience.")
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
                .setInfo("\n" +
                        "Behind the song \"Lego House\" by Ed Sheeran:\n" +
                        "\n" +
                        "Ed Sheeran is an English singer-songwriter, musician, and producer. The song \"Lego House\" actually speaks about the struggle to fix a crumbling relationship and, in general, the desire to take care of one's partner so they won't get hurt. The Lego house is a metaphor for a relationship. You invest so much time in building the connection, but when the house falls, it shatters instantly and takes time to rebuild. Sometimes, you can't even return to the same place you were before.\n" +
                        "\n" +
                        "In the first verse, the song presents what each person gives in a relationship. She is there for him, and her presence eases his burdens, while he is willing to do more and protect her at all costs. He uses a storm as a metaphor for her emotions and ensures that she has shelter.\n" +
                        "\n" +
                        "In the second verse, he uses a different metaphor and presents his girlfriend as an amazing work of art. Not only does he hang her on the wall, but he also admires her and showers her with praise. Later in the verse, he mentions that he has been in such situations before but feels that this time he is willing to give his heart with the hope of regaining her love.\n" +
                        "\n" +
                        "In the chorus, he tries to convey the idea that a good relationship is built on trial and error. You learn from your mistakes to create something better (assuming you don't give up and despair). He says that after all the crises they have experienced in their relationship, he feels that he loves her more than he did before.\n" +
                        "\n" +
                        "In the final verse, he says that he doesn't want to stop loving her, but on the other hand, he doesn't know how long he can continue like this and keep rebuilding everything from scratch. In essence, he leaves the ending somewhat open because we don't know his final decision.\n" +
                        "\n" +
                        "The music video is very interesting as it is not directly related to the song's theme. In the video, actor Rupert Grint, known primarily for his role as Ron in Harry Potter, appears, most likely cast for the role due to his resemblance to Sheeran. The reason for this is that in the video, Grint portrays a character obsessed with Sheeran (someone mentioned Stan?). We see him imitating Sheeran, writing songs, preparing for a performance, playing the guitar, and traveling on the tour bus. When he finally goes on stage, security guards jump on him and remove him, gradually revealing more details that make us understand that Grint is an obsessive fan of Sheeran (someone mentioned Stan?), and in the video, we see how he tries to imitate Sheeran.\n" +
                        "\n" +
                        "The video ends with Grint passing by Sheeran himself, his idol, as he exits a venue. The only interpretation we could think of is that it is also a love story, but of a different kind. The fan feels that he gives his all for the sake of the singer, but each time experiences disappointments and frustrations anew – this also explains the choice of long shots in various parts of the video, to emphasize the fan's loneliness. In this case, it seems that the fan chose to continue being obsessive about the singer because after the song ends, we see him hugging a Sheeran doll.\n" +
                        "\n" +
                        "Additionally, in 2013, a clip was released that presents the storyline of the original video but with Lego characters. It also achieved success and was nominated for Best Video of the Year at the annual MTV Awards. Which version do you think is better? It's up to you to decide.\n" +
                        "\n" +
                        "And well, one of the reasons we chose this song is because not long ago we celebrated International Lego Day (January 28). So let's end with a few irrelevant facts about Lego:\n" +
                        "\n" +
                        "Lego was invented in 1932 by Danish carpenter Ole Kirk Christiansen. The original name of the bricks was \"leg godt,\" which means \"play well\" in Danish, but over time, the name was shortened to Lego for better reception.\n" +
                        "\n" +
                        "Until 1979, all male Lego figures wore hats. Another interesting fact is that the Lego brick design is universal, and even a misplaced piece from the 1950s can connect to a new set purchased from the store.\n" +
                        "\n" +
                        "One reason why Lego figures are yellow is that yellow is a neutral skin color, and the company didn't want to attach specific characteristics to the figures. Each person can project their own imagination and use any figure as they see fit.")
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
                .setInfo("Behind the song \"Swimming Pools (Drank)\" by Kendrick Lamar:\n" +
                        "\n" +
                        "Kendrick Lamar is an American rapper from Compton, California. The song was released as a single on July 31, 2012, as part of the album \"Good Kid, M.A.A.D City.\" To this day, the song is considered one of Kendrick's biggest hits. In fact, the concept of the album is like a story, where Kendrick indulges in drinking and then wants to impress his friends, feeling social pressure. This theme runs throughout the entire album.\n" +
                        "\n" +
                        "In the United States, there are many young people who celebrate at parties or engage in drinking games while playing the song. Their goal is to take a shot every time Kendrick says the word \"drank\" in order to get drunk and \"get high.\" In fact, upon the release of the song, the trend became so widespread that it was dubbed the \"anthem of drinking parties.\" However, the irony is revealed in the lyrics themselves, which try to convey a completely opposite message.\n" +
                        "\n" +
                        "The opening of the song talks about the chronological order of every party – you pour a drink, drink quickly, and then get faded (\"Pour up (Drank), head shot (Drank…\"). The first verse discusses Kendrick's social life, which is accompanied by drinking habits from his family and close friends, and how he feels societal pressure pushing him to do the same. In the first verse, he mentions his late grandfather who drank excessively and eventually died as a result. Additionally, Kendrick mentions the reasons that led him to start drinking – the desire to fit in and be part of the \"cool kids.\"\n" +
                        "\n" +
                        "In the second verse, a conversation takes place between Kendrick and his conscience. To emphasize the differences between them, Kendrick sings with a louder voice and slightly alters his tone when assuming the role of his conscience. In this dialogue, Kendrick's conscience tells him, \"You gotta listen to me, 'cause if you don't wanna fall under that pressure, Kendrick, I can push you to greatness. I've been with you since day one.\" In essence, Kendrick describes the struggle of every teenager who feels the need to keep drinking even though they feel they have reached their limit.\n" +
                        "\n" +
                        "In contrast to other rappers, Kendrick himself does not do drugs or drink and chooses not to support that lifestyle. He tries to take his personal story and convey it forward, hoping that young people will learn from his mistakes.\n" +
                        "\n" +
                        "So, what does the title \"Swimming Pools\" mean? It is actually a metaphor for the excessive drinking culture surrounding him. Another meaning is that swimming pools are typically associated with children. In essence, there is a metaphor here for the presence of drinking in Kendrick's life from a young age.")
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
                .setInfo("The song \"Song 2\" by Blur, which became a hit, has an interesting backstory. The song was released as part of Blur's fifth album.\n" +
                        "\n" +
                        "Blur, previously known as a \"Britpop\" band, with songs characterized by catchy and poppy melodies, decided to make a joke at the expense of their record label. Instead of bringing another single in their familiar style, they chose to go in a much more \"rockist\" direction, in an obvious parody of the popular grunge genre in the United States at that time. They wanted to create a noisy song that would be difficult to market commercially.\n" +
                        "\n" +
                        "The band recorded the song deliberately to sound amateurish, with extreme volume and high speed. They also didn't put much effort into the lyrics, writing a text that hardly made any sense and was primarily filled with \"good-sounding\" phrases. Damon Albarn, the lead singer of the band, talked about the song when they first performed it: \"I don't know what it's called, I don't know what it's about, and I haven't even written it yet. For now, it's called 'Song 2'.\" The title of the song was supposed to be temporary, but the band eventually decided to keep it. Almost everything about the song was somehow connected to the number 2: it was the second song on the album (and also the second single from it), it had a duration of 2 minutes and 2 seconds, and it consisted of two verses and two choruses.\n" +
                        "\n" +
                        "To the band's surprise, their record label actually loved the song and agreed to release it as a single. The song became a massive success, ironically reaching number 2 on the UK Singles Chart and becoming their first big hit in the United States as well, even though it was a parody of the American rock of that time. The song has been featured in numerous films and TV shows, including The Simpsons and South Park, and appeared in the popular video game FIFA 98. It continues to be played to this day, with over 450 million streams on Spotify, and is considered the band's biggest hit and one of the greatest rock hits of all time.")
                .setYoutubeUrl("https://www.youtube.com/watch?v=SSbBvKaM6sk")
        );
        songs.add(new Song()
                .setTitle("Holiday")
                .setYear(2005)
                .setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkLlGxpnn4QQfUZRae8yevU_dJ7xXZSwImPQ&usqp=CAU")
                .setDuration(232)
                .setStreams(122)
                .setFavorite(false)
                .setId("25")
                .setAlbum("American Idiot")
                .setArtist("Green Day")
                .setInfo("Behind the songs \"Holiday\" and \"Wake Me Up When September Ends\" by Green Day:\n" +
                        "These songs were included as part of the album \"American Idiot\" (the band's seventh album), but it's important to note that this album was not originally intended to be written. It was written in response to the theft of recordings of another entirely planned album by the band (according to the protocol, years later band members revealed that they were eventually able to recover the materials). The album is essentially a concept album that tells the story of an American suburban teenager from a lower-middle-class background named Jesus. He becomes fed up with the life he knew up until that moment in the town of Jingletown and decides to leave home and move to the big city, where he meets his girlfriend \"Whatsername\" (he mentions that he remembers her face but not her name). He describes her as amazing but also dangerous, as she holds his heart like a grenade (explaining the album's cover image). He feels free and spends his time aimlessly, but he doesn't find meaning in it. He \"encounters\" Saint Jimmy, who is essentially another side of his personality, portraying him as charismatic and carefree. He uses the alter-ego of Saint Jimmy as an excuse to continue his reckless lifestyle, involving drugs and more, until \"Whatsername\" becomes tired of this lifestyle and decides to leave him and the city because she no longer loves the person he has become, the American Idiot that he despises. In fact, \"Whatsername\" and Jimmy represent the central theme of the album, anger versus love. Jimmy is fueled by rebellion and self-destruction, while \"Whatsername\" focuses on following what you believe in. Ultimately, \"Whatsername's\" departure serves as a trigger for Jesus, who realizes how far he has spiraled. He decides to \"kill\" Saint Jimmy and returns home to Jingletown. The album ends with Jesus stating that he has no regrets and doesn't want to forget what he has experienced.\n" +
                        "\n" +
                        "Through this story, Billie Joe Armstrong hoped to portray the maturation of America. He felt that in this album, he needed to increase the amount of political content he conveys in his lyrics. The album presents a protest by the band against the President of the United States at that time, George W. Bush. They attribute to him the term \"American Idiot,\" recalling the events of September 11th and the Iraq War that created turmoil and panic among the American public. They criticize American capitalism and argue in the song that the country is more concerned about losing money than losing human lives (\"And bleed, the company lost the war today\"). In the chorus, they emphasize how much they appreciate those who form independent opinions, in contrast to conformists who do what they are told and buy into the lies of politicians. The third verse is the most extreme, where they are supposed to salute Bush (Sieg Heil to the president Gasman) and compare the destruction caused by the United States in Iraq to the Nazi regime's attack on \"Kristallnacht,\" in which many Jewish shops and synagogues were vandalized. The purpose of all this provocation is to equate Bush's administration with the Nazi regime, as the band believes that he also generates manipulative propaganda and uses it to justify necessary warfare.\n" +
                        "\n" +
                        "The song \"Wake Me Up When September Ends\" is the only song on the album that is not part of the overarching story. It is based on the personal life story of the band's frontman, Billie Joe Armstrong, whose father passed away on September 1st, 1982, from cancer when Billie was just a 10-year-old child. His way of coping was to run home and lock himself in his room during the funeral, telling his mother to wake him up when September ends. The song was originally intended to be included in the album \"Shenanigans\" released in 2002, but Billie felt emotionally unprepared at the time, so it was included in this album released in 2004.\n" +
                        "\n" +
                        "If you enjoyed this post, we recommend reading our post about another Green Day song, \"Good Riddance (Time of Your Life).\"")
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
                .setInfo("Behind the song \"Cry Me a River\" by Justin Timberlake:\n" +
                        "In 1995, the boy band NSYNC was formed, which included Justin Timberlake among its members. The band gained significant fame and recognition worldwide, particularly due to their song \"Bye Bye Bye.\" In 1999, Justin Timberlake began dating the most famous pop star of that time, Britney Spears, until they broke up in 2002. Additionally, in the same year, NSYNC also disbanded, and as a result, Justin decided to pursue a solo career.\n" +
                        "\n" +
                        "When they broke up, there was intense media speculation about their separation, given the strong presence of both individuals in the industry. Justin claimed that Britney cheated on him with her choreographer, Wade Robson (who was also his friend), and he learned about it through that person, which led him to break up with Spears. Justin took the breakup very hard and gave a 10-minute interview to Barbara Walters, where he portrayed Britney as a \"terrible woman\" while playing a short piano piece. In that interview, Justin was asked about Britney's promise not to have sex until marriage, to which he sarcastically replied, \"Yeah, sure,\" and laughed (in a later interview, Justin was asked about specific things he did with her regarding sex, and he chose not to answer the question). It's important to note that this was in 2002, and the level of openness on such matters was different compared to today.\n" +
                        "\n" +
                        "Justin immediately started his solo career, and one of the singles from his debut album was \"Cry Me a River.\" The song tells the story of someone who was once deeply in love with someone who meant everything to them. She didn't appreciate it, played with fire, and in the end, got burned. The main criticism is in the chorus where he says, \"You don't have to say what you did, I already know. I found out from him. Now there's just no chance for you and me. There'll never be. Don't it make you sad about it?\" The music video for the song also suggests that the subject is Britney, as towards the end of the video, a girl who strongly resembles Britney is seen. Did Justin's \"revenge journey\" end here? Not sure. If you ask many music fans, they will also mention another well-known song by Justin Timberlake that deals with Britney's betrayal. It's the song \"What Goes Around... Comes Around,\" released at the end of 2006 (4-5 years after the breakup), and the music video depicts a girl cheating on her partner with his best friend.\n" +
                        "\n" +
                        "And how did Britney react? Well, she apologized in several interviews for what happened and asked not to be portrayed as the \"bad person\" in the story. At no point did she engage in a public feud with Justin or speak negatively about him personally. Additionally, Britney released her own song about the breakup called \"Everytime,\" in which she expresses sorrow over the separation and the difficulty of moving on. If it matters, earlier this year, Justin publicly apologized to Britney. It came after harsh criticism following the release of a documentary about Britney that addressed his role in her negative media coverage. Overall, 2002 wasn't a successful year for Justin Timberlake as he recently faced criticism for his handling of the wardrobe malfunction incident at the Super Bowl in 2004. It is highly recommended to watch the documentary \"Framing Britney Spears\" to explore the topic. If there is demand for it, we can discuss it further in another post.\n" +
                        "\n" +
                        "One interesting detail about the song is that singer Justin Bieber, who has performed several covers of the song over the years, sang \"Cry Me a River\" during a concert in Boston in 2012, a month after his breakup with Selena Gomez. What's equally interesting is that Selena Gomez \"returned the favor\" a few months later when she also performed a cover of the song.\n" +
                        "\n" +
                        "Do you think Justin Timberlake owes his solo career to Britney? Let us know your opinion.")
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
