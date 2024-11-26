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
import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.client.event.*;

import java.util.stream.*;

@Mod(Gravelmon.MOD_ID)
public class GravelmonForge {
    public static boolean ICON_MIXIN_INIT = false;
    public static boolean ICON_WIDGET_INIT = false;
    public static int TYPE_COUNT = 18;
    public GravelmonForge() {
        Gravelmon.init();
        PlatformEvents.CLIENT_ITEM_TOOLTIP.subscribe(Priority.LOWEST, itemTooltipEvent -> {
            var stack = itemTooltipEvent.getStack();
            var lines = itemTooltipEvent.getLines();
            var stackDescription = stack.getItem().getDescriptionId();
            var descriptionsForGravelmonBalls = GravelmonItems.POKE_BALLS.stream().flatMap(item-> Stream.of(item.get().getDescriptionId())).toList();
            if (descriptionsForGravelmonBalls.contains(stackDescription)) {
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
        ComposterBlock.COMPOSTABLES.put(GravelmonItems.ORANGE_APRICORN.get(), .65f);
        ComposterBlock.COMPOSTABLES.put(GravelmonItems.PURPLE_APRICORN.get(), .65f);
    }
    @SubscribeEvent
    public static void onRegisterNamedRenderTypes(RegisterNamedRenderTypesEvent event)
    {
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","orange_apricorn"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","purple_apricorn"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","purple_apricorn_sapling"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","orange_apricorn_sapling"), RenderType.cutout(), Sheets.cutoutBlockSheet());
    }


    private static String baseLangKeyForItem(ItemStack stack) {
        if (stack.getItem() instanceof PokeBallItem) {
            var asPokeball = (PokeBallItem)stack.getItem();
            return "item.gravelmon."+asPokeball.getPokeBall().getName().getPath()+".tooltip";
        }
        return ".tooltip";
    }
}