package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Weathermach extends drai.dev.gravelmon.pokemon.Pokemon {
    public Weathermach() {
        super("Weathermach",
                Type.FLYING,
                new Stats(78,
                        65,
                        78,
                        97,
                        111,
                        76),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Weathermach live in the upper atmosphere, dropping to lower altitudes to feed. They can release pulses of energy that govern the local weather."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.CYCLONE,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.WINDBLOW,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1)               ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

        setLangFileName("Weathermach");

    }


}
