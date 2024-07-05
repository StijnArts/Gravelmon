package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Bindshii extends Pokemon {
    public Bindshii() {
        super("Bindshii",
                Type.SOUND, Type.FAIRY,
                new Stats(70,50,65,80,140,115),
                List.of(Ability.LEVITATE, Ability.TANGLING_HAIR), Ability.OSCILLATE,
                17, 69,
                new Stats(0,0,0,0,3,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.HUMAN_LIKE, EggGroup.FAIRY),
                List.of(""),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
