package drai.dev.gravelmon.registries;

import dev.architectury.registry.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import net.minecraft.core.registries.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;

public class GravelmonMegaStonesTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Gravelmon.MOD_ID, Registries.CREATIVE_MODE_TAB);
//    public static final ResourceKey<CreativeModeTab> GRAVELMON_MEGA_STONES_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Gravelmon.MOD_ID, "gravelmon_mega_stones_tab"));
    public static final RegistrySupplier<CreativeModeTab> GRAVELMON_MEGA_STONES_TAB = TABS.register(
            "gravelmon_mega_stones_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("itemGroup.gravelmon.gravelmon_mega_stones_tab"), // Tab Name
                    () -> new ItemStack(GravelmonMegas.MEGA_STONE_SUPPLIERS_IDS.keySet().stream().findFirst().get().get()) // Icon
            )
    );

    public static void touch() {
    }
}
