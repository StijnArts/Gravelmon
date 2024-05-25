package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Skreychee extends Pokemon {
    public Skreychee() {
        super("Skreychee",
                Type.SOUND, Type.FAIRY,
                new Stats(50,45,55,60,85,55),
                List.of(Ability.LEVITATE, Ability.TANGLING_HAIR), Ability.OSCILLATE,
                6, 69,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                164, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.HUMAN_LIKE, EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("bindshii", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.SCREECH, 1),
                        new MoveLearnSetEntry(Move.DAZE, 4),
                        new MoveLearnSetEntry(Move.MOONLIGHT, 7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 10),
                        new MoveLearnSetEntry(Move.SWEET_KISS, 12),
                        new MoveLearnSetEntry(Move.ATTRACT, 14),
                        new MoveLearnSetEntry(Move.BIND, 17),
                        new MoveLearnSetEntry(Move.DISABLE, 21),
                        new MoveLearnSetEntry(Move.ENCORE, 26),
                        new MoveLearnSetEntry(Move.ROAR, 31),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 39),
                        new MoveLearnSetEntry(Move.SNORE, 47),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, 47),
                        new MoveLearnSetEntry(Move.STARBOLT, 52),
                        new MoveLearnSetEntry(Move.MOONBLAST, 55),
                        new MoveLearnSetEntry(Move.BOOMBURST, 60),

                        new MoveLearnSetEntry(Move.PSYCHIC, "egg"),
                        new MoveLearnSetEntry(Move.SWEET_KISS, "egg"),
                        new MoveLearnSetEntry(Move.TAUNT, "egg"),
                        new MoveLearnSetEntry(Move.CALM_MIND, "egg"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "egg"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, "egg"),
                        new MoveLearnSetEntry(Move.SING, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.POWER_GEM, "egg")
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
