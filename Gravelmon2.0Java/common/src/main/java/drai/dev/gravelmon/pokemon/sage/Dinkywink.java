package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Dinkywink extends Pokemon {
    public Dinkywink() {
        super("Dinkywink",
                Type.WATER, Type.ROCK,
                new Stats(40, 85, 65, 45, 60, 60),
                List.of(Ability.ROCK_HEAD, Ability.SWIFT_SWIM), Ability.STRONG_JAW,
                5, 149,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                76, List.of(EggGroup.WATER_2, EggGroup.MONSTER),
                List.of("While Dinkywink's mouth contains huge, razor sharp teeth, it has yet to develop the strength to utilize them. As such, it prefers to hunt by ramming into prey."),
                List.of(new EvolutionEntry("dunkywunkr", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.HEADBUTT,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.LEER,11),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,16),
                        new MoveLearnSetEntry(Move.AQUA_JET,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,26),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,31),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,41),
                        new MoveLearnSetEntry(Move.AQUA_RING,46),
                        new MoveLearnSetEntry(Move.AGILITY,51),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,56),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:raw_cod",90, 1,2)
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 14, 34, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN, Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.4, 0.3,
                List.of());
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
