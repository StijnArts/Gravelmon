package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pelasquall extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pelasquall() {
        super("Pelasquall",
                Type.WATER,Type.FLYING,
                new Stats(87,
                        95,
                        75,
                        108,
                        90,
                        80),
                List.of(Ability.TORRENT,Ability.BIG_PECKS,Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Experts of strong winds and raging waves. This rare species of flying Pokemon has been seen rescuing both people and Pokemon lost at sea. Only the most skillful Pelasquall can channel lighting strikes through its long head feather; and resist the power of dark clouds."),
                List.of()
                ,List.of(            new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,42)            ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 34, 56, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
