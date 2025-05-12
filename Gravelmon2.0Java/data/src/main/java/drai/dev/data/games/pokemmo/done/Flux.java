package drai.dev.data.games.pokemmo.done;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.altera.*;
import drai.dev.data.pokemon.flux.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Flux extends Game {
    public Flux() {super("Flux");}

    @Override
    public void registerPokemon() {
        addNewPokemon(new Mozz());
        addNewPokemon(new Mosseer());
        addNewPokemon(new Daemoth());
        addNewPokemon(new Chiklit());
        addNewPokemon(new Burnychus());
        addNewPokemon(new Pyropteryx());
        addNewPokemon(new Findolf());
        addNewPokemon(new Delfender());
        addNewPokemon(new Hydrocean());
        addNewPokemon(new Minyan());
        addNewPokemon(new Vilucard());
        addNewPokemon(new Lunapup());
        addNewPokemon(new Herolune());
        addNewPokemon(new Selkid());
        addNewPokemon(new Syrentide());
        addNewPokemon(new Cavamie());
        addNewPokemon(new Capymigo());
        addNewPokemon(new Humborb());
        addNewPokemon(new Navibri());
        addNewPokemon(new Turbolibri());
        addPokedexPokemon("ledyba, ledian-alteran");
        addNewPokemon(new Squrmy());
        addNewPokemon(new Durtwurm());
        addNewPokemon(new Wurmiterra());
        addPokedexPokemon("owten-alteran, eshouten-alteran");
        addNewPokemon(new Tanupy());
        addNewPokemon(new Tanscure());
        addNewPokemon(new Sluchuu());
        addNewPokemon(new Gullitt());
        addNewPokemon(new Garbagull());
        var nidorimewinter = new NidorimeWinterCoat();
        addNewPokemon(nidorimewinter);
        addNewPokemon(new NidorimeSummerCoat("NidorimeWinterCoat", Aspect.SUMMER));
        addNewPokemon(new Nidoregina());
        addNewPokemon(new Nidoregus());
        addNewPokemon(new Roadillo());
        addNewPokemon(new Armarauder());
        addNewPokemon(new Pouchelet());
        addNewPokemon(new Grimmposs());
        addNewPokemon(new Salmini());
        addNewPokemon(new SalmosaultFreshwater());
        addNewPokemon(new SalmosaultSaltwater());
        addNewPokemon(new Taroot());
        addNewPokemon(new Daikongus());
        addPokedexPokemon("shroomish-alteran, breloom-alteran");
        addNewPokemon(new Brontoloom());
        addNewPokemon(new Magief());
        addNewPokemon(new Corsuave());
//        addNewPokemon(new Raverogue()); Not Made yet
        addNewPokemon(new Zorotsune());
        addNewPokemon(new Nursa());
        addNewPokemon(new Cuspide());
        addNewPokemon(new Tarandible());
        addNewPokemon(new Gunafix());
        addNewPokemon(new Fixinit());
        addNewPokemon(new Artifixt());
        addNewPokemon(new Comite());
        addNewPokemon(new Cometeor());
        addNewPokemon(new Astronite());
        addNewPokemon(new Spelotl());
        addNewPokemon(new Salamancer());
        addNewPokemon(new Ledlite());
        addNewPokemon(new Insulatex());
        addNewPokemon(new Negawatt());
        addNewPokemon(new Sputya());
//        addNewPokemon(new Kosmisha()); Not Made yet
//        addNewPokemon(new Debrichka()); Not Made yet
        addNewPokemon(new Flager());
        addNewPokemon(new Inflagetah());
        addNewPokemon(new Jerbolta());
        addNewPokemon(new Karmilarie());
        addPokedexPokemon("ekans-alteran, arbok-alteran");
        addNewPokemon(new Scarablaze());
        addNewPokemon(new Cactana());
        addNewPokemon(new AlteranHagoop("", Aspect.ALTERAN));
        addNewPokemon(new Haagmaa());
        addNewPokemon(new Flintling());
        addNewPokemon(new Obsygnus());
//        addNewPokemon(new AlteranChimical()); //unfinished
        addNewPokemon(new Emberge());
        addNewPokemon(new Glubble());
        addNewPokemon(new Garblgoyle());
        addNewPokemon(new Aerapin());
        addNewPokemon(new Albashell());
        addNewPokemon(new Amperincus());
        addNewPokemon(new Ramhorn());
        addNewPokemon(new Purrchance());
        addNewPokemon(new Grizzlet());
        addNewPokemon(new Geogriff());
        addNewPokemon(new Diastryx());
    }
}
