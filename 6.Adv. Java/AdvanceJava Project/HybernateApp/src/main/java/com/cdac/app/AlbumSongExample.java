package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.AlbumSongDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

import net.bytebuddy.description.type.TypeDescription.Generic;

public class AlbumSongExample {
	public static void main(String[] args) {
		GenericDao gdao=new GenericDao();
		AlbumSongDao adao=new AlbumSongDao();
		
		//adding an album
	/*	Album album=new Album();
		album.setName("Hits of 2020");
		album.setReleaseDate(LocalDate.of(2020, 12, 30));
		album.setCopyright("Amazon Music");
		gdao.save(album);	*/
		
		//adding song to album
		/*Album album=(Album) gdao.fetchById(Album.class, 1);
		Song song=new Song();
		song.setTitle("Tumse Achha Kaun Hai");
		song.setArtist("Kumar Sanu");
		song.setDuration(6.57);
		song.setAlbum(album);
		gdao.save(song);	*/
		
	/*	List<Song> songs=adao.fetchSongsSungBy("Kumar Sanu");
		for(Song s: songs)
			System.out.println(s.getTitle()+" "+s.getDuration()+" "+s.getAlbum());
		*/
		
		
		//gdao.delete(Song.class,	6);
		
	/*	Song s=(Song) gdao.fetchById(Song.class, 5);
		System.out.println(s.getTitle()+" "+s.getDuration()+" "+s.getAlbum());	*/
		
			
		
			
	}
	
	
}
