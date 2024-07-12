package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
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
import drai.dev.data.pokemon.ayrei.regional.*;
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



        pokemon.add(new FligianParas("", Aspect.FLIGIAN));
        pokemon.add(new FligianParasect("", Aspect.FLIGIAN));
        pokemon.add(new FligianChansey("", Aspect.FLIGIAN));

        pokemon.add(new NovranSlowpoke("", Aspect.NOVRAN));
        pokemon.add(new NovranSlowbro("", Aspect.NOVRAN));
        pokemon.add(new NovranGrimer("", Aspect.NOVRAN));
        pokemon.add(new NovranMuk("", Aspect.NOVRAN));
        pokemon.add(new NovranLapras("", Aspect.NOVRAN));
        pokemon.add(new NovranOmanyte("", Aspect.NOVRAN));
        pokemon.add(new NovranOmastar("", Aspect.NOVRAN));

        pokemon.add(new QamoranPsyduck("", Aspect.QAMORAN));
        pokemon.add(new QamoranSeel("", Aspect.QAMORAN));
        pokemon.add(new QamoranDewgong("", Aspect.QAMORAN));
        pokemon.add(new QamoranHitmonlee("", Aspect.QAMORAN));
        pokemon.add(new QamoranHitmonchan("", Aspect.QAMORAN));
        pokemon.add(new QamoranKoffing("", Aspect.QAMORAN));
        pokemon.add(new QamoranWeezing("", Aspect.QAMORAN));
        pokemon.add(new QamoranTangela("", Aspect.QAMORAN));

        pokemon.add(new NostanDiglett("", Aspect.NOSTAN));
        pokemon.add(new NostanDugtrio("", Aspect.NOSTAN));
        pokemon.add(new NostanShellder("", Aspect.NOSTAN));
        pokemon.add(new NostanCloyster("", Aspect.NOSTAN));

        pokemon.add(new NorheimanRattata("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanDiglett("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanDugtrio("", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));
        pokemon.add(new NorheimanSeel("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanShellder("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanVoltorb("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanElectrode("", Aspect.NORHEIMAN, new Stats(490, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new NorheimanSeadra("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanDitto("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanDragonair("", Aspect.NORHEIMAN));

//        pokemon.add(new VaritasianOnix(95)); Member of line Not Finished
//        pokemon.add(new VaritasianCubone(104)); Member of line Not Finished
//        pokemon.add(new VaritasianMarowak(105)); Missing Art
        pokemon.add(new VaritasianHitmonlee("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianHitmonchan("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianHorsea(116)); Member of line Not Finished
//        pokemon.add(new VaritasianSeadra(117)); Missing Art
//        pokemon.add(new VaritasianMrMime(122)); Missing Art
        pokemon.add(new VaritasianPorygon("", Aspect.VARITASIAN));

//        pokemon.add(new HavaiianPoliwag(60)); //Member of line Not Finished
//        pokemon.add(new HavaiianPoliwhirl(61)); Missing Art
        pokemon.add(new HavaiianGastly("", Aspect.HAVAIIAN));
        pokemon.add(new HavaiianHaunter("", Aspect.HAVAIIAN));
        pokemon.add(new HavaiianGengar("", Aspect.HAVAIIAN));
//        pokemon.add(new HavaiianKrabby(98)); Missing Stats
//        pokemon.add(new HavaiianExeggcute(102)); Missing Art
//        pokemon.add(new HavaiianExeggutor(103)); Missing Art
//        pokemon.add(new HavaiianHorsea(116)); //Member of line Not Finished

        pokemon.add(new HizianVenonat("", Aspect.HIZIAN));
        pokemon.add(new HizianVenomoth("", Aspect.HIZIAN));
        pokemon.add(new HizianLickitung("", Aspect.HIZIAN));
        pokemon.add(new HizianRhyhorn("", Aspect.HIZIAN));
        pokemon.add(new HizianRhydon("", Aspect.HIZIAN));
        pokemon.add(new HizianScyther("", Aspect.HIZIAN));
        pokemon.add(new HizianPinsir("", Aspect.HIZIAN));

        pokemon.add(new AristosianBellsprout("", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianWeepinbell("", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianVictreebel("", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianGrowlithe("", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianArcanine("", Aspect.ARISTOSIAN));
        pokemon.add(new AristosianKangaskhan("", Aspect.ARISTOSIAN));

        pokemon.add(new AvorianMrMime("", Aspect.AVORIAN));

        //Pokemon Infinity
        addEghoPokemon();

        //Pokemon Insurgance
        addDeltaPokemon();

        //Pokemon Xenoverse
        addXPokemon();

        //Pokemon Radical Red
        pokemon.add(new SeviianDoduo("", Aspect.SEVIIAN));
        pokemon.add(new SeviianDodrio("", Aspect.SEVIIAN));

        //Pokemon Blazing Emerald
        addHoennianPokemon();

        //Pokemon Myth
        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranEkans("", Aspect.ALTERAN));
        pokemon.add(new AlteranArbok("", Aspect.ALTERAN));
        pokemon.add(new AlteranNidoranWinterCoat("Nidoranf", Aspect.ALTERAN_WINTER_COAT));
        pokemon.add(new AlteranNidoranSummerCoat("Nidoranm", Aspect.ALTERAN_SUMMER_COAT));

        //Armiran (Daybreak
        pokemon.add(new ArmiranGrowlithe("", Aspect.ARMIRAN));
        pokemon.add(new ArmiranArcanine("", Aspect.ARMIRAN));

        //Vanguard
        addAyreianPokemon();

        //Phoenix Rising
        pokemon.add(new RelicTentacool("", Aspect.RELIC));
        pokemon.add(new RelicTentacruel("", Aspect.RELIC));
        pokemon.add(new RelicKoffing("", Aspect.RELIC));
        pokemon.add(new RelicWeezing("", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianRaticate("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianBellsprout("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianGastly("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianHaunter("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianGengar("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianJynx("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianLapras("", Aspect.KASKADIAN));

        //Azure (Mystic)
        pokemon.add(new MysticVoltorb("", Aspect.MYSTIC));
        pokemon.add(new MysticElectrode("", Aspect.MYSTIC));

        //Pokemon Opalo
        pokemon.add(new CefiranVenomoth("", Aspect.CEFIRAN));
        pokemon.add(new CefiranDiglett("", Aspect.CEFIRAN));
        pokemon.add(new CefiranDugtrio("", Aspect.CEFIRAN));
        pokemon.add(new CefiranMeowthFire("Meowth", Aspect.CEFIRAN_FIRE));
        pokemon.add(new CefiranPersianFire("Persian", Aspect.CEFIRAN_FIRE));
        pokemon.add(new CefiranMeowthIce("Meowth", Aspect.CEFIRAN_ICE));
        pokemon.add(new CefiranPersianIce("Persian", Aspect.CEFIRAN_ICE));
        pokemon.add(new CefiranMeowthElectric("Meowth", Aspect.CEFIRAN_ELECTRIC));
        pokemon.add(new CefiranPersianElectric("Persian", Aspect.CEFIRAN_ELECTRIC));
    }

    private void addAyreianPokemon() {
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
        pokemon.add(new MythianPidgey("", Aspect.MYTHIAN));
        pokemon.add(new MythianPidgeotto("", Aspect.MYTHIAN));
        pokemon.add(new MythianPidgeot("", Aspect.MYTHIAN));
        /*pokemon.add(new MythianDrowzee(96));
        pokemon.add(new MythianHypno(97));*/
        pokemon.add(new MythianScyther("", Aspect.MYTHIAN));
        pokemon.add(new MythianLapras("", Aspect.MYTHIAN));
    }

    private void addHoennianPokemon() {
        pokemon.add(new HoennianVenonat("", Aspect.HOENNIAN));
        pokemon.add(new HoennianTentacool("", Aspect.HOENNIAN));
        pokemon.add(new HoennianTentacruel("", Aspect.HOENNIAN));
        pokemon.add(new HoennianDodrio("", Aspect.HOENNIAN));
        pokemon.add(new HoennianSeel("", Aspect.HOENNIAN));
        pokemon.add(new HoennianDewgong("", Aspect.HOENNIAN));
        pokemon.add(new HoennianOnix("", Aspect.HOENNIAN));
        pokemon.add(new HoennianTangela("", Aspect.HOENNIAN));
        pokemon.add(new HoennianPinsir("", Aspect.HOENNIAN));
    }

    private void addXPokemon() {
        pokemon.add(new PikachuFemaleX("Pikachu", Aspect.FEMALE_X));
        pokemon.add(new PikachuMaleX("Pikachu", Aspect.MALE_X));
        pokemon.add(new RaichuX("", Aspect.X));
        pokemon.add(new EldiwanMeowth("", Aspect.ELDIWAN));
        pokemon.add(new PonytaX("", Aspect.X));
        pokemon.add(new RapidashX("", Aspect.X));
        pokemon.add(new GastlyX("", Aspect.X));
        pokemon.add(new HaunterX("", Aspect.X));
        pokemon.add(new GengarX("", Aspect.X));
        pokemon.add(new ElectabuzzX("", Aspect.X));
        pokemon.add(new DittoX("", Aspect.X));
        pokemon.add(new MewtwoX("", Aspect.X));
    }

    private void addDeltaPokemon() {
        pokemon.add(new DeltaBulbasaur("", Aspect.DELTA));
        pokemon.add(new DeltaIvysaur("", Aspect.DELTA));
        pokemon.add(new DeltaVenusaur("", Aspect.DELTA));
        pokemon.add(new DeltaCharmander("", Aspect.DELTA));
        pokemon.add(new DeltaCharmeleon("", Aspect.DELTA));
        pokemon.add(new DeltaCharizard("", Aspect.DELTA));
        pokemon.add(new DeltaSquirtle("", Aspect.DELTA));
        pokemon.add(new DeltaWartortle("", Aspect.DELTA));
        pokemon.add(new DeltaBlastoise("", Aspect.DELTA));
        pokemon.add(new DeltaPidgey("", Aspect.DELTA));
        pokemon.add(new DeltaPidgeotto("", Aspect.DELTA));
        pokemon.add(new DeltaPidgeot("", Aspect.DELTA));
        pokemon.add(new DeltaPikachu("", Aspect.DELTA));
        pokemon.add(new DeltaRaichu("", Aspect.DELTA));
        pokemon.add(new DeltaDiglett("", Aspect.DELTA));
        pokemon.add(new DeltaDugtrio("", Aspect.DELTA));
        pokemon.add(new DeltaGrowlithe("", Aspect.DELTA));
        pokemon.add(new DeltaArcanine("", Aspect.DELTA));
        pokemon.add(new DeltaTentacool("", Aspect.DELTA));
        pokemon.add(new DeltaTentacruel("", Aspect.DELTA));
        pokemon.add(new DeltaGeodude("", Aspect.DELTA));
        pokemon.add(new DeltaGraveler("", Aspect.DELTA));
        pokemon.add(new DeltaGolem("", Aspect.DELTA));
        pokemon.add(new DeltaDoduo("", Aspect.DELTA));
        pokemon.add(new DeltaDodrio("", Aspect.DELTA));
        pokemon.add(new DeltaGrimer("", Aspect.DELTA));
        pokemon.add(new DeltaMuk("", Aspect.DELTA));
        pokemon.add(new DeltaKoffing("", Aspect.DELTA));
        pokemon.add(new DeltaWeezing("", Aspect.DELTA));
        pokemon.add(new DeltaTangela("", Aspect.DELTA));
        pokemon.add(new DeltaScyther("", Aspect.DELTA));
        pokemon.add(new DeltaElectabuzz("", Aspect.DELTA));
        pokemon.add(new DeltaMagmar("", Aspect.DELTA));
        pokemon.add(new DeltaDitto("", Aspect.DELTA));
        pokemon.add(new DeltaKabuto("", Aspect.DELTA));
        pokemon.add(new DeltaKabutops("", Aspect.DELTA));
        pokemon.add(new DeltaSnorlax("", Aspect.DELTA));
        pokemon.add(new DeltaDratini("", Aspect.DELTA));
        pokemon.add(new DeltaDragonair("", Aspect.DELTA));
        pokemon.add(new DeltaDragonite("", Aspect.DELTA));
    }

    private void addEghoPokemon() {
        pokemon.add(new EghoBulbasaur("", Aspect.EGHO));
        pokemon.add(new EghoIvysaur("", Aspect.EGHO));
        pokemon.add(new EghoVenusaur("", Aspect.EGHO));
        pokemon.add(new EghoCharmander("", Aspect.EGHO));
        pokemon.add(new EghoCharmeleon("", Aspect.EGHO));
        pokemon.add(new EghoCharizard("", Aspect.EGHO));
        pokemon.add(new EghoSquirtle("", Aspect.EGHO));
        pokemon.add(new EghoWartortle("", Aspect.EGHO));
        pokemon.add(new EghoBlastoise("", Aspect.EGHO));
        pokemon.add(new EghoSpearow("", Aspect.EGHO));
        pokemon.add(new EghoFearow("", Aspect.EGHO));
        pokemon.add(new EghoOddish("", Aspect.EGHO));
        pokemon.add(new EghoGloom("", Aspect.EGHO));
        pokemon.add(new EghoMagnemite("", Aspect.EGHO));
        pokemon.add(new EghoMagneton("", Aspect.EGHO));
        pokemon.add(new EghoGrimer("", Aspect.EGHO));
        pokemon.add(new EghoMuk("", Aspect.EGHO));
        pokemon.add(new EghoShellder("", Aspect.EGHO));
        pokemon.add(new EghoChansey("", Aspect.EGHO));
        pokemon.add(new EghoTangela("", Aspect.EGHO));
    }
}
