package drai.dev.gravelmon.pokeballs;

import com.cobblemon.mod.common.api.pokeball.catching.*;
import com.cobblemon.mod.common.pokemon.*;
import net.minecraft.world.entity.*;
import org.jetbrains.annotations.*;

public class ShinyBallBattleModifier implements CatchRateModifier {

    @Override
    public float value(@NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
        if(pokemon.getShiny()) return 255F;
        return 1F;
    }

    @NotNull
    @Override
    public Behavior behavior(@NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
        return Behavior.MULTIPLY;
    }

    @Override
    public boolean isValid(@NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
        return pokemon.getShiny();
    }

    @Override
    public float modifyCatchRate(float v, @NotNull LivingEntity livingEntity, @NotNull Pokemon pokemon) {
        return this.behavior(livingEntity, pokemon).getMutator().invoke(v, this.value(livingEntity, pokemon));
    }

    @Override
    public boolean isGuaranteed() {
        return true;
    }
}
