package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.aristos.regional.*;
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
import drai.dev.data.pokemon.form.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.ionos.regional.*;
import drai.dev.data.pokemon.ivris.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
import drai.dev.data.pokemon.mastenia.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.nosto.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.orohnhavai.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.data.pokemon.soulstones.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

import static drai.dev.data.attributes.StatArchetype.*;
import static drai.dev.data.attributes.StatType.*;

public class GenerationOne extends Game {
    public GenerationOne() {
        super("generation1");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new AromianRhyhorn("", Aspect.AROMIAN).setUsesBigModel()); //TODO
        pokemon.add(new AromianMeowth("", Aspect.AROMIAN).setUsesBigModel()); //TODO

        pokemon.add(new FabelianOddish("", Aspect.FABELIAN).setUsesBigModel()); //TODO
        pokemon.add(new FabelianGloom("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianOnix("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianPoliwag("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianPoliwhirl("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianMeowth("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianRattata("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianSeel("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianDewgong("", Aspect.FABELIAN).setUsesBigModel());
        pokemon.add(new FabelianJynx("", Aspect.FABELIAN).setUsesBigModel());

        pokemon.add(new MahalianMeowth("", Aspect.MAHALIAN).setUsesBigModel()); //TODO
        pokemon.add(new MahalianMankey("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianDratini("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianDragonair("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianStaryu("", Aspect.MAHALIAN).setUsesBigModel());
        pokemon.add(new MahalianRaichu("", Aspect.MAHALIAN).setUsesBigModel());

        pokemon.add(new FerranianMeowth("", Aspect.FERRANIAN).setUsesBigModel()); //TODO
        pokemon.add(new FerranianMachop("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianMachoke("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianMachamp("", Aspect.FERRANIAN).setUsesBigModel());
        pokemon.add(new FerranianLapras("", Aspect.FERRANIAN).setUsesBigModel());

        pokemon.add(new IvrisianMeowth("", Aspect.IVRISIAN).setUsesBigModel()); //TODO
        pokemon.add(new IvrisianMagikarp("", Aspect.IVRISIAN).setUsesBigModel());
        pokemon.add(new IvrisianGyarados("", Aspect.IVRISIAN).setUsesBigModel());

        pokemon.add(new PalmianRattata("", Aspect.PALMIAN).setUsesBigModel()); //TODO
        pokemon.add(new PalmianRaticate("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianGastly("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianExeggcute("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianExeggutor("", Aspect.PALMIAN, new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new PalmianGrowlithe("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianArcanine("", Aspect.PALMIAN, new Stats(555, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new PalmianMagikarp("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianPoliwag("", Aspect.PALMIAN).setUsesBigModel());
        pokemon.add(new PalmianPoliwhirl("", Aspect.PALMIAN).setUsesBigModel());

        //TODO
        pokemon.add(new RaianianArcanine("", Aspect.RAIANIAN, new Stats(555, FAST_SPECIAL_ATTACKER, List.of(SPEED))).setUsesBigModel());
        pokemon.add(new RaianianScyther("", Aspect.RAIANIAN).setUsesBigModel());
        pokemon.add(new RaianianDragonite("", Aspect.RAIANIAN, new Stats(600, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new RaianianDragoniteOne("", Aspect.RAIANIAN, new Stats(600, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))).setUsesBigModel());

        pokemon.add(new TrizoranOnix("", Aspect.TRIZORAN).setUsesBigModel()); //TODO

        pokemon.add(new NorsePikachu("", Aspect.NORSE).setUsesBigModel()); //TODO
        pokemon.add(new NorseRaichu("", Aspect.NORSE, new Stats(485, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
//
        formanPokemon();

//        pokemon.add(new PastelianShellder("", Aspect.PASTELIAN)); TODO
//        pokemon.add(new PastelianCloyster("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianChansey("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianKoffing("", Aspect.PASTELIAN));
//        pokemon.add(new PastelianWeezing("", Aspect.PASTELIAN));

//        pokemon.add(new TheossianRaichu("", Aspect.THEOSSIAN)); TODO
//        pokemon.add(new TheossianTauros("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianGrowlithe("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianArcanine("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianVenonat("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianVenomoth("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianOddish("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianGloom("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianVileplume("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianBellsprout("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianWeepinbell("", Aspect.THEOSSIAN));
//        pokemon.add(new TheossianVictreebel("", Aspect.THEOSSIAN));

//        pokemon.add(new NodorranEkans("", Aspect.NODORRAN)); TODO
//        pokemon.add(new NodorranArbok("", Aspect.NODORRAN));
//        pokemon.add(new NodorranGastly("", Aspect.NODORRAN));
//        pokemon.add(new NodorranHaunter("", Aspect.NODORRAN));
//        pokemon.add(new NodorranGengar("", Aspect.NODORRAN));
//        pokemon.add(new NodorranMagikarp("", Aspect.NODORRAN));
//        pokemon.add(new NodorranGyarados("", Aspect.NODORRAN));
//        pokemon.add(new NodorranOnix("", Aspect.NODORRAN));
//        pokemon.add(new NodorranKoffing("", Aspect.NODORRAN));
//        pokemon.add(new NodorranWeezing("", Aspect.NODORRAN));

        pokemon.add(new MastenianTentacool("", Aspect.MASTENIAN));
        pokemon.add(new MastenianPsyduck("", Aspect.MASTENIAN));
        pokemon.add(new MastenianGolduck("", Aspect.MASTENIAN));

        registerSoulstonesVariants();

        pokemon.add(new AfricanusanSlowpoke("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanSlowbro("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanPonyta("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanRapidash("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanTauros("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanMachop("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanMachoke("", Aspect.AFRICANUSAN));
        pokemon.add(new AfricanusanMachamp("", Aspect.AFRICANUSAN));

        pokemon.add(new IonosianEkans("", Aspect.IONOSIAN));
        pokemon.add(new IonosianArbok("", Aspect.IONOSIAN, new Stats(448, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
//        pokemon.add(new IonosianHypno("", Aspect.IONOSIAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));   Member of line not finished
        pokemon.add(new IonosianStarmie("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new IonosianJynx("", Aspect.IONOSIAN, new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new IonosianSnorlax("", Aspect.IONOSIAN, new Stats(540, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));

        pokemon.add(new AvalossianBellsprout("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianWeepinbell("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianVictreebel("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianParas("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianParasect("", Aspect.AVALOSSIAN));
        pokemon.add(new AvalossianChansey("", Aspect.AVALOSSIAN));

        addNewPokemon(new EnjinnianDrowzee("", Aspect.ENJINNIAN));
        addNewPokemon(new EnjinnianHypno("", Aspect.ENJINNIAN));

        addNewPokemon(new NovranSlowpoke("", Aspect.NOVRAN));
        addNewPokemon(new NovranSlowbro("", Aspect.NOVRAN));
        addNewPokemon(new NovranGrimer("", Aspect.NOVRAN));
        addNewPokemon(new NovranMuk("", Aspect.NOVRAN));
        addNewPokemon(new NovranLapras("", Aspect.NOVRAN));
        addNewPokemon(new NovranOmanyte("", Aspect.NOVRAN));
        addNewPokemon(new NovranOmastar("", Aspect.NOVRAN));

        addNewPokemon(new QamoranPsyduck("", Aspect.QAMORAN));
        addNewPokemon(new QamoranSeel("", Aspect.QAMORAN));
        addNewPokemon(new QamoranDewgong("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmonlee("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmonchan("", Aspect.QAMORAN));
        addNewPokemon(new QamoranKoffing("", Aspect.QAMORAN));
        addNewPokemon(new QamoranWeezing("", Aspect.QAMORAN));
        addNewPokemon(new QamoranTangela("", Aspect.QAMORAN));

        addNewPokemon(new NostanDiglett("", Aspect.NOSTAN));
        addNewPokemon(new NostanDugtrio("", Aspect.NOSTAN));
        addNewPokemon(new NostanShellder("", Aspect.NOSTAN));
        addNewPokemon(new NostanCloyster("", Aspect.NOSTAN));

        addNewPokemon(new NorheimanRattata("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanDiglett("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanDugtrio("", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new NorheimanSeel("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanShellder("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanVoltorb("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanElectrode("", Aspect.NORHEIMAN, new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new NorheimanSeadra("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanDitto("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanDragonair("", Aspect.NORHEIMAN));

//        pokemon.add(new VaritasianOnix(95)); Member of line Not Finished
//        pokemon.add(new VaritasianCubone(104)); Member of line Not Finished
//        pokemon.add(new VaritasianMarowak(105)); Missing Art
        addNewPokemon(new VaritasianHitmonlee("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmonchan("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianHorsea(116)); Member of line Not Finished
//        pokemon.add(new VaritasianSeadra(117)); Missing Art
//        pokemon.add(new VaritasianMrMime(122)); Missing Art
        addNewPokemon(new VaritasianPorygon("", Aspect.VARITASIAN));

//        pokemon.add(new HavaiianPoliwag(60)); //Member of line Not Finished
//        pokemon.add(new HavaiianPoliwhirl(61)); Missing Art
        addNewPokemon(new HavaiianGastly("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianHaunter("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianGengar("", Aspect.HAVAIIAN));
//        pokemon.add(new HavaiianKrabby(98)); Missing Stats
//        pokemon.add(new HavaiianExeggcute(102)); Missing Art
//        pokemon.add(new HavaiianExeggutor(103)); Missing Art
//        pokemon.add(new HavaiianHorsea(116)); //Member of line Not Finished

        addNewPokemon(new HizianVenonat("", Aspect.HIZIAN));
        addNewPokemon(new HizianVenomoth("", Aspect.HIZIAN));
        addNewPokemon(new HizianLickitung("", Aspect.HIZIAN));
        addNewPokemon(new HizianRhyhorn("", Aspect.HIZIAN));
        addNewPokemon(new HizianRhydon("", Aspect.HIZIAN));
        addNewPokemon(new HizianScyther("", Aspect.HIZIAN));
        addNewPokemon(new HizianPinsir("", Aspect.HIZIAN));

        addNewPokemon(new AristosianBellsprout("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianWeepinbell("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianVictreebel("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianGrowlithe("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianArcanine("", Aspect.ARISTOSIAN));
        addNewPokemon(new AristosianKangaskhan("", Aspect.ARISTOSIAN));

        addNewPokemon(new AvorianMrMime("", Aspect.AVORIAN));

        //Pokemon Infinity
        addEghoPokemon();

        //Pokemon Insurgance
        addDeltaPokemon();

        //Pokemon Xenoverse
        addXPokemon();

        //Pokemon Radical Red
        addNewPokemon(new SeviianDoduo("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianDodrio("", Aspect.SEVIIAN));

        //Pokemon Blazing Emerald
        addHoennianPokemon();

        //Pokemon Myth
        addMythianPokemon();

        //Pokemon Flux
        addNewPokemon(new AlteranEkans("", Aspect.ALTERAN));
        addNewPokemon(new AlteranArbok("", Aspect.ALTERAN));
        addNewPokemon(new AlteranNidoranWinterCoat("Nidoranf", Aspect.ALTERAN_WINTER_COAT));
        addNewPokemon(new AlteranNidoranSummerCoat("Nidoranm", Aspect.ALTERAN_SUMMER_COAT));

        //Armiran (Daybreak
        addNewPokemon(new ArmiranGrowlithe("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranArcanine("", Aspect.ARMIRAN));

        //Vanguard
        addAyreianPokemon();

        //Phoenix Rising
        addNewPokemon(new RelicTentacool("", Aspect.RELIC));
        addNewPokemon(new RelicTentacruel("", Aspect.RELIC));
        addNewPokemon(new RelicKoffing("", Aspect.RELIC));
        addNewPokemon(new RelicWeezing("", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianRaticate("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianBellsprout("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianGastly("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianHaunter("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianGengar("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianJynx("", Aspect.KASKADIAN).setUsesBigModel());
        pokemon.add(new KaskadianLapras("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticVoltorb("", Aspect.MYSTIC));
        addNewPokemon(new MysticElectrode("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranVenomoth("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDiglett("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranDugtrio("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranMeowthFire("Meowth", Aspect.CEFIRAN_FIRE));
        addNewPokemon(new CefiranPersianFire("Persian", Aspect.CEFIRAN_FIRE));
        addNewPokemon(new CefiranMeowthIce("Meowth", Aspect.CEFIRAN_ICE));
        addNewPokemon(new CefiranPersianIce("Persian", Aspect.CEFIRAN_ICE));
        addNewPokemon(new CefiranMeowthElectric("Meowth", Aspect.CEFIRAN_ELECTRIC));
        addNewPokemon(new CefiranPersianElectric("Persian", Aspect.CEFIRAN_ELECTRIC));
    }

    private void formanPokemon() {

        pokemon.add(new FormanBulbasaur("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCharmander("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSquirtle("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCaterpie("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanWeedle("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPidgey("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanRattata("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSpearow("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanFearow("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanEkans("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPikachu("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSandshrew("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidoranfemale("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidorina("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidoqueen("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidoranmale("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidorino("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNidoking("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanClefairy("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanVulpix("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanNinetales("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanJigglypuff("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanZubat("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGolbat("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanOddish("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanParas("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanVenonat("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDiglett("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDugtrio("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMeowth("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPsyduck("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGolduck("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMankey("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGrowlithe("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPoliwag("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanAbra("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMachop("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanBellsprout("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTentacool("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGeodude("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanPonyta("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSlowpoke("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSlowbro("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMagnemite("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanFarfetchd("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDoduo("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSeel("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGrimer("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanShellder("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCloyster("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGastly("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHaunter("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGengar("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanOnix("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDrowzee("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanKrabby("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanVoltorb("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanExeggcute("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanCubone("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMarowak("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHitmonlee("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHitmonchan("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanLickitung("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanKoffing("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanWeezing("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanRhyhorn("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanChansey("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanTangela("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanKangaskhan("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanHorsea("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanSeadra("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanGoldeen("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanStaryu("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanMrmime("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanScyther("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanJynx("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanElectabuzz("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanMagmar("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanPinsir("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanTauros("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMagikarp("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanLapras("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDitto("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanEevee("", Aspect.FORMAN).setUsesBigModel());
//        pokemon.add(new FormanPorygon("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
//        pokemon.add(new FormanSnorlax("", Aspect.FORMAN).setUsesBigModel());//Member of line not finished
        pokemon.add(new FormanArticuno("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanZapdos("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanMoltres("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDratini("", Aspect.FORMAN).setUsesBigModel());
        pokemon.add(new FormanDragonair("", Aspect.FORMAN).setUsesBigModel());
    }

    private void registerSoulstonesVariants() {
        pokemon.add(new EpochBulbasaur("", Aspect.EPOCH));
        pokemon.add(new EpochIvysaur("", Aspect.EPOCH));
        pokemon.add(new EpochVenusaur("", Aspect.EPOCH));
        pokemon.add(new EpochCharmander("", Aspect.EPOCH));
        pokemon.add(new EpochCharmeleon("", Aspect.EPOCH));
        pokemon.add(new EpochCharizard("", Aspect.EPOCH));
        pokemon.add(new EpochKoffing("", Aspect.EPOCH));
        pokemon.add(new EpochWeezing("", Aspect.EPOCH));
        pokemon.add(new EpochGastly("", Aspect.EPOCH));
        pokemon.add(new EpochHaunter("", Aspect.EPOCH));
        pokemon.add(new EpochGengar("", Aspect.EPOCH));
        pokemon.add(new EpochDoduo("", Aspect.EPOCH));
        pokemon.add(new EpochDodrio("", Aspect.EPOCH));
        pokemon.add(new EpochEkans("", Aspect.EPOCH));
        pokemon.add(new EpochArbok("", Aspect.EPOCH));
        pokemon.add(new EpochStaryu("", Aspect.EPOCH));
        pokemon.add(new EpochStarmie("", Aspect.EPOCH));
        pokemon.add(new EpochOnix("", Aspect.EPOCH));
        pokemon.add(new EpochZubat("", Aspect.EPOCH));
        pokemon.add(new EpochGolbat("", Aspect.EPOCH));
        pokemon.add(new EpochTangela("", Aspect.EPOCH));
        pokemon.add(new EpochMagikarp("", Aspect.EPOCH));
        pokemon.add(new EpochGyarados("", Aspect.EPOCH));
        pokemon.add(new EpochPonyta("", Aspect.EPOCH));
        pokemon.add(new EpochRapidash("", Aspect.EPOCH));
        pokemon.add(new EpochGeodude("", Aspect.EPOCH));
        pokemon.add(new EpochGraveler("", Aspect.EPOCH));
        pokemon.add(new EpochGolem("", Aspect.EPOCH));
        pokemon.add(new EpochDrowzee("", Aspect.EPOCH));
        pokemon.add(new EpochHypno("", Aspect.EPOCH));
        pokemon.add(new EpochSeel("", Aspect.EPOCH));
        pokemon.add(new EpochDewgong("", Aspect.EPOCH));
        pokemon.add(new EpochKabuto("", Aspect.EPOCH));
        pokemon.add(new EpochKabutops("", Aspect.EPOCH));
        pokemon.add(new EpochAerodactyl("", Aspect.EPOCH));
        pokemon.add(new EpochKrabby("", Aspect.EPOCH));
        pokemon.add(new EpochKingler("", Aspect.EPOCH));
        pokemon.add(new EpochVoltorb("", Aspect.EPOCH));
        pokemon.add(new EpochElectrode("", Aspect.EPOCH));
        pokemon.add(new EpochWeedle("", Aspect.EPOCH));
        pokemon.add(new EpochKakuna("", Aspect.EPOCH));
        pokemon.add(new EpochBeedrill("", Aspect.EPOCH));
        pokemon.add(new EpochMachop("", Aspect.EPOCH));
        pokemon.add(new EpochMachoke("", Aspect.EPOCH));
        pokemon.add(new EpochMachamp("", Aspect.EPOCH));
        pokemon.add(new EpochTauros("", Aspect.EPOCH));
        pokemon.add(new EpochElectabuzz("", Aspect.EPOCH));
        pokemon.add(new EpochMagmar("", Aspect.EPOCH));
        pokemon.add(new EpochExeggcute("", Aspect.EPOCH));
        pokemon.add(new EpochExeggutor("", Aspect.EPOCH));
        pokemon.add(new EpochGrimer("", Aspect.EPOCH));
        pokemon.add(new EpochMuk("", Aspect.EPOCH));
        pokemon.add(new EpochAbra("", Aspect.EPOCH));
        pokemon.add(new EpochKadabra("", Aspect.EPOCH));
        pokemon.add(new EpochAlakazam("", Aspect.EPOCH));
        pokemon.add(new EpochPsyduck("", Aspect.EPOCH));
        pokemon.add(new EpochGolduck("", Aspect.EPOCH));
        pokemon.add(new EpochEevee("", Aspect.EPOCH));
        pokemon.add(new EpochVaporeon("", Aspect.EPOCH));
        pokemon.add(new EpochJolteon("", Aspect.EPOCH));
        pokemon.add(new EpochFlareon("", Aspect.EPOCH));
        pokemon.add(new EpochMeowth("", Aspect.EPOCH));
        pokemon.add(new EpochPersian("", Aspect.EPOCH));
        pokemon.add(new EpochRattata("", Aspect.EPOCH));
        pokemon.add(new EpochRaticate("", Aspect.EPOCH));
        pokemon.add(new EpochSlowpoke("", Aspect.EPOCH));
        pokemon.add(new EpochSlowbro("", Aspect.EPOCH));
        pokemon.add(new EpochOddish("", Aspect.EPOCH));
        pokemon.add(new EpochGloom("", Aspect.EPOCH));
        pokemon.add(new EpochVileplume("", Aspect.EPOCH));
        pokemon.add(new EpochHorsea("", Aspect.EPOCH));
        pokemon.add(new EpochSeadra("", Aspect.EPOCH));
        pokemon.add(new EpochVenonat("", Aspect.EPOCH));
        pokemon.add(new EpochVenomoth("", Aspect.EPOCH));
        pokemon.add(new EpochCaterpie("", Aspect.EPOCH));
        pokemon.add(new EpochMetapod("", Aspect.EPOCH));
        pokemon.add(new EpochButterfree("", Aspect.EPOCH));
        pokemon.add(new EpochMankey("", Aspect.EPOCH));
        pokemon.add(new EpochPrimeape("", Aspect.EPOCH));
        pokemon.add(new EpochParas("", Aspect.EPOCH));
        pokemon.add(new EpochParasect("", Aspect.EPOCH));
        pokemon.add(new EpochLapras("", Aspect.EPOCH));
        pokemon.add(new EpochDiglett("", Aspect.EPOCH));
        pokemon.add(new EpochDugtrio("", Aspect.EPOCH));
        pokemon.add(new EpochPidgey("", Aspect.EPOCH));
        pokemon.add(new EpochPidgeotto("", Aspect.EPOCH));
        pokemon.add(new EpochPidgeot("", Aspect.EPOCH));
        pokemon.add(new EpochChansey("", Aspect.EPOCH));
        pokemon.add(new EpochTentacool("", Aspect.EPOCH));
        pokemon.add(new EpochTentacruel("", Aspect.EPOCH));
        pokemon.add(new EpochGrowlithe("", Aspect.EPOCH));
        pokemon.add(new EpochArcanine("", Aspect.EPOCH));
        pokemon.add(new EpochPikachu("", Aspect.EPOCH));
        pokemon.add(new EpochRaichu("", Aspect.EPOCH));
        pokemon.add(new EpochGoldeen("", Aspect.EPOCH));
        pokemon.add(new EpochSeaking("", Aspect.EPOCH));
        pokemon.add(new EpochMagnemite("", Aspect.EPOCH));
        pokemon.add(new EpochMagneton("", Aspect.EPOCH));
        pokemon.add(new EpochSpearow("", Aspect.EPOCH));
        pokemon.add(new EpochFearow("", Aspect.EPOCH));
        pokemon.add(new EpochJigglypuff("", Aspect.EPOCH));
        pokemon.add(new EpochWigglytuff("", Aspect.EPOCH));
        pokemon.add(new EpochDitto("", Aspect.EPOCH));
        pokemon.add(new EpochCubone("", Aspect.EPOCH));
        pokemon.add(new EpochMarowak("", Aspect.EPOCH));
        pokemon.add(new EpochHorseaOne("", Aspect.EPOCH));
        pokemon.add(new EpochSeadraOne("", Aspect.EPOCH));
        pokemon.add(new EpochOmanyte("", Aspect.EPOCH));
        pokemon.add(new EpochOmastar("", Aspect.EPOCH));
        pokemon.add(new EpochGrimerOne("", Aspect.EPOCH));
        pokemon.add(new EpochMukOne("", Aspect.EPOCH));
        pokemon.add(new EpochVulpix("", Aspect.EPOCH));
        pokemon.add(new EpochNinetales("", Aspect.EPOCH));
        pokemon.add(new EpochMrmime("", Aspect.EPOCH));
        pokemon.add(new EpochVoltorbOne("", Aspect.EPOCH));
        pokemon.add(new EpochElectrodeOne("", Aspect.EPOCH));
        pokemon.add(new EpochExeggcuteOne("", Aspect.EPOCH));
        pokemon.add(new EpochExeggutorOne("", Aspect.EPOCH));
        pokemon.add(new EpochDoduoOne("", Aspect.EPOCH));
        pokemon.add(new EpochDodrioOne("", Aspect.EPOCH));
        pokemon.add(new EpochMachopOne("", Aspect.EPOCH));
        pokemon.add(new EpochMachokeOne("", Aspect.EPOCH));
        pokemon.add(new EpochMachampOne("", Aspect.EPOCH));
        pokemon.add(new EpochJynx("", Aspect.EPOCH));
        pokemon.add(new EpochPoliwag("", Aspect.EPOCH));
        pokemon.add(new EpochPoliwhirl("", Aspect.EPOCH));
        pokemon.add(new EpochPoliwrath("", Aspect.EPOCH));
        pokemon.add(new EpochHitmonlee("", Aspect.EPOCH));
        pokemon.add(new EpochHitmonchan("", Aspect.EPOCH));
        pokemon.add(new EpochScyther("", Aspect.EPOCH));
        pokemon.add(new EpochPinsir("", Aspect.EPOCH));
        pokemon.add(new EpochGeodudeOne("", Aspect.EPOCH));
        pokemon.add(new EpochGravelerOne("", Aspect.EPOCH));
        pokemon.add(new EpochGolemOne("", Aspect.EPOCH));
        pokemon.add(new EpochClefairy("", Aspect.EPOCH));
        pokemon.add(new EpochClefable("", Aspect.EPOCH));
        pokemon.add(new EpochSnorlax("", Aspect.EPOCH));
        pokemon.add(new EpochMagnemiteOne("", Aspect.EPOCH));
        pokemon.add(new EpochMagnetonOne("", Aspect.EPOCH));
        pokemon.add(new EpochPorygon("", Aspect.EPOCH));
        pokemon.add(new EpochDratini("", Aspect.EPOCH));
        pokemon.add(new EpochDragonair("", Aspect.EPOCH));
        pokemon.add(new EpochDragonite("", Aspect.EPOCH));
        pokemon.add(new EpochKabutoOne("", Aspect.EPOCH));
        pokemon.add(new EpochKabutopsOne("", Aspect.EPOCH));
        pokemon.add(new EpochLaprasOne("", Aspect.EPOCH));
    }

    private void addAyreianPokemon() {
        pokemon.add(new AyreianSpearow("", Aspect.AYREIAN));
        pokemon.add(new AyreianFearow("", Aspect.AYREIAN));
        pokemon.add(new AyreianVenonat("", Aspect.AYREIAN));
        pokemon.add(new AyreianDoduo("", Aspect.AYREIAN));
        pokemon.add(new AyreianHitmonlee("", Aspect.AYREIAN));
        pokemon.add(new AyreianHitmonchan("", Aspect.AYREIAN));
        pokemon.add(new AyreianJynx("", Aspect.AYREIAN));
        pokemon.add(new AyreianSnorlax("", Aspect.AYREIAN));
        pokemon.add(new AyreianDratini("", Aspect.AYREIAN));
        pokemon.add(new AyreianDragonair("", Aspect.AYREIAN));
        pokemon.add(new AyreianDragonite("", Aspect.AYREIAN));
        pokemon.add(new AyreianLapras("", Aspect.AYREIAN));
        pokemon.add(new AyreianVulpix("", Aspect.AYREIAN));
        pokemon.add(new AyreianNinetales("", Aspect.AYREIAN));
        pokemon.add(new AyreianVulpixOne("", Aspect.AYREIAN));
        pokemon.add(new AyreianNinetalesOne("", Aspect.AYREIAN));

        pokemon.add(new AyreianBulbasaur("", Aspect.AYREIAN));
        pokemon.add(new AyreianIvysaur("", Aspect.AYREIAN));
        pokemon.add(new AyreianVenusaur("", Aspect.AYREIAN));
        pokemon.add(new AyreianCharmander("", Aspect.AYREIAN));
        pokemon.add(new AyreianCharmeleon("", Aspect.AYREIAN));
        pokemon.add(new AyreianCharizard("", Aspect.AYREIAN));
        pokemon.add(new AyreianSquirtle("", Aspect.AYREIAN));
        pokemon.add(new AyreianWartortle("", Aspect.AYREIAN));
        pokemon.add(new AyreianBlastoise("", Aspect.AYREIAN));
        pokemon.add(new AyreianCaterpie("", Aspect.AYREIAN));
        pokemon.add(new AyreianMetapod("", Aspect.AYREIAN));
        pokemon.add(new AyreianButterfree("", Aspect.AYREIAN));
        pokemon.add(new AyreianPidgey("", Aspect.AYREIAN));
        pokemon.add(new AyreianPidgeotto("", Aspect.AYREIAN));
        pokemon.add(new AyreianPidgeot("", Aspect.AYREIAN));
        pokemon.add(new AyreianDiglett("", Aspect.AYREIAN));
        pokemon.add(new AyreianDugtrio("", Aspect.AYREIAN));
        pokemon.add(new AyreianAbra("", Aspect.AYREIAN));
        pokemon.add(new AyreianKadabra("", Aspect.AYREIAN));
        pokemon.add(new AyreianAlakazam("", Aspect.AYREIAN));
        pokemon.add(new AyreianMagnemite("", Aspect.AYREIAN));
        pokemon.add(new AyreianMagneton("", Aspect.AYREIAN));
        pokemon.add(new AyreianGrimer("", Aspect.AYREIAN));
        pokemon.add(new AyreianMuk("", Aspect.AYREIAN));
        pokemon.add(new AyreianGastly("", Aspect.AYREIAN));
        pokemon.add(new AyreianHaunter("", Aspect.AYREIAN));
        pokemon.add(new AyreianGengar("", Aspect.AYREIAN));
        pokemon.add(new AyreianVoltorb("", Aspect.AYREIAN));
        pokemon.add(new AyreianElectrode("", Aspect.AYREIAN));
        pokemon.add(new AyreianPinsir("", Aspect.AYREIAN));
    }

    private void addMythianPokemon() {
        addNewPokemon(new MythianPidgey("", Aspect.MYTHIAN));
        addNewPokemon(new MythianPidgeotto("", Aspect.MYTHIAN));
        addNewPokemon(new MythianPidgeot("", Aspect.MYTHIAN));
        /*pokemon.add(new MythianDrowzee(96));
        pokemon.add(new MythianHypno(97));*/
        addNewPokemon(new MythianScyther("", Aspect.MYTHIAN));
        addNewPokemon(new MythianLapras("", Aspect.MYTHIAN));
    }

    private void addHoennianPokemon() {
        addNewPokemon(new HoennianVenonat("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTentacool("", Aspect.HOENNIAN).createFishingSpawn(SpawnPool.COMMON, 9, 34, 5.4));
        addNewPokemon(new HoennianTentacruel("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDodrio("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSeel("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDewgong("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianOnix("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTangela("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianPinsir("", Aspect.HOENNIAN));
    }

    private void addXPokemon() {
        addNewPokemon(new PikachuFemaleX("Pikachu", Aspect.FEMALE_X));
        addNewPokemon(new PikachuMaleX("Pikachu", Aspect.MALE_X));
        addNewPokemon(new RaichuX("", Aspect.X));
        addNewPokemon(new EldiwanMeowth("", Aspect.ELDIWAN));
        addNewPokemon(new PonytaX("", Aspect.X));
        addNewPokemon(new RapidashX("", Aspect.X));
        addNewPokemon(new GastlyX("", Aspect.X));
        addNewPokemon(new HaunterX("", Aspect.X));
        addNewPokemon(new GengarX("", Aspect.X));
        addNewPokemon(new ElectabuzzX("", Aspect.X));
        addNewPokemon(new DittoX("", Aspect.X));
        addNewPokemon(new MewtwoX("", Aspect.X));
    }

    private void addDeltaPokemon() {
        addNewPokemon(new DeltaBulbasaur("", Aspect.DELTA));
        addNewPokemon(new DeltaIvysaur("", Aspect.DELTA));
        addNewPokemon(new DeltaVenusaur("", Aspect.DELTA));
        addNewPokemon(new DeltaCharmander("", Aspect.DELTA));
        addNewPokemon(new DeltaCharmeleon("", Aspect.DELTA));
        addNewPokemon(new DeltaCharizard("", Aspect.DELTA));
        addNewPokemon(new DeltaSquirtle("", Aspect.DELTA));
        addNewPokemon(new DeltaWartortle("", Aspect.DELTA));
        addNewPokemon(new DeltaBlastoise("", Aspect.DELTA));
        addNewPokemon(new DeltaPidgey("", Aspect.DELTA));
        addNewPokemon(new DeltaPidgeotto("", Aspect.DELTA));
        addNewPokemon(new DeltaPidgeot("", Aspect.DELTA));
        addNewPokemon(new DeltaPikachu("", Aspect.DELTA));
        addNewPokemon(new DeltaRaichu("", Aspect.DELTA));
        addNewPokemon(new DeltaDiglett("", Aspect.DELTA));
        addNewPokemon(new DeltaDugtrio("", Aspect.DELTA));
        addNewPokemon(new DeltaGrowlithe("", Aspect.DELTA));
        addNewPokemon(new DeltaArcanine("", Aspect.DELTA));
        addNewPokemon(new DeltaTentacool("", Aspect.DELTA));
        addNewPokemon(new DeltaTentacruel("", Aspect.DELTA));
        addNewPokemon(new DeltaGeodude("", Aspect.DELTA));
        addNewPokemon(new DeltaGraveler("", Aspect.DELTA));
        addNewPokemon(new DeltaGolem("", Aspect.DELTA));
        addNewPokemon(new DeltaDoduo("", Aspect.DELTA));
        addNewPokemon(new DeltaDodrio("", Aspect.DELTA));
        addNewPokemon(new DeltaGrimer("", Aspect.DELTA));
        addNewPokemon(new DeltaMuk("", Aspect.DELTA));
        addNewPokemon(new DeltaKoffing("", Aspect.DELTA));
        addNewPokemon(new DeltaWeezing("", Aspect.DELTA));
        addNewPokemon(new DeltaTangela("", Aspect.DELTA));
        addNewPokemon(new DeltaScyther("", Aspect.DELTA));
        addNewPokemon(new DeltaElectabuzz("", Aspect.DELTA));
        addNewPokemon(new DeltaMagmar("", Aspect.DELTA));
        addNewPokemon(new DeltaDitto("", Aspect.DELTA));
        addNewPokemon(new DeltaKabuto("", Aspect.DELTA));
        addNewPokemon(new DeltaKabutops("", Aspect.DELTA));
        addNewPokemon(new DeltaSnorlax("", Aspect.DELTA));
        addNewPokemon(new DeltaDratini("", Aspect.DELTA));
        addNewPokemon(new DeltaDragonair("", Aspect.DELTA));
        addNewPokemon(new DeltaDragonite("", Aspect.DELTA));
    }

    private void addEghoPokemon() {
        addNewPokemon(new EghoBulbasaur("", Aspect.EGHO));
        addNewPokemon(new EghoIvysaur("", Aspect.EGHO));
        addNewPokemon(new EghoVenusaur("", Aspect.EGHO));
        addNewPokemon(new EghoCharmander("", Aspect.EGHO));
        addNewPokemon(new EghoCharmeleon("", Aspect.EGHO));
        addNewPokemon(new EghoCharizard("", Aspect.EGHO));
        addNewPokemon(new EghoSquirtle("", Aspect.EGHO));
        addNewPokemon(new EghoWartortle("", Aspect.EGHO));
        addNewPokemon(new EghoBlastoise("", Aspect.EGHO));
        addNewPokemon(new EghoSpearow("", Aspect.EGHO));
        addNewPokemon(new EghoFearow("", Aspect.EGHO));
        addNewPokemon(new EghoOddish("", Aspect.EGHO));
        addNewPokemon(new EghoGloom("", Aspect.EGHO));
        addNewPokemon(new EghoMagnemite("", Aspect.EGHO));
        addNewPokemon(new EghoMagneton("", Aspect.EGHO));
        addNewPokemon(new EghoGrimer("", Aspect.EGHO));
        addNewPokemon(new EghoMuk("", Aspect.EGHO));
        addNewPokemon(new EghoShellder("", Aspect.EGHO).fishingSpawnFromExisting());
        addNewPokemon(new EghoChansey("", Aspect.EGHO));
        addNewPokemon(new EghoTangela("", Aspect.EGHO));
    }
}
