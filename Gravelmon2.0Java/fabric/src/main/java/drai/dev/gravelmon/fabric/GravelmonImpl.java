package drai.dev.gravelmon.fabric;

import com.cobblemon.yajatkaul.mega_showdown.item.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import net.fabricmc.fabric.api.event.lifecycle.v1.*;
import net.fabricmc.fabric.impl.content.registry.*;
import net.fabricmc.loader.api.*;
import net.minecraft.resources.*;
import net.minecraft.server.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;

import java.util.*;
import java.util.function.*;

import static drai.dev.gravelmon.Gravelmon.MOD_ID;
import static drai.dev.gravelmon.fabric.CreativeTabsInit.initCreativeTabs;

public class GravelmonImpl {
    public static void platformInit() {
//        boolean isNotDataGen = System.getProperty("fabric-api.datagen") == null;
//        Gravelmon.init(isNotDataGen);
        GravelmonFeatures.registerFeatures();
        initCreativeTabs();
        var orangeApp = GravelmonItems.ORANGE_APRICORN.get();
        CompostingChanceRegistryImpl.INSTANCE.add(orangeApp, .65f);
        CompostingChanceRegistryImpl.INSTANCE.add(GravelmonItems.PURPLE_APRICORN.get(), .65f);
        GravelmonItems.POKE_BALLS.stream().map(Supplier::get).forEach(pokeBallItem -> {
            var gravelmonPokeball = (GravelmonPokeBall) pokeBallItem.getPokeBall();
            gravelmonPokeball.registerItem();
        });

        registerMegaStoneRecipes();
    }

    private static void registerMegaStoneRecipes() {
        if (!FabricLoader.getInstance().isModLoaded("mega_showdown")) return;
        ServerLifecycleEvents.SERVER_STARTED.register(GravelmonImpl::addMegaStoneRecipes);
        ServerLifecycleEvents.END_DATA_PACK_RELOAD.register((server, serverResourceManager, success) -> {
            addMegaStoneRecipes(server);
        });

    }

    private static void addMegaStoneRecipes(MinecraftServer server) {
        RecipeManager recipeManager = server.getRecipeManager();

        var newRecipes = new ArrayList<>(recipeManager.getRecipes());
        Ingredient input = Ingredient.of(MegaStones.MEGA_STONE);
        GravelmonMegas.getLegalMegaStones().forEach((entry) -> {
            var stringStringPair = entry.getValue();
            var item = entry.getKey();
            var aspect = stringStringPair.component2();
            var fullSpeciesName = stringStringPair.component1();
            ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(MOD_ID, "stonecutter_megastone_" + aspect + "_" + GravelmonUtils.getCleanName(fullSpeciesName));
            ItemStack output = new ItemStack(item.get(), 1);
            StonecutterRecipe recipe = new StonecutterRecipe(
                    recipeId.toString(),
                    input,
                    output
            );
            RecipeHolder<?> holder = new RecipeHolder<>(recipeId, recipe);
            newRecipes.add(holder);
        });
        recipeManager.replaceRecipes(newRecipes);
    }
}
