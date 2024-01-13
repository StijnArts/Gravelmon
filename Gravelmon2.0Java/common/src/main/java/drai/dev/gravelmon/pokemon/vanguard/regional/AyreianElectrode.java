package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AyreianElectrode extends Pokemon {
    public AyreianElectrode(int dexNo) {
        super(dexNo,"AyreianElectrode",
                Type.FIRE, Type.PSYCHIC,
                new Stats(60,60,55,110,100,105),
                List.of(Ability.ROCKY_PAYLOAD), Ability.DROUGHT,
                12, 666,
                new Stats(0,0,0,2,0,0), 190,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.MINERAL),
                List.of("It stores an overflowing amount of electric energy inside its body. Even a small shock makes it explode."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PRIMAL_SUN, 1),
                        new MoveLearnSetEntry(Move.POWER_GEM, 1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.ROLLOUT, 4),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE, 6),
                        new MoveLearnSetEntry(Move.EXPLOSION, 9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 11),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, 13),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, 16),
                        new MoveLearnSetEntry(Move.SWIFT, 20),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 22),
                        new MoveLearnSetEntry(Move.PSYBEAM, 26),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 29),
                        new MoveLearnSetEntry(Move.PSYSHOCK, 36),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, 41),
                        new MoveLearnSetEntry(Move.STORED_POWER, 47),
                        new MoveLearnSetEntry(Move.ERUPTION, 54),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 58),

                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "tutor"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
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
                        new MoveLearnSetEntry(Move.TELEKINESIS, "tutor"),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 54, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Electrode");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
