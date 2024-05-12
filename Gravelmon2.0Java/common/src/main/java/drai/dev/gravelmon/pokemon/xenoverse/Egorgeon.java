package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Egorgeon extends Pokemon {
    public Egorgeon() {
        super("Egorgeon",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(80, 100, 80, 140, 80, 120),
                List.of(Ability.SHED_SKIN, Ability.WONDER_SKIN), Ability.MARVEL_SCALE,
                40, 618,
                new Stats(0,0,0,3,0,0), 3,
                0.5,
                300, ExperienceGroup.SLOW,
                70,
                32, List.of(EggGroup.DRAGON, EggGroup.HUMAN_LIKE),
                List.of("It has a paralyzing glare it refracts through the scales on its body. In this way, it catches prey and dresses them up with its old leather."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PERFECT_GLARE,1),
                        new MoveLearnSetEntry(Move.ELECTROWEB,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.COIL,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.ATTRACT,18),
                        new MoveLearnSetEntry(Move.FLAIL,24),
                        new MoveLearnSetEntry(Move.HISS,30),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,36),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,41),
                        new MoveLearnSetEntry(Move.COIL,45),
                        new MoveLearnSetEntry(Move.WRING_OUT,51),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,57),
                        new MoveLearnSetEntry(Move.PERFECT_GLARE,62),
                        new MoveLearnSetEntry(Move.DISCHARGE,67),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.GLARE,"egg"),
                        new MoveLearnSetEntry(Move.TWISTER,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.FLASH,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.VELVET_SCALES,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 45, 62, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
