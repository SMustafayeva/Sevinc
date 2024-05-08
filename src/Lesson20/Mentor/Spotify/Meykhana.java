package Lesson20.Mentor.Spotify;

import Lesson20.Mentor.Spotify.Genre;

public class Meykhana implements Music {
    String title;
    String artist;
    int duration;

    public Meykhana(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Meykhana. Title: "+ title + ". Artist:" + artist+ ". Duration: "+ duration + " seconds.";
    }
}
