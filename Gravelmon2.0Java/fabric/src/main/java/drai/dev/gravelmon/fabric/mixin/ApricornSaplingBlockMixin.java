package drai.dev.gravelmon.fabric.mixin;

import com.cobblemon.mod.common.api.apricorn.*;
import com.cobblemon.mod.common.block.*;
import net.minecraft.world.level.block.state.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ApricornSaplingBlock.class)
public class ApricornSaplingBlockMixin {

    @Inject(method = "<init>", at =@At("HEAD"), remap = false, cancellable = true)
    private static void replaceWithGravelmonSapling(BlockBehaviour.Properties properties, Apricorn apricorn, CallbackInfo ci){

    }
}
