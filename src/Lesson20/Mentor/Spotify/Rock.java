package Lesson20.Mentor.Spotify;

import Lesson20.Mentor.Spotify.Genre;

public class Rock implements Music {

    String title;
    String artist;
    int duration;

    public Rock (String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Rock. Title: " + title + ". Artist:" + artist + ". Duration: "+ duration + " seconds";
    }
}
