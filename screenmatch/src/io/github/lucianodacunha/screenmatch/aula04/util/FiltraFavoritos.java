package io.github.lucianodacunha.screenmatch.aula04.util;

import io.github.lucianodacunha.screenmatch.aula04.model.Favoritavel;

public class FiltraFavoritos {

    public void filtraFavoritos(Favoritavel favoritavel){
        if (favoritavel.isFavorito())
            System.out.println("** Filme listado como favorito **");

    }
}
