package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Crystaleon extends Pokemon {
    public Crystaleon() {
        super("Crystaleon",
                Type.ROCK,
                new Stats(130,55,80,65,100,95),
                List.of(Ability.MIRROR_ARMOR), Ability.DRY_SKIN,
                10, 169,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.MONSTER),
                List.of("Crystaleon is a Pokemon that is made up of many ores, its ores were harvested off its body back in the day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PEBBLE_SHOT, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.SAND_WAVE, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 15),
                        new MoveLearnSetEntry(Move.PROTECT, 18),
                        new MoveLearnSetEntry(Move.MUDSLAP, 20),
                        new MoveLearnSetEntry(Move.SEISMIC_WAVE, 21),
                        new MoveLearnSetEntry(Move.CALM_MIND, 24),
                        new MoveLearnSetEntry(Move.SHRAPNEL_SPHERE, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),
                        new MoveLearnSetEntry(Move.POWER_GEM, 32),
                        new MoveLearnSetEntry(Move.SEISMIC_PULSE, 36),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 40),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 42),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 51),
                        new MoveLearnSetEntry(Move.RECOVER, 61),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 67),

                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.TICKLE, "egg"),
                        new MoveLearnSetEntry(Move.WISH, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.COVET, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER, "egg"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE, "egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, "egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.MAXY, "0"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        addAdditionalEvolution("eevee", new EvolutionEntry("crystaleon", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_DEEP_DARK.getId() + ":" + Biome.IS_DEEP_DARK.getName() +"\""))));
    }
}
