package com.baraatest.baraa.repositories;

import java.util.List;

import com.baraatest.baraa.models.Song;
import org.springframework.data.repository.CrudRepository;


public interface SongRepository extends CrudRepository<Song, Long>{
    List<Song> findAll();
    List<Song> findTop10ByOrderByRatingDesc();
    List<Song> findByArtistContaining(String artist);
}
