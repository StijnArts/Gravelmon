package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Venotrap extends drai.dev.data.pokemon.Pokemon {
    public Venotrap() {
        super("Snaptrap",
                Type.GRASS,
                new Stats(50,
                        85,
                        40,
                        85,
                        40,
                        35),
                List.of(Ability.TANGLING_HAIR), Ability.ARENA_TRAP,
                5, 104,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Snaptrap hang from trees to disguise themselves as hanging plants. When it's prey passes by, it quickly snaps them up and tangles them in it's vines."),
                List.of(new EvolutionEntry("faupent", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Snaptrap");

    }


}
