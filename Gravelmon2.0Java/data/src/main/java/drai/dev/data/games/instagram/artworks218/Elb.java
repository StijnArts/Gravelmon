package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.elb.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Elb extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Elb();
    private Elb() {
        super("Elb", "https://www.instagram.com/artworks218_/?hl=en");
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
        addNewPokemon(new ElbianSlakoth("", Aspect.ELBIAN)); //TODO
        addNewPokemon(new ElbianVigoroth("", Aspect.ELBIAN));
        addNewPokemon(new ElbianGulpin("", Aspect.ELBIAN));
        addNewPokemon(new ElbianSwalot("", Aspect.ELBIAN));
    }

}
