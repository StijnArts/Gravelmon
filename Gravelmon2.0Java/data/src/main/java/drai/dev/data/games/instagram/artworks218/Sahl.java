package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.sahl.*;

public class Sahl extends drai.dev.data.games.registry.Game {
    public Sahl() {
        super("Sahl");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new Meikourkei().setUsesBigModel());
        addNewPokemon(new Regifly().setUsesBigModel());
        addNewPokemon(new Regibug().setUsesBigModel());
        addNewPokemon(new Suimoru().setUsesBigModel());
        addNewPokemon(new Kinmoru().setUsesBigModel());
        addNewPokemon(new Domoru().setUsesBigModel());
        addNewPokemon(new Araemon().setUsesBigModel());
    }

}
