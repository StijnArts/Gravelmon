package drai.dev.gravelmon.registries;

import dev.architectury.registry.registries.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;

import static drai.dev.gravelmon.Gravelmon.MOD_ID;

public class GravelmonItemTags {

    public static final TagKey<Item> MEGA_STONES = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("mega_showdown", "mega_stones"));

}
