package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.avoris.regional.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.enjin.regional.*;
import drai.dev.gravelmon.pokemon.fliga.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.ionos.regional.*;
import drai.dev.gravelmon.pokemon.lagoone.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
//import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.neonintendo.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationThree extends Game {
    public GenerationThree() {
        super("generation3");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new LagoonanSableye(302));

//        pokemon.add(new IonosianTrapinch(328));   Missing Stats
//        pokemon.add(new IonosianVibrava(329));   Missing Stats
//        pokemon.add(new IonosianFlygon(330));   Missing Stats

        pokemon.add(new FligianTreecko(252));
        pokemon.add(new FligianGrovyle(253));
        pokemon.add(new FligianSceptile(254));
        pokemon.add(new FligianRalts(280));
        pokemon.add(new FligianKirlia(281));
        pokemon.add(new FligianGardevoir(282));
        pokemon.add(new FligianSlakoth(287));
        pokemon.add(new FligianVigoroth(288));
        pokemon.add(new FligianNincada(290));
        pokemon.add(new FligianDuskull(355));
        pokemon.add(new FligianDusclops(356));

//        pokemon.add(new EnjinnianElectrike(309));Member of line Not Finished
//        pokemon.add(new EnjinnianManectric(310));Member of line Not Finished

        pokemon.add(new EnjinnianSableye(302));

        pokemon.add(new NeoCacnea(331));

        pokemon.add(new NovranHuntail(367));
        pokemon.add(new NovranGorebyss(368));

        pokemon.add(new QamoranSpoink(325));
        pokemon.add(new QamoranGrumpig(326));

        pokemon.add(new NorheimanMasquerain(284, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new NorheimanWailmer(320));
        pokemon.add(new NorheimanNumel(322));
        pokemon.add(new NorheimanCorphish(341));
        pokemon.add(new NorheimanCrawdaunt(342, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));

        pokemon.add(new VaritasianSwablu(333));
        pokemon.add(new VaritasianAltaria(334));

        pokemon.add(new HizianNosepass(299));
        pokemon.add(new HizianSkitty(300));
        pokemon.add(new HizianDelcatty(301));
        pokemon.add(new HizianAron(304));
        pokemon.add(new HizianLairon(305));
        pokemon.add(new HizianAggron(306));
        pokemon.add(new HizianLileep(345));
        pokemon.add(new HizianCradily(346));
        pokemon.add(new HizianAnorith(347));
        pokemon.add(new HizianArmaldo(348));
        pokemon.add(new HizianTropius(357));
        pokemon.add(new HizianLuvdisc(370));

//        pokemon.add(new AristosianNumel(322)); Missing Art
//        pokemon.add(new AristosianTaillow(276)); Member of line not finished
//        pokemon.add(new AristosianNosepass(299)); Missing Art
        pokemon.add(new AristosianTropius(357));

        pokemon.add(new AvorianRoselia(315));

        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        pokemon.add(new SeviianFeebas(349));
        pokemon.add(new SeviianMilotic(350));

        //Pokemon Flux
        pokemon.add(new AlteranShroomish(285));
        pokemon.add(new AlteranBreloom(286));

        //Daybreak
        pokemon.add(new ArmiranSceptile(254));
        pokemon.add(new ArmiranSwellow(277));

        //Vanguard
        pokemon.add(new AyreianTorchic(255));
        pokemon.add(new AyreianCombusken(256));
        pokemon.add(new AyreianBlaziken(257));
        pokemon.add(new AyreianNosepass(299));
        pokemon.add(new AyreianAron(304));
        pokemon.add(new AyreianLairon(305));
        pokemon.add(new AyreianAggron(306));
        pokemon.add(new AyreianRoselia(315));
        pokemon.add(new AyreianNumel(322));
        pokemon.add(new AyreianCamerupt(323));
        pokemon.add(new AyreianTrapinch(328));
        pokemon.add(new AyreianVibrava(329));
        pokemon.add(new AyreianFlygon(330));
        pokemon.add(new AyreianSwablu(333));
        pokemon.add(new AyreianAltaria(334));
        pokemon.add(new AyreianLunatone(337));
        pokemon.add(new AyreianRelicanth(369));
        pokemon.add(new AyreianLuvdisc(370));

        //Phoenix Rising
        pokemon.add(new RelicRoselia(315));
        pokemon.add(new RelicSpinda(327));

        //Kaskadian
        pokemon.add(new KaskadianExploud(295));
        pokemon.add(new GutsyCastform(351));
        pokemon.add(new WindyCastform(351));
        pokemon.add(new SmoggyCastform(351));
        pokemon.add(new DustyCastform(351));
        pokemon.add(new SandyCastform(351));
        pokemon.add(new SwarmyCastform(351));
        pokemon.add(new SpookyCastform(351));
        pokemon.add(new WhirlyCastform(351));
        pokemon.add(new AllergyCastform(351));
        pokemon.add(new ZappyCastform(351));
        pokemon.add(new ZennyCastform(351));
        pokemon.add(new SorceryCastform(351));
        pokemon.add(new ShadyCastform(351));
        pokemon.add(new LovelyCastform(351));
        pokemon.add(new KaskadianTropius(357));

        //Azure (Mystic)
        pokemon.add(new MysticTreecko(252));
        pokemon.add(new MysticGrovyle(253));
        pokemon.add(new MysticSceptile(254));
        pokemon.add(new MysticTorchic(255));
        pokemon.add(new MysticCombusken(256));
        pokemon.add(new MysticBlaziken(257));
        pokemon.add(new MysticMudkip(258));
        pokemon.add(new MysticMarshtomp(259));
        pokemon.add(new MysticSwampert(260));
        pokemon.add(new MysticPoochyena(261));
        pokemon.add(new MysticMightyena(262));

        //Pokemon Opalo
        pokemon.add(new CefiranMakuhita(296));
        pokemon.add(new CefiranHariyama(297));
        pokemon.add(new CefiranSableye(302));
        pokemon.add(new CefiranNumel(322));
        pokemon.add(new CefiranCamerupt(323));
        pokemon.add(new CefiranVibrava(329));
        pokemon.add(new CefiranFlygon(330));
        pokemon.add(new CefiranSnorunt(361));
        pokemon.add(new CefiranGlalie(362));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        pokemon.add(new EghoLotad(270));
        pokemon.add(new EghoLombre(271));
        pokemon.add(new EghoLudicolo(272));
        pokemon.add(new EghoAzurill(298));
        pokemon.add(new EghoSwablu(333));
        pokemon.add(new EghoAltaria(334));
    }

    private void addDeltaPokemon() {
        //Pokemon Insurgance
        pokemon.add(new DeltaTreecko(252));
        pokemon.add(new DeltaGrovyle(253));
        pokemon.add(new DeltaSceptile(254));
        pokemon.add(new DeltaTorchic(255));
        pokemon.add(new DeltaCombusken(256));
        pokemon.add(new DeltaBlaziken(257));
        pokemon.add(new DeltaLotad(270));
        pokemon.add(new DeltaLombre(271));
        pokemon.add(new DeltaLudicolo(272));
        pokemon.add(new DeltaSeedot(273));
        pokemon.add(new DeltaNuzleaf(274));
        pokemon.add(new DeltaShiftry(275));
        pokemon.add(new DeltaRalts(280));
        pokemon.add(new DeltaKirlia(281));
        pokemon.add(new DeltaGardevoir(282));
        pokemon.add(new DeltaSableye(302));
        pokemon.add(new DeltaMawile(303));
        pokemon.add(new DeltaAron(304));
        pokemon.add(new DeltaLairon(305));
        pokemon.add(new DeltaAggron(306));
        pokemon.add(new DeltaMeditite(307));
        pokemon.add(new DeltaMedicham(308));
        pokemon.add(new DeltaPlusle(311));
        pokemon.add(new DeltaMinun(312));
        pokemon.add(new DeltaRoselia(315));
        pokemon.add(new DeltaWailmer(320));
        pokemon.add(new DeltaWailord(321));
        pokemon.add(new DeltaNumel(322));
        pokemon.add(new DeltaCamerupt(323));
        pokemon.add(new DeltaFeebas(349));
        pokemon.add(new DeltaMilotic(350));
        pokemon.add(new DeltaSnorunt(361));
        pokemon.add(new DeltaGlalie(362));
        pokemon.add(new DeltaClamperl(366));
        pokemon.add(new DeltaHuntail(367));
        pokemon.add(new DeltaGorebyss(368));
        pokemon.add(new DeltaSpiderBeldum(374));
        pokemon.add(new DeltaSpiderMetang(375));
        pokemon.add(new DeltaSpiderMetagross(376));
        pokemon.add(new DeltaRuinBeldum(374));
        pokemon.add(new DeltaRuinMetang(375));
        pokemon.add(new DeltaRuinMetagross(376));
        pokemon.add(new DeltaRegirock(377));
        pokemon.add(new DeltaRegice(378));
        pokemon.add(new DeltaRegisteel(379));
    }

    private void addXPokemon() {
        //X-Species (Xenoverse)
        pokemon.add(new RoseliaX(315));
        pokemon.add(new CarvanhaX(318));
        pokemon.add(new SharpedoX(319));
        pokemon.add(new CacneaX(331));
        pokemon.add(new CacturneX(332));
    }
}
