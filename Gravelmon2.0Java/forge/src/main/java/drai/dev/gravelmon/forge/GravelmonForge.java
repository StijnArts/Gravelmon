package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.platform.events.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import java.util.stream.*;
import net.minecraft.client.renderer.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.client.event.*;

import java.util.function.*;

@Mod(Gravelmon.MOD_ID)
public class GravelmonForge {
    private static boolean POKEBALL_INIT = false;
    public GravelmonForge() {
        Gravelmon.init();

        CobblemonEvents.THROWN_POKEBALL_HIT.subscribe(Priority.HIGHEST, thrownPokeballHitEvent -> {
           if(!POKEBALL_INIT){
               GravelmonItems.POKE_BALLS.stream().map(Supplier::get).forEach(pokeBallItem -> {
                   var gravelmonPokeball= (GravelmonPokeBall)pokeBallItem.getPokeBall();
                   gravelmonPokeball.registerItem();
               });
               POKEBALL_INIT = true;
           }
            return Unit.INSTANCE;
        });
    }

    @SubscribeEvent
    public static void onRegisterNamedRenderTypes(RegisterNamedRenderTypesEvent event)
    {
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","orange_apricorn"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","purple_apricorn"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","purple_apricorn_sapling"), RenderType.cutout(), Sheets.cutoutBlockSheet());
        event.register(ResourceLocation.fromNamespaceAndPath("gravelmon","orange_apricorn_sapling"), RenderType.cutout(), Sheets.cutoutBlockSheet());
    }
}