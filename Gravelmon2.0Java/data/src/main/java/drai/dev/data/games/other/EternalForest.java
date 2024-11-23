package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.eternalforest.*;

public class EternalForest extends Game {
    public EternalForest() {
        super("EternalForest");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Smettle().setUsesBigModel());
        addNewPokemon(new Smyucca().setUsesBigModel());
        addNewPokemon(new Demonagave().setUsesBigModel());
        addNewPokemon(new Pachyball().setUsesBigModel());
        addNewPokemon(new Pachyndou().setUsesBigModel());
        addNewPokemon(new Pachyvory().setUsesBigModel());
        addNewPokemon(new Squini().setUsesBigModel());
        addNewPokemon(new Squinja().setUsesBigModel());
        addNewPokemon(new Squartial().setUsesBigModel());
        addNewPokemon(new Wormini().setUsesBigModel());
        addNewPokemon(new Wormeel().setUsesBigModel());
        addNewPokemon(new Malarva().setUsesBigModel());
        addNewPokemon(new Mosdeng().setUsesBigModel());
        addNewPokemon(new Mosboom().setUsesBigModel());
        addNewPokemon(new Antager().setUsesBigModel());
        addNewPokemon(new Antoldier().setUsesBigModel());
        addNewPokemon(new Hamerry().setUsesBigModel());
        addNewPokemon(new Hamysos().setUsesBigModel());
        addNewPokemon(new Goatanaa().setUsesBigModel());
        addNewPokemon(new Goaturly().setUsesBigModel());
        addNewPokemon(new Pomara().setUsesBigModel());
        addNewPokemon(new Dashean().setUsesBigModel());
        addNewPokemon(new Boonny().setUsesBigModel());
        addNewPokemon(new Rabball().setUsesBigModel());
        addNewPokemon(new Lagorite().setUsesBigModel());
    }
}
