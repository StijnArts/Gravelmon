package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Metarock extends drai.dev.data.pokemon.Pokemon {
    public Metarock() {
        super("Metarock",
                Type.ROCK,
                new Stats(60,
                        88,
                        116,
                        44,
                        48,
                        44),
                List.of(Ability.STURDY,Ability.SAND_FORCE,Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                15, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Pressure and temperature have transformed Ignew's rock exterior into a thougher crust. Metarock is even capable of taking explosions without being damaged at all."),
                List.of(new EvolutionEntry("beherode", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,9),
                        new MoveLearnSetEntry(Move.ENDURE,14),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,18),
                        new MoveLearnSetEntry(Move.MAGNITUDE,23),
                        new MoveLearnSetEntry(Move.STRENGTH,27),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,34),
                        new MoveLearnSetEntry(Move.EARTH_POWER,37),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,41),
                        new MoveLearnSetEntry(Move.MOLTENDEFENSE,46),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"tm"),
                        new MoveLearnSetEntry(Move.SHARPEN,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC, Biome.IS_CAVE, Biome.IS_BADLANDS)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Metarock");

    }


}
