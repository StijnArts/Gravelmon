package drai.dev.gravelmon;

import com.cobblemon.yajatkaul.mega_showdown.utility.*;
import dev.architectury.injectables.annotations.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.world.item.*;

import java.util.*;
import java.util.function.*;

import static drai.dev.gravelmon.Gravelmon.MEGA_EVOLUTIONS;

public class GravelmonMegas {
    public static final Map<Supplier<Item>, String> MEGA_STONE_IDS = new HashMap();
    public static final Map<String, List<Supplier<Item>>> MEGA_STONES_PER_POKEMON = new HashMap();

    @ExpectPlatform
    public static void init(){
        MEGA_EVOLUTIONS.forEach((pokemonId, megaIdList)->{
            var megaStoneName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            megaIdList.forEach(megaAndAspect->{
                var megaId = megaAndAspect.getFirst();
                var megaStoneNameForId = megaStoneName;
                if(!megaId.equalsIgnoreCase("mega")){
                    var suffix = megaId.split("_");
                    megaStoneNameForId+="_"+suffix[1];
                }
                var aspect = megaAndAspect.getSecond();
                if(aspect.isPresent()){
                    megaStoneNameForId = aspect.get().name() + "_" + megaStoneNameForId;
                }
                var item = GravelmonItems.item(megaStoneNameForId);
                MEGA_STONE_IDS.put(item, megaStoneNameForId);
                MEGA_STONES_PER_POKEMON.computeIfAbsent(pokemonId, k->new ArrayList<>()).add(item);
            });
        });
    }
}
