package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.ferran.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.data.pokemon.nosto.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class GenerationSeven extends Game {
    public GenerationSeven() {
        super("generation7");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new FabelianYungoos("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        addNewPokemon(new FabelianGumshoos("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianMudbray("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianMinior("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianSandygast("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianPyukumuku("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianDhelmise("", Aspect.FABELIAN).setUsesBigModel());
        addNewPokemon(new FabelianMimikyu("", Aspect.FABELIAN).setUsesBigModel());

        addNewPokemon(new MahalianSandygast("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        addNewPokemon(new MahalianPalossand("", Aspect.MAHALIAN).setUsesBigModel());
        addNewPokemon(new MahalianCrabrawler("", Aspect.MAHALIAN).setUsesBigModel());

        addNewPokemon(new FerranianBounsweet("", Aspect.FERRANIAN).setUsesBigModel()); //TODO

        addNewPokemon(new IvrisianPikipek("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        addNewPokemon(new IvrisianTrumbeak("", Aspect.IVRISIAN).setUsesBigModel());

        addNewPokemon(new MastenianKomala("", Aspect.MASTENIAN, new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanComfey("", Aspect.AFRICANUSAN));

        addNewPokemon(new NovranPyukumuku("", Aspect.NOVRAN));

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
        addNewPokemon(new AyreianCutiefly("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRibombee("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMimikyu("", Aspect.AYREIAN));

        addNewPokemon(new AyreianYungoos("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGumshoos("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianPalossand("", Aspect.KASKADIAN).setUsesBigModel());
        addNewPokemon(new KaskadianBruxish("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticStufful("", Aspect.MYSTIC));
        addNewPokemon(new MysticBewear("", Aspect.MYSTIC));

    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochRowlet("", Aspect.EPOCH));
        addNewPokemon(new EpochDartrix("", Aspect.EPOCH));
        addNewPokemon(new EpochDecidueye("", Aspect.EPOCH));
        addNewPokemon(new EpochLitten("", Aspect.EPOCH));
        addNewPokemon(new EpochTorracat("", Aspect.EPOCH));
        addNewPokemon(new EpochIncineroar("", Aspect.EPOCH));
        addNewPokemon(new EpochPopplio("", Aspect.EPOCH));
        addNewPokemon(new EpochBrionne("", Aspect.EPOCH));
        addNewPokemon(new EpochPrimarina("", Aspect.EPOCH));

        addNewPokemon(new EpochMorelull("", Aspect.EPOCH));
        addNewPokemon(new EpochShiinotic("", Aspect.EPOCH));
        addNewPokemon(new EpochSandygast("", Aspect.EPOCH));
        addNewPokemon(new EpochPalossand("", Aspect.EPOCH));
        addNewPokemon(new EpochMareanie("", Aspect.EPOCH));
        addNewPokemon(new EpochToxapex("", Aspect.EPOCH));
        addNewPokemon(new EpochDewpider("", Aspect.EPOCH));
        addNewPokemon(new EpochAraquanid("", Aspect.EPOCH));
        addNewPokemon(new EpochCutiefly("", Aspect.EPOCH));
        addNewPokemon(new EpochRibombee("", Aspect.EPOCH));
        addNewPokemon(new EpochPikipek("", Aspect.EPOCH));
        addNewPokemon(new EpochTrumbeak("", Aspect.EPOCH));
        addNewPokemon(new EpochToucannon("", Aspect.EPOCH));
        addNewPokemon(new EpochStufful("", Aspect.EPOCH));
        addNewPokemon(new EpochBewear("", Aspect.EPOCH));
        addNewPokemon(new EpochBounsweet("", Aspect.EPOCH));
        addNewPokemon(new EpochSteenee("", Aspect.EPOCH));
        addNewPokemon(new EpochTsareena("", Aspect.EPOCH));
        addNewPokemon(new EpochBounsweetOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSteeneeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTsareenaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDewpiderOne("", Aspect.EPOCH));
        addNewPokemon(new EpochAraquanidOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMimikyu("", Aspect.EPOCH));
        addNewPokemon(new EpochJangmoo("", Aspect.EPOCH));
        addNewPokemon(new EpochHakamoo("", Aspect.EPOCH));
        addNewPokemon(new EpochKommoo("", Aspect.EPOCH));
        addNewPokemon(new EpochDhelmise("", Aspect.EPOCH));
        addNewPokemon(new EpochMudbray("", Aspect.EPOCH));
        addNewPokemon(new EpochMudsdale("", Aspect.EPOCH));
        addNewPokemon(new EpochSalandit("", Aspect.EPOCH));
        addNewPokemon(new EpochSalazzle("", Aspect.EPOCH));
        addNewPokemon(new EpochWimpod("", Aspect.EPOCH));
        addNewPokemon(new EpochGolisopod("", Aspect.EPOCH));
        addNewPokemon(new EpochComfey("", Aspect.EPOCH));

    }
}
