package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.hub.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationTwo extends Game {
    public GenerationTwo() {
        super("generation2");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new NovranSudowoodo(185));
        pokemon.add(new NovranSlowking(199));

        pokemon.add(new QamoranTyrogue(236));
        pokemon.add(new QamoranHitmontop(237));

        pokemon.add(new VaritasianTogepi(175));
        pokemon.add(new VaritasianTogetic(176));
//        pokemon.add(new VaritasianSudowoodo(185)); NOT FINISHED
        pokemon.add(new VaritasianWobbuffet(202));
//        pokemon.add(new VaritasianMantine(226)); NOT FINISHED
//        pokemon.add(new VaritasianKingdra(230)); NOT FINISHED
        pokemon.add(new VaritasianPorygon2(233));
        pokemon.add(new VaritasianTyrogue(236));
        pokemon.add(new VaritasianHitmontop(237));
        pokemon.add(new VaritasianRaikou(243));
        pokemon.add(new VaritasianEntei(244));
        pokemon.add(new VaritasianSuicune(245));

        pokemon.add(new HubianTogepi(175));
        pokemon.add(new HubianTogetic(176));
        pokemon.add(new HubianSmeargle(235));

        pokemon.add(new HizianGligar(207));
        pokemon.add(new HizianMurkrow(198));
        pokemon.add(new HizianMisdreavus(200));

//        pokemon.add(new NorheimanUnown(201)); NOT FINISHED
//        pokemon.add(new NorheimanForretress(205)); NOT FINISHED
//        pokemon.add(new NorheimanHoundour(228)); NOT FINISHED

        //Aristosian
        pokemon.add(new AristosianSentret(161));
        pokemon.add(new AristosianFurret(162));
        pokemon.add(new AristosianSpinarak(167));
        pokemon.add(new AristosianMareep(179));
        pokemon.add(new AristosianFlaaffy(180));

        //Avorian
//        pokemon.add(new AvorianMareep(179)); NOT FINISHED
//        pokemon.add(new AvorianFlaaffy(180)); NOT FINISHED

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

        //Pokemon Opalo
        pokemon.add(new CefiranTeddiursa(216));
        pokemon.add(new CefiranUrsaring(217));
        pokemon.add(new CefiranSlugma(218));
        pokemon.add(new CefiranMagcargo(219));
        pokemon.add(new CefiranDelibird(225));
        pokemon.add(new CefiranSmeargle(235));

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
        pokemon.add(new EghoChikorita(152));
        pokemon.add(new EghoBayleef(153));
        pokemon.add(new EghoMeganium(154));
        pokemon.add(new EghoCyndaquil(155));
        pokemon.add(new EghoQuilava(156));
        pokemon.add(new EghoTyphlosion(157));
        pokemon.add(new EghoTotodile(158));
        pokemon.add(new EghoCroconaw(159));
        pokemon.add(new EghoFeraligatr(160));
        pokemon.add(new EghoHoothoot(163));
        pokemon.add(new EghoNoctowl(164));
        pokemon.add(new EghoMarill(183));
        pokemon.add(new EghoAzumarill(184));
        pokemon.add(new EghoBlissey(242));
    }
}
