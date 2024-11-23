package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
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
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationFour extends Game {
    public GenerationFour() {
        super("generation4");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new LagoonanFinneon("", Aspect.LAGOONAN).fishingSpawnFromExisting());
        addNewPokemon(new LagoonanLumineon("", Aspect.LAGOONAN).fishingSpawnFromExisting());

//        pokemon.add(new IonosianShellos(422));   Missing Stats
//        pokemon.add(new IonosianGastrodon(423));   Missing Art
//        pokemon.add(new IonosianMimeJr(439));   Missing Art
//        pokemon.add(new IonosianMunchlax(446));   Missing Stats

        addNewPokemon(new FligianShellos("", Aspect.FLIGIAN));
        addNewPokemon(new FligianGastrodon("", Aspect.FLIGIAN));
        addNewPokemon(new FligianHappiny("", Aspect.FLIGIAN));
        addNewPokemon(new FligianGallade("", Aspect.FLIGIAN));
        addNewPokemon(new FligianDusknoir("", Aspect.FLIGIAN));

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

        //Azure (Mystic)
        addNewPokemon(new MysticRiolu("", Aspect.MYSTIC));
        addNewPokemon(new MysticLucario("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranSnover("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranAbomasnow("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFroslass("", Aspect.CEFIRAN));

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
