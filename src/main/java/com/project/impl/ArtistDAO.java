package com.project.impl;

import com.project.core.models.Album;
import com.project.core.models.Artist;
import com.project.core.repos.ArtistRepo;

import java.util.ArrayList;
import java.util.List;

public class ArtistDAO implements ArtistRepo {

    private List<Artist> artists;

    public ArtistDAO(){
        this.artists = new ArrayList<>();
    }

    @Override
    public List<Artist> readAll() {
        return null;
    }

    private List<Artist>copyList(){
        List<Artist> copy = new ArrayList<>();
        this.artists.forEach(ele -> copy.add(new Artist(ele)));
        return copy;
    }

    @Override
    public Artist read(String nickname) {
        Artist artist = this.artists.stream().filter(ele -> ele.getNickname().equals(nickname))
                .findFirst()
                .orElse(null);

        if(artist != null){
            artist = new Artist(artist);
        }

        return artist;
    }

    @Override
    public void add(Artist a) {
        if(a != null)
            this.artists.add(a);
    }

    @Override
    public void update(Artist a) {
        //remove based on ID
        this.artists.remove(a);

        //add new entry
        this.artists.add(a);
    }

    @Override
    public void delete(String nickname) {
        Artist a = new Artist();
        a.setNickname(nickname);
        this.artists.remove(a);
    }
}
