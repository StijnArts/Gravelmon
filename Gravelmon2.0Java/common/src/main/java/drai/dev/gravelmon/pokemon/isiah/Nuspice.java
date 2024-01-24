package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nuspice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nuspice() {
        super("Nuspice",
                Type.GRASS,
                new Stats(60,
                        40,
                        60,
                        40,
                        60,
                        35),
                List.of(Ability.CHLOROPHYLL), Ability.FLAME_BODY,
                8, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                59, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("- Tackle Normal 5 Growth Normal 9 Bullet SeedSTAB Grass 13 Stun Spore Grass 17 Seed ShotSTAB Grass 21 Magical LeafSTAB Grass 25 Natural Gift Normal 29 Synthesis Grass 33 Seed BombSTAB Grass 37 Energy BallSTAB Grass 41 Spore Grass 45 Seed FlareSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWTH,5),
                        new MoveLearnSetEntry(Move.BULLET_SEED,9),
                        new MoveLearnSetEntry(Move.STUN_SPORE,13),
                        new MoveLearnSetEntry(Move.SEEDSHOT,17),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,21),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,25),
                        new MoveLearnSetEntry(Move.SYNTHESIS,29),
                        new MoveLearnSetEntry(Move.SEED_BOMB,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.SPORE,41),
                        new MoveLearnSetEntry(Move.SEED_FLARE,45),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nuspice");

    }


}
