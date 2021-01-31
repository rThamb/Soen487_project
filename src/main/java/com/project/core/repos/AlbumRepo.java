package com.project.core.repos;

import com.project.core.models.Album;

import java.util.List;

public interface AlbumRepo {

    List<Album> readAll();

    Album read(String isrc);

    void add(Album a);

    void update(Album a);

    void delete(String isrc);
}
