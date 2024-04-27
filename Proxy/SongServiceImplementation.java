package Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceImplementation implements SongService{
    private HashMap <Integer, Song> songsDatabase = new HashMap<>();

    public SongServiceImplementation() {
        songsDatabase = new HashMap <> ();
        songsDatabase.put(1, new Song("Song 1", "Artist 1", "Album 1", 240));
        songsDatabase.put(2, new Song("Song 2", "Artist 2", "Album 1", 180));
        songsDatabase.put(3, new Song("Song 3", "Artist 3", "Album 2", 300));
        songsDatabase.put(4, new Song("Song 4", "Artist 4", "Album 2", 210));
        songsDatabase.put(5, new Song("Song 5", "Artist 5", "Album 3", 320));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return songsDatabase.get(songID);
    }

    @Override
    public List <Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List <Song> searchResults = new ArrayList<>();
        for (Song song: songsDatabase.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                searchResults.add(song);
            }
        }
        return searchResults;
    }

    @Override
    public List <Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List <Song> searchResults = new ArrayList < > ();
        for (Song song: songsDatabase.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                searchResults.add(song);
            }
        }
        return searchResults;
    }
}
