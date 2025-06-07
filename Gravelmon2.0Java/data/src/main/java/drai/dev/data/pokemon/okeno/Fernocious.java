package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fernocious extends drai.dev.data.pokemon.Pokemon {
    public Fernocious() {
        super("Fernocious",
                Type.GRASS, Type.POISON,
                new Stats(65,
                        120,
                        84,
                        70,
                        65,
                        99),
                List.of(Ability.LEAF_GUARD,Ability.STENCH,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("http://thumbs.dreamstime.com/z/cycad-seeds-261310.jpg ---- http://www.chinadaily.com.cn/world/att/site1/20060814/xin_580803141952451585516.jpg"),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Fernocious");

    }


}
