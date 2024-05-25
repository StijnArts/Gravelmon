package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Thermedary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thermedary() {
        super("Thermedary",
                Type.FIRE,
                new Stats(130,
                        60,
                        95,
                        60,
                        75,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("One of the most important species in southern Enriko. Travelers will use Camboil's hump to boil food in. It can even be used as a mobile hot spring."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SINGE,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,7),
                        new MoveLearnSetEntry(Move.MUD_SHOT,12),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,17),
                        new MoveLearnSetEntry(Move.STOMP,22),
                        new MoveLearnSetEntry(Move.MAGNITUDE,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,35),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,38),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,44),
                        new MoveLearnSetEntry(Move.LIFE_DEW,52),
                        new MoveLearnSetEntry(Move.BURN_UP,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 29, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thermedary");

    }


}
