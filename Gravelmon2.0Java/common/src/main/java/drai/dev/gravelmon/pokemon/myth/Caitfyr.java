package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Caitfyr extends Pokemon {
    public Caitfyr() {
        super("Caitfyr",
                Type.FIRE, Type.FAIRY,
                new Stats(60,65,60,80,80,80),
                List.of(Ability.BLAZE), Ability.PRANKSTER,
                11, 69,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.HUMAN_LIKE, EggGroup.FAIRY),
                List.of("Caitfyr enjoys nothing more than taking trinkets from unsuspecting travelers and then playing games with those travelers for them to get them back with it’s masks."),
                List.of(new EvolutionEntry("blazesidhe", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.CHARM, 1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 8),
                        new MoveLearnSetEntry(Move.WILLOWISP, 12),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK, 22),
                        new MoveLearnSetEntry(Move.BITE, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 28),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, 30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 37),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 40),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, 51),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, 55),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, 60),

                        new MoveLearnSetEntry(Move.PSYCHIC, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_KISS, "egg"),
                        new MoveLearnSetEntry(Move.TAUNT, "egg"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "egg"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "egg"),
                        new MoveLearnSetEntry(Move.SING, "egg"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE, "egg"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 17, 39, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_CRIMSON)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
