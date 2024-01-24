package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Florown extends drai.dev.gravelmon.pokemon.Pokemon {
    public Florown() {
        super("Florown",
                Type.GRASS,Type.PSYCHIC,
                new Stats(100,
                        65,
                        70,
                        120,
                        90,
                        75),
                List.of(Ability.EFFECT_SPORE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(1,0,0,2,0,0), 0,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Florown is for those trainers who like weird, but powerful Pokemon. Florown is in the same league as Mr. Mime, but are considered a lot stronger. Florown are fully in control of its psychic abilities and are often shown off in touring circuses."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.BOUNCE,48),
                        new MoveLearnSetEntry(Move.CRUNCH,54),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Florown");

    }


}
