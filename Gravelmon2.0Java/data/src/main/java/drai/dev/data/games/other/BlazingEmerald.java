package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.blazingemerald.*;

public class BlazingEmerald extends Game {
    public BlazingEmerald() {
        super("BlazingEmerald");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Oreon());
        pokemon.add(new Muramoth());
        pokemon.add(new Lucemoth());
        pokemon.add(new Drilladin());
        pokemon.add(new Drasparath());
        pokemon.add(new Mallarki());
        pokemon.add(new Silviper());
        pokemon.add(new Zangoro());
        pokemon.add(new Goolossal());
        pokemon.add(new Chrysalix());
        pokemon.add(new Slingray());
        pokemon.add(new Bawlfrog());
        pokemon.add(new Vitellion());
        pokemon.add(new Metunn());
    }
}
