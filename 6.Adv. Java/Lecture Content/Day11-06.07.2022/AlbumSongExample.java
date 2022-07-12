package com.cdac.app;

import java.util.List;

import com.cdac.dao.AlbumSongDao;
import com.cdac.entity.Album;
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
		
		//dao.delete(Song.class, 8);
		
		//add album and song together
		/*Album album = new Album();
		album.setName("Hits of 2019");
		album.setReleaseDate(LocalDate.of(2019, 12, 15));
		album.setCopyright("T-Series");
		
		List<Song> list = new ArrayList<Song>();
		
		Song song = new Song();
		song.setTitle("song1");
		song.setArtist("Ed Sheeran");
		song.setDuration(4.13);
		
		song.setAlbum(album);
		list.add(song);

		song = new Song();
		song.setTitle("song2");
		song.setArtist("Ed Sheeran");
		song.setDuration(4.24);
		
		song.setAlbum(album);
		list.add(song);

		song = new Song();
		song.setTitle("song3");
		song.setArtist("Taylor Swift");
		song.setDuration(5.02);
		
		song.setAlbum(album);
		list.add(song);

		album.setSongs(list);
		
		dao.save(album);*/
		
		//understanding lazy/eager loading
		/*Album album = (Album) dao.fetchById(Album.class, 1);
		System.out.println(album.getName() + " " + album.getCopyright() + " " + album.getReleaseDate());
		List<Song> songs = album.getSongs();
		for(Song song: songs)
			System.out.println(song.getTitle() + " " + song.getArtist() + " " + song.getDuration()); */
		
		Song song = (Song) dao.fetchById(Song.class, 3);
		System.out.println(song.getTitle() + " " + song.getArtist() + " " + song.getDuration());
		Album album = song.getAlbum();
		System.out.println(album.getName() + " " + album.getCopyright() + " " + album.getReleaseDate());		
	}
}
