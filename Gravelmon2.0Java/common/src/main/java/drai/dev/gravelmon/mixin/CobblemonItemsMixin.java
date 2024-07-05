package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
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
        GravelmonItems.NUCLEAR_BALL = pokeballItem("nuclear_ball",GravelmonPokeballs.NUCLEAR_BALL);
        GravelmonPokeballs.NUCLEAR_BALL.setPokeBallItem(GravelmonItems.NUCLEAR_BALL);
        GravelmonItems.ATOM_BALL = pokeballItem("atom_ball",GravelmonPokeballs.ATOM_BALL);
        GravelmonPokeballs.ATOM_BALL.setPokeBallItem(GravelmonItems.ATOM_BALL);
        GravelmonItems.DELTA_BALL = pokeballItem("delta_ball",GravelmonPokeballs.DELTA_BALL);
        GravelmonPokeballs.DELTA_BALL.setPokeBallItem(GravelmonItems.DELTA_BALL);
        GravelmonItems.XENO_BALL = pokeballItem("xeno_ball",GravelmonPokeballs.XENO_BALL);
        GravelmonPokeballs.XENO_BALL.setPokeBallItem(GravelmonItems.XENO_BALL);
        ANCIENT_BALL = pokeballItem("ancient_ball",GravelmonPokeballs.ANCIENT_BALL);
        GravelmonPokeballs.ANCIENT_BALL.setPokeBallItem(GravelmonItems.ANCIENT_BALL);
        SHINY_BALL = pokeballItem("shiny_ball",GravelmonPokeballs.SHINY_BALL);
        GravelmonPokeballs.SHINY_BALL.setPokeBallItem(GravelmonItems.SHINY_BALL);
        NUZLOCKE_BALL = pokeballItem("nuzlocke_ball",GravelmonPokeballs.NUZLOCKE_BALL);
        GravelmonPokeballs.NUZLOCKE_BALL.setPokeBallItem(GravelmonItems.NUZLOCKE_BALL);
        SNORE_BALL = pokeballItem("snore_ball",GravelmonPokeballs.SNORE_BALL);
        GravelmonPokeballs.SNORE_BALL.setPokeBallItem(GravelmonItems.SNORE_BALL);
        ARK_BALL = pokeballItem("ark_ball",GravelmonPokeballs.ARK_BALL);
        GravelmonPokeballs.ARK_BALL.setPokeBallItem(GravelmonItems.ARK_BALL);
        LIME_BALL = pokeballItem("lime_ball",GravelmonPokeballs.LIME_BALL);
        GravelmonPokeballs.LIME_BALL.setPokeBallItem(GravelmonItems.LIME_BALL);
        //Ancient Pokeballs
        ANCIENT_MAUVE_BALL = pokeballItem("ancient_mauve_ball", GravelmonPokeballs.ANCIENT_MAUVE_BALL);
        GravelmonPokeballs.ANCIENT_MAUVE_BALL.setPokeBallItem(ANCIENT_MAUVE_BALL);
        ANCIENT_CORAL_BALL = pokeballItem("ancient_coral_ball",GravelmonPokeballs.ANCIENT_CORAL_BALL);
        GravelmonPokeballs.ANCIENT_CORAL_BALL.setPokeBallItem(ANCIENT_CORAL_BALL);
        //Team Rocket Poke balls
        GravelmonItems.ROCKET_BALL = pokeballItem("rocket_ball",GravelmonPokeballs.ROCKET_BALL);
        GravelmonPokeballs.ROCKET_BALL.setPokeBallItem(GravelmonItems.ROCKET_BALL);
        GravelmonItems.GREAT_ROCKET_BALL = pokeballItem("great_rocket_ball",GravelmonPokeballs.GREAT_ROCKET_BALL);
        GravelmonPokeballs.GREAT_ROCKET_BALL.setPokeBallItem(GravelmonItems.GREAT_ROCKET_BALL);
        GravelmonItems.ULTRA_ROCKET_BALL = pokeballItem("ultra_rocket_ball",GravelmonPokeballs.ULTRA_ROCKET_BALL);
        GravelmonPokeballs.ULTRA_ROCKET_BALL.setPokeBallItem(GravelmonItems.ULTRA_ROCKET_BALL);
        //Official Game Poke balls
        GravelmonItems.TYPING_BALL = pokeballItem("typing_ball",GravelmonPokeballs.TYPING_BALL);
        GravelmonPokeballs.TYPING_BALL.setPokeBallItem(GravelmonItems.TYPING_BALL);
        GS_BALL = pokeballItem("gs_ball",GravelmonPokeballs.GS_BALL);
        GravelmonPokeballs.GS_BALL.setPokeBallItem(GravelmonItems.GS_BALL);
        GravelmonItems.GEN2_LURE_BALL = pokeballItem("gen2_lure_ball",GravelmonPokeballs.GEN2_LURE_BALL);
        GravelmonPokeballs.GEN2_LURE_BALL.setPokeBallItem(GravelmonItems.GEN2_LURE_BALL);
        //Anime Poke balls
        LAKE_BALL = pokeballItem("lake_ball",GravelmonPokeballs.LAKE_BALL);
        GravelmonPokeballs.LAKE_BALL.setPokeBallItem(GravelmonItems.LAKE_BALL);
        ANIME_SAFARI_BALL = pokeballItem("anime_safari_ball",GravelmonPokeballs.ANIME_SAFARI_BALL);
        GravelmonPokeballs.ANIME_SAFARI_BALL.setPokeBallItem(GravelmonItems.ANIME_SAFARI_BALL);
        ANNIE_BALL = pokeballItem("annie_ball",GravelmonPokeballs.ANNIE_BALL);
        GravelmonPokeballs.ANNIE_BALL.setPokeBallItem(GravelmonItems.ANNIE_BALL);
        OAKLEY_BALL = pokeballItem("oakley_ball",GravelmonPokeballs.OAKLEY_BALL);
        GravelmonPokeballs.OAKLEY_BALL.setPokeBallItem(GravelmonItems.OAKLEY_BALL);
        FISHING_BALL = pokeballItem("fishing_ball",GravelmonPokeballs.FISHING_BALL);
        GravelmonPokeballs.FISHING_BALL.setPokeBallItem(GravelmonItems.FISHING_BALL);
        ANIME_GS_BALL = pokeballItem("anime_gs_ball",GravelmonPokeballs.ANIME_GS_BALL);
        GravelmonPokeballs.ANIME_GS_BALL.setPokeBallItem(GravelmonItems.ANIME_GS_BALL);
        //Manga Poke balls
        MANGA_SAFARI_BALL = pokeballItem("manga_safari_ball",GravelmonPokeballs.MANGA_SAFARI_BALL);
        GravelmonPokeballs.MANGA_SAFARI_BALL.setPokeBallItem(GravelmonItems.MANGA_SAFARI_BALL);
        //LGBTQ+ balls
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
