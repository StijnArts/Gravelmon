package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.fliga.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.nosto.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.orohnhavai.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationOne extends Game {
    public GenerationOne() {
        super("generation1");
    }

    @Override
    public void registerPokemon() {

//        pokemon.add(new IonosianEkans(23));   Missing Stats
//        pokemon.add(new IonosianArbok(24));   Missing Stats
//        pokemon.add(new IonosianHypno(97));   Missing Stats
//        pokemon.add(new IonosianStarmie(121));   Missing Stats
//        pokemon.add(new IonosianJynx(124));   Missing Stats
//        pokemon.add(new IonosianSnorlax(143));   Missing Stats

        addNewPokemon(new FligianParas("", Aspect.FLIGIAN));
        addNewPokemon(new FligianParasect("", Aspect.FLIGIAN));
        addNewPokemon(new FligianChansey("", Aspect.FLIGIAN));

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
        addNewPokemon(new KaskadianRaticate("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianBellsprout("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGastly("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianHaunter("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGengar("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianJynx("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianLapras("", Aspect.KASKADIAN));

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

    private void addAyreianPokemon() {
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
