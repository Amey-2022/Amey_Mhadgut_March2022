package com.cdac.app;

import java.util.List;

import com.cdac.dao.AlbumSongDao;
import com.cdac.entity.Song;

public class AlbumSongExample {

	public static void main(String[] args) {
		//GenericDao dao = new GenericDao();
		AlbumSongDao dao = new AlbumSongDao();
		
		//adding an album
		/*Album album = new Album();
		album.setName("Hits of 2020");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		dao.save(album);*/
		
		//adding song to an album
		/*Album album = (Album) dao.fetchById(Album.class, 2);
		Song song = new Song();
		song.setTitle("stu");
		song.setArtist("Ed Sheeran");
		song.setDuration(3.15);
		song.setAlbum(album);
		dao.save(song);*/
		
		/*List<Song> songs = dao.fetchSongsSungBy("Taylor Swift");
		for(Song song : songs)
			System.out.println(song.getTitle() + " " + song.getDuration()); */
		
		dao.delete(Song.class, 8);
	}
}
