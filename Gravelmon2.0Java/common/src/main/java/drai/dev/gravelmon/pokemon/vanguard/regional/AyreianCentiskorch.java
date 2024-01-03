package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AyreianCentiskorch extends Pokemon {
    public AyreianCentiskorch(int dexNo) {
        super(dexNo, "AyreianCentiskorch",
                Type.GHOST, Type.BUG,
                new Stats(100,90,65,95,105,90),
                List.of(Ability.FLASH_FIRE, Ability.WHITE_SMOKE), Ability.MAGIC_BOUNCE,
                30, 1200,
                new Stats(0, 0, 0, 0, 2, 0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of("While its burning body is already dangerous on its own, this excessively hostile Pokémon also has large and very sharp fangs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK, 1),
                        new MoveLearnSetEntry(Move.WILLOWISP, 1),
                        new MoveLearnSetEntry(Move.WRAP, 5),
                        new MoveLearnSetEntry(Move.BITE, 10),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 20),
                        new MoveLearnSetEntry(Move.COIL, 24),
                        new MoveLearnSetEntry(Move.HEX, 27),
                        new MoveLearnSetEntry(Move.SLAM, 32),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 39),
                        new MoveLearnSetEntry(Move.CRUNCH, 46),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, 53),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 60),
                        new MoveLearnSetEntry(Move.LAST_RESPECTS, 67),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tutor"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, "tutor"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),

                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "egg")
                ),
                List.of(Label.VANGUARD, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 29, 56, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND, Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Centiskorch");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
