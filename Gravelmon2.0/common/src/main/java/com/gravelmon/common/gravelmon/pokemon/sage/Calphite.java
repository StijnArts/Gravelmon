package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Calphite extends Pokemon {
    public Calphite() {
        super("Calphite",
                Type.ROCK, Type.GROUND,
                new Stats(55, 55, 105, 35, 85, 30),
                List.of(Ability.STURDY, Ability.SAND_FORCE), Ability.SHEER_FORCE,
                14, 1252,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                73, ExperienceGroup.MEDIUM_FAST,
                70,
                75, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("Calphite spent many of its early years with its mother. Despite its massive size, it scared easily and trampled much in its path when running in fear."),
                List.of(new EvolutionEntry("indrolith", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,6),
                        new MoveLearnSetEntry(Move.ENDURE,11),
                        new MoveLearnSetEntry(Move.STOMP,16),
                        new MoveLearnSetEntry(Move.MAGNITUDE,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,26),
                        new MoveLearnSetEntry(Move.SANDSTORM,31),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,36),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.CURSE,51),
                        new MoveLearnSetEntry(Move.STONE_EDGE,56),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SHIELD_BASH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"egg"),
                        new MoveLearnSetEntry(Move.SLAM,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 28, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUSH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
