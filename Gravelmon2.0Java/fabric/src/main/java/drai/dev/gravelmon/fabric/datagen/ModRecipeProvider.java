package drai.dev.gravelmon.fabric.datagen;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.*;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravelmonItems.XENOLITH.get(),1)
                        .requires(CobblemonItemTags.EVOLUTION_STONES)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                                .requires(Items.CHORUS_FRUIT)
                .unlockedBy("hasChorusFruit", has(Items.CHORUS_FRUIT))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravelmonItems.MURKY_CLAW.get(),1)
                        .requires(CobblemonItems.RAZOR_CLAW)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                                .requires(Items.BLACK_DYE)
                .unlockedBy("hasRAZORCLAW", has(CobblemonItems.RAZOR_CLAW))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.SILVER_SCALE.get(),1)
                        .requires(CobblemonItems.DRAGON_SCALE)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                                .requires(Items.IRON_NUGGET)
                .unlockedBy("hasDRAGONSCALE", has(CobblemonItems.DRAGON_SCALE))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.ANCIENT_GLYPH.get(),1)
                        .requires(CobblemonItems.SPELL_TAG)
                                .requires(Items.NETHERITE_SCRAP)
                                .requires(Items.NETHERITE_SCRAP)
                                .requires(Items.NETHERITE_SCRAP)
                                .requires(Items.NETHERITE_SCRAP)
                                .requires(Items.SANDSTONE)
                                .requires(Items.SANDSTONE)
                                .requires(Items.SANDSTONE)
                                .requires(Items.SANDSTONE)
                .unlockedBy("hasSPELLTAG", has(CobblemonItems.SPELL_TAG))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.QUANTUM_UPGRADE.get(),1)
                .pattern("TLT")
                .pattern("SAS")
                .define('T', Items.BLUE_STAINED_GLASS)
                .define('A', Items.AMETHYST_SHARD)
                .define('S', Items.CHORUS_FRUIT)
                .define('L', Items.END_ROD)
                .unlockedBy("hasAmethystShard", has(Items.AMETHYST_SHARD))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.KALEIDOSCOPE.get(),1)
                .pattern("  T")
                .pattern("IAI")
                .pattern("T  ")
                .define('T', Items.TINTED_GLASS)
                .define('A', Items.AMETHYST_SHARD)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("hasAmethystShard", has(Items.AMETHYST_SHARD))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.CORRUPTED_DISC.get(),1)
                .pattern("AAA")
                .pattern("ATA")
                .pattern("AAA")
                .define('T', ItemTags.MUSIC_DISCS)
                .define('A', Items.SCULK)
                .unlockedBy("hasSculk", has(Items.SCULK))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.WES_UPDATE.get(),1)
                .requires(Items.AMETHYST_SHARD)
                .requires(CobblemonItems.UPGRADE)
                .unlockedBy("hasAmethystShard", has(Items.AMETHYST_SHARD))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.DREAD_PENDANT.get(),1)
                .pattern("SSS")
                .pattern("W S")
                .pattern("EW ")
                .define('W', ItemTags.PLANKS)
                .define('E', Items.ENDER_PEARL)
                .define('S', Items.STRING)
                .unlockedBy("hasEnderPearl", has(Items.ENDER_PEARL))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.SPARE_PARTS.get(),1)
                .pattern("IBI")
                .pattern("NIN")
                .pattern(" I ")
                .define('B', Items.IRON_BLOCK)
                .define('I', Items.IRON_INGOT)
                .define('N', Items.IRON_NUGGET)
                .unlockedBy("hasIronIngot", has(Items.IRON_INGOT))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.MAGIC_COOKIE.get(),1)
                .requires(Items.NETHER_STAR)
                .requires(Items.COOKIE)
                .unlockedBy("hasNetherStar", has(Items.NETHER_STAR))
                .save(exporter);

        //Pokeball recipes are json only

        //Held items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.XENOVERSAL_RING.get(),1)
                .pattern("WPW")
                .pattern("P P")
                .pattern("WPW")
                .define('W', Items.TERRACOTTA).define('P', Items.PURPUR_BLOCK)
                .unlockedBy("hasChorusFruit", has(Items.CHORUS_FRUIT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.TERRESTRIAL_RING.get(),1)
                .pattern("WPW")
                .pattern("PDP")
                .pattern("WPW")
                .define('W', Items.RED_WOOL).define('D', Items.DEEPSLATE).define('P', Items.COPPER_INGOT)
                .unlockedBy("hasDeepslate", has(Items.DEEPSLATE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.INDUCTIVE_RING.get(),1)
                .pattern("SCS")
                .pattern("W W")
                .pattern("WWW")
                .define('W', Items.IRON_INGOT).define('S', Items.SCULK).define('C', Items.AMETHYST_SHARD)
                .unlockedBy("hasSculk", has(Items.SCULK))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.GOLDEN_FEATHER.get(),1)
                .pattern("GGG")
                .pattern("GFG")
                .pattern("GGG")
                .define('G', Items.GOLD_NUGGET)
                .define('F', Items.FEATHER)
                .unlockedBy("hasFeather", has(Items.FEATHER))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.PIXIE_DUST.get(),1)
                .requires(GravelmonItems.MYSTIC_STONE.get())
                .unlockedBy("hasMYSTICSTONE", has(GravelmonItems.MYSTIC_STONE.get()))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.OCARINA.get(),1)
                .pattern("SNS")
                .pattern("  S")
                .define('N', Items.NOTE_BLOCK)
                .define('W', Items.STICK)
                .unlockedBy("hasNOTEBLOCK", has(Items.NOTE_BLOCK))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.ROYAL_JELLY.get(),1)
                .requires(Items.HONEY_BOTTLE)
                .requires(Items.GOLD_NUGGET)
                .requires(Items.GOLD_NUGGET)
                .requires(Items.GOLD_NUGGET)
                .requires(Items.GOLD_NUGGET)
                .unlockedBy("hasHoneyBottle", has(Items.HONEY_BOTTLE))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.COCONUT_MILK.get(),1)
                .pattern("JMJ")
                .pattern(" J")
                .define('M', Items.MILK_BUCKET)
                .define('J', Items.JUNGLE_WOOD)
                .unlockedBy("hasMILKBUCKET", has(Items.MILK_BUCKET))
                .save(exporter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                        GravelmonItems.CARROT_WINE.get(),1)
                .requires(Items.CARROT)
                .requires(Items.BARREL)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("hasCARROT", has(Items.CARROT))
                .save(exporter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                        GravelmonItems.URANIUM_CORE.get(),1)
                .pattern("RIR")
                .pattern("IBI")
                .pattern("WIW")
                .define('I', Items.IRON_BLOCK)
                .define('B', Items.NETHER_STAR)
                .define('R', Items.REDSTONE)
                .define('C', Items.WATER_BUCKET)
                .unlockedBy("hasNETHER_STAR", has(Items.NETHER_STAR))
                .save(exporter);

        

    }
}
