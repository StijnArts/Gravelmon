package drai.dev.data.games.instagram.fra;


import drai.dev.data.pokemon.fra.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//DONE
public class Fra extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Fra();
    private Fra() {
        super("fra");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
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
