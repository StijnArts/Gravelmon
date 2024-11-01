package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.elb.*;

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
