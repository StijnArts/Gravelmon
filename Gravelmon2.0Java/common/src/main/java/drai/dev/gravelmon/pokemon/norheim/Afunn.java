package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Afunn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Afunn() {
        super("Afunn",
                Type.FIRE, Type.ROCK,
                new Stats(65,
                        85,
                        90,
                        65,
                        75,
                        10),
                List.of(Ability.SOLID_ROCK), Ability.SOLID_ROCK,
                13, 165,
                new Stats(0,1,1,0,0,0), 50,
                0.0,
                78, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("volcunn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))),
                        new EvolutionEntry("Mountunn", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))),
                        new EvolutionEntry("Glacunn", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,6),
                        new MoveLearnSetEntry(Move.TAR_SHOT,12),
                        new MoveLearnSetEntry(Move.INCINERATE,18),
                        new MoveLearnSetEntry(Move.AMNESIA,24),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,36),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,42),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,48),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,54),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,60)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 34, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_FREEZING, Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Afunn");

    }


}
