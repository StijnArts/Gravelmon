package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.nosto.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationSeven extends Game {
    public GenerationSeven() {
        super("generation7");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AfricanusanComfey("", Aspect.AFRICANUSAN));

        pokemon.add(new NovranPyukumuku("", Aspect.NOVRAN));

        pokemon.add(new QamoranSandygast("", Aspect.QAMORAN));

        pokemon.add(new NostanMorelull("", Aspect.NOSTAN));
        pokemon.add(new NostanShiinotic("", Aspect.NOSTAN, new Stats(405, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));

        pokemon.add(new VaritasianBounsweet("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianSteenee("", Aspect.VARITASIAN));

        //X-Species (Xenoverse)
        pokemon.add(new MareanieX("", Aspect.X));
        pokemon.add(new ToxapexX("Toxapex", Aspect.X));
        pokemon.add(new PyukumukuX("", Aspect.X));
        pokemon.add(new TapuKokoX("", Aspect.X));
        pokemon.add(new TapuLeleX("", Aspect.X));
        pokemon.add(new TapuBuluX("", Aspect.X));
        pokemon.add(new TapuFiniX("", Aspect.X));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianMareanie("", Aspect.HOENNIAN));
        pokemon.add(new HoennianToxapex("", Aspect.HOENNIAN));

        //Radical Red
        pokemon.add(new SeviianWishiwashi("", Aspect.SEVIIAN));
        pokemon.add(new SeviianDhelmise("", Aspect.SEVIIAN));

        //Pokemon Flux
        pokemon.add(new DeepWishiwashi("", Aspect.DEEP));

        //Vanguard
        pokemon.add(new AyreianCutiefly("", Aspect.AYREIAN));
        pokemon.add(new AyreianRibombee("", Aspect.AYREIAN));
        pokemon.add(new AyreianMimikyu("", Aspect.AYREIAN));

        pokemon.add(new AyreianYungoos("", Aspect.AYREIAN));
        pokemon.add(new AyreianGumshoos("", Aspect.AYREIAN));

        //Kaskadian
        pokemon.add(new KaskadianPalossand("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianBruxish("", Aspect.KASKADIAN));

        //Azure (Mystic)
        pokemon.add(new MysticStufful("", Aspect.MYSTIC));
        pokemon.add(new MysticBewear("", Aspect.MYSTIC));

    }
}
