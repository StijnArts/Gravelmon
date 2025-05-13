package drai.dev.data.games.instagram.artworks218;


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

    }

}
