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
        addNewPokemon(new AromianRhyhorn("", Aspect.AROMIAN)); //TODO
        addNewPokemon(new AromianMeowth("", Aspect.AROMIAN)); //TODO

        addNewPokemon(new FabelianOddish("", Aspect.FABELIAN)); //TODO
        addNewPokemon(new FabelianGloom("", Aspect.FABELIAN));
        addNewPokemon(new FabelianOnix("", Aspect.FABELIAN));
        addNewPokemon(new FabelianPoliwag("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianPoliwhirl("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianMeowth("", Aspect.FABELIAN));
        addNewPokemon(new FabelianRattata("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSeel("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianDewgong("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianJynx("", Aspect.FABELIAN));

        addNewPokemon(new MahalianMeowth("", Aspect.MAHALIAN)); //TODO
        addNewPokemon(new MahalianMankey("", Aspect.MAHALIAN));
        addNewPokemon(new MahalianDratini("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new MahalianDragonair("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new MahalianStaryu("", Aspect.MAHALIAN).fishingSpawnFromExisting());
        addNewPokemon(new MahalianRaichu("", Aspect.MAHALIAN));

        addNewPokemon(new FerranianMeowth("", Aspect.FERRANIAN)); //TODO
        addNewPokemon(new FerranianMachop("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianMachoke("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianMachamp("", Aspect.FERRANIAN));
        addNewPokemon(new FerranianLapras("", Aspect.FERRANIAN));

        addNewPokemon(new IvrisianMeowth("", Aspect.IVRISIAN)); //TODO
        addNewPokemon(new IvrisianMagikarp("", Aspect.IVRISIAN).fishingSpawnFromExisting());
        addNewPokemon(new IvrisianGyarados("", Aspect.IVRISIAN).fishingSpawnFromExisting());

        addNewPokemon(new PalmianRattata("", Aspect.PALMIAN));
        addNewPokemon(new PalmianRaticate("", Aspect.PALMIAN));
        addNewPokemon(new PalmianGastly("", Aspect.PALMIAN));
        addNewPokemon(new PalmianExeggcute("", Aspect.PALMIAN));
        addNewPokemon(new PalmianExeggutor("", Aspect.PALMIAN, new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new PalmianGrowlithe("", Aspect.PALMIAN));
        addNewPokemon(new PalmianArcanine("", Aspect.PALMIAN, new Stats(555, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new PalmianMagikarp("", Aspect.PALMIAN).fishingSpawnFromExisting());
        addNewPokemon(new PalmianPoliwag("", Aspect.PALMIAN).fishingSpawnFromExisting());
        addNewPokemon(new PalmianPoliwhirl("", Aspect.PALMIAN).fishingSpawnFromExisting());

        addNewPokemon(new RaianianArcanine("", Aspect.RAIANIAN, new Stats(555, FAST_SPECIAL_ATTACKER, List.of(SPEED))));
        addNewPokemon(new RaianianScyther("", Aspect.RAIANIAN));
        addNewPokemon(new RaianianDragonite("", Aspect.RAIANIAN, new Stats(600, BULKY_SPECIAL_ATTACKER, List.of(SPECIAL_DEFENCE))));
        addNewPokemon(new RaianianDragoniteOne("", Aspect.RAIANIAN, new Stats(600, BULKY_PHYSICAL_ATTACKER, List.of(DEFENCE))));

        addNewPokemon(new TrizoranOnix("", Aspect.TRIZORAN));

        addNewPokemon(new NorsePikachu("", Aspect.NORSE));
        addNewPokemon(new NorseRaichu("", Aspect.NORSE, new Stats(485, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//
        formanPokemon();

//        addNewPokemon(new PastelianShellder("", Aspect.PASTELIAN)); TODO
//        addNewPokemon(new PastelianCloyster("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianChansey("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianKoffing("", Aspect.PASTELIAN));
//        addNewPokemon(new PastelianWeezing("", Aspect.PASTELIAN));

//        addNewPokemon(new TheossianRaichu("", Aspect.THEOSSIAN)); TODO
//        addNewPokemon(new TheossianTauros("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianGrowlithe("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianArcanine("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianVenonat("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianVenomoth("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianOddish("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianGloom("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianVileplume("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianBellsprout("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianWeepinbell("", Aspect.THEOSSIAN));
//        addNewPokemon(new TheossianVictreebel("", Aspect.THEOSSIAN));

//        addNewPokemon(new NodorranEkans("", Aspect.NODORRAN)); TODO
//        addNewPokemon(new NodorranArbok("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranGastly("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranHaunter("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranGengar("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranMagikarp("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranGyarados("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranOnix("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranKoffing("", Aspect.NODORRAN));
//        addNewPokemon(new NodorranWeezing("", Aspect.NODORRAN));

        addNewPokemon(new MastenianTentacool("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianPsyduck("", Aspect.MASTENIAN));
        addNewPokemon(new MastenianGolduck("", Aspect.MASTENIAN));

        registerSoulstonesVariants();

        addNewPokemon(new AfricanusanSlowpoke("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanSlowbro("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanPonyta("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanRapidash("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanTauros("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachop("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachoke("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachamp("", Aspect.AFRICANUSAN));

        addNewPokemon(new IonosianEkans("", Aspect.IONOSIAN));
        addNewPokemon(new IonosianArbok("", Aspect.IONOSIAN, new Stats(448, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
//        addNewPokemon(new IonosianHypno("", Aspect.IONOSIAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
//                List.of(StatType.SPEED))));   Member of line not finished
        addNewPokemon(new IonosianStarmie("", Aspect.IONOSIAN, new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new IonosianJynx("", Aspect.IONOSIAN, new Stats(455, StatArchetype.SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        addNewPokemon(new IonosianSnorlax("", Aspect.IONOSIAN, new Stats(540, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.HP))));

        addNewPokemon(new AvalossianBellsprout("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianWeepinbell("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVictreebel("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianParas("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianParasect("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianChansey("", Aspect.AVALOSSIAN));

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

//        addNewPokemon(new VaritasianOnix(95)); Member of line Not Finished
//        addNewPokemon(new VaritasianCubone(104)); Member of line Not Finished
//        addNewPokemon(new VaritasianMarowak(105)); Missing Art
        addNewPokemon(new VaritasianHitmonlee("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmonchan("", Aspect.VARITASIAN));
//        addNewPokemon(new VaritasianHorsea(116)); Member of line Not Finished
//        addNewPokemon(new VaritasianSeadra(117)); Missing Art
//        addNewPokemon(new VaritasianMrMime(122)); Missing Art
        addNewPokemon(new VaritasianPorygon("", Aspect.VARITASIAN));

//        addNewPokemon(new HavaiianPoliwag(60)); //Member of line Not Finished
//        addNewPokemon(new HavaiianPoliwhirl(61)); Missing Art
        addNewPokemon(new HavaiianGastly("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianHaunter("", Aspect.HAVAIIAN));
        addNewPokemon(new HavaiianGengar("", Aspect.HAVAIIAN));
//        addNewPokemon(new HavaiianKrabby(98)); Missing Stats
//        addNewPokemon(new HavaiianExeggcute(102)); Missing Art
//        addNewPokemon(new HavaiianExeggutor(103)); Missing Art
//        addNewPokemon(new HavaiianHorsea(116)); //Member of line Not Finished

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
        addNewPokemon(new KaskadianRaticate("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianBellsprout("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGastly("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianHaunter("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGengar("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianJynx("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianLapras("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticVoltorb("", Aspect.MYSTIC).setPreferredBlocks("minecraft:amethyst_block"));
        addNewPokemon(new MysticElectrode("", Aspect.MYSTIC));

        //Pokemon Opalo
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

        addNewPokemon(new FormanBulbasaur("", Aspect.FORMAN));
        addNewPokemon(new FormanCharmander("", Aspect.FORMAN));
        addNewPokemon(new FormanSquirtle("", Aspect.FORMAN));
        addNewPokemon(new FormanCaterpie("", Aspect.FORMAN));
        addNewPokemon(new FormanWeedle("", Aspect.FORMAN));
        addNewPokemon(new FormanPidgey("", Aspect.FORMAN));
        addNewPokemon(new FormanRattata("", Aspect.FORMAN));
        addNewPokemon(new FormanSpearow("", Aspect.FORMAN));
        addNewPokemon(new FormanFearow("", Aspect.FORMAN));
        addNewPokemon(new FormanEkans("", Aspect.FORMAN));
        addNewPokemon(new FormanPikachu("", Aspect.FORMAN));
        addNewPokemon(new FormanSandshrew("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoranfemale("", Aspect.FORMAN));
        addNewPokemon(new FormanNidorina("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoqueen("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoranmale("", Aspect.FORMAN));
        addNewPokemon(new FormanNidorino("", Aspect.FORMAN));
        addNewPokemon(new FormanNidoking("", Aspect.FORMAN));
        addNewPokemon(new FormanClefairy("", Aspect.FORMAN));
        addNewPokemon(new FormanVulpix("", Aspect.FORMAN));
        addNewPokemon(new FormanNinetales("", Aspect.FORMAN));
        addNewPokemon(new FormanJigglypuff("", Aspect.FORMAN));
        addNewPokemon(new FormanZubat("", Aspect.FORMAN));
        addNewPokemon(new FormanGolbat("", Aspect.FORMAN));
        addNewPokemon(new FormanOddish("", Aspect.FORMAN));
        addNewPokemon(new FormanParas("", Aspect.FORMAN));
        addNewPokemon(new FormanVenonat("", Aspect.FORMAN));
        addNewPokemon(new FormanDiglett("", Aspect.FORMAN));
        addNewPokemon(new FormanDugtrio("", Aspect.FORMAN));
        addNewPokemon(new FormanMeowth("", Aspect.FORMAN));
        addNewPokemon(new FormanPsyduck("", Aspect.FORMAN));
        addNewPokemon(new FormanGolduck("", Aspect.FORMAN));
        addNewPokemon(new FormanMankey("", Aspect.FORMAN));
        addNewPokemon(new FormanGrowlithe("", Aspect.FORMAN));
        addNewPokemon(new FormanPoliwag("", Aspect.FORMAN));
        addNewPokemon(new FormanAbra("", Aspect.FORMAN));
        addNewPokemon(new FormanMachop("", Aspect.FORMAN));
        addNewPokemon(new FormanBellsprout("", Aspect.FORMAN));
        addNewPokemon(new FormanTentacool("", Aspect.FORMAN));
        addNewPokemon(new FormanGeodude("", Aspect.FORMAN));
        addNewPokemon(new FormanPonyta("", Aspect.FORMAN));
        addNewPokemon(new FormanSlowpoke("", Aspect.FORMAN));
        addNewPokemon(new FormanSlowbro("", Aspect.FORMAN));
        addNewPokemon(new FormanMagnemite("", Aspect.FORMAN));
        addNewPokemon(new FormanFarfetchd("", Aspect.FORMAN));
        addNewPokemon(new FormanDoduo("", Aspect.FORMAN));
        addNewPokemon(new FormanSeel("", Aspect.FORMAN));
        addNewPokemon(new FormanGrimer("", Aspect.FORMAN));
        addNewPokemon(new FormanShellder("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanCloyster("", Aspect.FORMAN));
        addNewPokemon(new FormanGastly("", Aspect.FORMAN));
        addNewPokemon(new FormanHaunter("", Aspect.FORMAN));
        addNewPokemon(new FormanGengar("", Aspect.FORMAN));
        addNewPokemon(new FormanOnix("", Aspect.FORMAN));
        addNewPokemon(new FormanDrowzee("", Aspect.FORMAN));
        addNewPokemon(new FormanKrabby("", Aspect.FORMAN));
        addNewPokemon(new FormanVoltorb("", Aspect.FORMAN));
        addNewPokemon(new FormanExeggcute("", Aspect.FORMAN));
        addNewPokemon(new FormanCubone("", Aspect.FORMAN));
        addNewPokemon(new FormanMarowak("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmonlee("", Aspect.FORMAN));
        addNewPokemon(new FormanHitmonchan("", Aspect.FORMAN));
        addNewPokemon(new FormanLickitung("", Aspect.FORMAN));
        addNewPokemon(new FormanKoffing("", Aspect.FORMAN));
        addNewPokemon(new FormanWeezing("", Aspect.FORMAN));
        addNewPokemon(new FormanRhyhorn("", Aspect.FORMAN));
//        addNewPokemon(new FormanChansey("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanTangela("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanKangaskhan("", Aspect.FORMAN));
        addNewPokemon(new FormanHorsea("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanSeadra("", Aspect.FORMAN));
        addNewPokemon(new FormanGoldeen("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanStaryu("", Aspect.FORMAN).fishingSpawnFromExisting());
//        addNewPokemon(new FormanMrmime("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanScyther("", Aspect.FORMAN));
        addNewPokemon(new FormanJynx("", Aspect.FORMAN));
//        addNewPokemon(new FormanElectabuzz("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanMagmar("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanPinsir("", Aspect.FORMAN));
        addNewPokemon(new FormanTauros("", Aspect.FORMAN));
        addNewPokemon(new FormanMagikarp("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanLapras("", Aspect.FORMAN));
        addNewPokemon(new FormanDitto("", Aspect.FORMAN));
        addNewPokemon(new FormanEevee("", Aspect.FORMAN));
//        addNewPokemon(new FormanPorygon("", Aspect.FORMAN));//Member of line not finished
//        addNewPokemon(new FormanSnorlax("", Aspect.FORMAN));//Member of line not finished
        addNewPokemon(new FormanArticuno("", Aspect.FORMAN));
        addNewPokemon(new FormanZapdos("", Aspect.FORMAN));
        addNewPokemon(new FormanMoltres("", Aspect.FORMAN));
        addNewPokemon(new FormanDratini("", Aspect.FORMAN).fishingSpawnFromExisting());
        addNewPokemon(new FormanDragonair("", Aspect.FORMAN).fishingSpawnFromExisting());
    }

    private void registerSoulstonesVariants() {
        addNewPokemon(new EpochBulbasaur("", Aspect.EPOCH));
        addNewPokemon(new EpochIvysaur("", Aspect.EPOCH));
        addNewPokemon(new EpochVenusaur("", Aspect.EPOCH));
        addNewPokemon(new EpochCharmander("", Aspect.EPOCH));
        addNewPokemon(new EpochCharmeleon("", Aspect.EPOCH));
        addNewPokemon(new EpochCharizard("", Aspect.EPOCH));
        addNewPokemon(new EpochKoffing("", Aspect.EPOCH));
        addNewPokemon(new EpochWeezing("", Aspect.EPOCH));
        addNewPokemon(new EpochGastly("", Aspect.EPOCH));
        addNewPokemon(new EpochHaunter("", Aspect.EPOCH));
        addNewPokemon(new EpochGengar("", Aspect.EPOCH));
        addNewPokemon(new EpochDoduo("", Aspect.EPOCH));
        addNewPokemon(new EpochDodrio("", Aspect.EPOCH));
        addNewPokemon(new EpochEkans("", Aspect.EPOCH));
        addNewPokemon(new EpochArbok("", Aspect.EPOCH));
        addNewPokemon(new EpochStaryu("", Aspect.EPOCH));
        addNewPokemon(new EpochStarmie("", Aspect.EPOCH));
        addNewPokemon(new EpochOnix("", Aspect.EPOCH));
        addNewPokemon(new EpochZubat("", Aspect.EPOCH));
        addNewPokemon(new EpochGolbat("", Aspect.EPOCH));
        addNewPokemon(new EpochTangela("", Aspect.EPOCH));
        addNewPokemon(new EpochMagikarp("", Aspect.EPOCH));
        addNewPokemon(new EpochGyarados("", Aspect.EPOCH));
        addNewPokemon(new EpochPonyta("", Aspect.EPOCH));
        addNewPokemon(new EpochRapidash("", Aspect.EPOCH));
        addNewPokemon(new EpochGeodude("", Aspect.EPOCH));
        addNewPokemon(new EpochGraveler("", Aspect.EPOCH));
        addNewPokemon(new EpochGolem("", Aspect.EPOCH));
        addNewPokemon(new EpochDrowzee("", Aspect.EPOCH));
        addNewPokemon(new EpochHypno("", Aspect.EPOCH));
        addNewPokemon(new EpochSeel("", Aspect.EPOCH));
        addNewPokemon(new EpochDewgong("", Aspect.EPOCH));
        addNewPokemon(new EpochKabuto("", Aspect.EPOCH));
        addNewPokemon(new EpochKabutops("", Aspect.EPOCH));
        addNewPokemon(new EpochAerodactyl("", Aspect.EPOCH));
        addNewPokemon(new EpochKrabby("", Aspect.EPOCH));
        addNewPokemon(new EpochKingler("", Aspect.EPOCH));
        addNewPokemon(new EpochVoltorb("", Aspect.EPOCH));
        addNewPokemon(new EpochElectrode("", Aspect.EPOCH));
        addNewPokemon(new EpochWeedle("", Aspect.EPOCH));
        addNewPokemon(new EpochKakuna("", Aspect.EPOCH));
        addNewPokemon(new EpochBeedrill("", Aspect.EPOCH));
        addNewPokemon(new EpochMachop("", Aspect.EPOCH));
        addNewPokemon(new EpochMachoke("", Aspect.EPOCH));
        addNewPokemon(new EpochMachamp("", Aspect.EPOCH));
        addNewPokemon(new EpochTauros("", Aspect.EPOCH));
        addNewPokemon(new EpochElectabuzz("", Aspect.EPOCH));
        addNewPokemon(new EpochMagmar("", Aspect.EPOCH));
        addNewPokemon(new EpochExeggcute("", Aspect.EPOCH));
        addNewPokemon(new EpochExeggutor("", Aspect.EPOCH));
        addNewPokemon(new EpochGrimer("", Aspect.EPOCH));
        addNewPokemon(new EpochMuk("", Aspect.EPOCH));
        addNewPokemon(new EpochAbra("", Aspect.EPOCH));
        addNewPokemon(new EpochKadabra("", Aspect.EPOCH));
        addNewPokemon(new EpochAlakazam("", Aspect.EPOCH));
        addNewPokemon(new EpochPsyduck("", Aspect.EPOCH));
        addNewPokemon(new EpochGolduck("", Aspect.EPOCH));
        addNewPokemon(new EpochEevee("", Aspect.EPOCH));
        addNewPokemon(new EpochVaporeon("", Aspect.EPOCH));
        addNewPokemon(new EpochJolteon("", Aspect.EPOCH));
        addNewPokemon(new EpochFlareon("", Aspect.EPOCH));
        addNewPokemon(new EpochMeowth("", Aspect.EPOCH));
        addNewPokemon(new EpochPersian("", Aspect.EPOCH));
        addNewPokemon(new EpochRattata("", Aspect.EPOCH));
        addNewPokemon(new EpochRaticate("", Aspect.EPOCH));
        addNewPokemon(new EpochSlowpoke("", Aspect.EPOCH));
        addNewPokemon(new EpochSlowbro("", Aspect.EPOCH));
        addNewPokemon(new EpochOddish("", Aspect.EPOCH));
        addNewPokemon(new EpochGloom("", Aspect.EPOCH));
        addNewPokemon(new EpochVileplume("", Aspect.EPOCH));
        addNewPokemon(new EpochHorsea("", Aspect.EPOCH));
        addNewPokemon(new EpochSeadra("", Aspect.EPOCH));
        addNewPokemon(new EpochVenonat("", Aspect.EPOCH));
        addNewPokemon(new EpochVenomoth("", Aspect.EPOCH));
        addNewPokemon(new EpochCaterpie("", Aspect.EPOCH));
        addNewPokemon(new EpochMetapod("", Aspect.EPOCH));
        addNewPokemon(new EpochButterfree("", Aspect.EPOCH));
        addNewPokemon(new EpochMankey("", Aspect.EPOCH));
        addNewPokemon(new EpochPrimeape("", Aspect.EPOCH));
        addNewPokemon(new EpochParas("", Aspect.EPOCH));
        addNewPokemon(new EpochParasect("", Aspect.EPOCH));
        addNewPokemon(new EpochLapras("", Aspect.EPOCH));
        addNewPokemon(new EpochDiglett("", Aspect.EPOCH));
        addNewPokemon(new EpochDugtrio("", Aspect.EPOCH));
        addNewPokemon(new EpochPidgey("", Aspect.EPOCH));
        addNewPokemon(new EpochPidgeotto("", Aspect.EPOCH));
        addNewPokemon(new EpochPidgeot("", Aspect.EPOCH));
        addNewPokemon(new EpochChansey("", Aspect.EPOCH));
        addNewPokemon(new EpochTentacool("", Aspect.EPOCH));
        addNewPokemon(new EpochTentacruel("", Aspect.EPOCH));
        addNewPokemon(new EpochGrowlithe("", Aspect.EPOCH));
        addNewPokemon(new EpochArcanine("", Aspect.EPOCH));
        addNewPokemon(new EpochPikachu("", Aspect.EPOCH));
        addNewPokemon(new EpochRaichu("", Aspect.EPOCH));
        addNewPokemon(new EpochGoldeen("", Aspect.EPOCH));
        addNewPokemon(new EpochSeaking("", Aspect.EPOCH));
        addNewPokemon(new EpochMagnemite("", Aspect.EPOCH));
        addNewPokemon(new EpochMagneton("", Aspect.EPOCH));
        addNewPokemon(new EpochSpearow("", Aspect.EPOCH));
        addNewPokemon(new EpochFearow("", Aspect.EPOCH));
        addNewPokemon(new EpochJigglypuff("", Aspect.EPOCH));
        addNewPokemon(new EpochWigglytuff("", Aspect.EPOCH));
        addNewPokemon(new EpochDitto("", Aspect.EPOCH));
        addNewPokemon(new EpochCubone("", Aspect.EPOCH));
        addNewPokemon(new EpochMarowak("", Aspect.EPOCH));
        addNewPokemon(new EpochHorseaOne("", Aspect.EPOCH));
        addNewPokemon(new EpochSeadraOne("", Aspect.EPOCH));
        addNewPokemon(new EpochOmanyte("", Aspect.EPOCH));
        addNewPokemon(new EpochOmastar("", Aspect.EPOCH));
        addNewPokemon(new EpochGrimerOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMukOne("", Aspect.EPOCH));
        addNewPokemon(new EpochVulpix("", Aspect.EPOCH));
        addNewPokemon(new EpochNinetales("", Aspect.EPOCH));
        addNewPokemon(new EpochMrmime("", Aspect.EPOCH));
        addNewPokemon(new EpochVoltorbOne("", Aspect.EPOCH));
        addNewPokemon(new EpochElectrodeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochExeggcuteOne("", Aspect.EPOCH));
        addNewPokemon(new EpochExeggutorOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDoduoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochDodrioOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMachopOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMachokeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMachampOne("", Aspect.EPOCH));
        addNewPokemon(new EpochJynx("", Aspect.EPOCH));
        addNewPokemon(new EpochPoliwag("", Aspect.EPOCH));
        addNewPokemon(new EpochPoliwhirl("", Aspect.EPOCH));
        addNewPokemon(new EpochPoliwrath("", Aspect.EPOCH));
        addNewPokemon(new EpochHitmonlee("", Aspect.EPOCH));
        addNewPokemon(new EpochHitmonchan("", Aspect.EPOCH));
        addNewPokemon(new EpochScyther("", Aspect.EPOCH));
        addNewPokemon(new EpochPinsir("", Aspect.EPOCH));
        addNewPokemon(new EpochGeodudeOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGravelerOne("", Aspect.EPOCH));
        addNewPokemon(new EpochGolemOne("", Aspect.EPOCH));
        addNewPokemon(new EpochClefairy("", Aspect.EPOCH));
        addNewPokemon(new EpochClefable("", Aspect.EPOCH));
        addNewPokemon(new EpochSnorlax("", Aspect.EPOCH));
        addNewPokemon(new EpochMagnemiteOne("", Aspect.EPOCH));
        addNewPokemon(new EpochMagnetonOne("", Aspect.EPOCH));
        addNewPokemon(new EpochPorygon("", Aspect.EPOCH));
        addNewPokemon(new EpochDratini("", Aspect.EPOCH));
        addNewPokemon(new EpochDragonair("", Aspect.EPOCH));
        addNewPokemon(new EpochDragonite("", Aspect.EPOCH));
        addNewPokemon(new EpochKabutoOne("", Aspect.EPOCH));
        addNewPokemon(new EpochKabutopsOne("", Aspect.EPOCH));
        addNewPokemon(new EpochLaprasOne("", Aspect.EPOCH));
    }

    private void addAyreianPokemon() {
        addNewPokemon(new AyreianSpearow("", Aspect.AYREIAN));
        addNewPokemon(new AyreianFearow("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVenonat("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDoduo("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmonlee("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHitmonchan("", Aspect.AYREIAN));
        addNewPokemon(new AyreianJynx("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSnorlax("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDratini("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDragonair("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDragonite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianLapras("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVulpix("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNinetales("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVulpixOne("", Aspect.AYREIAN));
        addNewPokemon(new AyreianNinetalesOne("", Aspect.AYREIAN));

        addNewPokemon(new AyreianBulbasaur("", Aspect.AYREIAN));
        addNewPokemon(new AyreianIvysaur("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVenusaur("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCharmander("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCharmeleon("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCharizard("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSquirtle("", Aspect.AYREIAN));
        addNewPokemon(new AyreianWartortle("", Aspect.AYREIAN));
        addNewPokemon(new AyreianBlastoise("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCaterpie("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMetapod("", Aspect.AYREIAN));
        addNewPokemon(new AyreianButterfree("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRattata("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRaticate("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgeotto("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPidgeot("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDiglett("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDugtrio("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAbra("", Aspect.AYREIAN));
        addNewPokemon(new AyreianKadabra("", Aspect.AYREIAN));
        addNewPokemon(new AyreianAlakazam("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMagnemite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMagneton("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGrimer("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMuk("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGastly("", Aspect.AYREIAN));
        addNewPokemon(new AyreianHaunter("", Aspect.AYREIAN));
        addNewPokemon(new AyreianGengar("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVoltorb("", Aspect.AYREIAN));
        addNewPokemon(new AyreianElectrode("", Aspect.AYREIAN));
        addNewPokemon(new AyreianPinsir("", Aspect.AYREIAN));
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
