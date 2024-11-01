package drai.dev.data.pokemon.phoenixrising.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class RelicLedyba extends Pokemon {
    public RelicLedyba(String name, Aspect aspect) {
        super(name, aspect,"RelicLedyba",
                Type.FIRE, Type.STEEL,
                new Stats(60, 60, 50, 20, 40, 55),
                List.of(Ability.IRON_FIST, Ability.COMPOUND_EYES), Ability.IRON_FIST,
                8, 300,
                new Stats(0,1,0,0,0,0), 83,
                0.5,
                53, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.BUG, EggGroup.FAIRY),
                List.of("Relic Ledyba are often seen training with a Relic Ledian counterpart. It is said that they form close bonds with their mentors, and gift them with tarts made of Combee honey to gain favour."),
                List.of(new EvolutionEntry("RelicLedian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,5),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,8),
                        new MoveLearnSetEntry(Move.REFLECT,8),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,12),
                        new MoveLearnSetEntry(Move.BULK_UP,18),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,23),
                        new MoveLearnSetEntry(Move.UTURN,29),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm")
                        ),
                List.of(Label.PHOENIX_RISING, Label.GEN2),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 26, 10.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Ledyba");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
