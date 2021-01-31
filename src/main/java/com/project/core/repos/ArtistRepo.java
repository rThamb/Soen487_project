package com.project.core.repos;

import com.project.core.models.Artist;

import java.util.List;

public interface ArtistRepo {

    List<Artist> readAll();

    Artist read(String nickname);

    void add(Artist a);

    void update(Artist a);

    void delete(String nickname);

}
