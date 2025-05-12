package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mamagma extends drai.dev.data.pokemon.Pokemon {
    public Mamagma() {
        super("Mamagma",
                Type.FIRE,
                new Stats(183,
                        76,
                        63,
                        103,
                        64,
                        41),
                List.of(Ability.CUTE_CHARM), Ability.BERSERK,
                15, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.0,
                186, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,12),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.PROTECT,24),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,28),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,40),
                        new MoveLearnSetEntry(Move.CURSE,44),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,48),
                        new MoveLearnSetEntry(Move.AMNESIA,52),
                        new MoveLearnSetEntry(Move.INFERNO,56),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,60),
                        new MoveLearnSetEntry(Move.ERUPTION,64)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 33, 54, 0.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
