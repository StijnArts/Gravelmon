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

//        pokemon.add(new MastenianWooper("", Aspect.MASTENIAN)); TODO
//        pokemon.add(new MastenianChinchou("", Aspect.MASTENIAN));
//        pokemon.add(new MastenianLanturn("", Aspect.MASTENIAN));
//        pokemon.add(new MastenianLarvitar("", Aspect.MASTENIAN));
//        pokemon.add(new MastenianPupitar("", Aspect.MASTENIAN));

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
