package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Caitlit extends Pokemon {
    public Caitlit() {
        super("Caitlit",
                Type.FIRE,
                new Stats(40,40,40,65,65,65),
                List.of(Ability.BLAZE), Ability.PRANKSTER,
                5, 69,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.HUMAN_LIKE, EggGroup.FAIRY),
                List.of("Caitlit spends much of its time pretending to be a normal kitten or other catlike Pokemon in order to fool trainers with its adorable eyes."),
                List.of(new EvolutionEntry("caitfyr", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 4),
                        new MoveLearnSetEntry(Move.EMBER, 7),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 10),
                        new MoveLearnSetEntry(Move.CHARM, 12),
                        new MoveLearnSetEntry(Move.WILLOWISP, 15),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK, 20),
                        new MoveLearnSetEntry(Move.BITE, 23),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 26),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, 28),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 34),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 38),
                        new MoveLearnSetEntry(Move.COPYCAT, 42),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, 46),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, 47),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, 50),

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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_CRIMSON)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
