package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.eternalforest.*;

public class EternalForest extends Game {
    public EternalForest() {
        super("EternalForest");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Smettle().setUsesBigModel());
        pokemon.add(new Smyucca().setUsesBigModel());
        pokemon.add(new Demonagave().setUsesBigModel());
        pokemon.add(new Pachyball().setUsesBigModel());
        pokemon.add(new Pachyndou().setUsesBigModel());
        pokemon.add(new Pachyvory().setUsesBigModel());
        pokemon.add(new Squini().setUsesBigModel());
        pokemon.add(new Squinja().setUsesBigModel());
        pokemon.add(new Squartial().setUsesBigModel());
        pokemon.add(new Wormini().setUsesBigModel());
        pokemon.add(new Wormeel().setUsesBigModel());
        pokemon.add(new Malarva().setUsesBigModel());
        pokemon.add(new Mosdeng().setUsesBigModel());
        pokemon.add(new Mosboom().setUsesBigModel());
        pokemon.add(new Antager().setUsesBigModel());
        pokemon.add(new Antoldier().setUsesBigModel());
        pokemon.add(new Hamerry().setUsesBigModel());
        pokemon.add(new Hamysos().setUsesBigModel());
        pokemon.add(new Goatanaa().setUsesBigModel());
        pokemon.add(new Goaturly().setUsesBigModel());
        pokemon.add(new Pomara().setUsesBigModel());
        pokemon.add(new Dashean().setUsesBigModel());
        pokemon.add(new Boonny().setUsesBigModel());
        pokemon.add(new Rabball().setUsesBigModel());
        pokemon.add(new Lagorite().setUsesBigModel());
    }
}
