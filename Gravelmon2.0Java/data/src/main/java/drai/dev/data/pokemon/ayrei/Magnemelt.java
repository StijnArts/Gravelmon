package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Magnemelt extends Pokemon {
    public Magnemelt() {
        super("Magnemelt",
                Type.FIRE, Type.STEEL,
                new Stats(75,60,75,70,130,115),
                List.of(Ability.FLAME_BODY, Ability.MAGNET_PULL), Ability.TRANSISTOR,
                13, 650,
                new Stats(0,0,0,0,3,0), 60,
                -1,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It is so surrounded by magma that you'll almost never see it's original body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGMA_STORM, 1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 4),
                        new MoveLearnSetEntry(Move.ENDURE, 8),
                        new MoveLearnSetEntry(Move.INCINERATE, 12),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT, 16),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 20),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 24),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, 28),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 30),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 34),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 40),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE, 46),
                        new MoveLearnSetEntry(Move.OVERHEAT, 52),
                        new MoveLearnSetEntry(Move.STEEL_BEAM, 58),
                        new MoveLearnSetEntry(Move.RECOVER, 64),

                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GRAVITY, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 67, 1.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
