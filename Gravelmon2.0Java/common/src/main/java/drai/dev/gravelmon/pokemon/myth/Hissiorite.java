package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Hissiorite extends Pokemon {
    public Hissiorite() {
        super("Hissiorite",
                Type.FIRE,
                new Stats(35,25,70,60,50,40),
                List.of(Ability.BATTLE_ARMOR, Ability.FLAME_BODY), Ability.MARVEL_SCALE,
                5, 69,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("The base of it's neck emits super-heated gas that envelopes its body and causes it to have fewer inches off the ground, similar to a hot air balloon."),
                List.of(new EvolutionEntry("cobarett", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.0, List.of(
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
