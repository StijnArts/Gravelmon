package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.blazingemerald.*;

public class BlazingEmerald extends Game {
    public BlazingEmerald() {
        super("BlazingEmerald");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Oreon());
        addNewPokemon(new Muramoth());
        addNewPokemon(new Lucemoth());
        addNewPokemon(new Drilladin());
        addNewPokemon(new Drasparath());
        addNewPokemon(new Mallarki());
        addNewPokemon(new Silviper());
        addNewPokemon(new Zangoro());
        addNewPokemon(new Goolossal());
        addNewPokemon(new Chrysalix());
        addNewPokemon(new Slingray());
        addNewPokemon(new Bawlfrog());
        addNewPokemon(new Vitellion());
        addNewPokemon(new Metunn());
    }
}
