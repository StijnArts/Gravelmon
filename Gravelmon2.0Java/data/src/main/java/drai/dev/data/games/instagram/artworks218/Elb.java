package drai.dev.data.games.instagram.artworks218;


import drai.dev.gravelmon.pokemon.attributes.*;

public class Elb extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Elb();
    private Elb() {
        super("Elb");
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
