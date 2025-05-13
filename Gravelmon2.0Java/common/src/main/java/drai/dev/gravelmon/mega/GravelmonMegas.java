package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.pokemon.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import net.minecraft.world.item.*;
import org.apache.commons.lang3.*;

import java.util.*;
import java.util.function.*;


public class GravelmonMegas {

    public static Map<String, List<MegaEvolution>> MEGA_EVOLUTIONS = new HashMap<>();
    public static final Map<Item, String> MEGA_STONE_IDS = new HashMap();
    public static final Map<Supplier<Item>, String> MEGA_STONE_SUPPLIERS_IDS = new HashMap();
    public static final Map<String, List<Supplier<Item>>> MEGA_STONES_PER_POKEMON = new HashMap();

    static {
        MegaRegistry.register();
    }
    
    public static void init(boolean checkForLabels) {
        MEGA_EVOLUTIONS.forEach((pokemonId, megaIdList) -> {
            var megaStoneName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            megaIdList.forEach(mega -> {
                var aspects = new HashSet<String>();
                aspects.add(mega.getMegaName().toLowerCase());
                if (mega.getAspect() != null) aspects.add(mega.getAspect().getName());

                var aspect = mega.getMegaAspect();
                var pokemonIdForSpecies = pokemonId+" " + aspect;

                var item = GravelmonItems.megaItem(mega.getMegaStoneName(megaStoneName));

                MEGA_STONE_SUPPLIERS_IDS.put(item, pokemonIdForSpecies);
                MEGA_STONES_PER_POKEMON.computeIfAbsent(pokemonId, k -> new ArrayList<>()).add(item);
            });
        });

        if (MEGA_STONE_IDS.isEmpty()) return;
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
