package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.elb.*;

public class Elb extends drai.dev.data.games.registry.Game {
    public Elb() {
        super("Elb");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Sweeking().setUsesBigModel());
        addNewPokemon(new Appafrigion().setUsesBigModel());
        addNewPokemon(new Cervelot().setUsesBigModel());
    }

}
