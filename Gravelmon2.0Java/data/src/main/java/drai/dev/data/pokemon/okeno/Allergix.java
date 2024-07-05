package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Allergix extends drai.dev.data.pokemon.Pokemon {
    public Allergix() {
        super("Allergix",
                Type.POISON, Type.ICE,
                new Stats(165,
                        30,
                        40,
                        83,
                        110,
                        22),
                List.of(Ability.LIQUID_OOZE,Ability.TEARYEYED,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("- Icy WindSTAB Ice - Growth Normal 6 AcidSTAB Poison 10 Heal Block Psychic 12 SludgeSTAB Poison 17 Pain Split Normal 21 Acid SpraySTAB Poison 26 Minimize Normal 29 Acid Armor Poison 35 Freeze-DrySTAB Ice 40 Sludge BombSTAB Poison 46 Recover Normal 52 Ice BeamSTAB Ice 60 Poison BurstSTAB Poison 72 Sheer ColdSTAB Ice"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,10),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,17),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,21),
                        new MoveLearnSetEntry(Move.MINIMIZE,26),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,29),
                        new MoveLearnSetEntry(Move.FREEZEDRY,35),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.RECOVER,46),
                        new MoveLearnSetEntry(Move.ICE_BEAM,52),
                        new MoveLearnSetEntry(Move.POISONBURST,60),
                        new MoveLearnSetEntry(Move.SHEER_COLD,72),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Allergix");

    }


}
