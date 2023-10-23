package drai.dev.gravelmon.fabric.datagen;

import drai.dev.gravelmon.*;
import net.fabricmc.fabric.api.datagen.v1.*;

public class ModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelGenerator::new);
        pack.addProvider(ModBlockLootTables::new);
        pack.addProvider(ModItemTagGenerator::new);
        pack.addProvider(ModBlockTagGenerator::new);
        pack.addProvider(ModRecipeProvider::new);


    }
}
