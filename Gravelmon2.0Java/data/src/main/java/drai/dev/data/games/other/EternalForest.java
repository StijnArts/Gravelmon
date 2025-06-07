package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.eternalforest.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class EternalForest extends Game {
    public static final Game INSTANCE = new EternalForest();
    private EternalForest() {
        super("EternalForest");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Smettle().addLabels(Label.STARTER));
        addNewPokemon(new Smyucca().addLabels(Label.STARTER));
        addNewPokemon(new Demonagave().addLabels(Label.STARTER));
        addNewPokemon(new Pachyball().addLabels(Label.STARTER));
        addNewPokemon(new Pachyndou().addLabels(Label.STARTER));
        addNewPokemon(new Pachyvory().addLabels(Label.STARTER));
        addNewPokemon(new Squini().addLabels(Label.STARTER));
        addNewPokemon(new Squinja().addLabels(Label.STARTER));
        addNewPokemon(new Squartial().addLabels(Label.STARTER));
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
