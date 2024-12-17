package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chichaw extends drai.dev.data.pokemon.Pokemon {
    public Chichaw() {
        super("Chichaw",
                Type.GROUND,
                new Stats(55,
                        75,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.SAND_FORCE,Ability.STRONG_JAW), Ability.GLUTTONY,
                5, 130,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                74, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Chichaw show how they feel by how they bite you. Depending on if it bites gently or bites through flesh, it shows if it likes or dislikes you. Though even the gentle bites hurt."),
                List.of(new EvolutionEntry("Terrevour", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_SWAMP.getId() + ":" + Biome.IS_SWAMP.getName())))),
                List.of(             new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,6),
                        new MoveLearnSetEntry(Move.SAND_TOMB,9),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.TORMENT,18),
                        new MoveLearnSetEntry(Move.DIG,21),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.THRASH,39)          ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chichaw");

    }


}
