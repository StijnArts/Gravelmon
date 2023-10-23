package drai.dev.gravelmon.forge.datagen;

import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.data.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Gravelmon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GravelmonItems.VARIA_STONE);
        simpleItem(GravelmonItems.ASTRAL_STONE);
        simpleItem(GravelmonItems.AIR_STONE);
        simpleItem(GravelmonItems.MYSTIC_STONE);
        simpleItem(GravelmonItems.SOLID_STONE);
        simpleItem(GravelmonItems.QUANTUM_UPGRADE);
        simpleItem(GravelmonItems.KALEIDOSCOPE);
        simpleItem(GravelmonItems.CORRUPTED_DISC);
        simpleItem(GravelmonItems.WES_UPDATE);
        simpleItem(GravelmonItems.MURKY_CLAW);
        simpleItem(GravelmonItems.SILVER_SCALE);
        simpleItem(GravelmonItems.ANCIENT_GLYPH);
        simpleItem(GravelmonItems.VOIDIX);
        simpleItem(GravelmonItems.ELECTRIX);
        simpleItem(GravelmonItems.BURIX);
        simpleItem(GravelmonItems.AQUIX);
        simpleItem(GravelmonItems.VERDIX);
        simpleItem(GravelmonItems.ZERIX);
        simpleItem(GravelmonItems.PATHIX);
        simpleItem(GravelmonItems.PIXIX);
        simpleItem(GravelmonItems.LONG_CLUB);
        simpleItem(GravelmonItems.TERRESTRIAL_RING);
        simpleItem(GravelmonItems.XENOVERSAL_RING);
        simpleItem(GravelmonItems.TUSK_FOSSIL);
        simpleItem(GravelmonItems.HORN_FOSSIL);
    }

    private ItemModelBuilder simpleItem(RegistrySupplier<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Gravelmon.MOD_ID,"item/" + item.getId().getPath()));
    }
}
