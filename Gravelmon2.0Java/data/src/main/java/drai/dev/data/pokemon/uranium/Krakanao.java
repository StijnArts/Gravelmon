package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Krakanao extends Pokemon {
    public Krakanao() {
        super("Krakanao",
                Type.WATER, Type.DARK,
                new Stats(90,
                        145,
                        90,
                        70,
                        120,
                        95),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                18, 886,
                new Stats(1,0,1,0,0,1), 3,
                0.5,
                275, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Called the “Inescapable Malestrom”. It causes massive whirlpools that drag everything - ships, Mon and people alike - into its bottomless maw."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.RAGE,6),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,11),
                        new MoveLearnSetEntry(Move.ICE_FANG,16),
                        new MoveLearnSetEntry(Move.SCREECH,18),
                        new MoveLearnSetEntry(Move.SWAGGER,21),
                        new MoveLearnSetEntry(Move.ASSURANCE,26),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.SLASH,30),
                        new MoveLearnSetEntry(Move.AQUA_JET,34),
                        new MoveLearnSetEntry(Move.TAUNT,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.SKULL_BASH,50),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,56),
                        new MoveLearnSetEntry(Move.OCEANS_WRATH,90),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CORAL_BREAK,"tm")
                        ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "30")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.21, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        this.setPortraitXYZ(0,1.8,0);
    }
}
