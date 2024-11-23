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
        pokemon.add(new FabelianYungoos("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianGumshoos("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMudbray("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMinior("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSandygast("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianPyukumuku("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianDhelmise("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMimikyu("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianSandygast("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianPalossand("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianCrabrawler("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new FerranianBounsweet("", Aspect.FERRANIAN).setUsesBigModel()); //TODO

        pokemon.add(new IvrisianPikipek("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        pokemon.add(new IvrisianTrumbeak("", Aspect.IVRISIAN).setUsesBigModel());

        pokemon.add(new MastenianKomala("", Aspect.MASTENIAN, new Stats(0, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))));

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanComfey("", Aspect.AFRICANUSAN));

        pokemon.add(new NovranPyukumuku("", Aspect.NOVRAN));

        pokemon.add(new QamoranSandygast("", Aspect.QAMORAN));

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
        pokemon.add(new AyreianCutiefly("", Aspect.AYREIAN));
        pokemon.add(new AyreianRibombee("", Aspect.AYREIAN));
        pokemon.add(new AyreianMimikyu("", Aspect.AYREIAN));

        pokemon.add(new AyreianYungoos("", Aspect.AYREIAN));
        pokemon.add(new AyreianGumshoos("", Aspect.AYREIAN));

        //Kaskadian
        pokemon.add(new KaskadianPalossand("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianBruxish("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticStufful("", Aspect.MYSTIC));
        addNewPokemon(new MysticBewear("", Aspect.MYSTIC));

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
