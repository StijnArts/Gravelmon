package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationOne extends Game {
    public GenerationOne() {
        super("generation1");
    }

    @Override
    public void registerPokemon() {
        //Pokemon Infinity
        addEghoPokemon();

        //Pokemon Insurgance
        addDeltaPokemon();

        //Pokemon Xenoverse
        addXPokemon();

        //Pokemon Radical Red
        pokemon.add(new SeviianDoduo(84));
        pokemon.add(new SeviianDodrio(85));

        //Pokemon Blazing Emerald
        addHoennianPokemon();

        //Pokemon Myth
        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranEkans(23));
        pokemon.add(new AlteranArbok(24));
        pokemon.add(new AlteranNidoranWinterCoat(29));
        pokemon.add(new AlteranNidoranSummerCoat(29));

        //Armiran (Daybreak
        pokemon.add(new ArmiranGrowlithe(58));
        pokemon.add(new ArmiranArcanine(59));

        //Vanguard
        addAyreianPokemon();

        //Phoenix Rising
        pokemon.add(new RelicTentacool(72));
        pokemon.add(new RelicTentacruel(73));
        pokemon.add(new RelicKoffing(109));
        pokemon.add(new RelicWeezing(110));

        //Kaskadian
        pokemon.add(new KaskadianRaticate(20));
        pokemon.add(new KaskadianBellsprout(69));
        pokemon.add(new KaskadianGastly(92));
        pokemon.add(new KaskadianHaunter(93));
        pokemon.add(new KaskadianGengar(94));
        pokemon.add(new KaskadianJynx(124));
        pokemon.add(new KaskadianLapras(131));

        //Azure (Mystic)
        pokemon.add(new MysticVoltorb(100));
        pokemon.add(new MysticElectrode(101));
    }

    private void addAyreianPokemon() {
        pokemon.add(new AyreianBulbasaur(1));
        pokemon.add(new AyreianIvysaur(2));
        pokemon.add(new AyreianVenusaur(3));
        pokemon.add(new AyreianCharmander(4));
        pokemon.add(new AyreianCharmeleon(5));
        pokemon.add(new AyreianCharizard(6));
        pokemon.add(new AyreianSquirtle(7));
        pokemon.add(new AyreianWartortle(8));
        pokemon.add(new AyreianBlastoise(9));
        pokemon.add(new AyreianCaterpie(10));
        pokemon.add(new AyreianMetapod(11));
        pokemon.add(new AyreianButterfree(12));
        pokemon.add(new AyreianPidgey(16));
        pokemon.add(new AyreianPidgeotto(17));
        pokemon.add(new AyreianPidgeot(18));
        pokemon.add(new AyreianDiglett(50));
        pokemon.add(new AyreianDugtrio(51));
        pokemon.add(new AyreianAbra(63));
        pokemon.add(new AyreianKadabra(64));
        pokemon.add(new AyreianAlakazam(65));
        pokemon.add(new AyreianMagnemite(81));
        pokemon.add(new AyreianMagneton(82));
        pokemon.add(new AyreianGrimer(88));
        pokemon.add(new AyreianMuk(89));
        pokemon.add(new AyreianGastly(92));
        pokemon.add(new AyreianHaunter(93));
        pokemon.add(new AyreianGengar(94));
        pokemon.add(new AyreianVoltorb(100));
        pokemon.add(new AyreianElectrode(101));
        pokemon.add(new AyreianPinsir(127));
    }

    private void addMythianPokemon() {
        pokemon.add(new MythianPidgey(16));
        pokemon.add(new MythianPidgeotto(17));
        pokemon.add(new MythianPidgeot(18));
        /*pokemon.add(new MythianDrowzee(96));
        pokemon.add(new MythianHypno(97));*/
        pokemon.add(new MythianScyther(123));
        pokemon.add(new MythianLapras(131));
    }

    private void addHoennianPokemon() {
        pokemon.add(new HoennianVenonat(48));
        pokemon.add(new HoennianTentacool(72));
        pokemon.add(new HoennianTentacruel(73));
        pokemon.add(new HoennianDodrio(85));
        pokemon.add(new HoennianSeel(86));
        pokemon.add(new HoennianDewgong(87));
        pokemon.add(new HoennianOnix(95));
        pokemon.add(new HoennianTangela(114));
        pokemon.add(new HoennianPinsir(127));
    }

    private void addXPokemon() {
        pokemon.add(new PikachuXFemale(25));
        pokemon.add(new PikachuXMale(25));
        pokemon.add(new RaichuX(26));
        pokemon.add(new EldiwanMeowth(52));
        pokemon.add(new PonytaX(77));
        pokemon.add(new RapidashX(78));
        pokemon.add(new GastlyX(92));
        pokemon.add(new HaunterX(93));
        pokemon.add(new GengarX(94));
        pokemon.add(new ElectabuzzX(125));
        pokemon.add(new DittoX(132));
        pokemon.add(new MewtwoX(150));
    }

    private void addDeltaPokemon() {
        pokemon.add(new DeltaBulbasaur(1));
        pokemon.add(new DeltaIvysaur(2));
        pokemon.add(new DeltaVenusaur(3));
        pokemon.add(new DeltaCharmander(4));
        pokemon.add(new DeltaCharmeleon(5));
        pokemon.add(new DeltaCharizard(6));
        pokemon.add(new DeltaSquirtle(7));
        pokemon.add(new DeltaWartortle(8));
        pokemon.add(new DeltaBlastoise(9));
        pokemon.add(new DeltaPidgey(16));
        pokemon.add(new DeltaPidgeotto(17));
        pokemon.add(new DeltaPidgeot(18));
        pokemon.add(new DeltaPikachu(25));
        pokemon.add(new DeltaRaichu(26));
        pokemon.add(new DeltaDiglett(50));
        pokemon.add(new DeltaDugtrio(51));
        pokemon.add(new DeltaGrowlithe(58));
        pokemon.add(new DeltaArcanine(59));
        pokemon.add(new DeltaTentacool(72));
        pokemon.add(new DeltaTentacruel(73));
        pokemon.add(new DeltaGeodude(74));
        pokemon.add(new DeltaGraveler(75));
        pokemon.add(new DeltaGolem(76));
        pokemon.add(new DeltaDoduo(84));
        pokemon.add(new DeltaDodrio(85));
        pokemon.add(new DeltaGrimer(88));
        pokemon.add(new DeltaMuk(89));
        pokemon.add(new DeltaKoffing(109));
        pokemon.add(new DeltaWeezing(110));
        pokemon.add(new DeltaTangela(114));
        pokemon.add(new DeltaScyther(123));
        pokemon.add(new DeltaElectabuzz(125));
        pokemon.add(new DeltaMagmar(126));
        pokemon.add(new DeltaDitto(132));
        pokemon.add(new DeltaKabuto(140));
        pokemon.add(new DeltaKabutops(141));
        pokemon.add(new DeltaSnorlax(143));
        pokemon.add(new DeltaDratini(147));
        pokemon.add(new DeltaDragonair(148));
        pokemon.add(new DeltaDragonite(149));
    }

    private void addEghoPokemon() {
        pokemon.add(new EghoBulbasaur(1));
        pokemon.add(new EghoIvysaur(2));
        pokemon.add(new EghoVenusaur(3));
        pokemon.add(new EghoCharmander(4));
        pokemon.add(new EghoCharmeleon(5));
        pokemon.add(new EghoCharizard(6));
        pokemon.add(new EghoSquirtle(7));
        pokemon.add(new EghoWartortle(8));
        pokemon.add(new EghoBlastoise(9));
        pokemon.add(new EghoSpearow(21));
        pokemon.add(new EghoFearow(22));
        pokemon.add(new EghoOddish(43));
        pokemon.add(new EghoGloom(44));
        pokemon.add(new EghoMagnemite(81));
        pokemon.add(new EghoMagneton(82));
        pokemon.add(new EghoGrimer(88));
        pokemon.add(new EghoMuk(89));
        pokemon.add(new EghoShellder(90));
        pokemon.add(new EghoChansey(113));
        pokemon.add(new EghoTangela(114));
    }
}
