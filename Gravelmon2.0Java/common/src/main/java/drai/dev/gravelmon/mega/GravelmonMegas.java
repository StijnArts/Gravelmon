package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.pokemon.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import net.minecraft.world.item.*;

import java.util.*;
import java.util.function.*;

import static drai.dev.data.pokemon.AbstractPokemon.MEGA_EVOLUTIONS;

public class GravelmonMegas {
    public static final Map<Supplier<Item>, String> MEGA_STONE_IDS = new HashMap();
    public static final Map<String, List<Supplier<Item>>> MEGA_STONES_PER_POKEMON = new HashMap();

    public static void init() {
        MegaRegistry.register();
        MEGA_EVOLUTIONS.forEach((pokemonId, megaIdList) -> {
            var megaStoneName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            megaIdList.forEach(mega -> {
                var megaPokemon = PokemonSpecies.INSTANCE.getByName(pokemonId);
                if (megaPokemon == null) return;
                var aspects = new HashSet<String>();
                aspects.add(mega.getMegaName().toLowerCase());
                if (mega.getAspect() != null) aspects.add(mega.getAspect().getName());
                if (SpeciesManager.containsBannedLabels(pokemonId, String.join(" ", aspects))) return;

                var aspect = mega.getAspect();
                var pokemonIdForSpecies = pokemonId;
                if (aspect != null) {
                    pokemonIdForSpecies += " " + aspect.getName();
                }

                var item = GravelmonItems.item(mega.getMegaStoneName(megaStoneName));
                MEGA_STONE_IDS.put(item, pokemonIdForSpecies);
                MEGA_STONES_PER_POKEMON.computeIfAbsent(pokemonId, k -> new ArrayList<>()).add(item);
            });
        });

        if (MEGA_STONE_IDS.isEmpty()) return;
        GravelmonMegaStonesTab.touch();
        GravelmonMegaStonesTab.TABS.register();
    }
}
