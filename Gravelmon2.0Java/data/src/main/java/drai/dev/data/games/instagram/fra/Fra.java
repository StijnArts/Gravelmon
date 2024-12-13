package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.fra.*;

public class Fra extends drai.dev.data.games.registry.Game {
    public Fra() {
        super("fra");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Yuvixy());
        addNewPokemon(new Kyubicane());
        addNewPokemon(new Awootic());
        addNewPokemon(new Huskinu());
        addNewPokemon(new Burrolar());
        addNewPokemon(new Potling());
        addNewPokemon(new Potthos());
        addNewPokemon(new Gardelem());
        addNewPokemon(new Kaizora().fishingSpawnFromExisting());
        addNewPokemon(new Duozora());
        addNewPokemon(new Trizedora());
        addNewPokemon(new Fiestavia());
        addNewPokemon(new Pipengi());
        addNewPokemon(new Volantile());
        addNewPokemon(new Dradivetl());
    }

}
