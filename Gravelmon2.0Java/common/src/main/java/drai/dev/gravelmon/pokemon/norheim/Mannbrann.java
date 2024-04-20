package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mannbrann extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mannbrann() {
        super("Mannbrann",
                Type.FIRE, Type.PSYCHIC,
                new Stats(60,
                        96,
                        75,
                        90,
                        78,
                        80),
                List.of(Ability.SYNCHRONIZE,Ability.CLEAR_BODY,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                11, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mannbrann viciously lashes onto its prey with its four tentacles, giving off a burning sensation. Some may adapt to become immune to water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEDITATE,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,24),
                        new MoveLearnSetEntry(Move.FIRE_LASH,30),
                        new MoveLearnSetEntry(Move.BARRIER,36),
                        new MoveLearnSetEntry(Move.SCALD,42),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,50),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,56),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,60),
                        new MoveLearnSetEntry(Move.PSYSHOCK,68),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 13, 33, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
