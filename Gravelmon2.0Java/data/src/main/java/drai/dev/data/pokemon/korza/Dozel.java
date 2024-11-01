package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dozel extends drai.dev.data.pokemon.Pokemon {
    public Dozel() {
        super("Dozel",
                Type.WATER,
                new Stats(60,
                        40,
                        75,
                        50,
                        65,
                        10),
                List.of(Ability.SHELL_ARMOR,Ability.HYDRATION), Ability.DREAMER,
                3, 77,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Dozel are commonly found in creekbeds. They latch onto each other as they sleep to form a full shell and protect each other from predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SNORE,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dozel");

    }


}
