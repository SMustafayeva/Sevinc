package Lesson20.Mentor.Spotify;

import java.util.ArrayList;
import java.util.List;

public class Playlist<T extends Playable> {
    List <T> tracklist;

    public Playlist() {
        this.tracklist = new ArrayList<>();;
    }
    void addToList(T playable) {
        tracklist.add(playable);
    };
    void printDetails(){
       for (T track : tracklist){
           System.out.println(track.getDetails());
       }
    }
}
