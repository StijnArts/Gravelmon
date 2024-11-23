package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.arom.regional.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.form.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.hub.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class GenerationTwo extends Game {
    public GenerationTwo() {
        super("generation2");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AromianSentret("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        pokemon.add(new AromianFurret("", Aspect.AROMIAN).setUsesBigModel());

        pokemon.add(new FabelianStantler("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianShuckle("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSmeargle("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSpinarak("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianAriados("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianHoothoot("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianNoctowl("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianRaikou("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianEntei("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSuicune("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianMantine("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianYanma("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new IvrisianSmeargle("", Aspect.IVRISIAN).setUsesBigModel()); //TODO

        //TODO
        pokemon.add(new RaianianScizor("", Aspect.RAIANIAN, new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new RaianianNoctowl("", Aspect.RAIANIAN, new Stats(542, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());
        pokemon.add(new RaianianChinchou("", Aspect.RAIANIAN).setUsesBigModel());
        pokemon.add(new RaianianLanturn("", Aspect.RAIANIAN, new Stats(460, PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new RaianianPhanpy("", Aspect.RAIANIAN).setUsesBigModel());
        pokemon.add(new RaianianDonphan("", Aspect.RAIANIAN, new Stats(500, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());

        pokemon.add(new TrizoranSkarmory("", Aspect.TRIZORAN).setUsesBigModel()); //TODO

        pokemon.add(new NorsePichu("", Aspect.NORSE).setUsesBigModel()); //TODO
        pokemon.add(new NorseSentret("", Aspect.NORSE).setUsesBigModel());
        pokemon.add(new NorseFurret("", Aspect.NORSE, new Stats(415, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
//
        addFormanPokemon();

//        pokemon.add(new PastelianLedyba("", Aspect.PASTELIAN)); TODO
//        pokemon.add(new PastelianLedian("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianGirafarig("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianSneasel("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianSmeargle("", Aspect.PASTELIAN));

//        pokemon.add(new TheossianSunflora("", Aspect.THEOSSIAN)); TODO
//        pokemon.add(new TheossianSpinarak("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianAriados("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianMareep("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianFlaaffy("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianAmpharos("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianHoppip("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianSkiploom("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianJumpluff("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianMiltank("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianWooper("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianQuagsire("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianHeracross("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianBellossom("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianYanma("", Aspect.THEOSSIAN));

//        pokemon.add(new NodorranHoothoot("", Aspect.NODORRAN)); TODO
//        pokemon.add(new NodorranNoctowl("", Aspect.NODORRAN));
//        pokemon.add(new NodorranSteelix("", Aspect.NODORRAN));
//        pokemon.add(new NodorranSudowoodo("", Aspect.NODORRAN));
//        pokemon.add(new NodorranSunflora("", Aspect.NODORRAN));
//        pokemon.add(new NodorranTeddiursa("", Aspect.NODORRAN));
//        pokemon.add(new NodorranUrsaring("", Aspect.NODORRAN));

        pokemon.add(new MastenianWooper("", Aspect.MASTENIAN));
        pokemon.add(new MastenianChinchou("", Aspect.MASTENIAN));
        pokemon.add(new MastenianLanturn("", Aspect.MASTENIAN)); //MISSING STATS
        pokemon.add(new MastenianLarvitar("", Aspect.MASTENIAN));
        pokemon.add(new MastenianPupitar("", Aspect.MASTENIAN));

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanSlowking("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanPhanpy("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanDonphan("", Aspect.AFRICANUSAN));

        pokemon.add(new LagoonanRemoraid("", Aspect.LAGOONAN));
        pokemon.add(new LagoonanOctillery("", Aspect.LAGOONAN));

        pokemon.add(new IonosianChikorita("", Aspect.IONOSIAN)); //Sprite on desktop
        pokemon.add(new IonosianBayleef("", Aspect.IONOSIAN));
        pokemon.add(new IonosianMeganium("", Aspect.IONOSIAN, new Stats(525, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new IonosianCyndaquil("", Aspect.IONOSIAN));    //Sprite on desktop
        pokemon.add(new IonosianQuilava("", Aspect.IONOSIAN));
        pokemon.add(new IonosianTyphlosion("", Aspect.IONOSIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new IonosianTotodile("", Aspect.IONOSIAN));
        pokemon.add(new IonosianCroconaw("", Aspect.IONOSIAN));
        pokemon.add(new IonosianFeraligatr("", Aspect.IONOSIAN, new Stats(530, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        pokemon.add(new IonosianNatu("", Aspect.IONOSIAN));
        pokemon.add(new IonosianXatu("", Aspect.IONOSIAN,new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        pokemon.add(new IonosianGirafarig("", Aspect.IONOSIAN, new Stats(455, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new IonosianGranbull("", Aspect.IONOSIAN,new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new IonosianShuckle("", Aspect.IONOSIAN, new Stats(505, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE, StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE,
                        StatType.SPECIAL_DEFENCE))));
        pokemon.add(new IonosianSmoochum("", Aspect.IONOSIAN));

        pokemon.add(new AvalossianAipom("Aipom", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianBlissey("Blissey", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianQwilfish("Qwilfish", Aspect.AVALOSSIAN));

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
        pokemon.add(new AyreianTogepi("", Aspect.AYREIAN));
        pokemon.add(new AyreianTogetic("", Aspect.AYREIAN));
        pokemon.add(new AyreianHoppip("", Aspect.AYREIAN));
        pokemon.add(new AyreianSkiploom("", Aspect.AYREIAN));
        pokemon.add(new AyreianJumpluff("", Aspect.AYREIAN));
        pokemon.add(new AyreianMantine("", Aspect.AYREIAN));
        pokemon.add(new AyreianPhanpy("", Aspect.AYREIAN));
        pokemon.add(new AyreianDonphan("", Aspect.AYREIAN));
        pokemon.add(new AyreianHitmontop("", Aspect.AYREIAN));
        pokemon.add(new AyreianSmoochum("", Aspect.AYREIAN));


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

    private void addFormanPokemon() {

        pokemon.add(new FormanChikorita("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCyndaquil("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTotodile("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSentret("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanFurret("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHoothoot("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanLedyba("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanLedian("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSpinarak("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanAriados("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCrobat("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanChinchou("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTogepi("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanNatu("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMareep("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanFlaaffy("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMarill("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanSudowoodo("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanHoppip("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanAipom("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanSunkern("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanYanma("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanWooper("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMurkrow("", Aspect.FORMAN).setUsesBigModel()); //Member of line not finished
        pokemon.add(new FormanSlowking("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMisdreavus("", Aspect.FORMAN).setUsesBigModel()); //Member of line not finished
        pokemon.add(new FormanUnown("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new For manWobbuffet("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanGirafarig("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanPineco("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanForretress("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDunsparce("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanGligar("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanSteelix("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSnubbull("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGranbull("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanQwilfish("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanShuckle("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHeracross("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanSneasel("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanTeddiursa("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanSlugma("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanSwinub("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanPiloswine("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanCorsola("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanRemoraid("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDelibird("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMantine("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanSkarmory("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHoundour("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHoundoom("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPhanpy("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDonphan("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanPorygon2("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanStantler("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanSmeargle("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTyrogue("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHitmontop("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSmoochum("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanElekid("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanBlissey("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanLarvitar("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanRaikou("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanEntei("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSuicune("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanLugia("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHooh("", Aspect.FORMAN).setUsesBigModel());
    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochChikorita("", Aspect.EPOCH));
        pokemon.add(new EpochBayleef("", Aspect.EPOCH));
        pokemon.add(new EpochMeganium("", Aspect.EPOCH));
        pokemon.add(new EpochCyndaquil("", Aspect.EPOCH));
        pokemon.add(new EpochQuilava("", Aspect.EPOCH));
        pokemon.add(new EpochTyphlosion("", Aspect.EPOCH));
        pokemon.add(new EpochTotodile("", Aspect.EPOCH));
        pokemon.add(new EpochCroconaw("", Aspect.EPOCH));
        pokemon.add(new EpochFeraligatr("", Aspect.EPOCH));

        pokemon.add(new EpochChikoritaOne("", Aspect.EPOCH));
        pokemon.add(new EpochBayleefOne("", Aspect.EPOCH));
        pokemon.add(new EpochMeganiumOne("", Aspect.EPOCH));
        pokemon.add(new EpochCyndaquilOne("", Aspect.EPOCH));
        pokemon.add(new EpochQuilavaOne("", Aspect.EPOCH));
        pokemon.add(new EpochTyphlosionOne("", Aspect.EPOCH));
        pokemon.add(new EpochTotodileOne("", Aspect.EPOCH));
        pokemon.add(new EpochCroconawOne("", Aspect.EPOCH));
        pokemon.add(new EpochFeraligatrOne("", Aspect.EPOCH));

        pokemon.add(new EpochSteelix("", Aspect.EPOCH));
        pokemon.add(new EpochSlugma("", Aspect.EPOCH));
        pokemon.add(new EpochMagcargo("", Aspect.EPOCH));
        pokemon.add(new EpochNatu("", Aspect.EPOCH));
        pokemon.add(new EpochXatu("", Aspect.EPOCH));
        pokemon.add(new EpochSpinarak("", Aspect.EPOCH));
        pokemon.add(new EpochAriados("", Aspect.EPOCH));
        pokemon.add(new EpochStantler("", Aspect.EPOCH));
        pokemon.add(new EpochLedyba("", Aspect.EPOCH));
        pokemon.add(new EpochLedian("", Aspect.EPOCH));
        pokemon.add(new EpochGligar("", Aspect.EPOCH));
        pokemon.add(new EpochSudowoodo("", Aspect.EPOCH));
        pokemon.add(new EpochHoothoot("", Aspect.EPOCH));
        pokemon.add(new EpochNoctowl("", Aspect.EPOCH));
        pokemon.add(new EpochElekid("", Aspect.EPOCH));
        pokemon.add(new EpochMagby("", Aspect.EPOCH));
        pokemon.add(new EpochLarvitar("", Aspect.EPOCH));
        pokemon.add(new EpochPupitar("", Aspect.EPOCH));
        pokemon.add(new EpochTyranitar("", Aspect.EPOCH));
        pokemon.add(new EpochMareep("", Aspect.EPOCH));
        pokemon.add(new EpochFlaaffy("", Aspect.EPOCH));
        pokemon.add(new EpochAmpharos("", Aspect.EPOCH));
        pokemon.add(new EpochHeracross("", Aspect.EPOCH));
        pokemon.add(new EpochTeddiursa("", Aspect.EPOCH));
        pokemon.add(new EpochUrsaring("", Aspect.EPOCH));
        pokemon.add(new EpochEspeon("", Aspect.EPOCH));
        pokemon.add(new EpochUmbreon("", Aspect.EPOCH));
        pokemon.add(new EpochAipom("", Aspect.EPOCH));
        pokemon.add(new EpochSlowking("", Aspect.EPOCH));
        pokemon.add(new EpochBellossom("", Aspect.EPOCH));
        pokemon.add(new EpochSunkern("", Aspect.EPOCH));
        pokemon.add(new EpochSunflora("", Aspect.EPOCH));
        pokemon.add(new EpochKingdra("", Aspect.EPOCH));
        pokemon.add(new EpochChinchou("", Aspect.EPOCH));
        pokemon.add(new EpochLanturn("", Aspect.EPOCH));
        pokemon.add(new EpochMarill("", Aspect.EPOCH));
        pokemon.add(new EpochAzumarill("", Aspect.EPOCH));
        pokemon.add(new EpochDunsparce("", Aspect.EPOCH));
        pokemon.add(new EpochCorsola("", Aspect.EPOCH));
        pokemon.add(new EpochMantine("", Aspect.EPOCH));
        pokemon.add(new EpochMurkrow("", Aspect.EPOCH));
        pokemon.add(new EpochBlissey("", Aspect.EPOCH));
        pokemon.add(new EpochPichu("", Aspect.EPOCH));
        pokemon.add(new EpochIgglybuff("", Aspect.EPOCH));
        pokemon.add(new EpochSwinub("", Aspect.EPOCH));
        pokemon.add(new EpochPiloswine("", Aspect.EPOCH));
        pokemon.add(new EpochPhanpy("", Aspect.EPOCH));
        pokemon.add(new EpochDonphan("", Aspect.EPOCH));
        pokemon.add(new EpochSmeargle("", Aspect.EPOCH));
        pokemon.add(new EpochSlugmaOne("", Aspect.EPOCH));
        pokemon.add(new EpochMagcargoOne("", Aspect.EPOCH));
        pokemon.add(new EpochStantlerOne("", Aspect.EPOCH));
        pokemon.add(new EpochSmoochum("", Aspect.EPOCH));
        pokemon.add(new EpochYanma("", Aspect.EPOCH));
        pokemon.add(new EpochYanmaOne("", Aspect.EPOCH));
        pokemon.add(new EpochRemoraid("", Aspect.EPOCH));
        pokemon.add(new EpochOctillery("", Aspect.EPOCH));
        pokemon.add(new EpochMisdreavus("", Aspect.EPOCH));
        pokemon.add(new EpochPolitoed("", Aspect.EPOCH));
        pokemon.add(new EpochTyrogue("", Aspect.EPOCH));
        pokemon.add(new EpochHitmontop("", Aspect.EPOCH));
        pokemon.add(new EpochScizor("", Aspect.EPOCH));
        pokemon.add(new EpochMurkrowOne("", Aspect.EPOCH));
        pokemon.add(new EpochCleffa("", Aspect.EPOCH));
        pokemon.add(new EpochHoundour("", Aspect.EPOCH));
        pokemon.add(new EpochHoundoom("", Aspect.EPOCH));
        pokemon.add(new EpochSneasel("", Aspect.EPOCH));
        pokemon.add(new EpochMiltank("", Aspect.EPOCH));
        pokemon.add(new EpochSwinubOne("", Aspect.EPOCH));
        pokemon.add(new EpochPiloswineOne("", Aspect.EPOCH));
        pokemon.add(new EpochPorygon2("", Aspect.EPOCH));
        pokemon.add(new EpochWooper("", Aspect.EPOCH));
        pokemon.add(new EpochQuagsire("", Aspect.EPOCH));
        pokemon.add(new EpochDelibird("", Aspect.EPOCH));
        pokemon.add(new EpochHoppip("", Aspect.EPOCH));
        pokemon.add(new EpochSkiploom("", Aspect.EPOCH));
        pokemon.add(new EpochJumpluff("", Aspect.EPOCH));
        pokemon.add(new EpochKingdraOne("", Aspect.EPOCH));
        pokemon.add(new EpochPineco("", Aspect.EPOCH));
        pokemon.add(new EpochForretress("", Aspect.EPOCH));
        pokemon.add(new EpochHoothootOne("", Aspect.EPOCH));
        pokemon.add(new EpochNoctowlOne("", Aspect.EPOCH));
        pokemon.add(new EpochHoppipOne("", Aspect.EPOCH));
        pokemon.add(new EpochSkiploomOne("", Aspect.EPOCH));
        pokemon.add(new EpochJumpluffOne("", Aspect.EPOCH));
        pokemon.add(new EpochSkarmory("", Aspect.EPOCH));
        pokemon.add(new EpochSentret("", Aspect.EPOCH));
        pokemon.add(new EpochFurret("", Aspect.EPOCH));
        pokemon.add(new EpochCrobat("", Aspect.EPOCH));
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
