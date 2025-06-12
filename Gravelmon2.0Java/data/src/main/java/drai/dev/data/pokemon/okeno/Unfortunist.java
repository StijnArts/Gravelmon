package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Unfortunist extends drai.dev.data.pokemon.Pokemon {
    public Unfortunist() {
        super("Unfortunist",
                Type.DARK, Type.POISON,
                new Stats(66,
                        77,
                        117,
                        77,
                        117,
                        40),
                List.of(Ability.POISON_TOUCH,Ability.LIQUID_OOZE,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                13, 165,
                new Stats(0,0,1,0,1,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Upon evolving, it no longer uses spores to lure prey. Unfortunist infect roots in the forest, which allows them to control them to ensnare and drag Pokemon to their location."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HAZE,5),
                        new MoveLearnSetEntry(Move.SLUDGE,8),
                        new MoveLearnSetEntry(Move.WORRY_SEED,11),
                        new MoveLearnSetEntry(Move.ASSURANCE,15),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,18),
                        new MoveLearnSetEntry(Move.TOXIC,20),
                        new MoveLearnSetEntry(Move.PAYBACK,24),
                        new MoveLearnSetEntry(Move.SPORE,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,42),
                        new MoveLearnSetEntry(Move.MEMENTO,46),
                        new MoveLearnSetEntry(Move.CROSS_POISON,50),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,55),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,59),
                        new MoveLearnSetEntry(Move.VENOSHOCK,63),
                        new MoveLearnSetEntry(Move.POWER_WHIP,68),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 29, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_MUSHROOM)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Unfortunist");

    }


}
