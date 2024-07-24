package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Firipeck extends drai.dev.data.pokemon.Pokemon {
    public Firipeck() {
        super("Firipeck",
                Type.FLYING, Type.FIRE,
                new Stats(44,
                        68,
                        54,
                        50,
                        45,
                        55),
                List.of(Ability.KEEN_EYE,Ability.SKILL_LINK,Ability.RUN_AWAY), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Quick to flee. Firipeck are picky when choosing a tree to peck. When hurled up they are often mistaken for Poke Balls."),
                List.of(new EvolutionEntry("fyrepecker", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(         new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.FLURRYPECK,12),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.STEEL_WING,26),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,30),
                        new MoveLearnSetEntry(Move.BLAZEARROW,34),
                        new MoveLearnSetEntry(Move.ROOST,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,44),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,54),
                        new MoveLearnSetEntry(Move.DRILL_RUN,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64)               ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
