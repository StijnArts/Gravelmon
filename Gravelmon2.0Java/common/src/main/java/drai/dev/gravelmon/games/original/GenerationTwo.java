package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.xenoverse.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationTwo extends Original {
    public GenerationTwo() {
        super("generation2");
    }

    @Override
    public void registerPokemon() {
        registerPokemonInfinityForms();

        registerInsurganceForms();

        registerXenoverseForms();

        //Pokemon Blazing Emerald
//        pokemon.add(new HoennianChinchou(170));
//        pokemon.add(new HoennianLanturn(171));
//        pokemon.add(new HoennianDunsparce(206));
//        pokemon.add(new HoennianQwilfish(211));
        pokemon.add(new HoennianShuckle(213));
//        pokemon.add(new HoennianTeddiursa(216));
//        pokemon.add(new HoennianUrsaring(217));
//        pokemon.add(new HoennianSkarmory(227));

    }

    private void registerXenoverseForms() {
        //X-Species
        pokemon.add(new UnownEarth(201));
        pokemon.add(new UnownXenoverse(201));
        pokemon.add(new SmeargleX(235));
        pokemon.add(new ElekidX(239));
        pokemon.add(new TyranitarX(248));
    }

    private void registerInsurganceForms() {
        pokemon.add(new DeltaCyndaquil(155));
        pokemon.add(new DeltaQuilava(156));
        pokemon.add(new DeltaTyphlosion(157));
        pokemon.add(new DeltaHoothoot(163));
        pokemon.add(new DeltaNoctowl(164));
        pokemon.add(new DeltaChinchou(170));
        pokemon.add(new DeltaLanturn(171));
        pokemon.add(new DeltaPichu(172));
        pokemon.add(new DeltaAipom(190));
        pokemon.add(new DeltaSunkern(192));
        pokemon.add(new DeltaSunflora(193));
        pokemon.add(new DeltaYanma(193));
        pokemon.add(new DeltaWooper(194));
        pokemon.add(new DeltaQuagsire(195));
        pokemon.add(new DeltaMisdreavus(200));
        pokemon.add(new DeltaGirafarig(203));
        pokemon.add(new DeltaDunsparce(206));
        pokemon.add(new DeltaScizor(212));
        pokemon.add(new DeltaShuckle(213));
        pokemon.add(new DeltaRemoraid(223));
        pokemon.add(new DeltaOctillery(224));
        pokemon.add(new DeltaElekid(239));
        pokemon.add(new DeltaMagby(240));
    }

    private void registerPokemonInfinityForms() {
        //Pokemon Infinity
        pokemon.add(new EhgoChikorita(152));
        pokemon.add(new EhgoBayleef(153));
        pokemon.add(new EhgoMeganium(154));
        pokemon.add(new EhgoCyndaquil(155));
        pokemon.add(new EhgoQuilava(156));
        pokemon.add(new EhgoTyphlosion(157));
        pokemon.add(new EhgoTotodile(158));
        pokemon.add(new EhgoCroconaw(159));
        pokemon.add(new EhgoFeraligatr(160));
        pokemon.add(new EhgoHoothoot(163));
        pokemon.add(new EhgoNoctowl(164));
        pokemon.add(new EhgoMarill(183));
        pokemon.add(new EhgoAzumarill(184));
        pokemon.add(new EhgoBlissey(242));
    }
}
