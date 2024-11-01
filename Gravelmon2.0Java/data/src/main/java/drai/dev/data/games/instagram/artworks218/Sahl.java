package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.sahl.*;

public class Sahl extends drai.dev.data.games.registry.Game {
    public Sahl() {
        super("Sahl");
    }

    @Override
    public void registerPokemon() {

        pokemon.add(new Meikourkei().setUsesBigModel());
        pokemon.add(new Regifly().setUsesBigModel());
        pokemon.add(new Regibug().setUsesBigModel());
        pokemon.add(new Suimoru().setUsesBigModel());
        pokemon.add(new Kinmoru().setUsesBigModel());
        pokemon.add(new Domoru().setUsesBigModel());
        pokemon.add(new Araemon().setUsesBigModel());
    }

}
