package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pepprex extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pepprex() {
        super("Pepprex",
                Type.GRASS,Type.FIRE,
                new Stats(60,
                        60,
                        60,
                        130,
                        80,
                        70),
                List.of(Ability.CHLOROPHYLL), Ability.FLAME_BODY,
                8, 165,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("- Fire FangSTAB Fire - Tackle Normal - Growth Normal - Bullet SeedSTAB Grass - Natural Gift Normal - Synthesis Grass 5 Growth Normal 9 Bullet SeedSTAB Grass 14 Stun Spore Grass 18 Seed ShotSTAB Grass 23 Synthesis Grass 26 Magical LeafSTAB Grass 30 Flame BurstSTAB Fire 33 Crunch Dark 37 Swagger Normal 40 Seed BombSTAB Grass 44 Energy BallSTAB Grass 47 Spore Grass 51 Seed FlareSTAB Grass 55 Heat WaveSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SYNTHESIS,1),
                        new MoveLearnSetEntry(Move.GROWTH,5),
                        new MoveLearnSetEntry(Move.BULLET_SEED,9),
                        new MoveLearnSetEntry(Move.STUN_SPORE,14),
                        new MoveLearnSetEntry(Move.SEEDSHOT,18),
                        new MoveLearnSetEntry(Move.SYNTHESIS,23),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,26),
                        new MoveLearnSetEntry(Move.FLAME_BURST,30),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.SWAGGER,37),
                        new MoveLearnSetEntry(Move.SEED_BOMB,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,44),
                        new MoveLearnSetEntry(Move.SPORE,47),
                        new MoveLearnSetEntry(Move.SEED_FLARE,51),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,55),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
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
           setLangFileName("Pepprex");

    }


}
