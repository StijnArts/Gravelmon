package drai.dev.gravelmon.neoforge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.platform.events.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import kotlin.*;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.fml.event.lifecycle.*;

import java.util.stream.*;

@EventBusSubscriber(modid = "gravelmon", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GravelmonForgeClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        PlatformEvents.CLIENT_ITEM_TOOLTIP.subscribe(Priority.LOWEST, itemTooltipEvent -> {
            var stack = itemTooltipEvent.getStack();
            var lines = itemTooltipEvent.getLines();
            var stackDescription = stack.getItem().getDescriptionId();
            var descriptionsForGravelmonBalls = GravelmonItems.POKE_BALLS.stream().flatMap(item -> Stream.of(item.get().getDescriptionId())).toList();
            if (descriptionsForGravelmonBalls.contains(stackDescription)) {
                var language = Language.getInstance();
                if (stackDescription.contains("nuzlocke")) {
                    var key1 = baseLangKeyForItem(stack) + 1;
                    var key2 = baseLangKeyForItem(stack) + 2;
                    if (language.has(key1)) {
                        lines.add(Component.translatable(key1).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
                    }
                    if (language.has(key2)) {
                        lines.add(Component.translatable(key2).setStyle(Style.EMPTY.withColor(ChatFormatting.DARK_RED)));
                    }
                } else {
                    var key = baseLangKeyForItem(stack);
                    if (language.has(key)) {
                        lines.add(Component.translatable(key).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
                    }
                }
            }
            return Unit.INSTANCE;
        });
    }


    private static String baseLangKeyForItem(ItemStack stack) {
        if (stack.getItem() instanceof PokeBallItem) {
            var asPokeball = (PokeBallItem)stack.getItem();
            return "item.gravelmon."+asPokeball.getPokeBall().getName().getPath()+".tooltip";
        }
        return ".tooltip";
    }
}
