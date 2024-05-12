package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Peladra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Peladra() {
        super("Peladra",
                Type.WATER, Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("Peladra are extremely elusive. The pearl it sits on not only provides it with additional longevity but is greatly sought after by poachers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,3),
                        new MoveLearnSetEntry(Move.WATER_PULSE,5),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.BRINE,9),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,11),
                        new MoveLearnSetEntry(Move.AQUA_RING,13),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,15),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,17),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,19),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,21),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,23),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,25),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,27),
                        new MoveLearnSetEntry(Move.OUTRAGE,29),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,31),
                        new MoveLearnSetEntry(Move.SURF,33),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,35),
                        new MoveLearnSetEntry(Move.AQUA_JET,37),
                        new MoveLearnSetEntry(Move.WATERFALL,39)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Peladra");

    }


}
