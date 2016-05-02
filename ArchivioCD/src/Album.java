import java.util.Scanner;
import java.util.Vector;

/**
 * Created by andrew on 5/2/16.
 */
public class Album {

    private String title;
    private String author;
    private Vector<Song> songList = new Vector<>();

////////////////////////////COSTRUTTORI/////////////////////////////////////////////////////////////////////

    public Album(String title, Vector<Song> songList, String author) {
        this.title = title;
        this.songList = songList;
        this.author = author;
    }

    public Album(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Album(String title) {
        this.title = title;
    }

//////////////////////GETTER E SETTER/////////////////////////////////////////////////////////////////////

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Vector<Song> getSongList() {
        return songList;
    }

    public void setSongList(Vector<Song> songList) {
        this.songList = songList;
    }

////////////////////////////////METODI////////////////////////////////////////////////////////////////////

    public void addSong() {
        Scanner in = new Scanner(System.in);
        Song newSong = new Song(in.next(), in.nextInt(), in.nextInt());
        songList.add(newSong);
    }

    public void randomSong() {
        songList.get(MyMath.randomInt(0, songList.size()));
    }

    public void selectSong() {
        Scanner in = new Scanner(System.in);
        songList.get(in.nextInt());
    }

    public void songDescription() {
        Scanner in = new Scanner(System.in);
        songList.get(in.nextInt()).description();
    }

    public void albumDescription() {
        System.out.printf("Nome album: %s\n Nome autore: %s\n Tracklist: %s\n", this.title, this.author, songList.toString());
    }

    //  AGGIUNGERE METODO PER ACCESSI E CONFRONTI SECONDO NECESSITA

}
