package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
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

        addHoennianPokemon();

        //Radical Red
        pokemon.add(new SeviianTeddiursa(216));
        pokemon.add(new SeviianUrsaring(217));
        pokemon.add(new SeviianMantine(226));

        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranLedian(166));

        //Daybreak
        pokemon.add(new ArmiranTyranitar(248));

        //Vanguard
        pokemon.add(new AyreianChikorita(152));
        pokemon.add(new AyreianBayleef(153));
        pokemon.add(new AyreianMeganium(154));
        pokemon.add(new AyreianCyndaquil(155));
        pokemon.add(new AyreianQuilava(156));
        pokemon.add(new AyreianTyphlosion(157));
        pokemon.add(new AyreianTotodile(158));
        pokemon.add(new AyreianCroconaw(159));
        pokemon.add(new AyreianFeraligatr(160));
        pokemon.add(new AyreianHoothoot(163));
        pokemon.add(new AyreianNoctowl(164));
        pokemon.add(new AyreianSpinarak(167));
        pokemon.add(new AyreianAriados(168));
        pokemon.add(new AyreianStantler(234));

        //Phoenix Rising
        pokemon.add(new RelicLedyba(165));
        pokemon.add(new RelicLedian(166));
        pokemon.add(new RelicAipom(190));

        //Kaskadian
        pokemon.add(new KaskadianMarill(183));
        pokemon.add(new KaskadianAzumarill(184));
        pokemon.add(new AmazeAllSudowoodo(185));
        pokemon.add(new KaskadianYanma(193));

    }

    private void addMythianPokemon() {
        pokemon.add(new MythianMareep(179));
        pokemon.add(new MythianFlaaffy(180));
        pokemon.add(new MythianAmpharos(181));
        pokemon.add(new MythianScizor(212));
    }

    private void addHoennianPokemon() {
        //Pokemon Blazing Emerald
        pokemon.add(new HoennianChinchou(170));
        pokemon.add(new HoennianLanturn(171));
        pokemon.add(new HoennianDunsparce(206));
        pokemon.add(new HoennianQwilfish(211));
        pokemon.add(new HoennianShuckle(213));
        pokemon.add(new HoennianTeddiursa(216));
        pokemon.add(new HoennianUrsaring(217));
        pokemon.add(new HoennianSkarmory(227));
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
        pokemon.add(new DeltaSunkern(191));
        pokemon.add(new DeltaSunflora(192));
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
