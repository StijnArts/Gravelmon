package com.gravelmon.common.gravelmon.games.original;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.pokemon.blazingemerald.regional.*;
import com.gravelmon.common.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationSeven extends Original {
    public GenerationSeven() {
        super("generation7");
    }

    @Override
    public void registerPokemon() {
        //X-Species (Xenoverse)
        pokemon.add(new MareanieX(747));
        pokemon.add(new ToxapexX(748));
        pokemon.add(new PyukumukuX(771));
        pokemon.add(new TapuKokoX(785));
        pokemon.add(new TapuLeleX(786));
        pokemon.add(new TapuBuluX(787));
        pokemon.add(new TapuFiniX(788));

        //Pokemon Blazing Emerald
//        pokemon.add(new HoennianMareanie(747));
//        pokemon.add(new HoennianToxapex(748));

    }
}
