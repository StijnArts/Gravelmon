package drai.dev.gravelmon.fabric;

import drai.dev.gravelmon.registries.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.blockrenderlayer.v1.*;
import net.minecraft.client.renderer.*;

public class GravelmonFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN_SAPLING.get(), RenderType.cutout());
    }
}
