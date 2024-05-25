package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cloflower extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cloflower() {
        super("Cloflower",
                Type.GRASS,
                new Stats(35,
                        35,
                        35,
                        65,
                        55,
                        35),
                List.of(Ability.EFFECT_SPORE), Ability.FOREWARN,
                3, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.125,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("These gentle Pokemon can often be seen digging for roots underneath the soil of forests and even jungles. They are not aware of their psychic powers but that doesn't stop them from trying."),
                List.of(new EvolutionEntry("petafleur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"12")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,10),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,14),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,22),
                        new MoveLearnSetEntry(Move.WORRY_SEED,26),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,34),
                        new MoveLearnSetEntry(Move.GRAVITY,38),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,42),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 15, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cloflower");

    }


}
