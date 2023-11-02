package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

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
        pokemon.add(new HoennianMareanie(747));
        pokemon.add(new HoennianToxapex(748));

        //Radical Red
        //pokemon.add(new SeviianWishiwashi(746));
        //pokemon.add(new SeviianDhelmise(781));

    }
}
