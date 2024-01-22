package drai.dev.gravelmon.pokemon.uranium;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Leviathao extends Pokemon {
    public Leviathao() {
        super("Leviathao",
                Type.WATER, Type.ICE,
                new Stats(90,
                        70,
                        110,
                        135,
                        100,
                        105),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                14, 1503,
                new Stats(1,0,1,0,0,1), 3,
                0.5,
                275, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Called the “Unstoppable Spear”. The ice horn on its head can easily penetrate solid steel. It battles Baitatao and Krakanao for dominance over the sea."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.ICE_BALL,13),
                        new MoveLearnSetEntry(Move.BODY_SLAM,19),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,25),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,31),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.REST,39),
                        new MoveLearnSetEntry(Move.SNORE,39),
                        new MoveLearnSetEntry(Move.ICE_FANG,44),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,65),
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
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "40")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
    }
}
