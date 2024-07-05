package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Cobarett extends Pokemon {
    public Cobarett() {
        super("Cobarett",
                Type.FIRE, Type.STEEL,
                new Stats(65,45,100,70,90,50),
                List.of(Ability.BATTLE_ARMOR, Ability.FLAME_BODY), Ability.MARVEL_SCALE,
                11, 69,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("It covers itself in thick, billowing smoke so that it can slide easily through thick brush. The source of the smoke is its molten body temperature."),
                List.of(new EvolutionEntry("pythonova", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BIND, 4),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.DART_STRIKE, 10),
                        new MoveLearnSetEntry(Move.GLARE, 12),
                        new MoveLearnSetEntry(Move.ATTRACT, 14),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 16),
                        new MoveLearnSetEntry(Move.COIL, 18),
                        new MoveLearnSetEntry(Move.BULLET_WAVE, 21),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE, 24),
                        new MoveLearnSetEntry(Move.BOUNCE, 27),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 30),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 33),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 36),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 41),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 47),

                        new MoveLearnSetEntry(Move.CALM_MIND, "egg"),
                        new MoveLearnSetEntry(Move.RECOVER, "egg"),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, "egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "egg"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "egg"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 42, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
