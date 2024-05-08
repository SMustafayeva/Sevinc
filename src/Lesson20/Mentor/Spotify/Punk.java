package Lesson20.Mentor.Spotify;

import Lesson20.Mentor.Spotify.Genre;

public class Punk implements Music {
    String title;
    String artist;
    int duration;

    public Punk(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Punk. Title: "+ title + ". Artist:" + artist+ ". Duration: "+ duration + " seconds";
    }
}
