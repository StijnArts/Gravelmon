package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
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
        registerSoulstonesVariants();

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

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochRowlet("", Aspect.EPOCH));
        pokemon.add(new EpochDartrix("", Aspect.EPOCH));
        pokemon.add(new EpochDecidueye("", Aspect.EPOCH));
        pokemon.add(new EpochLitten("", Aspect.EPOCH));
        pokemon.add(new EpochTorracat("", Aspect.EPOCH));
        pokemon.add(new EpochIncineroar("", Aspect.EPOCH));
        pokemon.add(new EpochPopplio("", Aspect.EPOCH));
        pokemon.add(new EpochBrionne("", Aspect.EPOCH));
        pokemon.add(new EpochPrimarina("", Aspect.EPOCH));

        pokemon.add(new EpochMorelull("", Aspect.EPOCH));
        pokemon.add(new EpochShiinotic("", Aspect.EPOCH));
        pokemon.add(new EpochSandygast("", Aspect.EPOCH));
        pokemon.add(new EpochPalossand("", Aspect.EPOCH));
        pokemon.add(new EpochMareanie("", Aspect.EPOCH));
        pokemon.add(new EpochToxapex("", Aspect.EPOCH));
        pokemon.add(new EpochDewpider("", Aspect.EPOCH));
        pokemon.add(new EpochAraquanid("", Aspect.EPOCH));
        pokemon.add(new EpochCutiefly("", Aspect.EPOCH));
        pokemon.add(new EpochRibombee("", Aspect.EPOCH));
        pokemon.add(new EpochPikipek("", Aspect.EPOCH));
        pokemon.add(new EpochTrumbeak("", Aspect.EPOCH));
        pokemon.add(new EpochToucannon("", Aspect.EPOCH));
        pokemon.add(new EpochStufful("", Aspect.EPOCH));
        pokemon.add(new EpochBewear("", Aspect.EPOCH));
        pokemon.add(new EpochBounsweet("", Aspect.EPOCH));
        pokemon.add(new EpochSteenee("", Aspect.EPOCH));
        pokemon.add(new EpochTsareena("", Aspect.EPOCH));
        pokemon.add(new EpochBounsweetOne("", Aspect.EPOCH));
        pokemon.add(new EpochSteeneeOne("", Aspect.EPOCH));
        pokemon.add(new EpochTsareenaOne("", Aspect.EPOCH));
        pokemon.add(new EpochDewpiderOne("", Aspect.EPOCH));
        pokemon.add(new EpochAraquanidOne("", Aspect.EPOCH));
        pokemon.add(new EpochMimikyu("", Aspect.EPOCH));
        pokemon.add(new EpochJangmoo("", Aspect.EPOCH));
        pokemon.add(new EpochHakamoo("", Aspect.EPOCH));
        pokemon.add(new EpochKommoo("", Aspect.EPOCH));
        pokemon.add(new EpochDhelmise("", Aspect.EPOCH));
        pokemon.add(new EpochMudbray("", Aspect.EPOCH));
        pokemon.add(new EpochMudsdale("", Aspect.EPOCH));
        pokemon.add(new EpochSalandit("", Aspect.EPOCH));
        pokemon.add(new EpochSalazzle("", Aspect.EPOCH));
        pokemon.add(new EpochWimpod("", Aspect.EPOCH));
        pokemon.add(new EpochGolisopod("", Aspect.EPOCH));
        pokemon.add(new EpochComfey("", Aspect.EPOCH));

    }
}
