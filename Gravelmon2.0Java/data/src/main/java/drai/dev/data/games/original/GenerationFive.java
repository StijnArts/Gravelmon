package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.ferran.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.interregional.regional.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.sahl.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class GenerationFive extends Game {
    public GenerationFive() {
        super("generation5");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AromianKlink("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        pokemon.add(new AromianKlang("", Aspect.AROMIAN).setUsesBigModel());
        pokemon.add(new AromianVanillite("", Aspect.AROMIAN).setUsesBigModel());
        pokemon.add(new AromianVanillish("", Aspect.AROMIAN).setUsesBigModel());

        pokemon.add(new FabelianYamask("", Aspect.FABELIAN).setUsesBigModel()); //tODo
        pokemon.add(new FabelianLillipup("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianHerdier("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianRoggenrola("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianBoldore("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianTimburr("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianGurdurr("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianWoobat("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianLitwick("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianLampent("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianChandelure("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianDeino("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianTornadus("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianThundurus("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianLandorus("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianLarvesta("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianTrubbish("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianGarbodor("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new SahlianCobalion("", Aspect.SAHLIAN).setUsesBigModel()); //TODO
        pokemon.add(new SahlianTerrakion("", Aspect.SAHLIAN).setUsesBigModel());
        pokemon.add(new SahlianVirizion("", Aspect.SAHLIAN).setUsesBigModel());

        pokemon.add(new FerranianPatrat("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
        pokemon.add(new FerranianWatchog("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianYamask("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianVirizion("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianTerrakion("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianCobalion("", Aspect.FERRANIAN).setUsesBigModel());

        pokemon.add(new PalmianPawniard("", Aspect.PALMIAN).setUsesBigModel()); //TODO
        pokemon.add(new PalmianBisharp("", Aspect.PALMIAN).setUsesBigModel());

//        pokemon.add(new PastelianGothita("", Aspect.PASTELIAN)); TODO
//        pokemon.add(new PastelianGothorita("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianGothitelle("", Aspect.PASTELIAN));

//        pokemon.add(new TheossianCottonee("", Aspect.THEOSSIAN)); TODO
//        pokemon.add(new TheossianWhimsicott("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianPetilil("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianLilligant("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianDwebble("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianCrustle("", Aspect.THEOSSIAN));

//        pokemon.add(new NodorranOshawott("", Aspect.NODORRAN)); TODO
//        pokemon.add(new NodorranDewott("", Aspect.NODORRAN));
//        pokemon.add(new NodorranSamurott("", Aspect.NODORRAN));
//        pokemon.add(new NodorranFoongus("", Aspect.NODORRAN));
//        pokemon.add(new NodorranAmoonguss("", Aspect.NODORRAN));
//        pokemon.add(new NodorranCubchoo("", Aspect.NODORRAN));
//        pokemon.add(new NodorranBeartic("", Aspect.NODORRAN));
//        pokemon.add(new NodorranTynamo("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new NodorranEelektrik("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new NodorranEelektross("", Aspect.NODORRAN)); MISSING ART

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanGothita("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanGothorita("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanGothitelle("", Aspect.AFRICANUSAN));

        pokemon.add(new LagoonanLitwick("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanLampent("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanChandelure("", Aspect.LAGOONAN));

//        pokemon.add(new IonosianKarrablast(588));   Missing Art
        pokemon.add(new IonosianDruddigon("", Aspect.IONOSIAN,
                new Stats(485, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of())));

        pokemon.add(new AvalossianVanillite("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianVanillish("", Aspect.AVALOSSIAN));

        addNewPokemon(new NovranHerdier("", Aspect.NOVRAN));
        addNewPokemon(new NovranStoutland("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanillite("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanillish("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanilluxe("", Aspect.NOVRAN));
        addNewPokemon(new NovranDruddigon("", Aspect.NOVRAN));

        addNewPokemon(new QamoranCubchoo("", Aspect.QAMORAN));
        addNewPokemon(new QamoranBeartic("", Aspect.QAMORAN));

        addNewPokemon(new VaritasianYamask("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlink("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlang("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTynamo("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektrik("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektross("", Aspect.VARITASIAN));

//        pokemon.add(new HavaiianOshawott(501)); Member of line Not Finished

        addNewPokemon(new InterianGenesect("", Aspect.INTERIAN));

//        pokemon.add(new NostanTrubbish()); Missing Art
//        pokemon.add(new NostanGarbodor()); Missing Art

        addNewPokemon(new NorheimanSigilyph("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanFoongus("", Aspect.NORHEIMAN));

        addNewPokemon(new HizianHeatmor("", Aspect.HIZIAN));
        addNewPokemon(new HizianDruddigon("", Aspect.HIZIAN));

        addNewPokemon(new AvorianMaractus("", Aspect.AVORIAN));

        //Pokemon Infinity
        addNewPokemon(new EghoTrubbish("", Aspect.EGHO));
        addNewPokemon(new EghoGarbodor("", Aspect.EGHO));

        //Pokemon Insurgance
        addNewPokemon(new DeltaSnivy("", Aspect.DELTA));
        addNewPokemon(new DeltaServine("", Aspect.DELTA));
        addNewPokemon(new DeltaSerperior("", Aspect.DELTA));
        addNewPokemon(new DeltaPurrloin("", Aspect.DELTA));
        addNewPokemon(new DeltaLiepard("", Aspect.DELTA));
        addNewPokemon(new DeltaVenipede("", Aspect.DELTA));
        addNewPokemon(new DeltaWhirlipede("", Aspect.DELTA));
        addNewPokemon(new DeltaScolipede("", Aspect.DELTA));
        addNewPokemon(new DeltaWaterPetilil("", Aspect.DELTA_WATER));
        addNewPokemon(new DeltaWaterLilligant("", Aspect.DELTA_WATER));
        addNewPokemon(new DeltaFairyPetilil("", Aspect.DELTA_FAIRY));
        addNewPokemon(new DeltaFairyLilligant("", Aspect.DELTA_FAIRY));
        addNewPokemon(new DeltaDarumaka("", Aspect.DELTA));
        addNewPokemon(new DeltaDarmanitan("", Aspect.DELTA));
        addNewPokemon(new DeltaMaractus("", Aspect.DELTA));
        addNewPokemon(new DeltaBerryDwebble("", Aspect.DELTA_BERRY));
        addNewPokemon(new DeltaBerryCrustle("", Aspect.DELTA_BERRY));
        addNewPokemon(new DeltaCakeDwebble("", Aspect.DELTA_CAKE));
        addNewPokemon(new DeltaCakeCrustle("", Aspect.DELTA_CAKE));
        addNewPokemon(new DeltaScraggy("", Aspect.DELTA));
        addNewPokemon(new DeltaScrafty("", Aspect.DELTA));
        addNewPokemon(new DeltaYamask("", Aspect.DELTA));
        addNewPokemon(new DeltaCofagrigus("", Aspect.DELTA));
        addNewPokemon(new DeltaSolosis("", Aspect.DELTA));
        addNewPokemon(new DeltaDuosion("", Aspect.DELTA));
        addNewPokemon(new DeltaReuniclus("", Aspect.DELTA));
        addNewPokemon(new DeltaEmolga("", Aspect.DELTA));
        addNewPokemon(new DeltaKarrablast("", Aspect.DELTA));
        addNewPokemon(new DeltaEscavalier("", Aspect.DELTA));
        addNewPokemon(new DeltaFoongus("", Aspect.DELTA));
        addNewPokemon(new DeltaAmoonguss("", Aspect.DELTA));
        addNewPokemon(new DeltaLitwick("", Aspect.DELTA));
        addNewPokemon(new DeltaLampent("", Aspect.DELTA));
        addNewPokemon(new DeltaChandelure("", Aspect.DELTA));
        addNewPokemon(new DeltaAxew("", Aspect.DELTA));
        addNewPokemon(new DeltaFraxure("", Aspect.DELTA));
        addNewPokemon(new DeltaHaxorus("", Aspect.DELTA));
        addNewPokemon(new DeltaGolett("", Aspect.DELTA));
        addNewPokemon(new DeltaGolurk("", Aspect.DELTA));
        addNewPokemon(new DeltaPawniard("", Aspect.DELTA));
        addNewPokemon(new DeltaBisharp("", Aspect.DELTA));
        addNewPokemon(new DeltaHeatmor("", Aspect.DELTA));
        addNewPokemon(new DeltaDeino("", Aspect.DELTA));
        addNewPokemon(new DeltaZweilous("", Aspect.DELTA));
        addNewPokemon(new DeltaHydreigon("", Aspect.DELTA));
        addNewPokemon(new DeltaLarvesta("", Aspect.DELTA));
        addNewPokemon(new DeltaVolcarona("", Aspect.DELTA));
        addNewPokemon(new DeltaMeloetta("", Aspect.DELTA));

        //X-Species (Xenoverse)
        addNewPokemon(new YamaskX("", Aspect.X));
        addNewPokemon(new CofagrigusX("", Aspect.X));
        addNewPokemon(new JoltikX("", Aspect.X));
        addNewPokemon(new GalvantulaX("", Aspect.X));
        addNewPokemon(new BisharpX("", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianMaractus("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSolosis("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDuosion("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianReuniclus("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEmolga("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTynamo("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektrik("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektross("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianPawniard("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianBisharp("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianBlitzle("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianZebstrika("", Aspect.SEVIIAN));

        addMythianPokemon();

        //Pokemon Flux
        addNewPokemon(new AlteranZorua("", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranRoggenrola("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranBoldore("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGigalith("", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianSnivy("", Aspect.AYREIAN));
        pokemon.add(new AyreianServine("", Aspect.AYREIAN));
        pokemon.add(new AyreianSerperior("", Aspect.AYREIAN));
        pokemon.add(new AyreianTepig("", Aspect.AYREIAN));
        pokemon.add(new AyreianPignite("", Aspect.AYREIAN));
        pokemon.add(new AyreianEmboar("", Aspect.AYREIAN));
        pokemon.add(new AyreianPidove("", Aspect.AYREIAN));
        pokemon.add(new AyreianTranquill("", Aspect.AYREIAN));
        pokemon.add(new AyreianUnfezant("", Aspect.AYREIAN));
        pokemon.add(new AyreianSandile("", Aspect.AYREIAN));
        pokemon.add(new AyreianKrokorok("", Aspect.AYREIAN));
        pokemon.add(new AyreianKrookodile("", Aspect.AYREIAN));
        pokemon.add(new AyreianAxew("", Aspect.AYREIAN));
        pokemon.add(new AyreianFraxure("", Aspect.AYREIAN));
        pokemon.add(new AyreianHaxorus("", Aspect.AYREIAN));
        pokemon.add(new AyreianDruddigon("", Aspect.AYREIAN));
//        pokemon.add(new AyreianHydreigon("", Aspect.AYREIAN));//MEMBER OF LINE NOT FINISHED
        pokemon.add(new AyreianTimburr("", Aspect.AYREIAN));
        pokemon.add(new AyreianGurdurr("", Aspect.AYREIAN));
        pokemon.add(new AyreianConkeldurr("", Aspect.AYREIAN));

        pokemon.add(new AyreianDwebble("", Aspect.AYREIAN));
        pokemon.add(new AyreianArchen("", Aspect.AYREIAN));
        pokemon.add(new AyreianArcheops("", Aspect.AYREIAN));
        pokemon.add(new AyreianMinccino("", Aspect.AYREIAN));
        pokemon.add(new AyreianCinccino("", Aspect.AYREIAN));
        pokemon.add(new AyreianDucklett("", Aspect.AYREIAN));
        pokemon.add(new AyreianSwanna("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanillite("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanillish("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanilluxe("", Aspect.AYREIAN));

        //Kaskadian
        pokemon.add(new KaskadianExcadrill("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianGurdurr("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianConkeldurr("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianSolosis("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianDuosion("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianReuniclus("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianGolett("", Aspect.KASKADIAN).setUsesBigModel());

        //Azure (Mystic)
        addNewPokemon(new MysticSolosis("", Aspect.MYSTIC));
        addNewPokemon(new MysticDuosion("", Aspect.MYSTIC));
        addNewPokemon(new MysticReuniclus("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranPetilil("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranLilligant("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGothitelle("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolett("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolurk("", Aspect.CEFIRAN));
    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochSnivy("", Aspect.EPOCH));
        pokemon.add(new EpochServine("", Aspect.EPOCH));
        pokemon.add(new EpochSerperior("", Aspect.EPOCH));
        pokemon.add(new EpochTepig("", Aspect.EPOCH));
        pokemon.add(new EpochPignite("", Aspect.EPOCH));
        pokemon.add(new EpochEmboar("", Aspect.EPOCH));

        pokemon.add(new EpochSolosis("", Aspect.EPOCH));
        pokemon.add(new EpochDuosion("", Aspect.EPOCH));
        pokemon.add(new EpochReuniclus("", Aspect.EPOCH));
        pokemon.add(new EpochRufflet("", Aspect.EPOCH));
        pokemon.add(new EpochBraviary("", Aspect.EPOCH));
        pokemon.add(new EpochTympole("", Aspect.EPOCH));
        pokemon.add(new EpochPalpitoad("", Aspect.EPOCH));
        pokemon.add(new EpochSeismitoad("", Aspect.EPOCH));
        pokemon.add(new EpochZorua("", Aspect.EPOCH));
        pokemon.add(new EpochZoroark("", Aspect.EPOCH));
        pokemon.add(new EpochDucklett("", Aspect.EPOCH));
        pokemon.add(new EpochSwanna("", Aspect.EPOCH));
        pokemon.add(new EpochGolett("", Aspect.EPOCH));
        pokemon.add(new EpochGolurk("", Aspect.EPOCH));
        pokemon.add(new EpochLarvesta("", Aspect.EPOCH));
        pokemon.add(new EpochVolcarona("", Aspect.EPOCH));
        pokemon.add(new EpochRoggenrola("", Aspect.EPOCH));
        pokemon.add(new EpochBoldore("", Aspect.EPOCH));
        pokemon.add(new EpochGigalith("", Aspect.EPOCH));
        pokemon.add(new EpochLillipup("", Aspect.EPOCH));
        pokemon.add(new EpochHerdier("", Aspect.EPOCH));
        pokemon.add(new EpochStoutland("", Aspect.EPOCH));
        pokemon.add(new EpochMinccino("", Aspect.EPOCH));
        pokemon.add(new EpochCinccino("", Aspect.EPOCH));
        pokemon.add(new EpochDruddigon("", Aspect.EPOCH));
        pokemon.add(new EpochWoobat("", Aspect.EPOCH));
        pokemon.add(new EpochSwoobat("", Aspect.EPOCH));
        pokemon.add(new EpochTimburr("", Aspect.EPOCH));
        pokemon.add(new EpochGurdurr("", Aspect.EPOCH));
        pokemon.add(new EpochConkeldurr("", Aspect.EPOCH));
        pokemon.add(new EpochLitwick("", Aspect.EPOCH));
        pokemon.add(new EpochLampent("", Aspect.EPOCH));
        pokemon.add(new EpochChandelure("", Aspect.EPOCH));
        pokemon.add(new EpochVanillite("", Aspect.EPOCH));
        pokemon.add(new EpochVanillish("", Aspect.EPOCH));
        pokemon.add(new EpochVanilluxe("", Aspect.EPOCH));
        pokemon.add(new EpochJoltik("", Aspect.EPOCH));
        pokemon.add(new EpochGalvantula("", Aspect.EPOCH));
        pokemon.add(new EpochCubchoo("", Aspect.EPOCH));
        pokemon.add(new EpochBeartic("", Aspect.EPOCH));
        pokemon.add(new EpochVenipede("", Aspect.EPOCH));
        pokemon.add(new EpochWhirlipede("", Aspect.EPOCH));
        pokemon.add(new EpochScolipede("", Aspect.EPOCH));
        pokemon.add(new EpochDeerling("", Aspect.EPOCH));
        pokemon.add(new EpochSawsbuck("", Aspect.EPOCH));
        pokemon.add(new EpochTynamo("", Aspect.EPOCH));
        pokemon.add(new EpochEelektrik("", Aspect.EPOCH));
        pokemon.add(new EpochEelektross("", Aspect.EPOCH));
        pokemon.add(new EpochBasculin("", Aspect.EPOCH));
        pokemon.add(new EpochPidove("", Aspect.EPOCH));
        pokemon.add(new EpochTranquill("", Aspect.EPOCH));
        pokemon.add(new EpochUnfezant("", Aspect.EPOCH));
        pokemon.add(new EpochDwebble("", Aspect.EPOCH));
        pokemon.add(new EpochCrustle("", Aspect.EPOCH));
        pokemon.add(new EpochDurant("", Aspect.EPOCH));
        pokemon.add(new EpochMeloetta("", Aspect.EPOCH));
        pokemon.add(new EpochDeino("", Aspect.EPOCH));
        pokemon.add(new EpochZweilous("", Aspect.EPOCH));
        pokemon.add(new EpochHydreigon("", Aspect.EPOCH));
        pokemon.add(new EpochYamask("", Aspect.EPOCH));
        pokemon.add(new EpochCofagrigus("", Aspect.EPOCH));
        pokemon.add(new EpochThroh("", Aspect.EPOCH));
        pokemon.add(new EpochSawk("", Aspect.EPOCH));
        pokemon.add(new EpochSandile("", Aspect.EPOCH));
        pokemon.add(new EpochKrokorok("", Aspect.EPOCH));
        pokemon.add(new EpochKrookodile("", Aspect.EPOCH));
        pokemon.add(new EpochPatrat("", Aspect.EPOCH));
        pokemon.add(new EpochWatchog("", Aspect.EPOCH));
        pokemon.add(new EpochGothita("", Aspect.EPOCH));
        pokemon.add(new EpochGothorita("", Aspect.EPOCH));
        pokemon.add(new EpochGothitelle("", Aspect.EPOCH));
        pokemon.add(new EpochVullaby("", Aspect.EPOCH));
        pokemon.add(new EpochMandibuzz("", Aspect.EPOCH));
        pokemon.add(new EpochFerroseed("", Aspect.EPOCH));
        pokemon.add(new EpochFerrothorn("", Aspect.EPOCH));
        pokemon.add(new EpochGothitaOne("", Aspect.EPOCH));
        pokemon.add(new EpochGothoritaOne("", Aspect.EPOCH));
        pokemon.add(new EpochGothitelleOne("", Aspect.EPOCH));
        pokemon.add(new EpochPurrloin("", Aspect.EPOCH));
        pokemon.add(new EpochLiepard("", Aspect.EPOCH));
        pokemon.add(new EpochTrubbish("", Aspect.EPOCH));
        pokemon.add(new EpochGarbodor("", Aspect.EPOCH));
        pokemon.add(new EpochKlink("", Aspect.EPOCH));
        pokemon.add(new EpochKlang("", Aspect.EPOCH));
        pokemon.add(new EpochKlinklang("", Aspect.EPOCH));
        pokemon.add(new EpochDarumaka("", Aspect.EPOCH));
        pokemon.add(new EpochDarmanitan("", Aspect.EPOCH));
        pokemon.add(new EpochRoggenrolaOne("", Aspect.EPOCH));
        pokemon.add(new EpochBoldoreOne("", Aspect.EPOCH));
        pokemon.add(new EpochGigalithOne("", Aspect.EPOCH));
        pokemon.add(new EpochVanilliteOne("", Aspect.EPOCH));
        pokemon.add(new EpochVanillishOne("", Aspect.EPOCH));
        pokemon.add(new EpochVanilluxeOne("", Aspect.EPOCH));
        pokemon.add(new EpochArchen("", Aspect.EPOCH));
        pokemon.add(new EpochArcheops("", Aspect.EPOCH));
        pokemon.add(new EpochTirtouga("", Aspect.EPOCH));
        pokemon.add(new EpochCarracosta("", Aspect.EPOCH));
        pokemon.add(new EpochMunna("", Aspect.EPOCH));
        pokemon.add(new EpochMusharna("", Aspect.EPOCH));
        pokemon.add(new EpochDrilbur("", Aspect.EPOCH));
        pokemon.add(new EpochExcadrill("", Aspect.EPOCH));
        pokemon.add(new EpochDrilburOne("", Aspect.EPOCH));
        pokemon.add(new EpochExcadrillOne("", Aspect.EPOCH));
        pokemon.add(new EpochSolosisOne("", Aspect.EPOCH));
        pokemon.add(new EpochDuosionOne("", Aspect.EPOCH));
        pokemon.add(new EpochReuniclusOne("", Aspect.EPOCH));
        pokemon.add(new EpochSewaddle("", Aspect.EPOCH));
        pokemon.add(new EpochSwadloon("", Aspect.EPOCH));
        pokemon.add(new EpochLeavanny("", Aspect.EPOCH));
        pokemon.add(new EpochTimburrOne("", Aspect.EPOCH));
        pokemon.add(new EpochGurdurrOne("", Aspect.EPOCH));
        pokemon.add(new EpochConkeldurrOne("", Aspect.EPOCH));
        pokemon.add(new EpochLarvestaOne("", Aspect.EPOCH));
        pokemon.add(new EpochVolcaronaOne("", Aspect.EPOCH));
        pokemon.add(new EpochFrillish("", Aspect.EPOCH));
        pokemon.add(new EpochJellicent("", Aspect.EPOCH));
        pokemon.add(new EpochBlitzle("", Aspect.EPOCH));
        pokemon.add(new EpochZebstrika("", Aspect.EPOCH));
        pokemon.add(new EpochEmolga("", Aspect.EPOCH));
        pokemon.add(new EpochElgyem("", Aspect.EPOCH));
        pokemon.add(new EpochBeheeyem("", Aspect.EPOCH));
        pokemon.add(new EpochScraggy("", Aspect.EPOCH));
        pokemon.add(new EpochScrafty("", Aspect.EPOCH));

    }

    private void addMythianPokemon() {
        addNewPokemon(new MythianZorua("", Aspect.MYTHIAN));
        addNewPokemon(new MythianZoroark("", Aspect.MYTHIAN));
        addNewPokemon(new MythianLarvesta("", Aspect.MYTHIAN));
        addNewPokemon(new MythianVolcarona("", Aspect.MYTHIAN));
    }
}
