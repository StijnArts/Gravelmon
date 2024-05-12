package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationThree extends Original {
    public GenerationThree() {
        super("generation3");
    }

    @Override
    public void registerPokemon() {
        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        pokemon.add(new SeviianFeebas(349));
        pokemon.add(new SeviianMilotic(350));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        pokemon.add(new EhgoLotad(270));
        pokemon.add(new EhgoLombre(271));
        pokemon.add(new EhgoLudicolo(272));
        pokemon.add(new EhgoAzurill(298));
        pokemon.add(new EhgoSwablu(333));
        pokemon.add(new EhgoAltaria(334));
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
