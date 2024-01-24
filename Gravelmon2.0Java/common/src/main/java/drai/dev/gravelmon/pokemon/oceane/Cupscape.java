package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cupscape extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cupscape() {
        super("Cupscape",
                Type.FAIRY,Type.ROCK,
                new Stats(64,
                        34,
                        85,
                        45,
                        64,
                        13),
                List.of(Ability.BATTLE_ARMOR), Ability.DAZZLING,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Cupscapes are small, sparkling pieces of reef that are generally very docile and passive. They hardly move, and typically let other lifeforms take refuge on top of them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HAPPYSLAP,3),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,7),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.REFLECT,32),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,40),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,44),
                        new MoveLearnSetEntry(Move.EARTH_POWER,48),
                        new MoveLearnSetEntry(Move.POWER_GEM,51)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cupscape");

    }


}
