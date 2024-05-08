package Lesson20.Mentor.Spotify;

public class Spotify {
    public static void main(String[] args) {
        Playlist<Music> music= new Playlist<>();
        System.out.println("Spotify tracklist:".indent(10));
        music.addToList(new Punk("Los Angeles","X",180));
        music.addToList(new Punk("Straight Edge","Minor Threat",46));
        music.addToList(new Punk("Welcome to Paradise","Green Day",200));
        music.addToList(new Rock("Bohemian Rhapsody","Queen", 200));
        music.addToList(new Rock("Smells Like Teen Spirit","Nirvana", 190));
        music.addToList(new Rock("I Love Rock ’n’ Roll","Joan Jett & the Blackhearts", 178));
        music.addToList(new Meykhana("Revayet","Namiq Qaraçuxurlu",280));
        music.addToList(new Meykhana("Meyxana","Pərviz BülBülə",300));
        music.addToList(new Meykhana("Vefasiz","Rəşad Dağlı",320));
        Playlist<Podcast> podcast = new Playlist<>();
        podcast.addToList(new Podcast("The Cost of Happiness",1800));
        podcast.addToList(new Podcast("Hidden Brain",2000));
        music.printDetails();
        podcast.printDetails();
    }
}
