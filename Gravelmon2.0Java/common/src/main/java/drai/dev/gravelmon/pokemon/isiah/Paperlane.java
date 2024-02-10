package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Paperlane extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paperlane() {
        super("Paperlane",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        80,
                        30,
                        45,
                        40,
                        95),
                List.of(Ability.HYPER_CUTTER), Ability.STEADFAST,
                6, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                119, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("himegami", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))
                ),
                List.of(           new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,5),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.CUT,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,20),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,25),
                        new MoveLearnSetEntry(Move.DETECT,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.SYNTHESIS,40),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,45),
                        new MoveLearnSetEntry(Move.DEFOG,50),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,55),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,60),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,65),
                        new MoveLearnSetEntry(Move.GUILLOTINE,70)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paperlane");

    }


}
