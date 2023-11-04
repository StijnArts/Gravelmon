package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import drai.dev.gravelmon.pokeballs.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

import static drai.dev.gravelmon.registries.GravelmonItems.*;

@Mixin(CobblemonItems.class)
public class CobblemonItemsMixin {

    private static boolean init = false;
    @Inject(method = "pokeBallItem", at =@At("HEAD"), remap = false, cancellable = true)
    private void injectPokeballs(PokeBall pokeBall, CallbackInfoReturnable<PokeBallItem> cir){
        if(!init){
            createPokeballItems();
            init=true;
        }
    }

    private void createPokeballItems() {
        MAUVE_BALL = pokeballItem("mauve_ball", GravelmonPokeballs.MAUVE_BALL);
        GravelmonPokeballs.MAUVE_BALL.setPokeBallItem(MAUVE_BALL);
        CORAL_BALL = pokeballItem("coral_ball",GravelmonPokeballs.CORAL_BALL);
        GravelmonPokeballs.CORAL_BALL.setPokeBallItem(CORAL_BALL);
        LUSTER_BALL = pokeballItem("luster_ball",GravelmonPokeballs.LUSTER_BALL);
        GravelmonPokeballs.LUSTER_BALL.setPokeBallItem(LUSTER_BALL);
        SUN_BALL = pokeballItem("sun_ball",GravelmonPokeballs.SUN_BALL);
        GravelmonPokeballs.SUN_BALL.setPokeBallItem(SUN_BALL);
        DAWN_BALL = pokeballItem("dawn_ball",GravelmonPokeballs.DAWN_BALL);
        GravelmonPokeballs.DAWN_BALL.setPokeBallItem(DAWN_BALL);
        FEATHER_BALL = pokeballItem("feather_ball",GravelmonPokeballs.FEATHER_BALL);
        GravelmonPokeballs.FEATHER_BALL.setPokeBallItem(FEATHER_BALL);
        GAY_BALL = pokeballItem("gay_ball",GravelmonPokeballs.GAY_BALL);
        GravelmonPokeballs.GAY_BALL.setPokeBallItem(GAY_BALL);
        LESBIAN_BALL = pokeballItem("lesbian_ball",GravelmonPokeballs.LESBIAN_BALL);
        GravelmonPokeballs.LESBIAN_BALL.setPokeBallItem(LESBIAN_BALL);
        BI_BALL = pokeballItem("bi_ball",GravelmonPokeballs.BI_BALL);
        GravelmonPokeballs.BI_BALL.setPokeBallItem(BI_BALL);
        PAN_BALL = pokeballItem("pan_ball",GravelmonPokeballs.PAN_BALL);
        GravelmonPokeballs.PAN_BALL.setPokeBallItem(PAN_BALL);
        TRANS_BALL = pokeballItem("trans_ball",GravelmonPokeballs.TRANS_BALL);
        GravelmonPokeballs.TRANS_BALL.setPokeBallItem(TRANS_BALL);
        NON_BINARY_BALL = pokeballItem("non_binary_ball",GravelmonPokeballs.NON_BINARY_BALL);
        GravelmonPokeballs.NON_BINARY_BALL.setPokeBallItem(NON_BINARY_BALL);
        ACE_BALL = pokeballItem("ace_ball",GravelmonPokeballs.ACE_BALL);
        GravelmonPokeballs.ACE_BALL.setPokeBallItem(ACE_BALL);
        ARO_BALL = pokeballItem("aro_ball",GravelmonPokeballs.ARO_BALL);
        GravelmonPokeballs.ARO_BALL.setPokeBallItem(ARO_BALL);

    }
}
