package drai.dev.gravelmon.neoforge;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.yajatkaul.mega_showdown.item.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.resources.*;
import net.minecraft.server.*;
import net.minecraft.server.packs.resources.*;
import net.minecraft.util.profiling.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.*;
import net.neoforged.neoforge.common.*;
import net.neoforged.neoforge.event.*;
import net.neoforged.neoforge.event.server.*;
import net.neoforged.neoforge.server.*;

import java.util.*;
import java.util.function.*;

import static drai.dev.gravelmon.Gravelmon.MOD_ID;
import static drai.dev.gravelmon.neoforge.GravelmonForge.POKEBALL_INIT;

public class GravelmonImpl {
    public static void platformInit() {
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


        NeoForge.EVENT_BUS.addListener(GravelmonImpl::onServerStarted);
        NeoForge.EVENT_BUS.addListener(GravelmonImpl::registerMegaStoneRecipes);
    }

    private static MinecraftServer cachedServer;

    @SubscribeEvent
    public static void onServerStarted(ServerStartedEvent event) {
        cachedServer = event.getServer();
        addMegaStoneRecipes(cachedServer);
    }

    private static void registerMegaStoneRecipes(AddReloadListenerEvent event) {
        if (!ModList.get().isLoaded("mega_showdown")) return;

        event.addListener(new SimplePreparableReloadListener<Void>() {
            @Override
            protected Void prepare(ResourceManager arg, ProfilerFiller arg2) {
                return null;
            }

            @Override
            protected void apply(Void object, ResourceManager arg, ProfilerFiller arg2) {
                if(cachedServer == null) cachedServer = ServerLifecycleHooks.getCurrentServer();
                if(cachedServer == null) return;
                addMegaStoneRecipes(cachedServer);
            }
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
            ResourceLocation recipeId = ResourceLocation.fromNamespaceAndPath(MOD_ID, "stonecutter_megastone_" + aspect + "_" + GravelmonUtils.getCleanName(fullSpeciesName));;
            if(newRecipes.stream().anyMatch(holder->holder.id().equals(recipeId))){
                ItemStack output = new ItemStack(item.get(), 1);
                StonecutterRecipe recipe = new StonecutterRecipe(
                        recipeId.toString(),
                        input,
                        output
                );
                RecipeHolder<?> holder = new RecipeHolder<>(recipeId, recipe);
                newRecipes.add(holder);
            }

        });
        recipeManager.replaceRecipes(newRecipes);
    }
}
