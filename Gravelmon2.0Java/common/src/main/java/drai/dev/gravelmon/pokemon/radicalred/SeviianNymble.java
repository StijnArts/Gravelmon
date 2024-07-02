package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class SeviianNymble extends Pokemon {
    public SeviianNymble(String name, Aspect aspect) {
        super(name, aspect,"SeviianNymble",
                Type.BUG, Type.DRAGON,
                new Stats(33, 46, 40, 21, 25, 45),
                List.of(Ability.SWARM), Ability.TINTED_LENS,
                2, 10,
                new Stats(0, 1, 0, 0, 0, 0), 190,
                0.5,
                42, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("seviianlokix", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "23")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.POUNCE, 4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 6),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 9),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 11),
                        new MoveLearnSetEntry(Move.SCREECH, 14),
                        new MoveLearnSetEntry(Move.ENDURE, 18),
                        new MoveLearnSetEntry(Move.BUG_BITE, 22),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE, 26),
                        new MoveLearnSetEntry(Move.AGILITY, 30),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 34),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, 41),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.DRACO_BARRAGE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, "tutor"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN9),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 36, 2.0, List.of(
                    new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Nymble");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
