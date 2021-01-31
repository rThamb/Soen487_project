package com.project.impl;

import com.project.core.models.Album;
import com.project.core.repos.AlbumRepo;

import java.util.List;

public class AlbumDAO implements AlbumRepo {
    @Override
    public List<Album> readAll() {
        return null;
    }

    @Override
    public Album read(String isrc) {
        return null;
    }

    @Override
    public void add(Album a) {

    }

    @Override
    public void update(Album a) {

    }

    @Override
    public void delete(String isrc) {

    }
}
