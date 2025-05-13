package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.entity.pokemon.*;
import com.cobblemon.yajatkaul.mega_showdown.megaevo.*;
import drai.dev.gravelmon.mega.*;
import net.minecraft.server.level.*;
import net.minecraft.world.entity.player.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(MegaLogic.class)
public class MegaLogicMixin {
    /**
     * @author drai
     * @reason Replace mega evolution logic to allow for multiple mega features and integrate with gravelmon registration style
     */
    @Overwrite
    public static void Evolve(PokemonEntity context, Player player, Boolean fromBattle) {
        MegaEvolveLogic.evolve(context, player, fromBattle);
    }
    /**
     * @author drai
     * @reason Replace mega evolution logic to allow for multiple mega features and integrate with gravelmon registration style
     */
    @Overwrite
    public static void EvoLogic(ServerPlayer player) {
        MegaEvolveLogic.EvoLogic(player);
    }
}
