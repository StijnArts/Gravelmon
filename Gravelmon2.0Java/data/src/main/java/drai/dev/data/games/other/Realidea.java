package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.realidea.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Realidea extends Game {
    public static final Game INSTANCE = new Realidea();
    private Realidea() {
        super("RealideaSystem", "https://discord.com/invite/gNmjGNDST9");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Meadew().addLabels(Label.STARTER));
        addNewPokemon(new Ninfae().addLabels(Label.STARTER));
        addNewPokemon(new Faeuna().addLabels(Label.STARTER));
        addNewPokemon(new Mousic().addLabels(Label.STARTER));
        addNewPokemon(new Rabatuta().addLabels(Label.STARTER));
        addNewPokemon(new Flamelin().addLabels(Label.STARTER));
        addNewPokemon(new Gulliby().addLabels(Label.STARTER));
        addNewPokemon(new Saigull().addLabels(Label.STARTER));
        addNewPokemon(new Seaghoul().addLabels(Label.STARTER));
        addNewPokemon(new Faemie().addLabels(Label.STARTER));
    }
}
