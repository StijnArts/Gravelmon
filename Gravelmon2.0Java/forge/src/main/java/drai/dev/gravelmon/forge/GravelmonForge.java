package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.platform.events.*;
import com.cobblemon.mod.common.util.*;
import dev.architectury.platform.forge.EventBuses;
import drai.dev.gravelmon.Gravelmon;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.*;
import net.minecraft.client.renderer.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.item.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

    }
    @SubscribeEvent
    public static void onRegisterNamedRenderTypes(RegisterNamedRenderTypesEvent event)
    {
        event.register("gravelmon:orange_apricorn", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:purple_apricorn", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:purple_apricorn_sapling", RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register("gravelmon:orange_apricorn_sapling", RenderType.cutout(), Sheets.cutoutBlockSheet());
    }

}