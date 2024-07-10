package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.data.pokemon.fliga.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.hub.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationTwo extends Game {
    public GenerationTwo() {
        super("generation2");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new IonosianBayleef(153));   Missing Stats
//        pokemon.add(new IonosianMeganium(154));   Missing Stats
//        pokemon.add(new IonosianCyndaquil(155));   Missing Art
//        pokemon.add(new IonosianQuilava(156));   Missing Stats
//        pokemon.add(new IonosianTyphlosion(157));   Missing Stats
//        pokemon.add(new IonosianTotodile(158));   Missing Stats
//        pokemon.add(new IonosianCroconaw(159));   Missing Stats
//        pokemon.add(new IonosianFeraligatr(160));   Missing Stats
//        pokemon.add(new IonosianNatu(177));   Missing Stats
//        pokemon.add(new IonosianXatu(178));   Missing Stats
//        pokemon.add(new IonosianGirafarig(203));   Missing Stats
//        pokemon.add(new IonosianGranbull(210));   Missing Stats
//        pokemon.add(new IonosianShuckle(213));   Missing Stats
//        pokemon.add(new IonosianSmoochum(238));   Missing Stats

        pokemon.add(new FligianAipom("Aipom", Aspect.FLIGIAN));
        pokemon.add(new FligianBlissey("Blissey", Aspect.FLIGIAN));
        pokemon.add(new FligianQwilfish("Qwilfish", Aspect.FLIGIAN));

        pokemon.add(new EnjinnianHoothoot("Hoothoot", Aspect.ENJINNIAN));
        pokemon.add(new EnjinnianNoctowl("Noctowl", Aspect.ENJINNIAN));

        pokemon.add(new NovranSudowoodo("Sudowoodo", Aspect.NOVRAN));
        pokemon.add(new NovranSlowking("Slowking", Aspect.NOVRAN));

        pokemon.add(new QamoranTyrogue("Tyrogue", Aspect.QAMORAN));
        pokemon.add(new QamoranHitmontop("Hitmontop", Aspect.QAMORAN));

        pokemon.add(new VaritasianTogepi("Togepi", Aspect.VARITASIAN));
        pokemon.add(new VaritasianTogetic("Togetic", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianSudowoodo(185)); Missing Art
        pokemon.add(new VaritasianWobbuffet("Wobbuffet", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianMantine(226)); Missing Art
//        pokemon.add(new VaritasianKingdra(230)); Missing Art
        pokemon.add(new VaritasianPorygon2("Porygon2", Aspect.VARITASIAN));
        pokemon.add(new VaritasianTyrogue("Tyrogue", Aspect.VARITASIAN));
        pokemon.add(new VaritasianHitmontop("Hitmontop", Aspect.VARITASIAN));
        pokemon.add(new VaritasianRaikou("Raikou", Aspect.VARITASIAN));
        pokemon.add(new VaritasianEntei("Entei", Aspect.VARITASIAN));
        pokemon.add(new VaritasianSuicune("Suicune", Aspect.VARITASIAN));

        pokemon.add(new HubianTogepi("Togepi", Aspect.HUBIAN));
        pokemon.add(new HubianTogetic("Togetic", Aspect.HUBIAN));
        pokemon.add(new HubianSmeargle("Smeargle", Aspect.HUBIAN));

        pokemon.add(new HizianGligar("Gligar", Aspect.HIZIAN));
        pokemon.add(new HizianMurkrow("Murkrow", Aspect.HIZIAN));
        pokemon.add(new HizianMisdreavus("Misdreavus", Aspect.HIZIAN));

        pokemon.add(new NorheimanUnown("Unown", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanForretress("Forretress", Aspect.NORHEIMAN, new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        pokemon.add(new NorheimanHoundour("Houndour", Aspect.NORHEIMAN));

        //Aristosian
        pokemon.add(new AristosianSentret("Sentret", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianFurret("Furret", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianSpinarak("Spinarak", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianMareep("Mareep", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianFlaaffy("Flaaffy", Aspect.ARISTOSIAN));

        //Avorian
//        pokemon.add(new AvorianMareep(179)); Member of Line not finished
//        pokemon.add(new AvorianFlaaffy(180)); Member of Line not finished

        registerPokemonInfinityForms();

        registerInsurganceForms();

        registerXenoverseForms();

        addHoennianPokemon();

        //Radical Red
        pokemon.add(new SeviianTeddiursa("Teddiursa", Aspect.SEVIIAN));
        pokemon.add(new SeviianUrsaring("Ursaring", Aspect.SEVIIAN));
        pokemon.add(new SeviianMantine("Mantine", Aspect.SEVIIAN));

        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranLedian("Ledian", Aspect.ALTERAN));

        //Daybreak
        pokemon.add(new ArmiranTyranitar("Tyranitar", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianChikorita("Chikorita", Aspect.AYREIAN));
        pokemon.add(new AyreianBayleef("Bayleef", Aspect.AYREIAN));
        pokemon.add(new AyreianMeganium("Meganium", Aspect.AYREIAN));
        pokemon.add(new AyreianCyndaquil("Cyndaquil", Aspect.AYREIAN));
        pokemon.add(new AyreianQuilava("Quilava", Aspect.AYREIAN));
        pokemon.add(new AyreianTyphlosion("Typhlosion", Aspect.AYREIAN));
        pokemon.add(new AyreianTotodile("Totodile", Aspect.AYREIAN));
        pokemon.add(new AyreianCroconaw("Croconaw", Aspect.AYREIAN));
        pokemon.add(new AyreianFeraligatr("Feraligatr", Aspect.AYREIAN));
        pokemon.add(new AyreianSpinarak("Spinarak", Aspect.AYREIAN));
        pokemon.add(new AyreianAriados("Ariados", Aspect.AYREIAN));
        pokemon.add(new AyreianStantler("Stantler", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicLedyba("Ledyba", Aspect.RELIC));
        pokemon.add(new RelicLedian("Ledian", Aspect.RELIC));
        pokemon.add(new RelicAipom("Aipom", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianMarill("Marill", Aspect.KASKADIAN));
        pokemon.add(new KaskadianAzumarill("Azumarill", Aspect.KASKADIAN));
        pokemon.add(new AmazeAllSudowoodo("Sudowoodo", Aspect.AMAZE_ALL));
        pokemon.add(new KaskadianYanma("Yanma", Aspect.KASKADIAN));

        //Pokemon Opalo
        pokemon.add(new CefiranTeddiursa("Teddiursa", Aspect.CEFIRAN));
        pokemon.add(new CefiranUrsaring("Ursaring", Aspect.CEFIRAN));
        pokemon.add(new CefiranSlugma("Slugma", Aspect.CEFIRAN));
        pokemon.add(new CefiranMagcargo("Magcargo", Aspect.CEFIRAN));
        pokemon.add(new CefiranDelibird("Delibird", Aspect.CEFIRAN));
        pokemon.add(new CefiranSmeargle("Smeargle", Aspect.CEFIRAN));

    }

    private void addMythianPokemon() {
        pokemon.add(new MythianMareep("Mareep", Aspect.MYTHIAN));
        pokemon.add(new MythianFlaaffy("Flaaffy", Aspect.MYTHIAN));
        pokemon.add(new MythianAmpharos("Ampharos", Aspect.MYTHIAN));
        pokemon.add(new MythianScizor("Scizor", Aspect.MYTHIAN));
    }

    private void addHoennianPokemon() {
        //Pokemon Blazing Emerald
        pokemon.add(new HoennianChinchou("Chinchou", Aspect.HOENNIAN));
        pokemon.add(new HoennianLanturn("Lanturn", Aspect.HOENNIAN));
        pokemon.add(new HoennianDunsparce("Dunsparce", Aspect.HOENNIAN));
        pokemon.add(new HoennianQwilfish("Qwilfish", Aspect.HOENNIAN));
        pokemon.add(new HoennianShuckle("Shuckle", Aspect.HOENNIAN));
        pokemon.add(new HoennianTeddiursa("Teddiursa", Aspect.HOENNIAN));
        pokemon.add(new HoennianUrsaring("Ursaring", Aspect.HOENNIAN));
        pokemon.add(new HoennianSkarmory("Skarmory", Aspect.HOENNIAN));
    }

    private void registerXenoverseForms() {
        //X-Species
        pokemon.add(new UnownEarth("Unown", Aspect.EARTH));
        pokemon.add(new UnownXenoverse("Unown", Aspect.XENOVERSE));
        pokemon.add(new SmeargleX("Smeargle", Aspect.X));
        pokemon.add(new ElekidX("Elekid", Aspect.X));
        pokemon.add(new TyranitarX("Tyranitar", Aspect.X));
    }

    private void registerInsurganceForms() {
        pokemon.add(new DeltaCyndaquil("Cyndaquil", Aspect.DELTA));
        pokemon.add(new DeltaQuilava("Quilava", Aspect.DELTA));
        pokemon.add(new DeltaTyphlosion("Typhlosion", Aspect.DELTA));
        pokemon.add(new DeltaHoothoot("Hoothoot", Aspect.DELTA));
        pokemon.add(new DeltaNoctowl("Noctowl", Aspect.DELTA));
        pokemon.add(new DeltaChinchou("Chinchou", Aspect.DELTA));
        pokemon.add(new DeltaLanturn("Lanturn", Aspect.DELTA));
        pokemon.add(new DeltaPichu("Pichu", Aspect.DELTA));
        pokemon.add(new DeltaAipom("Aipom", Aspect.DELTA));
        pokemon.add(new DeltaSunkern("Sunkern", Aspect.DELTA));
        pokemon.add(new DeltaSunflora("Sunflora", Aspect.DELTA));
        pokemon.add(new DeltaYanma("Yanma", Aspect.DELTA));
        pokemon.add(new DeltaWooper("Wooper", Aspect.DELTA));
        pokemon.add(new DeltaQuagsire("Quagsire", Aspect.DELTA));
        pokemon.add(new DeltaMisdreavus("Misdreavus", Aspect.DELTA));
        pokemon.add(new DeltaGirafarig("Girafarig", Aspect.DELTA));
        pokemon.add(new DeltaDunsparce("Dunsparce", Aspect.DELTA));
        pokemon.add(new DeltaScizor("Scizor", Aspect.DELTA));
        pokemon.add(new DeltaShuckle("Shuckle", Aspect.DELTA));
        pokemon.add(new DeltaRemoraid("Remoraid", Aspect.DELTA));
        pokemon.add(new DeltaOctillery("Octillery", Aspect.DELTA));
        pokemon.add(new DeltaElekid("Elekid", Aspect.DELTA));
        pokemon.add(new DeltaMagby("Magby", Aspect.DELTA));
    }

    private void registerPokemonInfinityForms() {
        //Pokemon Infinity
        pokemon.add(new EghoChikorita("chikorita", Aspect.EGHO));
        pokemon.add(new EghoBayleef("bayleef", Aspect.EGHO));
        pokemon.add(new EghoMeganium("meganium", Aspect.EGHO));
        pokemon.add(new EghoCyndaquil("cyndaquil", Aspect.EGHO));
        pokemon.add(new EghoQuilava("quilava", Aspect.EGHO));
        pokemon.add(new EghoTyphlosion("typhlosion", Aspect.EGHO));
        pokemon.add(new EghoTotodile("totodile", Aspect.EGHO));
        pokemon.add(new EghoCroconaw("croconaw", Aspect.EGHO));
        pokemon.add(new EghoFeraligatr("feraligatr", Aspect.EGHO));
        pokemon.add(new EghoHoothoot("hoothoot", Aspect.EGHO));
        pokemon.add(new EghoNoctowl("noctowl", Aspect.EGHO));
        pokemon.add(new EghoMarill("marill", Aspect.EGHO));
        pokemon.add(new EghoAzumarill("azumarill", Aspect.EGHO));
        pokemon.add(new EghoBlissey( "blissey", Aspect.EGHO));
    }
}
