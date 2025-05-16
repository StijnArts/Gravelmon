package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.pokemon.*;
import com.cobblemon.mod.common.pokemon.helditem.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import drai.dev.gravelsextendedbattles.showdown.*;
import kotlin.*;
import net.minecraft.core.registries.*;
import net.minecraft.world.item.*;
import org.apache.commons.lang3.*;

import java.util.*;
import java.util.function.*;


public class GravelmonMegas {

    public static Map<String, List<MegaEvolution>> MEGA_EVOLUTIONS = new HashMap<>();
    public static final Map<Item, Pair<String, String>> MEGA_STONE_IDS = new HashMap();
    public static final Map<Supplier<Item>, Pair<String, String>> MEGA_STONE_SUPPLIERS_IDS = new HashMap();
    public static final Map<String, List<Supplier<Item>>> MEGA_STONES_PER_POKEMON = new HashMap();

    static {
        MegaRegistry.register();
    }
    
    public static void init() {
        var itemModifications = new ArrayList<ItemModificationEntry>();
        var usedNames = new HashSet<String>();
        MEGA_EVOLUTIONS.forEach((pokemonId, megaIdList) -> {
            var megaStoneName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            megaIdList.forEach(mega -> {
                var aspect = mega.getMegaAspect();

                String accurateStoneName = mega.getMegaStoneName(megaStoneName);
                if(usedNames.contains(accurateStoneName)) return;
                var item = GravelmonItems.megaItem(accurateStoneName);
                String userSpeciesName = pokemonId + (mega.getAspect() != null ? " " + mega.getAspect().getName() : "");

                MEGA_STONE_SUPPLIERS_IDS.put(item, new Pair(userSpeciesName, aspect));
                MEGA_STONES_PER_POKEMON.computeIfAbsent(pokemonId, k -> new ArrayList<>()).add(item);
                usedNames.add(accurateStoneName);
                CobblemonHeldItemManager.INSTANCE.registerStackRemap(stack -> {
                    if(MEGA_STONE_IDS.containsKey(stack.getItem())) {
                        return BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath().toLowerCase().replaceAll("_","");
                    }
                    return null;
                });

                ItemModificationEntry itemModificationEntry = new ItemModificationEntry(
                        userSpeciesName,
                        accurateStoneName,
                        pokemonId + " " + aspect);
                itemModifications.add(
                        itemModificationEntry
                );
            });
        });

        ShowdownItemManager.MODIFY_ITEMS_EVENT.subscribe(Priority.NORMAL, showdownItemModificationEvent -> {
            showdownItemModificationEvent.itemModificationEntries.addAll(itemModifications);
            return Unit.INSTANCE;
        });

        if (MEGA_STONE_SUPPLIERS_IDS.isEmpty()) return;
        GravelmonMegaStonesTab.touch();
        GravelmonMegaStonesTab.TABS.register();
    }

    public static List<MegaEvolution> getMegas(String name, Set<String> aspects) {
        return MEGA_EVOLUTIONS.computeIfAbsent(name, k -> new ArrayList<>()).stream()
                .filter(megaEvolution -> aspects
                .stream().anyMatch(aspect->aspect.equalsIgnoreCase(megaEvolution.getAspect().getName()))).toList();
    }

    public static void lateInit() {
        MEGA_STONE_SUPPLIERS_IDS.forEach((itemSupplier, megaId) -> MEGA_STONE_IDS.put(itemSupplier.get(), megaId));
    }
}
