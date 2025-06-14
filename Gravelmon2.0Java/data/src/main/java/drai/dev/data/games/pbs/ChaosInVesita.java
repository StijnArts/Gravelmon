package drai.dev.data.games.pbs;

import drai.dev.data.pokemon.chaosinvestia.*;
import drai.dev.data.pokemon.chaosinvestia.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class ChaosInVesita extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new ChaosInVesita();
    private ChaosInVesita() {
        super("ChaosInVesita");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new VesitanChespin("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanQuilladin("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanChesnaught("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanFennekin("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanBraixen("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanDelphox("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanFroakie("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanFrogadier("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanGreninja("", Aspect.VESITAN).addLabels(Label.STARTER));
        addNewPokemon(new VesitanScatterbug("", Aspect.VESITAN));
        addNewPokemon(new VesitanSpewpa("", Aspect.VESITAN));
        addNewPokemon(new VesitanVivillon("", Aspect.VESITAN));
        addNewPokemon(new VesitanFlabebe("", Aspect.VESITAN));
        addNewPokemon(new VesitanFloette("", Aspect.VESITAN));
        addNewPokemon(new VesitanFlorges("", Aspect.VESITAN));
        addNewPokemon(new VesitanSkiddo("", Aspect.VESITAN));
        addNewPokemon(new VesitanGogoat("", Aspect.VESITAN));
        addNewPokemon(new VesitanSpritzee("", Aspect.VESITAN));
        addNewPokemon(new VesitanAromatisse("", Aspect.VESITAN));
        addNewPokemon(new VesitanSwirlix("", Aspect.VESITAN));
        addNewPokemon(new VesitanSlurpuff("", Aspect.VESITAN));
        addNewPokemon(new VesitanInkay("", Aspect.VESITAN));
        addNewPokemon(new VesitanMalamar("", Aspect.VESITAN));
        addNewPokemon(new VesitanBinacle("", Aspect.VESITAN));
        addNewPokemon(new VesitanBarbaracle("", Aspect.VESITAN));
        addNewPokemon(new VesitanSkrelp("", Aspect.VESITAN));
        addNewPokemon(new VesitanDragalge("", Aspect.VESITAN));
        addNewPokemon(new VesitanClauncher("", Aspect.VESITAN));
        addNewPokemon(new VesitanClawitzer("", Aspect.VESITAN));
        addNewPokemon(new VesitanHelioptile("", Aspect.VESITAN));
        addNewPokemon(new VesitanHeliolisk("", Aspect.VESITAN));
        addNewPokemon(new VesitanHawlucha("", Aspect.VESITAN));
        addNewPokemon(new VesitanDedenne("", Aspect.VESITAN));
        addNewPokemon(new VesitanGoomy("", Aspect.VESITAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new VesitanSliggoo("", Aspect.VESITAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new VesitanGoodra("", Aspect.VESITAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new VesitanBergmite("", Aspect.VESITAN));
        addNewPokemon(new VesitanAvalugg("", Aspect.VESITAN));
        addNewPokemon(new VesitanNoibat("", Aspect.VESITAN));
        addNewPokemon(new VesitanNoivern("", Aspect.VESITAN));
//        addNewPokemon(new VesitanXerneas("", Aspect.VESITAN));
//        addNewPokemon(new VesitanYveltal("", Aspect.VESITAN));
    }
}
