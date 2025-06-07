package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Mushi extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Mushi();
    private Mushi() {
        super("Mushi");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Bewilt().addLabels(Label.STARTER));
        addNewPokemon(new Twirleef().addLabels(Label.STARTER));
        addNewPokemon(new Pestrina().addLabels(Label.STARTER));
        addNewPokemon(new Pyroki().addLabels(Label.STARTER));
        addNewPokemon(new Formidet().addLabels(Label.STARTER));
        addNewPokemon(new Formillant().addLabels(Label.STARTER));
        addNewPokemon(new Micronaut().addLabels(Label.STARTER));
        addNewPokemon(new Divernaut().addLabels(Label.STARTER));
        addNewPokemon(new Tarpress().addLabels(Label.STARTER));
        addNewPokemon(new Kawaiiko());
        addNewPokemon(new Moffluffle());
        addNewPokemon(new Hedodan());
        addNewPokemon(new Noxisekt());
        addNewPokemon(new Minicoo());
        addNewPokemon(new Nimbuzz());
        addNewPokemon(new Shipilla());
        addNewPokemon(new Koucoon());
        addNewPokemon(new Brahmbash());
        addNewPokemon(new Bramoth());
        addNewPokemon(new Bumbuzz());
        addNewPokemon(new Kimfoo());
        addNewPokemon(new Kamabukee());
        addNewPokemon(new Convice());

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
        addNewPokemon(new Sapeeko());
        addNewPokemon(new Grobolt());
        addNewPokemon(new Hydrone());
        addNewPokemon(new Astronet());
        addNewPokemon(new Terrantula());
    }

}
