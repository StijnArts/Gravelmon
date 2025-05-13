package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.realidea.*;

public class Realidea extends Game {
    public static final Game INSTANCE = new Realidea();
    private Realidea() {
        super("RealideaSystem");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Meadew());
        addNewPokemon(new Ninfae());
        addNewPokemon(new Faeuna());
        addNewPokemon(new Mousic());
        addNewPokemon(new Rabatuta());
        addNewPokemon(new Flamelin());
        addNewPokemon(new Gulliby());
        addNewPokemon(new Saigull());
        addNewPokemon(new Seaghoul());
        addNewPokemon(new Faemie());
    }
}
