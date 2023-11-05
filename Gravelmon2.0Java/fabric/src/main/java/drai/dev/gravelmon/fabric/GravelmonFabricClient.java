package drai.dev.gravelmon.fabric;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.platform.events.*;
import com.cobblemon.mod.common.util.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.blockrenderlayer.v1.*;
import net.fabricmc.fabric.api.client.item.v1.*;
import net.fabricmc.loader.api.*;
import net.minecraft.*;
import net.minecraft.client.renderer.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.item.*;

import java.util.stream.*;

public class GravelmonFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.ORANGE_APRICORN_SAPLING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GravelmonBlocks.PURPLE_APRICORN_SAPLING.get(), RenderType.cutout());
        PlatformEvents.CLIENT_ITEM_TOOLTIP.subscribe(Priority.LOWEST, event -> {
                var stack = event.getStack();
            var lines = event.getLines();
            var stackDescription = stack.getItem().getDescriptionId();
            var descriptionsForGravelmonBalls = GravelmonItems.POKE_BALLS.stream().flatMap(item->Stream.of(item.get().getDescriptionId())).toList();
            if (descriptionsForGravelmonBalls.contains(stackDescription)) {


                if(stack.getTag() != null){
                    if (!stack.getTag().getBoolean(DataKeys.HIDE_TOOLTIP)) {
                        return Unit.INSTANCE;
                    }
                }
                if(stackDescription.contains("nuzlocke")){
                    var language = Language.getInstance();
                    var key1 = this.baseLangKeyForItem(stack)+1;
                    var key2 = this.baseLangKeyForItem(stack)+2;
                    if (language.has(key1)) {
                        lines.add(Component.translatable(key1).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
                    }
                    if (language.has(key2)) {
                        lines.add(Component.translatable(key2).setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_RED)));
                    }
                } else {
                    var language = Language.getInstance();
                    var key = this.baseLangKeyForItem(stack);
                    if (language.has(key)) {
                        lines.add(Component.translatable(key).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
                    }
                }
            }
            return Unit.INSTANCE;
        });
    }

    private String baseLangKeyForItem(ItemStack stack) {
        if (stack.getItem() instanceof PokeBallItem) {
            var asPokeball = (PokeBallItem)stack.getItem();
            return "item.gravelmon."+asPokeball.getPokeBall().getName().getPath()+".tooltip";
        }
        return ".tooltip";
    }
}
