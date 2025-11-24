package drai.dev.gravelmon.mega;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.pokemon.*;
import com.cobblemon.mod.common.pokemon.*;
import com.cobblemon.mod.common.pokemon.helditem.*;
import com.github.yajatkaul.mega_showdown.*;
import com.github.yajatkaul.mega_showdown.components.*;
import com.github.yajatkaul.mega_showdown.creative.*;
import com.github.yajatkaul.mega_showdown.gimmick.*;
import com.github.yajatkaul.mega_showdown.gimmick.codec.*;
import com.github.yajatkaul.mega_showdown.item.custom.mega.*;
import com.github.yajatkaul.mega_showdown.utils.*;
import dev.architectury.registry.registries.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import drai.dev.gravelsextendedbattles.showdown.*;
import kotlin.*;
import net.minecraft.core.registries.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;

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
        var keys = new ArrayList<>(MEGA_EVOLUTIONS.keySet().stream().sorted().toList());
        keys.forEach(pokemonId -> {
            var megaStoneName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            var megaIdList = MEGA_EVOLUTIONS.get(pokemonId);
            megaIdList.forEach(mega -> {
                var aspect = mega.getMegaAspect();
                var aspects = new HashSet<String>();
                aspects.add(aspect);
                if(pokemonId.contains(" ")) {
                    List<String> split = new ArrayList<>(List.of(pokemonId.split(" ")));
                    split.removeFirst();
                    aspects.addAll(split);
                }
//                var labels = SpeciesManager.getLabelsFromSpecies(pokemonId, aspects);
//                var isBanned = SpeciesManager.containsBannedLabels(labels);
//                if(isBanned) return;
                String accurateStoneName = mega.getMegaStoneName(megaStoneName);
                if(usedNames.contains(accurateStoneName)) return;
//                var megaGimmick = new MegaGimmick(accurateStoneName, pokemonId, aspect);
                var item = megaItem(accurateStoneName);
                String userSpeciesName = pokemonId + (mega.getAspect() != null ? " " + mega.getAspect().toLowerCase().replaceAll("_","") : "");

                MEGA_STONE_SUPPLIERS_IDS.put(item, new Pair<>(userSpeciesName, aspect));
                MEGA_STONES_PER_POKEMON.computeIfAbsent(pokemonId, k -> new ArrayList<>()).add(item);
                usedNames.add(accurateStoneName);

                ItemModificationEntry itemModificationEntry = new ItemModificationEntry(
                        pokemonId,
                        userSpeciesName,
                        accurateStoneName,
                        pokemonId + " " + aspect);
                itemModifications.add(
                        itemModificationEntry
                );
            });
        });

        CobblemonHeldItemManager.INSTANCE.registerStackRemap(stack -> {
            if(MEGA_STONE_IDS.containsKey(stack.getItem())) {
                var result = BuiltInRegistries.ITEM.getKey(stack.getItem()).getPath().toLowerCase().replaceAll("_","");
                return result;
            }
            return null;
        });

        ShowdownItemManager.MODIFY_ITEMS_EVENT.subscribe(Priority.NORMAL, showdownItemModificationEvent -> {
            showdownItemModificationEvent.itemModificationEntries.addAll(itemModifications);
            return Unit.INSTANCE;
        });
    }

    public static void lateInit() {
        MEGA_STONE_SUPPLIERS_IDS.forEach((itemSupplier, megaId) -> MEGA_STONE_IDS.put(itemSupplier.get(), megaId));
    }

    public static List<Map.Entry<Supplier<Item>, Pair<String, String>>> getLegalMegaStones(){
        return GravelmonMegas.MEGA_STONE_SUPPLIERS_IDS.entrySet().stream().filter((entry) -> {
            var stringStringPair = entry.getValue();
            var aspect = stringStringPair.component2();
            var fullSpeciesName = stringStringPair.component1();
            var speciesName = fullSpeciesName;
            var aspects = new HashSet<String>();
            if (fullSpeciesName.contains(" ")) {
                List<String> split = new ArrayList<>(List.of(fullSpeciesName.split(" ")));
                speciesName = split.get(0);
                split.removeFirst();
                aspects.addAll(split);
            }
            Species pokemon = PokemonSpecies.INSTANCE.getByName(speciesName);
            if(pokemon == null) return false;
            var form = pokemon.getForm(Set.of(aspect));
            if(form.getName().equalsIgnoreCase("normal")) return false;
            return true;
//            var labels = new ArrayList<>(SpeciesManager.getLabelsFromSpecies(speciesName, aspects));
//            labels.addAll(SpeciesManager.getLabelsFromSpecies(speciesName, Set.of(aspect)));
//            var isBanned = SpeciesManager.containsBannedLabels(labels);
//            return !isBanned;
        }).toList();
    }



    public static RegistrySupplier<Item> megaItem(String megaStoneName) {
        Supplier<Item> item = ()->new MegaStone(
                new Item.Properties()
                        .component(MegaShowdownDataComponents.REGISTRY_TYPE_COMPONENT.get(), RegistryLocator.MEGA)
                        .component(MegaShowdownDataComponents.RESOURCE_LOCATION_COMPONENT.get(), ResourceLocation.fromNamespaceAndPath(MegaShowdown.MOD_ID, megaStoneName))
                        .arch$tab(MegaShowdownTabs.MEGA_TAB)
        ) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
                list.add(Component.translatable("tooltip.gravelmon."+megaStoneName+".tooltip"));
                super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
            }
        };
        return GravelmonItems.ITEMS.register(megaStoneName, item);
    }

    public static MegaGimmick createMegaGimmick(String mega_stone_id, String pokemon, String aspect) {
        String mega_aspect = "mega_evolution=" + aspect;
        return new MegaGimmick(
                mega_stone_id,
                List.of(pokemon),
                new AspectSetCodec(
                        List.of(),
                        List.of(),
                        List.of(),
                        List.of(),
                        List.of(mega_aspect),
                        List.of("mega_evolution=none")
                )
        );
    }
}
