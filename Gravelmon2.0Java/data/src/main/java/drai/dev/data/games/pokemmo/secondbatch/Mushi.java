package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.mushi.*;

public class Mushi extends drai.dev.data.games.registry.Game {
    public Mushi() {
        super("Mushi");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Bewilt());
        addNewPokemon(new Twirleef());
        addNewPokemon(new Pestrina());
        addNewPokemon(new Pyroki());
        addNewPokemon(new Formidet());
        addNewPokemon(new Formillant());
        addNewPokemon(new Micronaut());
        addNewPokemon(new Divernaut());
        addNewPokemon(new Tarpress());
        addNewPokemon(new Kawaiiko());
        addNewPokemon(new Moffluffle());
        addNewPokemon(new Hedodan());
        addNewPokemon(new Noxisekt());
        addNewPokemon(new Brahmbash());
        addNewPokemon(new Bramoth());
        addNewPokemon(new Kimfoo());
        addNewPokemon(new Kamabukee());
        addNewPokemon(new Collemboo());
        addNewPokemon(new Glastasma());
        addNewPokemon(new Lavalux());
        addNewPokemon(new Lampod());
        addNewPokemon(new Inzallum());
        addNewPokemon(new Sneacroach());
        addNewPokemon(new Stalroach()); //Renamed from Monstroach
        addNewPokemon(new Polvite());
        addNewPokemon(new Koromite());
        addNewPokemon(new Debribriz());
        addNewPokemon(new Terremotor());
        addNewPokemon(new Gomnom());
        addNewPokemon(new Caramello());
        addNewPokemon(new Goopest());
        addNewPokemon(new Shugatrix());
    }

}