package com.project.impl.factory;

import com.project.core.repos.AlbumRepo;
import com.project.core.repos.ArtistRepo;
import com.project.impl.AlbumDAO;
import com.project.impl.ArtistDAO;

public class ArtistRepoFactory {

    private static ArtistRepo repo;

    private ArtistRepoFactory(){}

    public static synchronized ArtistRepo getInstance(){
        if(repo == null){
            repo = new ArtistDAO();
        }
        return repo;
    }
}
