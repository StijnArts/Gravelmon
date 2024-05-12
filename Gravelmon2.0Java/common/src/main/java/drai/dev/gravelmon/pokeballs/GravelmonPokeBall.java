package drai.dev.gravelmon.pokeballs;

import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import dev.architectury.registry.registries.*;
import net.minecraft.resources.*;
import org.jetbrains.annotations.*;

import java.util.*;

public class GravelmonPokeBall extends PokeBall {
    public void setPokeBallItem(RegistrySupplier<PokeBallItem> pokeBallItem){
        this.item = pokeBallItem;
    }
    private RegistrySupplier<PokeBallItem> item;
    public GravelmonPokeBall(@NotNull ResourceLocation name, @NotNull CatchRateModifier catchRateModifier, @NotNull List<? extends CaptureEffect> effects, float waterDragValue, @NotNull ResourceLocation model2d, @NotNull ResourceLocation model3d) {
        super(name, catchRateModifier, effects, waterDragValue, model2d, model3d, 1, false);
    }

    public PokeBallItem getPokeBallItem() {
        return this.item.get();
    }
}
