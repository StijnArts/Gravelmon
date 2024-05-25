package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Snomint extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snomint() {
        super("Snomint",
                Type.ICE, Type.GRASS,
                new Stats(70,
                        35,
                        30,
                        60,
                        70,
                        35),
                List.of(Ability.AROMA_VEIL,Ability.ICE_BODY,Ability.NATURAL_CURE), Ability.NATURAL_CURE,
                5, 165,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("It's often seen playing in snow and leaf piles in the winter. It only thrives on clean water; Snomint is nowhere to be found in areas with dirty, polluted slush."),
                List.of(new EvolutionEntry("snofresh", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,6),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.ICY_WIND,17),
                        new MoveLearnSetEntry(Move.HAZE,20),
                        new MoveLearnSetEntry(Move.SYNTHESIS,24),
                        new MoveLearnSetEntry(Move.FREEZEDRY,28),
                        new MoveLearnSetEntry(Move.SEED_BOMB,32),
                        new MoveLearnSetEntry(Move.LEECH_SEED,35),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,38),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,42),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,50),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.LIFE_DEW,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snomint");

    }


}
