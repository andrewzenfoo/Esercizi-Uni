import java.util.Vector;

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
        Album album = new Album(IO.input());
        albumList.add(album);
    }

    public void findAlbum() {
        String wantedAlbum = IO.input();
        if (albumList.contains(wantedAlbum)) {
            System.out.printf("L'album %s è stato trovato\n", wantedAlbum);
        }
        System.out.printf("L'album %s non è presente nell'archivio\n", wantedAlbum);
    }

    public void showAlbum() {
        String toShow = IO.input();
        if (albumList.contains(toShow)) {
            int index = albumList.indexOf(toShow);
            System.out.println(albumList.get(index));
        }
        System.out.printf("L'album %s non è presente nell'archivio\n", toShow);
    }

    public void removeAlbum() {
        String index = IO.input();
        albumList.removeElement(albumList.indexOf(index));
    }

    public void randomAlbum() {
        albumList.get(MyMath.randomInt(0, albumList.size()));
    }

}

