package drai.dev.gravelmon.forge.datagen;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.data.*;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.*;
import net.minecraftforge.common.crafting.conditions.*;
import org.lwjgl.system.linux.*;

import java.util.*;
import java.util.function.*;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ASTRAL_SMELTABLES = List.of(GravelmonItems.ASTRAL_STONE.get(),
            GravelmonBlocks.ASTRAL_STONE_ORE.get(), GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get());
    private static final List<ItemLike> AIR_SMELTABLES = List.of(GravelmonItems.AIR_STONE.get(),
            GravelmonBlocks.AIR_STONE_ORE.get(), GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get());
    private static final List<ItemLike> MYSTIC_SMELTABLES = List.of(GravelmonItems.MYSTIC_STONE.get(),
            GravelmonBlocks.MYSTIC_STONE_ORE.get(), GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get());
    private static final List<ItemLike> SOLID_SMELTABLES = List.of(GravelmonItems.SOLID_STONE.get(),
            GravelmonBlocks.SOLID_STONE_ORE.get(), GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, ASTRAL_SMELTABLES, RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.25f, 200, "astral");
        oreBlasting(pWriter, ASTRAL_SMELTABLES, RecipeCategory.MISC, GravelmonItems.ASTRAL_STONE.get(), 0.25f, 100, "astral");

        oreSmelting(pWriter, AIR_SMELTABLES, RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.25f, 200, "air");
        oreBlasting(pWriter, AIR_SMELTABLES, RecipeCategory.MISC, GravelmonItems.AIR_STONE.get(), 0.25f, 100, "air");

        oreSmelting(pWriter, MYSTIC_SMELTABLES, RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.25f, 200, "mystic");
        oreBlasting(pWriter, MYSTIC_SMELTABLES, RecipeCategory.MISC, GravelmonItems.MYSTIC_STONE.get(), 0.25f, 100, "mystic");

        oreSmelting(pWriter, SOLID_SMELTABLES, RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.25f, 200, "solid");
        oreBlasting(pWriter, SOLID_SMELTABLES, RecipeCategory.MISC, GravelmonItems.SOLID_STONE.get(), 0.25f, 100, "solid");

        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, XGravityEvent.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);*/

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravelmonItems.VARIA_STONE.get(), 9)
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
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  Gravelmon.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}