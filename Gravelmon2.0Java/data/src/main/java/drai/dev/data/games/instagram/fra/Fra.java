package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.fra.*;

public class Fra extends drai.dev.data.games.registry.Game {
    public Fra() {
        super("fra");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Yuvixy().setUsesBigModel());
        addNewPokemon(new Kyubicane().setUsesBigModel());
        addNewPokemon(new Awootic().setUsesBigModel());
        addNewPokemon(new Huskinu().setUsesBigModel());
        addNewPokemon(new Burrolar().setUsesBigModel());
        addNewPokemon(new Potling().setUsesBigModel());
        addNewPokemon(new Potthos().setUsesBigModel());
        addNewPokemon(new Gardelem().setUsesBigModel());
        addNewPokemon(new Kaizora().setUsesBigModel());
        addNewPokemon(new Duozora().setUsesBigModel());
        addNewPokemon(new Trizedora().setUsesBigModel());
        addNewPokemon(new Fiestavia().setUsesBigModel());
        addNewPokemon(new Pipengi().setUsesBigModel());
        addNewPokemon(new Volantile().setUsesBigModel());
        addNewPokemon(new Dradivetl().setUsesBigModel());
    }

}
