package Proxy;

import java.util.List;

public class MusicApp {
    public static void main(String[] args) {

        SongService songService = new SongServiceImplementation();
        SongServiceProxy songServiceProxy = new SongServiceProxy(songService);

        // Search for songs using proxy
        Song song1 = songServiceProxy.searchById(1);
        System.out.println("Song 1: " + song1.getTitle() + " by " + song1.getArtist());

        Song song2 = songServiceProxy.searchById(2);
        System.out.println("Song 2: " + song2.getTitle() + " by " + song2.getArtist());

        Song song3 = songServiceProxy.searchById(3);
        System.out.println("Song 3: " + song3.getTitle() + " by " + song3.getArtist());

        // Search for songs by title and album using proxy
        List<Song> songsByTitle = songServiceProxy.searchByTitle("Song 1");
        System.out.println("Songs with title 'Song 1': " + songsByTitle.size());

        List <Song> songsByAlbum = songServiceProxy.searchByAlbum("Album 2");
        System.out.println("Songs in album 'Album 2': " + songsByAlbum.size());
    }
}
