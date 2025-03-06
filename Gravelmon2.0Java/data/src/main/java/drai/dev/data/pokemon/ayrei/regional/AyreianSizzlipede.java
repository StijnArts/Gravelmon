package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianSizzlipede extends Pokemon {
    public AyreianSizzlipede(String name, Aspect aspect) {
        super(name, aspect,"AyreianSizzlipede",
                Type.GHOST, Type.BUG,
                new Stats(50,55,45,60,65,50),
                List.of(Ability.FLASH_FIRE, Ability.WHITE_SMOKE), Ability.MAGIC_BOUNCE,
                7, 10,
                new Stats(0, 0, 0, 0, 1, 0), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of("It wraps prey up with its heated body, cooking them in its coils. Once they're well-done, it will voraciously nibble them down to the last morsel."),
                List.of(new EvolutionEntry("ayreiancentiskorch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "30")))),
                List.of(
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
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),

                        new MoveLearnSetEntry(Move.DEFENSE_CURL, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT, "egg"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "egg")
                ),
                List.of(Label.VANGUARD, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 36, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_SOUL_SAND, Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Sizzlipede");
    }
}
