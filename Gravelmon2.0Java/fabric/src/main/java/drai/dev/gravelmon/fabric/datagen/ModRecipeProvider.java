package drai.dev.gravelmon.fabric.datagen;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;

import java.util.function.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.SOLID_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.SOLID_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.SOLID_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.SOLID_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.SOLID_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.SOLID_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.SOLID_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.AIR_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.AIR_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.AIR_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.AIR_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.AIR_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.AIR_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.AIR_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.MYSTIC_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.MYSTIC_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.MYSTIC_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.MYSTIC_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.MYSTIC_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.MYSTIC_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.MYSTIC_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.ASTRAL_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.ASTRAL_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GravelmonBlocks.ASTRAL_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.ASTRAL_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.ASTRAL_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.ASTRAL_STONE.get())+"_smelting_from_"+
                                GravelmonBlocks.ASTRAL_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.SOLID_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.SOLID_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.SOLID_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.SOLID_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.SOLID_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.SOLID_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.SOLID_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.AIR_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.AIR_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.AIR_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.AIR_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.AIR_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.AIR_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.AIR_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.MYSTIC_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.MYSTIC_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.MYSTIC_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.MYSTIC_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.MYSTIC_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.MYSTIC_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.MYSTIC_STONE_ORE.get().getDescriptionId());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.ASTRAL_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.ASTRAL_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get().getDescriptionId());
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(GravelmonBlocks.ASTRAL_STONE_ORE.get()),
                        RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.1f,200)
                .unlockedBy(RecipeProvider.getHasName(GravelmonBlocks.ASTRAL_STONE_ORE.get()),
                        RecipeProvider.has(GravelmonItems.ASTRAL_STONE.get())).save(exporter,
                        RecipeProvider.getItemName(GravelmonItems.ASTRAL_STONE.get())+"_blasting_from_"+
                                GravelmonBlocks.ASTRAL_STONE_ORE.get().getDescriptionId());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravelmonItems.VARIA_STONE.get(),9)
                .requires(GravelmonItems.AIR_STONE.get())
                .requires(CobblemonItems.FIRE_STONE)
                .requires(CobblemonItems.THUNDER_STONE)
                .requires(CobblemonItems.WATER_STONE)
                .requires(CobblemonItems.LEAF_STONE)
                .requires(CobblemonItems.ICE_STONE)
                .requires(CobblemonItems.DUSK_STONE)
                .requires(CobblemonItems.DAWN_STONE)
                .requires(GravelmonItems.ASTRAL_STONE.get())
                .unlockedBy("hasEvolutionStone", has(CobblemonItemTags.EVOLUTION_STONES))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravelmonItems.XENOVERSAL_RING.get(),1)
                .pattern("WPW")
                .pattern("P P")
                .pattern("WPW")
                .define('W', Items.TERRACOTTA).define('P', Items.PURPUR_BLOCK)
                .unlockedBy("hasChorusFruit", has(Items.CHORUS_FRUIT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravelmonItems.TERRESTRIAL_RING.get(),1)
                .pattern("WPW")
                .pattern("PDP")
                .pattern("WPW")
                .define('W', Items.RED_WOOL).define('D', Items.DEEPSLATE).define('P', Items.COPPER_INGOT)
                .unlockedBy("hasDeepslate", has(Items.DEEPSLATE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravelmonItems.INDUCTIVE_RING.get(),1)
                .pattern("SCS")
                .pattern("W W")
                .pattern("WWW")
                .define('W', Items.IRON_INGOT).define('S', Items.SCULK).define('C', Items.AMETHYST_SHARD)
                .unlockedBy("hasSculk", has(Items.SCULK))
                .save(exporter);
    }
}
