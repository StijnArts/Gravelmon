package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianMagneton extends Pokemon {
    public AyreianMagneton(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"AyreianMagneton",
                Type.FIRE, Type.STEEL,
                new Stats(50,60,65,90,120,80),
                List.of(Ability.FLAME_BODY, Ability.MAGNET_PULL), Ability.TRANSISTOR,
                10, 600,
                new Stats(0,0,0,0,2,0), 65,
                -1,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The two heads that aren't constantly burning are always trying to detatch themselves from the third head, with little result."),
                List.of(new EvolutionEntry("magnemelt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))),
                List.of(
                        new MoveLearnSetEntry(Move.TRI_ATTACK, 1),
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
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 46, 0.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WASTELAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Magneton");
        setCanFly(true);
    }
}
