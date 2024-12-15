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
        addNewPokemon(new AromianGabite("", Aspect.AROMIAN)); //TODO
        addNewPokemon(new AromianGarchomp("", Aspect.AROMIAN));
//
        addNewPokemon(new FabelianSnover("", Aspect.FABELIAN)); //TODO
        addNewPokemon(new FabelianChatot("", Aspect.FABELIAN));
        addNewPokemon(new FabelianPachirisu("", Aspect.FABELIAN));
        addNewPokemon(new FabelianGlameow("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBidoof("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBibarel("", Aspect.FABELIAN));
        addNewPokemon(new FabelianCherubi("", Aspect.FABELIAN));
        addNewPokemon(new MahalianMantyke("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new MahalianSpiritomb("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianHippopotas("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianHippowdon("", Aspect.MAHALIAN));

        addNewPokemon(new IvrisianRiolu("", Aspect.IVRISIAN)); //TODO

        addNewPokemon(new PalmianGible("", Aspect.PALMIAN));
        addNewPokemon(new PalmianGabite("", Aspect.PALMIAN));
        addNewPokemon(new PalmianGarchomp("", Aspect.PALMIAN, new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK, StatType.ATTACK))));

        addNewPokemon(new RaianianGible("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianGabite("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianGarchomp("", Aspect.RAIANIAN, new Stats(600, BULKY_SUPPORT, List.of(ATTACK, ATTACK, ATTACK))));
        addNewPokemon(new RaianianLucario("", Aspect.RAIANIAN, new Stats(525, FAST_SPECIAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new RaianianGallade("", Aspect.RAIANIAN, new Stats(518, FAST_PHYSICAL_ATTACKER, List.of(SPEED))));

        addNewPokemon(new TrizoranGible("", Aspect.TRIZORAN));
        addNewPokemon(new TrizoranGabite("", Aspect.TRIZORAN));
        addNewPokemon(new TrizoranGarchomp("", Aspect.TRIZORAN, new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED, StatType.SPECIAL_ATTACK))));

        addNewPokemon(new NorseGible("", Aspect.NORSE));
        addNewPokemon(new NorseGabite("", Aspect.NORSE));
        addNewPokemon(new NorseGarchomp("", Aspect.NORSE, new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE))));

//        addNewPokemon(new PastelianWeavile("", Aspect.PASTELIAN)); TODO

//        addNewPokemon(new OlysosianSkorupi("", Aspect.OLYSOSIAN)); Missing Art
//        addNewPokemon(new OlysosianDrapion("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new OlysosianBuneary("", Aspect.OLYSOSIAN)); MEMBER OF LINE NOT FINISHED
//        addNewPokemon(new OlysosianLopunny("", Aspect.OLYSOSIAN)); Missing Art

//        addNewPokemon(new TheossianShinx("", Aspect.THEOSSIAN)); TODO
//        addNewPokemon(new TheossianLuxio("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianLuxray("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianCroagunk("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianToxicroak("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianYanmega("", Aspect.THEOSSIAN));

//        addNewPokemon(new NodorranChimchar("", Aspect.NODORRAN)); TODO
//        addNewPokemon(new NodorranMonferno("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranInfernape("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranDrifblim("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranDrifloon("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranHippopotas("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranHippowdon("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranProbopass("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranBonsly("", Aspect.NODORRAN));

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanBronzor("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanBronzong("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanCherubi("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanCherrim("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanKricketot("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanKricketune("", Aspect.AFRICANUSAN));

        addNewPokemon(new LagoonanFinneon("", Aspect.LAGOONAN).fishingSpawnFromExisting());
        addNewPokemon(new LagoonanLumineon("", Aspect.LAGOONAN).fishingSpawnFromExisting());

//        addNewPokemon(new IonosianShellos(422));   Missing Stats
//        addNewPokemon(new IonosianGastrodon(423));   Missing Art
//        addNewPokemon(new IonosianMimeJr(439));   Missing Art
        addNewPokemon(new IonosianMunchlax("", Aspect.IONOSIAN));

        addNewPokemon(new AvalossianShellos("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGastrodon("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianHappiny("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGallade("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianDusknoir("", Aspect.AVALOSSIAN));

        addNewPokemon(new RicanShellos("", Aspect.RICAN));
        addNewPokemon(new RicanGastrodon("", Aspect.RICAN));

        addNewPokemon(new NovranCranidos("", Aspect.NOVRAN));
        addNewPokemon(new NovranRampardos("", Aspect.NOVRAN));
        addNewPokemon(new NovranBonsly("", Aspect.NOVRAN));
        addNewPokemon(new NovranCherubi("", Aspect.NOVRAN));
        addNewPokemon(new NovranCherrim("", Aspect.NOVRAN));

        addNewPokemon(new QamoranCombee("", Aspect.QAMORAN));
        addNewPokemon(new QamoranTangrowth("", Aspect.QAMORAN));

//        addNewPokemon(new NorheimanShinx(403)); Member of line Not Finished
//        addNewPokemon(new NorheimanLuxio(404)); Missing Art
//        addNewPokemon(new NorheimanLuxray(405)); Member of line Not Finished
        addNewPokemon(new NorheimanMismagius("", Aspect.NORHEIMAN, new Stats(495, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));

//        addNewPokemon(new VaritasianBonsly(438)); Member of line Not Finished
//        addNewPokemon(new VaritasianMimeJr(439)); Missing Art
        addNewPokemon(new VaritasianMunchlax("", Aspect.VARITASIAN));
//        addNewPokemon(new VaritasianMantyke(458)); Member of line Not Finished

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

        //Daybreak
        addNewPokemon(new ArmiranGarchomp("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippopotas("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranHippowdon("", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianPachirisu("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMunchlax("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRiolu("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLucario("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMantyke("", Aspect.AYREIAN).fishingSpawnFromExisting());
        addNewPokemon(new AyreianGallade("", Aspect.AYREIAN));

        addNewPokemon(new AyreianShinx("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuxio("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuxray("", Aspect.AYREIAN));
        addNewPokemon(new AyreianBudew("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRoserade("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDrifloon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDrifblim("", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicBudew("", Aspect.RELIC));
        addNewPokemon(new RelicRoserade("", Aspect.RELIC));
        addNewPokemon(new RelicAmbipom("", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianBidoof("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianBibarel("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianShinx("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianLuxio("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianLuxray("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianAmbipom("", Aspect.KASKADIAN));
        addNewPokemon(new AmazeAllDrifblim("", Aspect.AMAZE_ALL));
        addNewPokemon(new KaskadianSkuntank("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianSnover("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianAbomasnow("", Aspect.KASKADIAN));
        addNewPokemon(new SolRotom("", Aspect.SOL));
        addNewPokemon(new SwayRotom("", Aspect.SWAY));
        addNewPokemon(new BrawlRotom("", Aspect.BRAWL));
        addNewPokemon(new WebRotom("", Aspect.WEB));
        addNewPokemon(new JunkRotom("", Aspect.JUNK));
        addNewPokemon(new HomeRotom("", Aspect.HOME));
        addNewPokemon(new BassRotom("", Aspect.BASS));
        addNewPokemon(new TwirlRotom("", Aspect.TWIRL));
        addNewPokemon(new MixRotom("", Aspect.MIX));

        //Azure (Mystic) //TODO work out why not all regional forms are marked as additional pokemon
        addNewPokemon(new MysticRiolu("", Aspect.MYSTIC).setPreferredBlocks("minecraft:sandstone"));
        addNewPokemon(new MysticLucario("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranBuneary("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranLopunny("", Aspect.CEFIRAN, new Stats(480, FAST_PHYSICAL_ATTACKER, List.of())));
        addNewPokemon(new CefiranSnover("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranAbomasnow("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFroslass("", Aspect.CEFIRAN));

    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochTurtwig("", Aspect.EPOCH));
        addNewPokemon(new EpochGrotle("", Aspect.EPOCH));
        addNewPokemon(new EpochTorterra("", Aspect.EPOCH));
        addNewPokemon(new EpochChimchar("", Aspect.EPOCH));
        addNewPokemon(new EpochMonferno("", Aspect.EPOCH));
        addNewPokemon(new EpochInfernape("", Aspect.EPOCH));
        addNewPokemon(new EpochPiplup("", Aspect.EPOCH));
        addNewPokemon(new EpochPrinplup("", Aspect.EPOCH));
        addNewPokemon(new EpochEmpoleon("", Aspect.EPOCH));

        addNewPokemon(new EpochProbopass("", Aspect.EPOCH));
        addNewPokemon(new EpochTangrowth("", Aspect.EPOCH));
        addNewPokemon(new EpochFinneon("", Aspect.EPOCH));
        addNewPokemon(new EpochLumineon("", Aspect.EPOCH));
        addNewPokemon(new EpochGliscor("", Aspect.EPOCH));
        addNewPokemon(new EpochDrifloon("", Aspect.EPOCH));
        addNewPokemon(new EpochDrifblim("", Aspect.EPOCH));
        addNewPokemon(new EpochBonsly("", Aspect.EPOCH));
        addNewPokemon(new EpochElectivire("", Aspect.EPOCH));
        addNewPokemon(new EpochMagmortar("", Aspect.EPOCH));
        addNewPokemon(new EpochHippopotas("", Aspect.EPOCH));
        addNewPokemon(new EpochHippowdon("", Aspect.EPOCH));
        addNewPokemon(new EpochBronzor("", Aspect.EPOCH));
        addNewPokemon(new EpochBronzong("", Aspect.EPOCH));
        addNewPokemon(new EpochDusknoir("", Aspect.EPOCH));
        addNewPokemon(new EpochLeafeon("", Aspect.EPOCH));
        addNewPokemon(new EpochGlaceon("", Aspect.EPOCH));
        addNewPokemon(new EpochShellos("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodon("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonOne("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosTwo("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonTwo("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosThree("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonThree("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosFour("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonFour("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosFive("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonFive("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosSix("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonSix("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosSeven("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonSeven("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosEight("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonEight("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosNine("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonNine("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosTen("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonTen("", Aspect.EPOCH));
        addNewPokemon(new EpochShellosEleven("", Aspect.EPOCH));
        addNewPokemon(new EpochGastrodonEleven("", Aspect.EPOCH));
        addNewPokemon(new EpochAmbipom("", Aspect.EPOCH));
        addNewPokemon(new EpochStarly("", Aspect.EPOCH));
        addNewPokemon(new EpochStaravia("", Aspect.EPOCH));
        addNewPokemon(new EpochStaraptor("", Aspect.EPOCH));
        addNewPokemon(new EpochKricketot("", Aspect.EPOCH));
        addNewPokemon(new EpochKricketune("", Aspect.EPOCH));
        addNewPokemon(new EpochStunky("", Aspect.EPOCH));
        addNewPokemon(new EpochSkuntank("", Aspect.EPOCH));
        addNewPokemon(new EpochCroagunk("", Aspect.EPOCH));
        addNewPokemon(new EpochToxicroak("", Aspect.EPOCH));
        addNewPokemon(new EpochYanmega("", Aspect.EPOCH));
        addNewPokemon(new EpochSkorupi("", Aspect.EPOCH));
        addNewPokemon(new EpochDrapion("", Aspect.EPOCH));
        addNewPokemon(new EpochSpiritomb("", Aspect.EPOCH));
        addNewPokemon(new EpochCherubi("", Aspect.EPOCH));
        addNewPokemon(new EpochCherrim("", Aspect.EPOCH));
        addNewPokemon(new EpochMantyke("", Aspect.EPOCH));
        addNewPokemon(new EpochHappiny("", Aspect.EPOCH));
        addNewPokemon(new EpochMagnezone("", Aspect.EPOCH));
        addNewPokemon(new EpochShinx("", Aspect.EPOCH));
        addNewPokemon(new EpochLuxio("", Aspect.EPOCH));
        addNewPokemon(new EpochLuxray("", Aspect.EPOCH));
        addNewPokemon(new EpochMamoswine("", Aspect.EPOCH));
        addNewPokemon(new EpochBuneary("", Aspect.EPOCH));
        addNewPokemon(new EpochLopunny("", Aspect.EPOCH));
        addNewPokemon(new EpochBuizel("", Aspect.EPOCH));
        addNewPokemon(new EpochFloatzel("", Aspect.EPOCH));
        addNewPokemon(new EpochBudew("", Aspect.EPOCH));
        addNewPokemon(new EpochRoserade("", Aspect.EPOCH));
        addNewPokemon(new EpochGible("", Aspect.EPOCH));
        addNewPokemon(new EpochGabite("", Aspect.EPOCH));
        addNewPokemon(new EpochGarchomp("", Aspect.EPOCH));
        addNewPokemon(new EpochMimejr("", Aspect.EPOCH));
        addNewPokemon(new EpochShieldon("", Aspect.EPOCH));
        addNewPokemon(new EpochBastiodon("", Aspect.EPOCH));
        addNewPokemon(new EpochSnover("", Aspect.EPOCH));
        addNewPokemon(new EpochAbomasnow("", Aspect.EPOCH));
        addNewPokemon(new EpochGibleOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGabiteOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGarchompOne("", Aspect.EPOCH));
        addNewPokemon(new EpochYanmegaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMismagius("", Aspect.EPOCH));
        addNewPokemon(new EpochRiolu("", Aspect.EPOCH));
        addNewPokemon(new EpochLucario("", Aspect.EPOCH));
        addNewPokemon(new EpochCranidos("", Aspect.EPOCH));
        addNewPokemon(new EpochRampardos("", Aspect.EPOCH));
        addNewPokemon(new EpochHonchkrow("", Aspect.EPOCH));
        addNewPokemon(new EpochHonchkrowOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBidoof("", Aspect.EPOCH));
        addNewPokemon(new EpochBibarel("", Aspect.EPOCH));
        addNewPokemon(new EpochCarnivine("", Aspect.EPOCH));
        addNewPokemon(new EpochMunchlax("", Aspect.EPOCH));
        addNewPokemon(new EpochProbopassOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMamoswineOne("", Aspect.EPOCH));
        addNewPokemon(new EpochChingling("", Aspect.EPOCH));
        addNewPokemon(new EpochMagnezoneOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBudewOne("", Aspect.EPOCH));
        addNewPokemon(new EpochRoseradeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPorygonz("", Aspect.EPOCH));
        addNewPokemon(new EpochFroslass("", Aspect.EPOCH));
        addNewPokemon(new EpochGallade("", Aspect.EPOCH));
        addNewPokemon(new EpochWeavile("", Aspect.EPOCH));

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


}
