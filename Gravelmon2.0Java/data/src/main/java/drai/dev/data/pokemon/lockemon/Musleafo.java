package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Musleafo extends Pokemon {
    public Musleafo() {
        super("Musleafo",
                Type.GRASS, Type.BUG,
                new Stats(50,
                        40,
                        40,
                        40,
                        30,
                        50),
                List.of(Ability.HONEY_GATHER), Ability.HONEY_GATHER,
                6, 35,
                new Stats(2,0,0,0,0,0), 220,
                0.5,
                114, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.GRASS),
                List.of("Musleafo are most common in the spring and summer, always on the hunt for more and more sweet nectar. They like to hunt together, although loners are not unheard of."),
                List.of(new EvolutionEntry("eecroach", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,8),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.LEECH_SEED,22),
                        new MoveLearnSetEntry(Move.ENDURE,29),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.AIR_SLASH,43),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
