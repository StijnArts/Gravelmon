package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.eternalforest.*;

public class EternalForest extends Game {
    public EternalForest() {
        super("EternalForest");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Smettle());
        addNewPokemon(new Smyucca());
        addNewPokemon(new Demonagave());
        addNewPokemon(new Pachyball());
        addNewPokemon(new Pachyndou());
        addNewPokemon(new Pachyvory());
        addNewPokemon(new Squini());
        addNewPokemon(new Squinja());
        addNewPokemon(new Squartial());
        addNewPokemon(new Wormini());
        addNewPokemon(new Wormeel());
        addNewPokemon(new Malarva());
        addNewPokemon(new Mosdeng());
        addNewPokemon(new Mosboom());
        addNewPokemon(new Antager());
        addNewPokemon(new Antoldier());
        addNewPokemon(new Hamerry());
        addNewPokemon(new Hamysos());
        addNewPokemon(new Goatanaa());
        addNewPokemon(new Goaturly());
        addNewPokemon(new Pomara());
        addNewPokemon(new Dashean());
        addNewPokemon(new Boonny());
        addNewPokemon(new Rabball());
        addNewPokemon(new Lagorite());
    }
}
