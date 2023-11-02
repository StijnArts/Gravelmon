package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.xenoverse.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationOne extends Original {
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
//        pokemon.add(new SeviianDoduo(84));
//        pokemon.add(new SeviianDodrio(85));


        //Pokemon Blazing Emerald
        addHoennianPokemon();

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
        pokemon.add(new EhgoBulbasaur(1));
        pokemon.add(new EhgoIvysaur(2));
        pokemon.add(new EhgoVenusaur(3));
        pokemon.add(new EhgoCharmander(4));
        pokemon.add(new EhgoCharmeleon(5));
        pokemon.add(new EhgoCharizard(6));
        pokemon.add(new EhgoSquirtle(7));
        pokemon.add(new EhgoWartortle(8));
        pokemon.add(new EhgoBlastoise(9));
        pokemon.add(new EhgoSpearow(21));
        pokemon.add(new EhgoFearow(22));
        pokemon.add(new EhgoOddish(43));
        pokemon.add(new EhgoGloom(44));
        pokemon.add(new EhgoMagnemite(81));
        pokemon.add(new EhgoMagneton(82));
        pokemon.add(new EhgoGrimer(88));
        pokemon.add(new EhgoMuk(89));
        pokemon.add(new EhgoShellder(90));
        pokemon.add(new EhgoChansey(113));
        pokemon.add(new EhgoTangela(114));
    }
}
