package drai.dev.data.games.pokemmo;


import drai.dev.data.pokemon.mushi.*;

public class Mushi extends drai.dev.data.games.registry.Game {
    public Mushi() {
        super("Mushi");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Bewilt());
        pokemon.add(new Twirleef());
        pokemon.add(new Pestrina());
        pokemon.add(new Pyroki());
        pokemon.add(new Formidet());
        pokemon.add(new Formillant());
        pokemon.add(new Micronaut());
        pokemon.add(new Divernaut());
        pokemon.add(new Tarpress());
        pokemon.add(new Kawaiiko());
        pokemon.add(new Moffluffle());
        pokemon.add(new Hedodan());
        pokemon.add(new Noxisekt());

        //done
        pokemon.add(new Minicoo());
        pokemon.add(new Nimbuzz());
        pokemon.add(new Shipilla());
        pokemon.add(new Koucoon());
        pokemon.add(new Brahmbash());
        pokemon.add(new Bramoth());
        pokemon.add(new Bumbuzz());

        pokemon.add(new Kimfoo());
        pokemon.add(new Kamabukee());
        //done
        pokemon.add(new Convice());

        pokemon.add(new Collemboo());
        pokemon.add(new Glastasma());
        pokemon.add(new Lavalux());
        pokemon.add(new Lampod());
        pokemon.add(new Inzallum());
        pokemon.add(new Sneacroach());
        pokemon.add(new Stalroach()); //Renamed from Monstroach
        pokemon.add(new Polvite());
        pokemon.add(new Koromite());
        pokemon.add(new Debribriz());
        pokemon.add(new Terremotor());
        pokemon.add(new Gomnom());
        pokemon.add(new Caramello());
        pokemon.add(new Goopest());
        pokemon.add(new Shugatrix());
    }

}
