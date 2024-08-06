package drai.dev.data.games.pokemmo.instagram.artworks218;


import drai.dev.data.pokemon.elb.*;
import drai.dev.data.pokemon.elb.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Elb extends drai.dev.data.games.registry.Game {
    public Elb() {
        super("Elb");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Sweeking().setUsesBigModel());
        pokemon.add(new Appafrigion().setUsesBigModel());
        pokemon.add(new Cervelot().setUsesBigModel());
    }

}
