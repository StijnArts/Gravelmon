package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.fliga.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.hub.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.interregional.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.rica.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationFour extends Game {
    public GenerationFour() {
        super("generation4");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AfricanusanBronzor("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanBronzong("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanCherubi("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanCherrim("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanKricketot("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanKricketune("", Aspect.AFRICANUSAN));

        pokemon.add(new LagoonanFinneon("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanLumineon("", Aspect.LAGOONAN));

//        pokemon.add(new IonosianShellos(422));   Missing Stats
//        pokemon.add(new IonosianGastrodon(423));   Missing Art
//        pokemon.add(new IonosianMimeJr(439));   Missing Art
//        pokemon.add(new IonosianMunchlax(446));   Missing Stats

        pokemon.add(new FligianShellos("", Aspect.FLIGIAN));
        pokemon.add(new FligianGastrodon("", Aspect.FLIGIAN));
        pokemon.add(new FligianHappiny("", Aspect.FLIGIAN));
        pokemon.add(new FligianGallade("", Aspect.FLIGIAN));
        pokemon.add(new FligianDusknoir("", Aspect.FLIGIAN));

        pokemon.add(new RicanShellos("", Aspect.RICAN));
        pokemon.add(new RicanGastrodon("", Aspect.RICAN));

        pokemon.add(new NovranCranidos("", Aspect.NOVRAN));
        pokemon.add(new NovranRampardos("", Aspect.NOVRAN));
        pokemon.add(new NovranBonsly("", Aspect.NOVRAN));
        pokemon.add(new NovranCherubi("", Aspect.NOVRAN));
        pokemon.add(new NovranCherrim("", Aspect.NOVRAN));

        pokemon.add(new QamoranCombee("", Aspect.QAMORAN));
        pokemon.add(new QamoranTangrowth("", Aspect.QAMORAN));

//        pokemon.add(new NorheimanShinx(403)); Member of line Not Finished
//        pokemon.add(new NorheimanLuxio(404)); Missing Art
//        pokemon.add(new NorheimanLuxray(405)); Member of line Not Finished
        pokemon.add(new NorheimanMismagius("", Aspect.NORHEIMAN, new Stats(495, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));

//        pokemon.add(new VaritasianBonsly(438)); Member of line Not Finished
//        pokemon.add(new VaritasianMimeJr(439)); Missing Art
        pokemon.add(new VaritasianMunchlax("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianMantyke(458)); Member of line Not Finished

        pokemon.add(new InterianPiplup("", Aspect.INTERIAN));
        pokemon.add(new InterianPrinplup("", Aspect.INTERIAN));
        pokemon.add(new InterianEmpoleon("", Aspect.INTERIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new InterianArceus("", Aspect.INTERIAN));
//
        pokemon.add(new HubianTogekiss("", Aspect.HUBIAN));

        pokemon.add(new HizianMismagius("", Aspect.HIZIAN));
        pokemon.add(new HizianHonchkrow("", Aspect.HIZIAN));
        pokemon.add(new HizianGliscor("", Aspect.HIZIAN));
        pokemon.add(new HizianSkorupi("", Aspect.HIZIAN));
        pokemon.add(new HizianDrapion("", Aspect.HIZIAN));

        //Pokemon Infinity
        pokemon.add(new EghoHappiny("", Aspect.EGHO));
        pokemon.add(new EghoMagnezone("", Aspect.EGHO));
        pokemon.add(new EghoTangrowth("", Aspect.EGHO));

        //Pokemon Insurgance
        addDeltaPokemon();

        //X-species
        pokemon.add(new BudewX("", Aspect.X));
        pokemon.add(new RoseradeX("", Aspect.X));
        pokemon.add(new SpiritombX("", Aspect.X));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianTangrowth("", Aspect.HOENNIAN));
        pokemon.add(new HoennianRegigigas("", Aspect.HOENNIAN));

        //Radical Red
        pokemon.add(new SeviianCarnivine("", Aspect.SEVIIAN));
        pokemon.add(new SeviianMantyke("", Aspect.SEVIIAN));

        addMythianPokemon();

        //Daybreak
        pokemon.add(new ArmiranGarchomp("", Aspect.ARMIRAN));
        pokemon.add(new ArmiranHippopotas("", Aspect.ARMIRAN));
        pokemon.add(new ArmiranHippowdon("", Aspect.ARMIRAN));

        //Vanguard
//        pokemon.add(new AyreianTurtwig("", Aspect.AYREIAN));
//        pokemon.add(new AyreianGrotle("", Aspect.AYREIAN));
//        pokemon.add(new AyreianTorterra("", Aspect.AYREIAN));
//        pokemon.add(new AyreianChimchar("", Aspect.AYREIAN));
//        pokemon.add(new AyreianMonferno("", Aspect.AYREIAN));
//        pokemon.add(new AyreianInfernape("", Aspect.AYREIAN));
//        pokemon.add(new AyreianPiplup("", Aspect.AYREIAN));
//        pokemon.add(new AyreianPrinplup("", Aspect.AYREIAN));
//        pokemon.add(new AyreianEmpoleon("", Aspect.AYREIAN));
//        pokemon.add(new AyreianKricketot("", Aspect.AYREIAN));
//        pokemon.add(new AyreianKricketune("", Aspect.AYREIAN));
//        pokemon.add(new AyreianPachirisu("", Aspect.AYREIAN));
//        pokemon.add(new AyreianChingling("", Aspect.AYREIAN));
//        pokemon.add(new AyreianMimejr("", Aspect.AYREIAN));
//        pokemon.add(new AyreianChatot("", Aspect.AYREIAN));
//        pokemon.add(new AyreianMunchlax("", Aspect.AYREIAN));
//        pokemon.add(new AyreianRiolu("", Aspect.AYREIAN));
//        pokemon.add(new AyreianLucario("", Aspect.AYREIAN));
//        pokemon.add(new AyreianMantyke("", Aspect.AYREIAN));
//        pokemon.add(new AyreianGallade("", Aspect.AYREIAN));

        pokemon.add(new AyreianShinx("", Aspect.AYREIAN));
        pokemon.add(new AyreianLuxio("", Aspect.AYREIAN));
        pokemon.add(new AyreianLuxray("", Aspect.AYREIAN));
        pokemon.add(new AyreianBudew("", Aspect.AYREIAN));
        pokemon.add(new AyreianRoserade("", Aspect.AYREIAN));
        pokemon.add(new AyreianDrifloon("", Aspect.AYREIAN));
        pokemon.add(new AyreianDrifblim("", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicBudew("", Aspect.RELIC));
        pokemon.add(new RelicRoserade("", Aspect.RELIC));
        pokemon.add(new RelicAmbipom("", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianBidoof("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianBibarel("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianShinx("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianLuxio("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianLuxray("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianAmbipom("", Aspect.KASKADIAN));
        pokemon.add(new AmazeAllDrifblim("", Aspect.AMAZE_ALL));
        pokemon.add(new KaskadianSkuntank("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianSnover("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianAbomasnow("", Aspect.KASKADIAN));
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
        pokemon.add(new MysticRiolu("", Aspect.MYSTIC));
        pokemon.add(new MysticLucario("", Aspect.MYSTIC));

        //Pokemon Opalo
        pokemon.add(new CefiranSnover("", Aspect.CEFIRAN));
        pokemon.add(new CefiranAbomasnow("", Aspect.CEFIRAN));
        pokemon.add(new CefiranFroslass("", Aspect.CEFIRAN));

    }

    private void addDeltaPokemon() {
        pokemon.add(new DeltaTurtwig("", Aspect.DELTA));
        pokemon.add(new DeltaGrotle("", Aspect.DELTA));
        pokemon.add(new DeltaTorterra("", Aspect.DELTA));
        pokemon.add(new DeltaShinx("", Aspect.DELTA));
        pokemon.add(new DeltaLuxio("", Aspect.DELTA));
        pokemon.add(new DeltaLuxray("", Aspect.DELTA));
        pokemon.add(new DeltaBudew("", Aspect.DELTA));
        pokemon.add(new DeltaRoserade("", Aspect.DELTA));
        pokemon.add(new DeltaCombee("", Aspect.DELTA));
        pokemon.add(new DeltaVespiquen("", Aspect.DELTA));
        pokemon.add(new DeltaAmbipom("", Aspect.DELTA));
        pokemon.add(new DeltaDrifloon("", Aspect.DELTA));
        pokemon.add(new DeltaDrifblim("", Aspect.DELTA));
        pokemon.add(new DeltaBuneary("", Aspect.DELTA));
        pokemon.add(new DeltaLopunny("", Aspect.DELTA));
        pokemon.add(new DeltaMismagius("", Aspect.DELTA));
        pokemon.add(new DeltaMunchlax("", Aspect.DELTA));
        pokemon.add(new DeltaRiolu("", Aspect.DELTA));
        pokemon.add(new DeltaLucario("", Aspect.DELTA));
        pokemon.add(new DeltaCroagunk("", Aspect.DELTA));
        pokemon.add(new DeltaToxicroak("", Aspect.DELTA));
        pokemon.add(new DeltaTangrowth("", Aspect.DELTA));
        pokemon.add(new DeltaElectivire("", Aspect.DELTA));
        pokemon.add(new DeltaMagmortar("", Aspect.DELTA));
        pokemon.add(new DeltaYanmega("", Aspect.DELTA));
        pokemon.add(new DeltaGallade("", Aspect.DELTA));
        pokemon.add(new DeltaFroslass("", Aspect.DELTA));
    }

    private void addMythianPokemon() {
        pokemon.add(new MythianRiolu("", Aspect.MYTHIAN));
        pokemon.add(new MythianLucario("", Aspect.MYTHIAN));
    }


}
