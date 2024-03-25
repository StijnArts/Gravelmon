package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ozzapi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ozzapi() {
        super("Ozzapi",
                Type.ELECTRIC,
                new Stats(45,
                        60,
                        32,
                        50,
                        33,
                        76),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 298,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ozzapi are found in Otopo's rugged, savannah-esque areas. They are extremely fast Pokemon, so can be hard to study. When spooked, it will send a quick jolt at its assailant using its ossicones."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.CHARGE,11),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,15),
                        new MoveLearnSetEntry(Move.STOMP,18),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,22),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,29),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,34),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,39),
                        new MoveLearnSetEntry(Move.DISCHARGE,44),
                        new MoveLearnSetEntry(Move.MEGA_KICK,49)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ozzapi");

    }


}
