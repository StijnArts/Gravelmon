package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Trairoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trairoo() {
        super("Trairoo",
                Type.NORMAL, Type.FLYING,
                new Stats(150,
                        50,
                        65,
                        50,
                        70,
                        90),
                List.of(Ability.HEALER), Ability.REGENERATOR,
                12, 165,
                new Stats(2,0,0,0,0,0), 140,
                0.125,
                213, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("They are popular in daycares. Trainers will often leave eggs at the daycare for them to take care of the eggs and hatch it for them. It carries the eggs within its wings, which folds like a tray, and keep it like this until the eggs hatch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,6),
                        new MoveLearnSetEntry(Move.PECK,11),
                        new MoveLearnSetEntry(Move.ROOST,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,26),
                        new MoveLearnSetEntry(Move.REFRESH,31),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.EGG_BOMB,41),
                        new MoveLearnSetEntry(Move.HEAL_BELL,46),
                        new MoveLearnSetEntry(Move.REFLECT,51),
                        new MoveLearnSetEntry(Move.DRILL_PECK,56),
                        new MoveLearnSetEntry(Move.BATON_PASS,61),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,66)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 43, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Trairoo");

    }


}
