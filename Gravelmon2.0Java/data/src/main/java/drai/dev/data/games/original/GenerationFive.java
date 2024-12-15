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
        addNewPokemon(new AromianKlink("", Aspect.AROMIAN)); //TODO
        addNewPokemon(new AromianKlang("", Aspect.AROMIAN));
        addNewPokemon(new AromianVanillite("", Aspect.AROMIAN));
        addNewPokemon(new AromianVanillish("", Aspect.AROMIAN));

        addNewPokemon(new FabelianYamask("", Aspect.FABELIAN)); //tODo
        addNewPokemon(new FabelianLillipup("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHerdier("", Aspect.FABELIAN));
        addNewPokemon(new FabelianRoggenrola("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBoldore("", Aspect.FABELIAN));
        addNewPokemon(new FabelianTimburr("", Aspect.FABELIAN));
        addNewPokemon(new FabelianGurdurr("", Aspect.FABELIAN));
        addNewPokemon(new FabelianWoobat("", Aspect.FABELIAN));
        addNewPokemon(new FabelianLitwick("", Aspect.FABELIAN));
        addNewPokemon(new FabelianLampent("", Aspect.FABELIAN));
        addNewPokemon(new FabelianChandelure("", Aspect.FABELIAN));
        addNewPokemon(new FabelianDeino("", Aspect.FABELIAN));

        addNewPokemon(new MahalianTornadus("", Aspect.MAHALIAN)); //TODO
        addNewPokemon(new MahalianThundurus("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianLandorus("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianLarvesta("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianTrubbish("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianGarbodor("", Aspect.MAHALIAN));

        addNewPokemon(new SahlianCobalion("", Aspect.SAHLIAN)); //TODO
        addNewPokemon(new SahlianTerrakion("", Aspect.SAHLIAN));
        addNewPokemon(new SahlianVirizion("", Aspect.SAHLIAN));

        addNewPokemon(new FerranianPatrat("", Aspect.FERRANIAN)); //TODO
        addNewPokemon(new FerranianWatchog("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianYamask("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianVirizion("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianTerrakion("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianCobalion("", Aspect.FERRANIAN));

        addNewPokemon(new PalmianPawniard("", Aspect.PALMIAN)); //TODO
        addNewPokemon(new PalmianBisharp("", Aspect.PALMIAN));

//        addNewPokemon(new PastelianGothita("", Aspect.PASTELIAN)); TODO
//        addNewPokemon(new PastelianGothorita("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianGothitelle("", Aspect.PASTELIAN));

//        addNewPokemon(new TheossianCottonee("", Aspect.THEOSSIAN)); TODO
//        addNewPokemon(new TheossianWhimsicott("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianPetilil("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianLilligant("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianDwebble("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianCrustle("", Aspect.THEOSSIAN));

//        addNewPokemon(new NodorranOshawott("", Aspect.NODORRAN)); TODO
//        addNewPokemon(new NodorranDewott("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranSamurott("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranFoongus("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranAmoonguss("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranCubchoo("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranBeartic("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranTynamo("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranEelektrik("", Aspect.NODORRAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new NodorranEelektross("", Aspect.NODORRAN)); MISSING ART

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanGothita("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanGothorita("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanGothitelle("", Aspect.AFRICANUSAN));

        addNewPokemon(new LagoonanLitwick("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanLampent("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanChandelure("", Aspect.LAGOONAN));

//        addNewPokemon(new IonosianKarrablast(588));   Missing Art
        addNewPokemon(new IonosianDruddigon("", Aspect.IONOSIAN,
                new Stats(485, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of())));

        addNewPokemon(new AvalossianVanillite("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVanillish("", Aspect.AVALOSSIAN));

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

//        addNewPokemon(new HavaiianOshawott(501)); Member of line Not Finished

        addNewPokemon(new InterianGenesect("", Aspect.INTERIAN));

//        addNewPokemon(new NostanTrubbish()); Missing Art
//        addNewPokemon(new NostanGarbodor()); Missing Art

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

        //Pokemon Flux
        addNewPokemon(new AlteranZorua("", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranRoggenrola("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranBoldore("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGigalith("", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianSnivy("", Aspect.AYREIAN));
        addNewPokemon(new AyreianServine("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSerperior("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTepig("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPignite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianEmboar("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidove("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTranquill("", Aspect.AYREIAN));
        addNewPokemon(new AyreianUnfezant("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSandile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKrokorok("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKrookodile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAxew("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFraxure("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHaxorus("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDruddigon("", Aspect.AYREIAN));
//        addNewPokemon(new AyreianHydreigon("", Aspect.AYREIAN));//MEMBER OF LINE NOT FINISHED
        addNewPokemon(new AyreianTimburr("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGurdurr("", Aspect.AYREIAN));
        addNewPokemon(new AyreianConkeldurr("", Aspect.AYREIAN));

        addNewPokemon(new AyreianDwebble("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArchen("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArcheops("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDucklett("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwanna("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillish("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanilluxe("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianExcadrill("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGurdurr("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianConkeldurr("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianSolosis("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDuosion("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianReuniclus("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGolett("", Aspect.KASKADIAN));

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
        addNewPokemon(new EpochSnivy("", Aspect.EPOCH));
        addNewPokemon(new EpochServine("", Aspect.EPOCH));
        addNewPokemon(new EpochSerperior("", Aspect.EPOCH));
        addNewPokemon(new EpochTepig("", Aspect.EPOCH));
        addNewPokemon(new EpochPignite("", Aspect.EPOCH));
        addNewPokemon(new EpochEmboar("", Aspect.EPOCH));

        addNewPokemon(new EpochSolosis("", Aspect.EPOCH));
        addNewPokemon(new EpochDuosion("", Aspect.EPOCH));
        addNewPokemon(new EpochReuniclus("", Aspect.EPOCH));
        addNewPokemon(new EpochRufflet("", Aspect.EPOCH));
        addNewPokemon(new EpochBraviary("", Aspect.EPOCH));
        addNewPokemon(new EpochTympole("", Aspect.EPOCH));
        addNewPokemon(new EpochPalpitoad("", Aspect.EPOCH));
        addNewPokemon(new EpochSeismitoad("", Aspect.EPOCH));
        addNewPokemon(new EpochZorua("", Aspect.EPOCH));
        addNewPokemon(new EpochZoroark("", Aspect.EPOCH));
        addNewPokemon(new EpochDucklett("", Aspect.EPOCH));
        addNewPokemon(new EpochSwanna("", Aspect.EPOCH));
        addNewPokemon(new EpochGolett("", Aspect.EPOCH));
        addNewPokemon(new EpochGolurk("", Aspect.EPOCH));
        addNewPokemon(new EpochLarvesta("", Aspect.EPOCH));
        addNewPokemon(new EpochVolcarona("", Aspect.EPOCH));
        addNewPokemon(new EpochRoggenrola("", Aspect.EPOCH));
        addNewPokemon(new EpochBoldore("", Aspect.EPOCH));
        addNewPokemon(new EpochGigalith("", Aspect.EPOCH));
        addNewPokemon(new EpochLillipup("", Aspect.EPOCH));
        addNewPokemon(new EpochHerdier("", Aspect.EPOCH));
        addNewPokemon(new EpochStoutland("", Aspect.EPOCH));
        addNewPokemon(new EpochMinccino("", Aspect.EPOCH));
        addNewPokemon(new EpochCinccino("", Aspect.EPOCH));
        addNewPokemon(new EpochDruddigon("", Aspect.EPOCH));
        addNewPokemon(new EpochWoobat("", Aspect.EPOCH));
        addNewPokemon(new EpochSwoobat("", Aspect.EPOCH));
        addNewPokemon(new EpochTimburr("", Aspect.EPOCH));
        addNewPokemon(new EpochGurdurr("", Aspect.EPOCH));
        addNewPokemon(new EpochConkeldurr("", Aspect.EPOCH));
        addNewPokemon(new EpochLitwick("", Aspect.EPOCH));
        addNewPokemon(new EpochLampent("", Aspect.EPOCH));
        addNewPokemon(new EpochChandelure("", Aspect.EPOCH));
        addNewPokemon(new EpochVanillite("", Aspect.EPOCH));
        addNewPokemon(new EpochVanillish("", Aspect.EPOCH));
        addNewPokemon(new EpochVanilluxe("", Aspect.EPOCH));
        addNewPokemon(new EpochJoltik("", Aspect.EPOCH));
        addNewPokemon(new EpochGalvantula("", Aspect.EPOCH));
        addNewPokemon(new EpochCubchoo("", Aspect.EPOCH));
        addNewPokemon(new EpochBeartic("", Aspect.EPOCH));
        addNewPokemon(new EpochVenipede("", Aspect.EPOCH));
        addNewPokemon(new EpochWhirlipede("", Aspect.EPOCH));
        addNewPokemon(new EpochScolipede("", Aspect.EPOCH));
        addNewPokemon(new EpochDeerling("", Aspect.EPOCH));
        addNewPokemon(new EpochSawsbuck("", Aspect.EPOCH));
        addNewPokemon(new EpochTynamo("", Aspect.EPOCH));
        addNewPokemon(new EpochEelektrik("", Aspect.EPOCH));
        addNewPokemon(new EpochEelektross("", Aspect.EPOCH));
        addNewPokemon(new EpochBasculin("", Aspect.EPOCH));
        addNewPokemon(new EpochPidove("", Aspect.EPOCH));
        addNewPokemon(new EpochTranquill("", Aspect.EPOCH));
        addNewPokemon(new EpochUnfezant("", Aspect.EPOCH));
        addNewPokemon(new EpochDwebble("", Aspect.EPOCH));
        addNewPokemon(new EpochCrustle("", Aspect.EPOCH));
        addNewPokemon(new EpochDurant("", Aspect.EPOCH));
        addNewPokemon(new EpochMeloetta("", Aspect.EPOCH));
        addNewPokemon(new EpochDeino("", Aspect.EPOCH));
        addNewPokemon(new EpochZweilous("", Aspect.EPOCH));
        addNewPokemon(new EpochHydreigon("", Aspect.EPOCH));
        addNewPokemon(new EpochYamask("", Aspect.EPOCH));
        addNewPokemon(new EpochCofagrigus("", Aspect.EPOCH));
        addNewPokemon(new EpochThroh("", Aspect.EPOCH));
        addNewPokemon(new EpochSawk("", Aspect.EPOCH));
        addNewPokemon(new EpochSandile("", Aspect.EPOCH));
        addNewPokemon(new EpochKrokorok("", Aspect.EPOCH));
        addNewPokemon(new EpochKrookodile("", Aspect.EPOCH));
        addNewPokemon(new EpochPatrat("", Aspect.EPOCH));
        addNewPokemon(new EpochWatchog("", Aspect.EPOCH));
        addNewPokemon(new EpochGothita("", Aspect.EPOCH));
        addNewPokemon(new EpochGothorita("", Aspect.EPOCH));
        addNewPokemon(new EpochGothitelle("", Aspect.EPOCH));
        addNewPokemon(new EpochVullaby("", Aspect.EPOCH));
        addNewPokemon(new EpochMandibuzz("", Aspect.EPOCH));
        addNewPokemon(new EpochFerroseed("", Aspect.EPOCH));
        addNewPokemon(new EpochFerrothorn("", Aspect.EPOCH));
        addNewPokemon(new EpochGothitaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGothoritaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGothitelleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPurrloin("", Aspect.EPOCH));
        addNewPokemon(new EpochLiepard("", Aspect.EPOCH));
        addNewPokemon(new EpochTrubbish("", Aspect.EPOCH));
        addNewPokemon(new EpochGarbodor("", Aspect.EPOCH));
        addNewPokemon(new EpochKlink("", Aspect.EPOCH));
        addNewPokemon(new EpochKlang("", Aspect.EPOCH));
        addNewPokemon(new EpochKlinklang("", Aspect.EPOCH));
        addNewPokemon(new EpochDarumaka("", Aspect.EPOCH));
        addNewPokemon(new EpochDarmanitan("", Aspect.EPOCH));
        addNewPokemon(new EpochRoggenrolaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBoldoreOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGigalithOne("", Aspect.EPOCH));
        addNewPokemon(new EpochVanilliteOne("", Aspect.EPOCH));
        addNewPokemon(new EpochVanillishOne("", Aspect.EPOCH));
        addNewPokemon(new EpochVanilluxeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochArchen("", Aspect.EPOCH));
        addNewPokemon(new EpochArcheops("", Aspect.EPOCH));
        addNewPokemon(new EpochTirtouga("", Aspect.EPOCH));
        addNewPokemon(new EpochCarracosta("", Aspect.EPOCH));
        addNewPokemon(new EpochMunna("", Aspect.EPOCH));
        addNewPokemon(new EpochMusharna("", Aspect.EPOCH));
        addNewPokemon(new EpochDrilbur("", Aspect.EPOCH));
        addNewPokemon(new EpochExcadrill("", Aspect.EPOCH));
        addNewPokemon(new EpochDrilburOne("", Aspect.EPOCH));
        addNewPokemon(new EpochExcadrillOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSolosisOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDuosionOne("", Aspect.EPOCH));
        addNewPokemon(new EpochReuniclusOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSewaddle("", Aspect.EPOCH));
        addNewPokemon(new EpochSwadloon("", Aspect.EPOCH));
        addNewPokemon(new EpochLeavanny("", Aspect.EPOCH));
        addNewPokemon(new EpochTimburrOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGurdurrOne("", Aspect.EPOCH));
        addNewPokemon(new EpochConkeldurrOne("", Aspect.EPOCH));
        addNewPokemon(new EpochLarvestaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochVolcaronaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochFrillish("", Aspect.EPOCH));
        addNewPokemon(new EpochJellicent("", Aspect.EPOCH));
        addNewPokemon(new EpochBlitzle("", Aspect.EPOCH));
        addNewPokemon(new EpochZebstrika("", Aspect.EPOCH));
        addNewPokemon(new EpochEmolga("", Aspect.EPOCH));
        addNewPokemon(new EpochElgyem("", Aspect.EPOCH));
        addNewPokemon(new EpochBeheeyem("", Aspect.EPOCH));
        addNewPokemon(new EpochScraggy("", Aspect.EPOCH));
        addNewPokemon(new EpochScrafty("", Aspect.EPOCH));
    }
}
