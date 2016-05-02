import java.util.Scanner;
import java.util.Vector;

/**
 * Created by andrew on 5/3/16.
 */
public class Library {

    private Vector<Album> albumList = new Vector<>();

    public Library(Vector<Album> albumList) {
        this.albumList = albumList;
    }

    public Vector<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(Vector<Album> albumList) {
        this.albumList = albumList;
    }

////////////////////////////////METODI/////////////////////////////////////////////////////////////////////////

    public void newAlbum() {
        Scanner in = new Scanner(System.in);
        Album album = new Album(in.next());
        albumList.add(album);
    }

    public void findAlbum() {
        Scanner in = new Scanner(System.in);
        String wantedAlbum = in.next();
        if (albumList.contains(wantedAlbum)) {
            System.out.printf("L'album %s è stato trovato\n", wantedAlbum);
        }
        System.out.printf("L'album %s non è presente nell'archivio\n", wantedAlbum);
    }

    public void showAlbum() {
        Scanner in = new Scanner(System.in);
        String toShow = in.next();
        if (albumList.contains(toShow)) {
            int index = albumList.indexOf(toShow);
            System.out.println(albumList.get(index));
        }
        System.out.printf("L'album %s non è presente nell'archivio\n", toShow);
    }

    public void removeAlbum() {
        Scanner in = new Scanner(System.in);
        String index = in.next();
        albumList.removeElement(albumList.indexOf(index));
    }

    public void randomAblum() {
        albumList.get(MyMath.randomInt(0, albumList.size()));
    }

}
