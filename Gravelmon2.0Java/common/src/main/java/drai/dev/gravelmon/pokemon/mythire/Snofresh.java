package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Snofresh extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snofresh() {
        super("Snofresh",
                Type.ICE, Type.GRASS,
                new Stats(100,
                        45,
                        35,
                        85,
                        90,
                        45),
                List.of(Ability.AROMA_VEIL,Ability.ICE_BODY,Ability.NATURAL_CURE), Ability.NATURAL_CURE,
                13, 165,
                new Stats(2,0,0,0,0,0), 130,
                0.5,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("The effervescent aroma from the leaves of this Pokemon soothes the body and mind, so they're brewed to create teas and perfumes. Eaten raw, however, the leaves will freeze you solid!"),
                List.of(new EvolutionEntry("snomatcha", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
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
                        new MoveLearnSetEntry(Move.LEECH_SEED,36),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,45),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,50),
                        new MoveLearnSetEntry(Move.LEAF_STORM,58),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 54, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snofresh");

    }


}
