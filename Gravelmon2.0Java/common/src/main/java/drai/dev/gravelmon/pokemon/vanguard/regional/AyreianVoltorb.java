package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianVoltorb extends Pokemon {
    public AyreianVoltorb(String name, Aspect aspect) {
        super(name, aspect,"AyreianVoltorb",
                Type.FIRE, Type.ROCK,
                new Stats(50,60,45,90,70,65),
                List.of(Ability.STEAM_ENGINE), Ability.STEAM_ENGINE,
                5, 104,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.MINERAL),
                List.of("Usually found in power plants. Easily mistaken for a Poke Ball, it has zapped many people."),
                List.of(new EvolutionEntry("Ayreianelectrode", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.ROLLOUT, 4),
                        new MoveLearnSetEntry(Move.EXPLOSION, 9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 11),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, 16),
                        new MoveLearnSetEntry(Move.SWIFT, 20),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 22),
                        new MoveLearnSetEntry(Move.PSYBEAM, 26),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 29),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, 34),
                        new MoveLearnSetEntry(Move.DISCHARGE, 37),
                        new MoveLearnSetEntry(Move.EXPLOSION, 41),
                        new MoveLearnSetEntry(Move.GYRO_BALL, 46),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, 48),

                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tutor"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE, "tutor")
                ),
                List.of(Label.VANGUARD, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Voltorb");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
