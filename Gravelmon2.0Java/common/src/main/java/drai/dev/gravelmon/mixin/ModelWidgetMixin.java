package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.client.gui.summary.widgets.*;
import com.cobblemon.mod.common.pokeball.*;
import com.cobblemon.mod.common.pokemon.*;
import drai.dev.gravelmon.*;
import kotlin.jvm.internal.*;
import org.joml.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(ModelWidget.class)
public class ModelWidgetMixin {

    @Shadow private float rotationY;
    @Mutable
    @Final
    @Shadow private Vector3f rotVec;

    @Inject(method = "<init>(IIIILcom/cobblemon/mod/common/pokemon/RenderablePokemon;FFDZILkotlin/jvm/internal/DefaultConstructorMarker;)V", at =@At("TAIL"), remap = false)
    private void modifyRotation(int par1, int par2, int par3, int par4, RenderablePokemon par5, float par6, float par7, double par8, boolean par9, int par10, DefaultConstructorMarker par11, CallbackInfo ci){
        rotationY = GravelmonUtils.modelWidgetCorrection(par5, rotationY);
        rotVec = new Vector3f(0F, rotationY, 0F);
    }
}