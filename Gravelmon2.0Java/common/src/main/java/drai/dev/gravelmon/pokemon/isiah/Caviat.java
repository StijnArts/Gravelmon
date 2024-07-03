package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Caviat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caviat() {
        super("Caviat",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("rodat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.TAUNT,13),
                        new MoveLearnSetEntry(Move.CRUNCH,16),
                        new MoveLearnSetEntry(Move.TICKLE,18),
                        new MoveLearnSetEntry(Move.HYPER_FANG,21),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,26),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,28),
                        new MoveLearnSetEntry(Move.SWAGGER,31),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caviat");

    }


}
