package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AyreianDwebble extends Pokemon {
    public AyreianDwebble(String name, Aspect aspect) {
        super(name, aspect,"AyreianDwebble",
                Type.WATER, Type.BUG,
                new Stats(70,45,45,55,25,85),
                List.of(Ability.RAIN_DISH, Ability.SHELL_ARMOR), Ability.WEAK_ARMOR,
                3, 145,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.BUG),
                List.of("The plant on top of its back secretes a sticky substance similar to glue, which is why sometimes Dwebble will have items attached to it, like Heart Scales."),
                List.of(new EvolutionEntry("cradecart", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.STICKY_WEB, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.WITHDRAW, 4),
                        new MoveLearnSetEntry(Move.BUBBLE, 8),
                        new MoveLearnSetEntry(Move.BUG_BITE, 12),
                        new MoveLearnSetEntry(Move.FLAIL, 16),
                        new MoveLearnSetEntry(Move.SLASH, 20),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL, 24),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, 28),
                        new MoveLearnSetEntry(Move.LIQUIDATION, 32),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 36),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, 40),
                        new MoveLearnSetEntry(Move.SHELL_SMASH, 44),
                        new MoveLearnSetEntry(Move.WAVE_CRASH, 48),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SAND_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),

                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg")
                ),
                List.of(Label.GEN5,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 9, 32, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Dwebble");
        this.setPortraitXYZ(0,1.8,0);
    }
}
