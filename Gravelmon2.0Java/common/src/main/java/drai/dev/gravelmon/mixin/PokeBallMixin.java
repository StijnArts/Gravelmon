package drai.dev.gravelmon.mixin;

import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.pokeballs.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(PokeBall.class)
public abstract class PokeBallMixin implements PokeBallItemSettable{

    @Shadow public PokeBallItem item;

    @Override
    public void setPokeBallItem(RegistrySupplier<PokeBallItem> item){
        System.out.println("I set the item, yippeeeee");
        this.item = item.get();
    }
}
