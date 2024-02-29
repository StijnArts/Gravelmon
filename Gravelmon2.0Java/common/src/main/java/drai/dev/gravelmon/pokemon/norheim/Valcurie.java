package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Valcurie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valcurie() {
        super("Valcurie",
                Type.FIGHTING,Type.FLYING,
                new Stats(136,
                        116,
                        106,
                        91,
                        86,
                        95),
                List.of(Ability.NATURAL_CURE), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("The queen of six former heroines and the last of her kind. Valcurie decides the fate of Pokemon; who may die with glory or to live to finish their story."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMART_STRIKE,1),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,8),
                        new MoveLearnSetEntry(Move.POWER_TRICK,12),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,23),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,28),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,36),
                        new MoveLearnSetEntry(Move.NO_RETREAT,44),
                        new MoveLearnSetEntry(Move.AIR_SLASH,50),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,62),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,72),
                        new MoveLearnSetEntry(Move.RETALIATE,80)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valcurie");

    }


}
