package Lesson20.Mentor.Spotify;

public class Podcast implements Playable{
    private  String title;
    private int duration;

    public Podcast(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Podcast. Title: " + title + ". Duration: "+ duration + " seconds";
    }
}
