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
import drai.dev.data.pokemon.vanguard.regional.*;
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

        addNewPokemon(new FligianAipom("Aipom", Aspect.FLIGIAN));
        addNewPokemon(new FligianBlissey("Blissey", Aspect.FLIGIAN));
        addNewPokemon(new FligianQwilfish("Qwilfish", Aspect.FLIGIAN));

        addNewPokemon(new EnjinnianHoothoot("Hoothoot", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianNoctowl("Noctowl", Aspect.ENJINNIAN));

        addNewPokemon(new NovranSudowoodo("Sudowoodo", Aspect.NOVRAN));
        addNewPokemon(new NovranSlowking("Slowking", Aspect.NOVRAN));

        addNewPokemon(new QamoranTyrogue("Tyrogue", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmontop("Hitmontop", Aspect.QAMORAN));

        addNewPokemon(new VaritasianTogepi("Togepi", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTogetic("Togetic", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianSudowoodo(185)); Missing Art
        addNewPokemon(new VaritasianWobbuffet("Wobbuffet", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianMantine(226)); Missing Art
//        pokemon.add(new VaritasianKingdra(230)); Missing Art
        addNewPokemon(new VaritasianPorygon2("Porygon2", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTyrogue("Tyrogue", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmontop("Hitmontop", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianRaikou("Raikou", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEntei("Entei", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSuicune("Suicune", Aspect.VARITASIAN));

        addNewPokemon(new HubianTogepi("Togepi", Aspect.HUBIAN));
        addNewPokemon(new HubianTogetic("Togetic", Aspect.HUBIAN));
        addNewPokemon(new HubianSmeargle("Smeargle", Aspect.HUBIAN));

        addNewPokemon(new HizianGligar("Gligar", Aspect.HIZIAN));
        addNewPokemon(new HizianMurkrow("Murkrow", Aspect.HIZIAN));
        addNewPokemon(new HizianMisdreavus("Misdreavus", Aspect.HIZIAN));

        addNewPokemon(new NorheimanUnown("Unown", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanForretress("Forretress", Aspect.NORHEIMAN, new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new NorheimanHoundour("Houndour", Aspect.NORHEIMAN));

        //Aristosian
        addNewPokemon(new AristosianSentret("Sentret", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFurret("Furret", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianSpinarak("Spinarak", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianMareep("Mareep", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFlaaffy("Flaaffy", Aspect.ARISTOSIAN));

        //Avorian
//        pokemon.add(new AvorianMareep(179)); Member of Line not finished
//        pokemon.add(new AvorianFlaaffy(180)); Member of Line not finished

        registerPokemonInfinityForms();

        registerInsurganceForms();

        registerXenoverseForms();

        addHoennianPokemon();

        //Radical Red
        addNewPokemon(new SeviianTeddiursa("Teddiursa", Aspect.SEVIIAN));
        addNewPokemon(new SeviianUrsaring("Ursaring", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMantine("Mantine", Aspect.SEVIIAN));

        addMythianPokemon();

        //Pokemon Flux
        addNewPokemon(new AlteranLedian("Ledian", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranTyranitar("Tyranitar", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianChikorita("Chikorita", Aspect.AYREIAN));
        addNewPokemon(new AyreianBayleef("Bayleef", Aspect.AYREIAN));
        addNewPokemon(new AyreianMeganium("Meganium", Aspect.AYREIAN));
        addNewPokemon(new AyreianCyndaquil("Cyndaquil", Aspect.AYREIAN));
        addNewPokemon(new AyreianQuilava("Quilava", Aspect.AYREIAN));
        addNewPokemon(new AyreianTyphlosion("Typhlosion", Aspect.AYREIAN));
        addNewPokemon(new AyreianTotodile("Totodile", Aspect.AYREIAN));
        addNewPokemon(new AyreianCroconaw("Croconaw", Aspect.AYREIAN));
        addNewPokemon(new AyreianFeraligatr("Feraligatr", Aspect.AYREIAN));
        addNewPokemon(new AyreianSpinarak("Spinarak", Aspect.AYREIAN));
        addNewPokemon(new AyreianAriados("Ariados", Aspect.AYREIAN));
        addNewPokemon(new AyreianStantler("Stantler", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicLedyba("Ledyba", Aspect.RELIC));
        addNewPokemon(new RelicLedian("Ledian", Aspect.RELIC));
        addNewPokemon(new RelicAipom("Aipom", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianMarill("Marill", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianAzumarill("Azumarill", Aspect.KASKADIAN));
        addNewPokemon(new AmazeAllSudowoodo("Sudowoodo", Aspect.AMAZE_ALL));
        addNewPokemon(new KaskadianYanma("Yanma", Aspect.KASKADIAN));

        //Pokemon Opalo
        addNewPokemon(new CefiranTeddiursa("Teddiursa", Aspect.CEFIRAN));
        addNewPokemon(new CefiranUrsaring("Ursaring", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSlugma("Slugma", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMagcargo("Magcargo", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDelibird("Delibird", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSmeargle("Smeargle", Aspect.CEFIRAN));

    }

    private void addMythianPokemon() {
        addNewPokemon(new MythianMareep("Mareep", Aspect.MYTHIAN));
        addNewPokemon(new MythianFlaaffy("Flaaffy", Aspect.MYTHIAN));
        addNewPokemon(new MythianAmpharos("Ampharos", Aspect.MYTHIAN));
        addNewPokemon(new MythianScizor("Scizor", Aspect.MYTHIAN));
    }

    private void addHoennianPokemon() {
        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianChinchou("Chinchou", Aspect.HOENNIAN));
        addNewPokemon(new HoennianLanturn("Lanturn", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDunsparce("Dunsparce", Aspect.HOENNIAN));
        addNewPokemon(new HoennianQwilfish("Qwilfish", Aspect.HOENNIAN));
        addNewPokemon(new HoennianShuckle("Shuckle", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTeddiursa("Teddiursa", Aspect.HOENNIAN));
        addNewPokemon(new HoennianUrsaring("Ursaring", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSkarmory("Skarmory", Aspect.HOENNIAN));
    }

    private void registerXenoverseForms() {
        //X-Species
        addNewPokemon(new UnownEarth("Unown", Aspect.EARTH));
        addNewPokemon(new UnownXenoverse("Unown", Aspect.XENOVERSE));
        addNewPokemon(new SmeargleX("Smeargle", Aspect.X));
        addNewPokemon(new ElekidX("Elekid", Aspect.X));
        addNewPokemon(new TyranitarX("Tyranitar", Aspect.X));
    }

    private void registerInsurganceForms() {
        addNewPokemon(new DeltaCyndaquil("Cyndaquil", Aspect.DELTA));
        addNewPokemon(new DeltaQuilava("Quilava", Aspect.DELTA));
        addNewPokemon(new DeltaTyphlosion("Typhlosion", Aspect.DELTA));
        addNewPokemon(new DeltaHoothoot("Hoothoot", Aspect.DELTA));
        addNewPokemon(new DeltaNoctowl("Noctowl", Aspect.DELTA));
        addNewPokemon(new DeltaChinchou("Chinchou", Aspect.DELTA));
        addNewPokemon(new DeltaLanturn("Lanturn", Aspect.DELTA));
        addNewPokemon(new DeltaPichu("Pichu", Aspect.DELTA));
        addNewPokemon(new DeltaAipom("Aipom", Aspect.DELTA));
        addNewPokemon(new DeltaSunkern("Sunkern", Aspect.DELTA));
        addNewPokemon(new DeltaSunflora("Sunflora", Aspect.DELTA));
        addNewPokemon(new DeltaYanma("Yanma", Aspect.DELTA));
        addNewPokemon(new DeltaWooper("Wooper", Aspect.DELTA));
        addNewPokemon(new DeltaQuagsire("Quagsire", Aspect.DELTA));
        addNewPokemon(new DeltaMisdreavus("Misdreavus", Aspect.DELTA));
        addNewPokemon(new DeltaGirafarig("Girafarig", Aspect.DELTA));
        addNewPokemon(new DeltaDunsparce("Dunsparce", Aspect.DELTA));
        addNewPokemon(new DeltaScizor("Scizor", Aspect.DELTA));
        addNewPokemon(new DeltaShuckle("Shuckle", Aspect.DELTA));
        addNewPokemon(new DeltaRemoraid("Remoraid", Aspect.DELTA));
        addNewPokemon(new DeltaOctillery("Octillery", Aspect.DELTA));
        addNewPokemon(new DeltaElekid("Elekid", Aspect.DELTA));
        addNewPokemon(new DeltaMagby("Magby", Aspect.DELTA));
    }

    private void registerPokemonInfinityForms() {
        //Pokemon Infinity
        addNewPokemon(new EghoChikorita("chikorita", Aspect.EGHO));
        addNewPokemon(new EghoBayleef("bayleef", Aspect.EGHO));
        addNewPokemon(new EghoMeganium("meganium", Aspect.EGHO));
        addNewPokemon(new EghoCyndaquil("cyndaquil", Aspect.EGHO));
        addNewPokemon(new EghoQuilava("quilava", Aspect.EGHO));
        addNewPokemon(new EghoTyphlosion("typhlosion", Aspect.EGHO));
        addNewPokemon(new EghoTotodile("totodile", Aspect.EGHO).fishingSpawnFromExisting());
        addNewPokemon(new EghoCroconaw("croconaw", Aspect.EGHO));
        addNewPokemon(new EghoFeraligatr("feraligatr", Aspect.EGHO));
        addNewPokemon(new EghoHoothoot("hoothoot", Aspect.EGHO));
        addNewPokemon(new EghoNoctowl("noctowl", Aspect.EGHO));
        addNewPokemon(new EghoMarill("marill", Aspect.EGHO));
        addNewPokemon(new EghoAzumarill("azumarill", Aspect.EGHO));
        addNewPokemon(new EghoBlissey( "blissey", Aspect.EGHO));
    }
}
