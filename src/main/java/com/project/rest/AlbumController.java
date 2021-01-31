package com.project.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Path("album")
public class AlbumController {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{isrc}")
    public String getAlbum(@PathParam("isrc") String isrc) {
        return isrc + "";
    }

    @PUT
    //@Path("{isrc}")
    public void addAlbum() {

        /*
        library = library.stream().filter(book -> !book.getTitle().equals(title))
                .collect(Collectors.toCollection(ArrayList::new));
        Book newBook = new Book(title, author, isbn);
        library.add(newBook);

         */
    }

}
