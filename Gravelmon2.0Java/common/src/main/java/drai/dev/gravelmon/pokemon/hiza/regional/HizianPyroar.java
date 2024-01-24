package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianPyroar extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianPyroar() {
        super("Pyroar",
                Type.GHOST,Type.FLYING,
                new Stats(76,
                        119,
                        72,
                        68,
                        66,
                        106),
                List.of(Ability.WIND_RIDER), Ability.WIND_RIDER,
                8, 165,
                new Stats(0,0,0,2,0,0), 65,
                0.125,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They hunt their prey accompained by strong wind currents, their swift movement alongside the wind allows it to become partially invisible."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.WORK_UP,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,11),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,15),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,18),
                        new MoveLearnSetEntry(Move.WHIRLWIND,20),
                        new MoveLearnSetEntry(Move.TWISTER,23),
                        new MoveLearnSetEntry(Move.SPITE,28),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,33),
                        new MoveLearnSetEntry(Move.TAILWIND,35),
                        new MoveLearnSetEntry(Move.CRUNCH,41),
                        new MoveLearnSetEntry(Move.LAST_RESORT,46),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,50),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,57)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyroar");

    }


}
