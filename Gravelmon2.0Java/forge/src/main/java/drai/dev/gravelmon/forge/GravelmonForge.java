package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.platform.events.*;
import com.cobblemon.mod.common.util.*;
import dev.architectury.platform.forge.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.*;
import net.minecraft.client.renderer.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.item.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.javafmlmod.*;

import java.util.stream.*;

@Mod(Gravelmon.MOD_ID)
public class GravelmonForge {
    public static boolean ICON_MIXIN_INIT = false;
    public static boolean ICON_WIDGET_INIT = false;
    public static int TYPE_COUNT = 18;
    public GravelmonForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Gravelmon.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Gravelmon.init();
        PlatformEvents.CLIENT_ITEM_TOOLTIP.subscribe(Priority.LOWEST, itemTooltipEvent -> {
            var stack = itemTooltipEvent.getStack();
            var lines = itemTooltipEvent.getLines();
            var stackDescription = stack.getItem().getDescriptionId();
            var descriptionsForGravelmonBalls = GravelmonItems.POKE_BALLS.stream().flatMap(item-> Stream.of(item.get().getDescriptionId())).toList();
            if (descriptionsForGravelmonBalls.contains(stackDescription)) {
                if(stack.getTag() != null){
                    if (!stack.getTag().getBoolean(DataKeys.HIDE_TOOLTIP)) {
                        return Unit.INSTANCE;
                    }
                }
                var language = Language.getInstance();
                if(stackDescription.contains("nuzlocke")){
                    var key1 = baseLangKeyForItem(stack)+1;
                    var key2 = baseLangKeyForItem(stack)+2;
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
    @SubscribeEvent
    public static void onRegisterNamedRenderTypes(RegisterNamedRenderTypesEvent event)
    {
        event.register("gravelmon:orange_apricorn", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:purple_apricorn", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:purple_apricorn_sapling", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:orange_apricorn_sapling", RenderType.cutout(), Sheets.cutoutBlockSheet());
    }


    private static String baseLangKeyForItem(ItemStack stack) {
        if (stack.getItem() instanceof PokeBallItem) {
            var asPokeball = (PokeBallItem)stack.getItem();
            return "item.gravelmon."+asPokeball.getPokeBall().getName().getPath()+".tooltip";
        }
        return ".tooltip";
    }
}