package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sprocko extends drai.dev.data.pokemon.Pokemon {
    public Sprocko() {
        super("Sprocko",
                Type.GRASS,
                new Stats(25,
                        20,
                        40,
                        40,
                        20,
                        50),
                List.of(Ability.MULTISCALE), Ability.MULTISCALE,
                4, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("It carries seeds in its mouth whenever it finds them. When confronted by enemies, it will spit them all at once in a powerful burst."),
                List.of(new EvolutionEntry("scalivid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BULLET_SEED,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,16),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,19),
                        new MoveLearnSetEntry(Move.NATURE_POWER,24),
                        new MoveLearnSetEntry(Move.ENDEAVOR,31),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,35),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_WINTER, Biome.IS_AUTUMN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Sprocko");

    }


}
