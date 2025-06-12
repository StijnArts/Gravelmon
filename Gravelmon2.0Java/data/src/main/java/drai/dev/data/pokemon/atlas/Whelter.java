package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Whelter extends drai.dev.data.pokemon.Pokemon {
    public Whelter() {
        super("Whelter",
                Type.WATER,
                new Stats(110,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.THICK_FAT,Ability.HYDRATION,Ability.SIMPLE), Ability.SIMPLE,
                19, 165,
                new Stats(1,0,0,0,0,0), 125,
                0.5,
                80, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Instead of flippers, Whelter's fins are more similar to flotation devices, helping them stay afloat without expending energy. They move slowly, filtering water through their mouth to feed."),
                List.of(new EvolutionEntry("refhuge", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.YAWN,8),
                        new MoveLearnSetEntry(Move.ROLLOUT,12),
                        new MoveLearnSetEntry(Move.MIST,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,29),
                        new MoveLearnSetEntry(Move.SWALLOW,33),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,38),
                        new MoveLearnSetEntry(Move.HAZE,44),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
