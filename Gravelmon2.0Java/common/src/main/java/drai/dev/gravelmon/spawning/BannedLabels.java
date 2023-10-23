package drai.dev.gravelmon.spawning;

import com.cobblemon.mod.common.api.spawning.*;
import com.cobblemon.mod.common.api.spawning.context.*;
import com.cobblemon.mod.common.api.spawning.detail.*;
import com.cobblemon.mod.common.api.spawning.influence.*;
import net.minecraft.world.entity.*;
import org.jetbrains.annotations.*;

public class BannedLabels implements SpawningInfluence {

    @Override
    public void affectSpawn(@NotNull Entity entity) {

    }

    @Override
    public void affectAction(@NotNull SpawnAction<?> spawnAction) {

    }

    @Override
    public float affectBucketWeight(@NotNull SpawnBucket spawnBucket, float v) {
        return 0;
    }

    @Override
    public boolean affectSpawnable(@NotNull SpawnDetail spawnDetail, @NotNull SpawningContext spawningContext) {
        return false;
    }

    @Override
    public float affectWeight(@NotNull SpawnDetail spawnDetail, @NotNull SpawningContext spawningContext, float v) {
        return 0;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
