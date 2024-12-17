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
        addNewPokemon(new AromianSentret("", Aspect.AROMIAN)); //TODO
        addNewPokemon(new AromianFurret("", Aspect.AROMIAN));

        addNewPokemon(new FabelianStantler("", Aspect.FABELIAN)); //TODO
        addNewPokemon(new FabelianShuckle("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSmeargle("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSpinarak("", Aspect.FABELIAN));
        addNewPokemon(new FabelianAriados("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHoothoot("", Aspect.FABELIAN));
        addNewPokemon(new FabelianNoctowl("", Aspect.FABELIAN));
        addNewPokemon(new FabelianRaikou("", Aspect.FABELIAN));
        addNewPokemon(new FabelianEntei("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSuicune("", Aspect.FABELIAN));

        addNewPokemon(new MahalianMantine("", Aspect.MAHALIAN).fishingSpawnFromExisting()); //TODO
        addNewPokemon(new MahalianYanma("", Aspect.MAHALIAN));

        addNewPokemon(new IvrisianSmeargle("", Aspect.IVRISIAN)); //TODO

        addNewPokemon(new RaianianScizor("", Aspect.RAIANIAN, new Stats(500, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_ATTACK))));
        addNewPokemon(new RaianianNoctowl("", Aspect.RAIANIAN, new Stats(542, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));
        addNewPokemon(new RaianianChinchou("", Aspect.RAIANIAN).fishingSpawnFromExisting());
        addNewPokemon(new RaianianLanturn("", Aspect.RAIANIAN, new Stats(460, PHYSICAL_ATTACKER, List.of(SPECIAL_DEFENCE))).fishingSpawnFromExisting());
        addNewPokemon(new RaianianPhanpy("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianDonphan("", Aspect.RAIANIAN, new Stats(500, SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));

        addNewPokemon(new TrizoranSkarmory("", Aspect.TRIZORAN));

        addNewPokemon(new NorsePichu("", Aspect.NORSE));
        addNewPokemon(new NorseSentret("", Aspect.NORSE));
        addNewPokemon(new NorseFurret("", Aspect.NORSE, new Stats(415, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));
//
        addFormanPokemon();

//        addNewPokemon(new PastelianLedyba("", Aspect.PASTELIAN)); TODO
//        addNewPokemon(new PastelianLedian("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianGirafarig("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianSneasel("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianSmeargle("", Aspect.PASTELIAN));

//        addNewPokemon(new TheossianSunflora("", Aspect.THEOSSIAN)); TODO
//        addNewPokemon(new TheossianSpinarak("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianAriados("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianMareep("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianFlaaffy("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianAmpharos("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianHoppip("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianSkiploom("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianJumpluff("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianMiltank("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianWooper("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianQuagsire("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianHeracross("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianBellossom("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianYanma("", Aspect.THEOSSIAN));

//        addNewPokemon(new NodorranHoothoot("", Aspect.NODORRAN)); TODO
//        addNewPokemon(new NodorranNoctowl("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranSteelix("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranSudowoodo("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranSunflora("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranTeddiursa("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranUrsaring("", Aspect.NODORRAN));

        addNewPokemon(new MastenianWooper("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianChinchou("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianLanturn("", Aspect.MASTENIAN)); //MISSING STATS
        addNewPokemon(new MastenianLarvitar("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianPupitar("", Aspect.MASTENIAN));

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanSlowking("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanPhanpy("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanDonphan("", Aspect.AFRICANUSAN));

        addNewPokemon(new LagoonanRemoraid("", Aspect.LAGOONAN));
        addNewPokemon(new LagoonanOctillery("", Aspect.LAGOONAN));

        addNewPokemon(new IonosianChikorita("", Aspect.IONOSIAN)); //Sprite on desktop
        addNewPokemon(new IonosianBayleef("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianMeganium("", Aspect.IONOSIAN, new Stats(525, StatArchetype.PHYSICAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new IonosianCyndaquil("", Aspect.IONOSIAN));    //Sprite on desktop
        addNewPokemon(new IonosianQuilava("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianTyphlosion("", Aspect.IONOSIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new IonosianTotodile("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianCroconaw("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianFeraligatr("", Aspect.IONOSIAN, new Stats(530, StatArchetype.FAST_PHYSICAL_ATTACKER,
                List.of(StatType.ATTACK))));
        addNewPokemon(new IonosianNatu("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianXatu("", Aspect.IONOSIAN,new Stats(470, StatArchetype.PHYSICAL_WALL,
                List.of(StatType.HP))));
        addNewPokemon(new IonosianGirafarig("", Aspect.IONOSIAN, new Stats(455, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new IonosianGranbull("", Aspect.IONOSIAN,new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        addNewPokemon(new IonosianShuckle("", Aspect.IONOSIAN, new Stats(505, StatArchetype.FAST_PHYSICAL_WALL,
                List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE, StatType.SPECIAL_DEFENCE, StatType.SPECIAL_DEFENCE,
                        StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new IonosianSmoochum("", Aspect.IONOSIAN));

        addNewPokemon(new AvalossianAipom("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianBlissey("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianQwilfish("", Aspect.AVALOSSIAN));

        addNewPokemon(new EnjinnianHoothoot("", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianNoctowl("", Aspect.ENJINNIAN));

        addNewPokemon(new NovranSudowoodo("", Aspect.NOVRAN));
        addNewPokemon(new NovranSlowking("", Aspect.NOVRAN));

        addNewPokemon(new QamoranTyrogue("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmontop("", Aspect.QAMORAN));

        addNewPokemon(new VaritasianTogepi("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTogetic("", Aspect.VARITASIAN));
//        addNewPokemon(new VaritasianSudowoodo(185)); Missing Art
        addNewPokemon(new VaritasianWobbuffet("", Aspect.VARITASIAN));
//        addNewPokemon(new VaritasianMantine(226)); Missing Art
//        addNewPokemon(new VaritasianKingdra(230)); Missing Art
        addNewPokemon(new VaritasianPorygon2("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTyrogue("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmontop("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianRaikou("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEntei("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSuicune("", Aspect.VARITASIAN));

        addNewPokemon(new HubianTogepi("", Aspect.HUBIAN));
        addNewPokemon(new HubianTogetic("", Aspect.HUBIAN));
        addNewPokemon(new HubianSmeargle("", Aspect.HUBIAN));

        addNewPokemon(new HizianGligar("", Aspect.HIZIAN));
        addNewPokemon(new HizianMurkrow("", Aspect.HIZIAN));
        addNewPokemon(new HizianMisdreavus("", Aspect.HIZIAN));

        addNewPokemon(new NorheimanUnown("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanForretress("", Aspect.NORHEIMAN, new Stats(465, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new NorheimanHoundour("", Aspect.NORHEIMAN));

        //Aristosian
        addNewPokemon(new AristosianSentret("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFurret("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianSpinarak("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianMareep("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianFlaaffy("", Aspect.ARISTOSIAN));

        //Avorian
//        addNewPokemon(new AvorianMareep(179)); Member of Line not finished
//        addNewPokemon(new AvorianFlaaffy(180)); Member of Line not finished

        registerPokemonInfinityForms();

        registerInsurganceForms();

        registerXenoverseForms();

        addHoennianPokemon();

        //Radical Red
        addNewPokemon(new SeviianTeddiursa("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianUrsaring("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMantine("", Aspect.SEVIIAN));

        //Pokemon Flux
        addNewPokemon(new AlteranLedian("", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranTyranitar("", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianTogepi("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTogetic("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHoppip("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSkiploom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianJumpluff("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMantine("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPhanpy("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDonphan("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmontop("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSmoochum("", Aspect.AYREIAN));

        addNewPokemon(new AyreianChikorita("", Aspect.AYREIAN));
        addNewPokemon(new AyreianBayleef("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMeganium("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCyndaquil("", Aspect.AYREIAN));
        addNewPokemon(new AyreianQuilava("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTyphlosion("", Aspect.AYREIAN));
        addNewPokemon(new AyreianTotodile("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCroconaw("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFeraligatr("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSpinarak("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAriados("", Aspect.AYREIAN));
        addNewPokemon(new AyreianStantler("", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicLedyba("", Aspect.RELIC));
        addNewPokemon(new RelicLedian("", Aspect.RELIC));
        addNewPokemon(new RelicAipom("", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianMarill("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianAzumarill("", Aspect.KASKADIAN));
        addNewPokemon(new AmazeAllSudowoodo("", Aspect.AMAZE_ALL));
        addNewPokemon(new KaskadianYanma("", Aspect.KASKADIAN));

        //Pokemon Opalo
        addNewPokemon(new CefiranTeddiursa("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranUrsaring("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSlugma("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMagcargo("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDelibird("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSmeargle("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranCelebi("", Aspect.CEFIRAN));
    }

    private void addFormanPokemon() {
        addNewPokemon(new FormanChikorita("", Aspect.FORMAN));
        addNewPokemon(new FormanCyndaquil("", Aspect.FORMAN));
        addNewPokemon(new FormanTotodile("", Aspect.FORMAN));
        addNewPokemon(new FormanSentret("", Aspect.FORMAN));
        addNewPokemon(new FormanFurret("", Aspect.FORMAN));
        addNewPokemon(new FormanHoothoot("", Aspect.FORMAN));
        addNewPokemon(new FormanLedyba("", Aspect.FORMAN));
        addNewPokemon(new FormanLedian("", Aspect.FORMAN));
        addNewPokemon(new FormanSpinarak("", Aspect.FORMAN));
        addNewPokemon(new FormanAriados("", Aspect.FORMAN));
        addNewPokemon(new FormanCrobat("", Aspect.FORMAN));
        addNewPokemon(new FormanChinchou("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanTogepi("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanNatu("", Aspect.FORMAN));
        addNewPokemon(new FormanMareep("", Aspect.FORMAN));
        addNewPokemon(new FormanFlaaffy("", Aspect.FORMAN));
//        addNewPokemon(new FormanMarill("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSudowoodo("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanHoppip("", Aspect.FORMAN));
//        addNewPokemon(new FormanAipom("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanSunkern("", Aspect.FORMAN));
//        addNewPokemon(new FormanYanma("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanWooper("", Aspect.FORMAN));
//        addNewPokemon(new FormanMurkrow("", Aspect.FORMAN)); //Member of line not finished
        addNewPokemon(new FormanSlowking("", Aspect.FORMAN));
//        addNewPokemon(new FormanMisdreavus("", Aspect.FORMAN)); //Member of line not finished
        addNewPokemon(new FormanUnown("", Aspect.FORMAN));
//        addNewPokemon(new For manWobbuffet("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanGirafarig("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanPineco("", Aspect.FORMAN));
        addNewPokemon(new FormanForretress("", Aspect.FORMAN));
        addNewPokemon(new FormanDunsparce("", Aspect.FORMAN));
//        addNewPokemon(new FormanGligar("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanSteelix("", Aspect.FORMAN));
        addNewPokemon(new FormanSnubbull("", Aspect.FORMAN));
        addNewPokemon(new FormanGranbull("", Aspect.FORMAN));
        addNewPokemon(new FormanQwilfish("", Aspect.FORMAN));
        addNewPokemon(new FormanShuckle("", Aspect.FORMAN));
        addNewPokemon(new FormanHeracross("", Aspect.FORMAN));
//        addNewPokemon(new FormanSneasel("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanTeddiursa("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanSlugma("", Aspect.FORMAN));
//        addNewPokemon(new FormanSwinub("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanPiloswine("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanCorsola("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanRemoraid("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanDelibird("", Aspect.FORMAN));
//        addNewPokemon(new FormanMantine("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanSkarmory("", Aspect.FORMAN));
        addNewPokemon(new FormanHoundour("", Aspect.FORMAN));
        addNewPokemon(new FormanHoundoom("", Aspect.FORMAN));
        addNewPokemon(new FormanPhanpy("", Aspect.FORMAN));
        addNewPokemon(new FormanDonphan("", Aspect.FORMAN));
//        addNewPokemon(new FormanPorygon2("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanStantler("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanSmeargle("", Aspect.FORMAN));
        addNewPokemon(new FormanTyrogue("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmontop("", Aspect.FORMAN));
        addNewPokemon(new FormanSmoochum("", Aspect.FORMAN));
//        addNewPokemon(new FormanElekid("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanBlissey("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanRaikou("", Aspect.FORMAN));
        addNewPokemon(new FormanEntei("", Aspect.FORMAN));
        addNewPokemon(new FormanSuicune("", Aspect.FORMAN));
        addNewPokemon(new FormanLarvitar("", Aspect.FORMAN));
        addNewPokemon(new FormanLugia("", Aspect.FORMAN));
        addNewPokemon(new FormanHooh("", Aspect.FORMAN));
    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochChikorita("", Aspect.EPOCH));
        addNewPokemon(new EpochBayleef("", Aspect.EPOCH));
        addNewPokemon(new EpochMeganium("", Aspect.EPOCH));
        addNewPokemon(new EpochCyndaquil("", Aspect.EPOCH));
        addNewPokemon(new EpochQuilava("", Aspect.EPOCH));
        addNewPokemon(new EpochTyphlosion("", Aspect.EPOCH));
        addNewPokemon(new EpochTotodile("", Aspect.EPOCH));
        addNewPokemon(new EpochCroconaw("", Aspect.EPOCH));
        addNewPokemon(new EpochFeraligatr("", Aspect.EPOCH));

        addNewPokemon(new EpochChikoritaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochBayleefOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMeganiumOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCyndaquilOne("", Aspect.EPOCH));
        addNewPokemon(new EpochQuilavaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTyphlosionOne("", Aspect.EPOCH));
        addNewPokemon(new EpochTotodileOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCroconawOne("", Aspect.EPOCH));
        addNewPokemon(new EpochFeraligatrOne("", Aspect.EPOCH));

        addNewPokemon(new EpochSteelix("", Aspect.EPOCH));
        addNewPokemon(new EpochSlugma("", Aspect.EPOCH));
        addNewPokemon(new EpochMagcargo("", Aspect.EPOCH));
        addNewPokemon(new EpochNatu("", Aspect.EPOCH));
        addNewPokemon(new EpochXatu("", Aspect.EPOCH));
        addNewPokemon(new EpochSpinarak("", Aspect.EPOCH));
        addNewPokemon(new EpochAriados("", Aspect.EPOCH));
        addNewPokemon(new EpochStantler("", Aspect.EPOCH));
        addNewPokemon(new EpochLedyba("", Aspect.EPOCH));
        addNewPokemon(new EpochLedian("", Aspect.EPOCH));
        addNewPokemon(new EpochGligar("", Aspect.EPOCH));
        addNewPokemon(new EpochSudowoodo("", Aspect.EPOCH));
        addNewPokemon(new EpochHoothoot("", Aspect.EPOCH));
        addNewPokemon(new EpochNoctowl("", Aspect.EPOCH));
        addNewPokemon(new EpochElekid("", Aspect.EPOCH));
        addNewPokemon(new EpochMagby("", Aspect.EPOCH));
        addNewPokemon(new EpochLarvitar("", Aspect.EPOCH));
        addNewPokemon(new EpochPupitar("", Aspect.EPOCH));
        addNewPokemon(new EpochTyranitar("", Aspect.EPOCH));
        addNewPokemon(new EpochMareep("", Aspect.EPOCH));
        addNewPokemon(new EpochFlaaffy("", Aspect.EPOCH));
        addNewPokemon(new EpochAmpharos("", Aspect.EPOCH));
        addNewPokemon(new EpochHeracross("", Aspect.EPOCH));
        addNewPokemon(new EpochTeddiursa("", Aspect.EPOCH));
        addNewPokemon(new EpochUrsaring("", Aspect.EPOCH));
        addNewPokemon(new EpochEspeon("", Aspect.EPOCH));
        addNewPokemon(new EpochUmbreon("", Aspect.EPOCH));
        addNewPokemon(new EpochAipom("", Aspect.EPOCH));
        addNewPokemon(new EpochSlowking("", Aspect.EPOCH));
        addNewPokemon(new EpochBellossom("", Aspect.EPOCH));
        addNewPokemon(new EpochSunkern("", Aspect.EPOCH));
        addNewPokemon(new EpochSunflora("", Aspect.EPOCH));
        addNewPokemon(new EpochKingdra("", Aspect.EPOCH));
        addNewPokemon(new EpochChinchou("", Aspect.EPOCH));
        addNewPokemon(new EpochLanturn("", Aspect.EPOCH));
        addNewPokemon(new EpochMarill("", Aspect.EPOCH));
        addNewPokemon(new EpochAzumarill("", Aspect.EPOCH));
        addNewPokemon(new EpochDunsparce("", Aspect.EPOCH));
        addNewPokemon(new EpochCorsola("", Aspect.EPOCH));
        addNewPokemon(new EpochMantine("", Aspect.EPOCH));
        addNewPokemon(new EpochMurkrow("", Aspect.EPOCH));
        addNewPokemon(new EpochBlissey("", Aspect.EPOCH));
        addNewPokemon(new EpochPichu("", Aspect.EPOCH));
        addNewPokemon(new EpochIgglybuff("", Aspect.EPOCH));
        addNewPokemon(new EpochSwinub("", Aspect.EPOCH));
        addNewPokemon(new EpochPiloswine("", Aspect.EPOCH));
        addNewPokemon(new EpochPhanpy("", Aspect.EPOCH));
        addNewPokemon(new EpochDonphan("", Aspect.EPOCH));
        addNewPokemon(new EpochSmeargle("", Aspect.EPOCH));
        addNewPokemon(new EpochSlugmaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMagcargoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochStantlerOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSmoochum("", Aspect.EPOCH));
        addNewPokemon(new EpochYanma("", Aspect.EPOCH));
        addNewPokemon(new EpochYanmaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochRemoraid("", Aspect.EPOCH));
        addNewPokemon(new EpochOctillery("", Aspect.EPOCH));
        addNewPokemon(new EpochMisdreavus("", Aspect.EPOCH));
        addNewPokemon(new EpochPolitoed("", Aspect.EPOCH));
        addNewPokemon(new EpochTyrogue("", Aspect.EPOCH));
        addNewPokemon(new EpochHitmontop("", Aspect.EPOCH));
        addNewPokemon(new EpochScizor("", Aspect.EPOCH));
        addNewPokemon(new EpochMurkrowOne("", Aspect.EPOCH));
        addNewPokemon(new EpochCleffa("", Aspect.EPOCH));
        addNewPokemon(new EpochHoundour("", Aspect.EPOCH));
        addNewPokemon(new EpochHoundoom("", Aspect.EPOCH));
        addNewPokemon(new EpochSneasel("", Aspect.EPOCH));
        addNewPokemon(new EpochMiltank("", Aspect.EPOCH));
        addNewPokemon(new EpochSwinubOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPiloswineOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPorygon2("", Aspect.EPOCH));
        addNewPokemon(new EpochWooper("", Aspect.EPOCH));
        addNewPokemon(new EpochQuagsire("", Aspect.EPOCH));
        addNewPokemon(new EpochDelibird("", Aspect.EPOCH));
        addNewPokemon(new EpochHoppip("", Aspect.EPOCH));
        addNewPokemon(new EpochSkiploom("", Aspect.EPOCH));
        addNewPokemon(new EpochJumpluff("", Aspect.EPOCH));
        addNewPokemon(new EpochKingdraOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPineco("", Aspect.EPOCH));
        addNewPokemon(new EpochForretress("", Aspect.EPOCH));
        addNewPokemon(new EpochHoothootOne("", Aspect.EPOCH));
        addNewPokemon(new EpochNoctowlOne("", Aspect.EPOCH));
        addNewPokemon(new EpochHoppipOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSkiploomOne("", Aspect.EPOCH));
        addNewPokemon(new EpochJumpluffOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSkarmory("", Aspect.EPOCH));
        addNewPokemon(new EpochSentret("", Aspect.EPOCH));
        addNewPokemon(new EpochFurret("", Aspect.EPOCH));
        addNewPokemon(new EpochCrobat("", Aspect.EPOCH));
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
