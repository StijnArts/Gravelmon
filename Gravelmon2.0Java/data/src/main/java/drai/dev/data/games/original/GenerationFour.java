package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.hub.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.interregional.regional.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.rica.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class GenerationFour extends Game {
    public GenerationFour() {
        super("generation4");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AromianGabite("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        pokemon.add(new AromianGarchomp("", Aspect.AROMIAN).setUsesBigModel());
//
        pokemon.add(new FabelianSnover("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianChatot("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianPachirisu("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianGlameow("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianBidoof("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianBibarel("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianCherubi("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new MahalianMantyke("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianSpiritomb("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianHippopotas("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianHippowdon("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new IvrisianRiolu("", Aspect.IVRISIAN).setUsesBigModel()); //TODO

        pokemon.add(new PalmianGible("", Aspect.PALMIAN).setUsesBigModel()); //TODO
        pokemon.add(new PalmianGabite("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianGarchomp("", Aspect.PALMIAN, new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK, StatType.ATTACK))).setUsesBigModel());

        pokemon.add(new RaianianGible("", Aspect.RAIANIAN).setUsesBigModel()); //TODO
        pokemon.add(new RaianianGabite("", Aspect.RAIANIAN).setUsesBigModel());
        pokemon.add(new RaianianGarchomp("", Aspect.RAIANIAN, new Stats(600, BULKY_SUPPORT, List.of(ATTACK, ATTACK, ATTACK))).setUsesBigModel());
        pokemon.add(new RaianianLucario("", Aspect.RAIANIAN, new Stats(525, FAST_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new RaianianGallade("", Aspect.RAIANIAN, new Stats(518, FAST_PHYSICAL_ATTACKER, List.of(SPEED))).setUsesBigModel());

        pokemon.add(new TrizoranGible("", Aspect.TRIZORAN).setUsesBigModel()); //TODO
        pokemon.add(new TrizoranGabite("", Aspect.TRIZORAN).setUsesBigModel());
        pokemon.add(new TrizoranGarchomp("", Aspect.TRIZORAN, new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))).setUsesBigModel());

        pokemon.add(new NorseGible("", Aspect.NORSE).setUsesBigModel()); //TODO
        pokemon.add(new NorseGabite("", Aspect.NORSE).setUsesBigModel());
        pokemon.add(new NorseGarchomp("", Aspect.NORSE, new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE))).setUsesBigModel());

//        pokemon.add(new PastelianWeavile("", Aspect.PASTELIAN)); TODO

//        pokemon.add(new OlysosianSkorupi("", Aspect.OLYSOSIAN)); Missing Art
//        pokemon.add(new OlysosianDrapion("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new OlysosianBuneary("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
//        pokemon.add(new OlysosianLopunny("", Aspect.OLYSOSIAN)); Missing Art

//        pokemon.add(new TheossianShinx("", Aspect.THEOSSIAN)); TODO
//        pokemon.add(new TheossianLuxio("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianLuxray("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianCroagunk("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianToxicroak("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianYanmega("", Aspect.THEOSSIAN));

//        pokemon.add(new NodorranChimchar("", Aspect.NODORRAN)); TODO
//        pokemon.add(new NodorranMonferno("", Aspect.NODORRAN));
//        pokemon.add(new NodorranInfernape("", Aspect.NODORRAN));
//        pokemon.add(new NodorranDrifblim("", Aspect.NODORRAN));
//        pokemon.add(new NodorranDrifloon("", Aspect.NODORRAN));
//        pokemon.add(new NodorranHippopotas("", Aspect.NODORRAN));
//        pokemon.add(new NodorranHippowdon("", Aspect.NODORRAN));
//        pokemon.add(new NodorranProbopass("", Aspect.NODORRAN));
//        pokemon.add(new NodorranBonsly("", Aspect.NODORRAN));

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanBronzor("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanBronzong("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanCherubi("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanCherrim("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanKricketot("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanKricketune("", Aspect.AFRICANUSAN));

        addNewPokemon(new LagoonanFinneon("", Aspect.LAGOONAN).fishingSpawnFromExisting());
        addNewPokemon(new LagoonanLumineon("", Aspect.LAGOONAN).fishingSpawnFromExisting());

//        pokemon.add(new IonosianShellos(422));   Missing Stats
//        pokemon.add(new IonosianGastrodon(423));   Missing Art
//        pokemon.add(new IonosianMimeJr(439));   Missing Art
        pokemon.add(new IonosianMunchlax("", Aspect.IONOSIAN));

        pokemon.add(new AvalossianShellos("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianGastrodon("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianHappiny("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianGallade("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianDusknoir("", Aspect.AVALOSSIAN));

        addNewPokemon(new RicanShellos("", Aspect.RICAN));
        addNewPokemon(new RicanGastrodon("", Aspect.RICAN));

        addNewPokemon(new NovranCranidos("", Aspect.NOVRAN));
        addNewPokemon(new NovranRampardos("", Aspect.NOVRAN));
        addNewPokemon(new NovranBonsly("", Aspect.NOVRAN));
        addNewPokemon(new NovranCherubi("", Aspect.NOVRAN));
        addNewPokemon(new NovranCherrim("", Aspect.NOVRAN));

        addNewPokemon(new QamoranCombee("", Aspect.QAMORAN));
        addNewPokemon(new QamoranTangrowth("", Aspect.QAMORAN));

//        pokemon.add(new NorheimanShinx(403)); Member of line Not Finished
//        pokemon.add(new NorheimanLuxio(404)); Missing Art
//        pokemon.add(new NorheimanLuxray(405)); Member of line Not Finished
        addNewPokemon(new NorheimanMismagius("", Aspect.NORHEIMAN, new Stats(495, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));

//        pokemon.add(new VaritasianBonsly(438)); Member of line Not Finished
//        pokemon.add(new VaritasianMimeJr(439)); Missing Art
        addNewPokemon(new VaritasianMunchlax("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianMantyke(458)); Member of line Not Finished

        addNewPokemon(new InterianPiplup("", Aspect.INTERIAN));
        addNewPokemon(new InterianPrinplup("", Aspect.INTERIAN));
        addNewPokemon(new InterianEmpoleon("", Aspect.INTERIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new InterianArceus("", Aspect.INTERIAN));
//
        addNewPokemon(new HubianTogekiss("", Aspect.HUBIAN));

        addNewPokemon(new HizianMismagius("", Aspect.HIZIAN));
        addNewPokemon(new HizianHonchkrow("", Aspect.HIZIAN));
        addNewPokemon(new HizianGliscor("", Aspect.HIZIAN));
        addNewPokemon(new HizianSkorupi("", Aspect.HIZIAN));
        addNewPokemon(new HizianDrapion("", Aspect.HIZIAN));

        //Pokemon Infinity
        addNewPokemon(new EghoHappiny("", Aspect.EGHO));
        addNewPokemon(new EghoMagnezone("", Aspect.EGHO));
        addNewPokemon(new EghoTangrowth("", Aspect.EGHO));

        //Pokemon Insurgance
        addDeltaPokemon();

        //X-species
        addNewPokemon(new BudewX("", Aspect.X));
        addNewPokemon(new RoseradeX("", Aspect.X));
        addNewPokemon(new SpiritombX("", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianTangrowth("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianRegigigas("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianCarnivine("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMantyke("", Aspect.SEVIIAN));

        addMythianPokemon();

        //Daybreak
        addNewPokemon(new ArmiranGarchomp("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippopotas("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippowdon("", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianPachirisu("", Aspect.AYREIAN));
        pokemon.add(new AyreianMunchlax("", Aspect.AYREIAN));
        pokemon.add(new AyreianRiolu("", Aspect.AYREIAN));
        pokemon.add(new AyreianLucario("", Aspect.AYREIAN));
        pokemon.add(new AyreianMantyke("", Aspect.AYREIAN));
        pokemon.add(new AyreianGallade("", Aspect.AYREIAN));

        pokemon.add(new AyreianShinx("", Aspect.AYREIAN));
        pokemon.add(new AyreianLuxio("", Aspect.AYREIAN));
        pokemon.add(new AyreianLuxray("", Aspect.AYREIAN));
        pokemon.add(new AyreianBudew("", Aspect.AYREIAN));
        pokemon.add(new AyreianRoserade("", Aspect.AYREIAN));
        pokemon.add(new AyreianDrifloon("", Aspect.AYREIAN));
        pokemon.add(new AyreianDrifblim("", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicBudew("", Aspect.RELIC));
        addNewPokemon(new RelicRoserade("", Aspect.RELIC));
        addNewPokemon(new RelicAmbipom("", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianBidoof("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianBibarel("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianShinx("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianLuxio("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianLuxray("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianAmbipom("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new AmazeAllDrifblim("", Aspect.AMAZE_ALL));
        pokemon.add(new KaskadianSkuntank("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianSnover("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianAbomasnow("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new SolRotom("", Aspect.SOL));
        pokemon.add(new SwayRotom("", Aspect.SWAY));
        pokemon.add(new BrawlRotom("", Aspect.BRAWL));
        pokemon.add(new WebRotom("", Aspect.WEB));
        pokemon.add(new JunkRotom("", Aspect.JUNK));
        pokemon.add(new HomeRotom("", Aspect.HOME));
        pokemon.add(new BassRotom("", Aspect.BASS));
        pokemon.add(new TwirlRotom("", Aspect.TWIRL));
        pokemon.add(new MixRotom("", Aspect.MIX));

        //Azure (Mystic)
        addNewPokemon(new MysticRiolu("", Aspect.MYSTIC));
        addNewPokemon(new MysticLucario("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranSnover("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranAbomasnow("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFroslass("", Aspect.CEFIRAN));

    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochTurtwig("", Aspect.EPOCH));
        pokemon.add(new EpochGrotle("", Aspect.EPOCH));
        pokemon.add(new EpochTorterra("", Aspect.EPOCH));
        pokemon.add(new EpochChimchar("", Aspect.EPOCH));
        pokemon.add(new EpochMonferno("", Aspect.EPOCH));
        pokemon.add(new EpochInfernape("", Aspect.EPOCH));
        pokemon.add(new EpochPiplup("", Aspect.EPOCH));
        pokemon.add(new EpochPrinplup("", Aspect.EPOCH));
        pokemon.add(new EpochEmpoleon("", Aspect.EPOCH));

        pokemon.add(new EpochProbopass("", Aspect.EPOCH));
        pokemon.add(new EpochTangrowth("", Aspect.EPOCH));
        pokemon.add(new EpochFinneon("", Aspect.EPOCH));
        pokemon.add(new EpochLumineon("", Aspect.EPOCH));
        pokemon.add(new EpochGliscor("", Aspect.EPOCH));
        pokemon.add(new EpochDrifloon("", Aspect.EPOCH));
        pokemon.add(new EpochDrifblim("", Aspect.EPOCH));
        pokemon.add(new EpochBonsly("", Aspect.EPOCH));
        pokemon.add(new EpochElectivire("", Aspect.EPOCH));
        pokemon.add(new EpochMagmortar("", Aspect.EPOCH));
        pokemon.add(new EpochHippopotas("", Aspect.EPOCH));
        pokemon.add(new EpochHippowdon("", Aspect.EPOCH));
        pokemon.add(new EpochBronzor("", Aspect.EPOCH));
        pokemon.add(new EpochBronzong("", Aspect.EPOCH));
        pokemon.add(new EpochDusknoir("", Aspect.EPOCH));
        pokemon.add(new EpochLeafeon("", Aspect.EPOCH));
        pokemon.add(new EpochGlaceon("", Aspect.EPOCH));
        pokemon.add(new EpochShellos("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodon("", Aspect.EPOCH));
        pokemon.add(new EpochShellosOne("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonOne("", Aspect.EPOCH));
        pokemon.add(new EpochShellosTwo("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonTwo("", Aspect.EPOCH));
        pokemon.add(new EpochShellosThree("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonThree("", Aspect.EPOCH));
        pokemon.add(new EpochShellosFour("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonFour("", Aspect.EPOCH));
        pokemon.add(new EpochShellosFive("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonFive("", Aspect.EPOCH));
        pokemon.add(new EpochShellosSix("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonSix("", Aspect.EPOCH));
        pokemon.add(new EpochShellosSeven("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonSeven("", Aspect.EPOCH));
        pokemon.add(new EpochShellosEight("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonEight("", Aspect.EPOCH));
        pokemon.add(new EpochShellosNine("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonNine("", Aspect.EPOCH));
        pokemon.add(new EpochShellosTen("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonTen("", Aspect.EPOCH));
        pokemon.add(new EpochShellosEleven("", Aspect.EPOCH));
        pokemon.add(new EpochGastrodonEleven("", Aspect.EPOCH));
        pokemon.add(new EpochAmbipom("", Aspect.EPOCH));
        pokemon.add(new EpochStarly("", Aspect.EPOCH));
        pokemon.add(new EpochStaravia("", Aspect.EPOCH));
        pokemon.add(new EpochStaraptor("", Aspect.EPOCH));
        pokemon.add(new EpochKricketot("", Aspect.EPOCH));
        pokemon.add(new EpochKricketune("", Aspect.EPOCH));
        pokemon.add(new EpochStunky("", Aspect.EPOCH));
        pokemon.add(new EpochSkuntank("", Aspect.EPOCH));
        pokemon.add(new EpochCroagunk("", Aspect.EPOCH));
        pokemon.add(new EpochToxicroak("", Aspect.EPOCH));
        pokemon.add(new EpochYanmega("", Aspect.EPOCH));
        pokemon.add(new EpochSkorupi("", Aspect.EPOCH));
        pokemon.add(new EpochDrapion("", Aspect.EPOCH));
        pokemon.add(new EpochSpiritomb("", Aspect.EPOCH));
        pokemon.add(new EpochCherubi("", Aspect.EPOCH));
        pokemon.add(new EpochCherrim("", Aspect.EPOCH));
        pokemon.add(new EpochMantyke("", Aspect.EPOCH));
        pokemon.add(new EpochHappiny("", Aspect.EPOCH));
        pokemon.add(new EpochMagnezone("", Aspect.EPOCH));
        pokemon.add(new EpochShinx("", Aspect.EPOCH));
        pokemon.add(new EpochLuxio("", Aspect.EPOCH));
        pokemon.add(new EpochLuxray("", Aspect.EPOCH));
        pokemon.add(new EpochMamoswine("", Aspect.EPOCH));
        pokemon.add(new EpochBuneary("", Aspect.EPOCH));
        pokemon.add(new EpochLopunny("", Aspect.EPOCH));
        pokemon.add(new EpochBuizel("", Aspect.EPOCH));
        pokemon.add(new EpochFloatzel("", Aspect.EPOCH));
        pokemon.add(new EpochBudew("", Aspect.EPOCH));
        pokemon.add(new EpochRoserade("", Aspect.EPOCH));
        pokemon.add(new EpochGible("", Aspect.EPOCH));
        pokemon.add(new EpochGabite("", Aspect.EPOCH));
        pokemon.add(new EpochGarchomp("", Aspect.EPOCH));
        pokemon.add(new EpochMimejr("", Aspect.EPOCH));
        pokemon.add(new EpochShieldon("", Aspect.EPOCH));
        pokemon.add(new EpochBastiodon("", Aspect.EPOCH));
        pokemon.add(new EpochSnover("", Aspect.EPOCH));
        pokemon.add(new EpochAbomasnow("", Aspect.EPOCH));
        pokemon.add(new EpochGibleOne("", Aspect.EPOCH));
        pokemon.add(new EpochGabiteOne("", Aspect.EPOCH));
        pokemon.add(new EpochGarchompOne("", Aspect.EPOCH));
        pokemon.add(new EpochYanmegaOne("", Aspect.EPOCH));
        pokemon.add(new EpochMismagius("", Aspect.EPOCH));
        pokemon.add(new EpochRiolu("", Aspect.EPOCH));
        pokemon.add(new EpochLucario("", Aspect.EPOCH));
        pokemon.add(new EpochCranidos("", Aspect.EPOCH));
        pokemon.add(new EpochRampardos("", Aspect.EPOCH));
        pokemon.add(new EpochHonchkrow("", Aspect.EPOCH));
        pokemon.add(new EpochHonchkrowOne("", Aspect.EPOCH));
        pokemon.add(new EpochBidoof("", Aspect.EPOCH));
        pokemon.add(new EpochBibarel("", Aspect.EPOCH));
        pokemon.add(new EpochCarnivine("", Aspect.EPOCH));
        pokemon.add(new EpochMunchlax("", Aspect.EPOCH));
        pokemon.add(new EpochProbopassOne("", Aspect.EPOCH));
        pokemon.add(new EpochMamoswineOne("", Aspect.EPOCH));
        pokemon.add(new EpochChingling("", Aspect.EPOCH));
        pokemon.add(new EpochMagnezoneOne("", Aspect.EPOCH));
        pokemon.add(new EpochBudewOne("", Aspect.EPOCH));
        pokemon.add(new EpochRoseradeOne("", Aspect.EPOCH));
        pokemon.add(new EpochPorygonz("", Aspect.EPOCH));
        pokemon.add(new EpochFroslass("", Aspect.EPOCH));
        pokemon.add(new EpochGallade("", Aspect.EPOCH));
        pokemon.add(new EpochWeavile("", Aspect.EPOCH));

    }

    private void addDeltaPokemon() {
        addNewPokemon(new DeltaTurtwig("", Aspect.DELTA));
        addNewPokemon(new DeltaGrotle("", Aspect.DELTA));
        addNewPokemon(new DeltaTorterra("", Aspect.DELTA));
        addNewPokemon(new DeltaShinx("", Aspect.DELTA));
        addNewPokemon(new DeltaLuxio("", Aspect.DELTA));
        addNewPokemon(new DeltaLuxray("", Aspect.DELTA));
        addNewPokemon(new DeltaBudew("", Aspect.DELTA));
        addNewPokemon(new DeltaRoserade("", Aspect.DELTA));
        addNewPokemon(new DeltaCombee("", Aspect.DELTA));
        addNewPokemon(new DeltaVespiquen("", Aspect.DELTA));
        addNewPokemon(new DeltaAmbipom("", Aspect.DELTA));
        addNewPokemon(new DeltaDrifloon("", Aspect.DELTA));
        addNewPokemon(new DeltaDrifblim("", Aspect.DELTA));
        addNewPokemon(new DeltaBuneary("", Aspect.DELTA));
        addNewPokemon(new DeltaLopunny("", Aspect.DELTA));
        addNewPokemon(new DeltaMismagius("", Aspect.DELTA));
        addNewPokemon(new DeltaMunchlax("", Aspect.DELTA));
        addNewPokemon(new DeltaRiolu("", Aspect.DELTA));
        addNewPokemon(new DeltaLucario("", Aspect.DELTA));
        addNewPokemon(new DeltaCroagunk("", Aspect.DELTA));
        addNewPokemon(new DeltaToxicroak("", Aspect.DELTA));
        addNewPokemon(new DeltaTangrowth("", Aspect.DELTA));
        addNewPokemon(new DeltaElectivire("", Aspect.DELTA));
        addNewPokemon(new DeltaMagmortar("", Aspect.DELTA));
        addNewPokemon(new DeltaYanmega("", Aspect.DELTA));
        addNewPokemon(new DeltaGallade("", Aspect.DELTA));
        addNewPokemon(new DeltaFroslass("", Aspect.DELTA));
    }

    private void addMythianPokemon() {
        addNewPokemon(new MythianRiolu("", Aspect.MYTHIAN));
        addNewPokemon(new MythianLucario("", Aspect.MYTHIAN));
    }


}
