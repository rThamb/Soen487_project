package com.project.impl.factory;

import com.project.core.repos.AlbumRepo;
import com.project.impl.AlbumDAO;

public class AlbumRepoFactory {

    private static AlbumRepo repo;

    private AlbumRepoFactory(){}

    public static synchronized AlbumRepo getInstance(){
        if(repo == null){
            repo = new AlbumDAO();
        }
        return repo;
    }
}
