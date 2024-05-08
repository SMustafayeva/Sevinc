package Lesson20.Mentor.Spotify;

public class Genre {
    String title;
    String artist;
    int duration;

    public Genre(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
