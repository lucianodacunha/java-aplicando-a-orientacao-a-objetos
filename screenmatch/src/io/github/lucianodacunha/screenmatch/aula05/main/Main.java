package io.github.lucianodacunha.screenmatch.aula05.main;

import io.github.lucianodacunha.screenmatch.aula05.model.Favoritavel;
import io.github.lucianodacunha.screenmatch.aula05.model.Musica;
import io.github.lucianodacunha.screenmatch.aula05.model.PodCast;

import java.util.Locale;

/**
 * Nesse curso exploramos vários aspectos da orientação a objetos, como herança,
 * polimorfismo e encapsulamento. Destacamos os principais conceitos que você
 * precisa se familiarizar para trabalhar com Java ou outras linguagens
 * orientadas a objetos.
 *
 * O nosso desafio é que você consiga praticar parte do que vimos, pensando, por
 * exemplo, em uma aplicação de músicas, na qual seja possível escutar algum
 * áudio. A ideia é que você tenha uma superclasse, que pode se chamar "Áudio",
 * e crie suas heranças, como "Podcasts", "Músicas", trabalhando essa questão do
 * encapsulamento.
 *
 * Vamos fazer uma aplicação, trabalhar herança, criar uma classe que controle
 * suas músicas e podcasts preferidos e assim por diante. A ideia é modelar de
 * maneira que exista uma classe "Áudio" com título, duração, total de
 * reproduções, curtidas e classificação, além de métodos encapsulados para
 * curtir, reproduzir e assim por diante, impedindo que a classe Principal tenha
 * acesso a esses atributos.
 *
 * Aplicar seus conhecimentos em uma aplicação de um sistema de músicas,
 * utilizando conceitos de orientação a objetos, encapsulamento, herança e
 * polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Musica perdida = new Musica();
        perdida.setCantor("Biig Piig");
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        perdida.setTitulo("Perdida");
        perdida.setDuracao(3.01f);
        perdida.reproduzir();
        perdida.classificar(4);
        perdida.curtir();
        perdida.favoritar();

        Musica rosesAndGold = new Musica();
        perdida.setCantor("Biig Piig");
        perdida.setAlbum("Vol. I - Big fan of the sesh");
        rosesAndGold.setTitulo("Roses and Gold");
        rosesAndGold.setDuracao(3.15f);
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.reproduzir();
        rosesAndGold.classificar(4);

        PodCast primoDev13 = new PodCast();
        primoDev13.setHost("PrimoDev");
        primoDev13.setTitulo("Quais habilidades um desenvolvedor precisa ter?");
        primoDev13.setDuracao(7.55f);
        primoDev13.reproduzir();
        primoDev13.reproduzir();
        primoDev13.classificar(5);
        primoDev13.favoritar();

        Favoritavel[] favoritos = {perdida, rosesAndGold, primoDev13};

        System.out.println("\n** Favoritos: **");
        for (Favoritavel favorito: favoritos){
            if (favorito.isFavorito())
                System.out.println(favorito);
        }

    }
}



