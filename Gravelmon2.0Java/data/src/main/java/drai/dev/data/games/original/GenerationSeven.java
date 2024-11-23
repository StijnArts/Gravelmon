package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.nosto.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationSeven extends Game {
    public GenerationSeven() {
        super("generation7");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new QamoranSandygast("", Aspect.QAMORAN));

        addNewPokemon(new NostanMorelull("", Aspect.NOSTAN));
        addNewPokemon(new NostanShiinotic("", Aspect.NOSTAN, new Stats(405, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));

        addNewPokemon(new VaritasianBounsweet("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSteenee("", Aspect.VARITASIAN));

        //X-Species (Xenoverse)
        addNewPokemon(new MareanieX("", Aspect.X));
        addNewPokemon(new ToxapexX("Toxapex", Aspect.X));
        addNewPokemon(new PyukumukuX("", Aspect.X));
        addNewPokemon(new TapuKokoX("", Aspect.X));
        addNewPokemon(new TapuLeleX("", Aspect.X));
        addNewPokemon(new TapuBuluX("", Aspect.X));
        addNewPokemon(new TapuFiniX("", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianMareanie("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianToxapex("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianWishiwashi("", Aspect.SEVIIAN).fishingSpawnFromExisting());
        addNewPokemon(new SeviianDhelmise("", Aspect.SEVIIAN).fishingSpawnFromExisting());

        //Pokemon Flux
        addNewPokemon(new DeepWishiwashi("", Aspect.DEEP));

        //Vanguard
        addNewPokemon(new AyreianYungoos("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGumshoos("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianPalossand("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianBruxish("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticStufful("", Aspect.MYSTIC));
        addNewPokemon(new MysticBewear("", Aspect.MYSTIC));

    }
}
