package Lesson12.Mentor;

import java.util.Arrays;

public class Playlist {
    private Song[] songs;

    public Playlist() {
        this.songs = new Song[0] ;
    }
    public void addSong (Song song){
        for (Song s : songs) {
            if (song.equals(s)) return;
        }
        int len = songs.length;
        songs = Arrays.copyOf(songs, len + 1);
        songs[len-1] = song;
    }
    public void displaySongs (){
        for (Song music: songs){
            System.out.println(music);
        }
    }
}
