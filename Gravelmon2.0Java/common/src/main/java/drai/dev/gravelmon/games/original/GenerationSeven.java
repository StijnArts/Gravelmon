package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.nosto.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationSeven extends Game {
    public GenerationSeven() {
        super("generation7");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new QamoranSandygast(769));

        pokemon.add(new NostanMorelull(755));
        pokemon.add(new NostanShiinotic(756, new Stats(405, StatArchetype.SPECIAL_WALL,
                List.of(drai.dev.gravelmon.pokemon.attributes.Stats.StatType.SPEED))));

        pokemon.add(new VaritasianBounsweet(761));
        pokemon.add(new VaritasianSteenee(762));

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
        pokemon.add(new SeviianWishiwashi(746));
        pokemon.add(new SeviianDhelmise(781));

        //Pokemon Flux
        pokemon.add(new DeepWishiwashi(746));

        //Vanguard
        pokemon.add(new AyreianYungoos(734));
        pokemon.add(new AyreianGumshoos(735));

        //Kaskadian
        pokemon.add(new KaskadianPalossand(770));
        pokemon.add(new KaskadianBruxish(779));

        //Azure (Mystic)
        pokemon.add(new MysticStufful(759));
        pokemon.add(new MysticBewear(760));

    }
}
