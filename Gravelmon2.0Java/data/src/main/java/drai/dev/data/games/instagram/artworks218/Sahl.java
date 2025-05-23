package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.sahl.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Sahl extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Sahl();
    private Sahl() {
        super("Sahl");
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

        addNewPokemon(new SahlianCobalion("", Aspect.SAHLIAN)); //TODO
        addNewPokemon(new SahlianTerrakion("", Aspect.SAHLIAN));
        addNewPokemon(new SahlianVirizion("", Aspect.SAHLIAN));

    }

}
