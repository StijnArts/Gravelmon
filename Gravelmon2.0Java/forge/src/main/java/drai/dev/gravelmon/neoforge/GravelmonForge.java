package drai.dev.gravelmon.neoforge;

import drai.dev.gravelmon.*;
import net.minecraft.client.renderer.*;
import net.minecraft.resources.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.client.event.*;

@Mod(Gravelmon.MOD_ID)
public class GravelmonForge {
    public static boolean POKEBALL_INIT = false;
    public GravelmonForge() {
//        Gravelmon.init(true);
//
//        CobblemonEvents.THROWN_POKEBALL_HIT.subscribe(Priority.HIGHEST, thrownPokeballHitEvent -> {
//           if(!POKEBALL_INIT){
//               GravelmonItems.POKE_BALLS.stream().map(Supplier::get).forEach(pokeBallItem -> {
//                   var gravelmonPokeball= (GravelmonPokeBall)pokeBallItem.getPokeBall();
//                   gravelmonPokeball.registerItem();
//               });
//               POKEBALL_INIT = true;
//           }
//            return Unit.INSTANCE;
//        });
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