package com.project.core.models;

import java.util.Objects;

public class Album {

    private String isrc;
    private String title;
    private String description;
    private int year;
    private Artist artist;

    public Album(){}

    public Album(Album a){
        this.isrc = a.isrc;
        this.title = a.title;
        this.description = a.description;
        this.year = a.year;
        this.artist = new Artist(a.artist);
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o == null || getClass() != o.getClass())) {
            Album album = (Album) o;
            return isrc.equals(album.isrc);
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isrc);
    }

    @Override
    public String toString(){
        return "";
    }
}
