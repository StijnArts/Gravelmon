package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.realidea.*;

public class Realidea extends Game {
    public Realidea() {
        super("RealideaSystem");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Meadew());
        pokemon.add(new Ninfae());
        pokemon.add(new Faeuna());
        pokemon.add(new Mousic());
        pokemon.add(new Rabatuta());
        pokemon.add(new Flamelin());
        pokemon.add(new Gulliby());
        pokemon.add(new Saigull());
        pokemon.add(new Seaghoul());
    }
}
