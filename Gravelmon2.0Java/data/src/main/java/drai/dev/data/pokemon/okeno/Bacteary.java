package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bacteary extends drai.dev.data.pokemon.Pokemon {
    public Bacteary() {
        super("Bacteary",
                Type.POISON, Type.ICE,
                new Stats(100,
                        18,
                        30,
                        61,
                        61,
                        18),
                List.of(Ability.LIQUID_OOZE,Ability.TEARYEYED,Ability.REGENERATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("- Icy WindSTAB Ice - Growth Normal 6 AcidSTAB Poison 10 Heal Block Psychic 12 SludgeSTAB Poison 17 Pain Split Normal 21 Acid SpraySTAB Poison 26 Minimize Normal 29 Acid Armor Poison 33 Freeze-DrySTAB Ice 37 Sludge BombSTAB Poison 41 Recover Normal 45 Ice BeamSTAB Ice 52 Poison BurstSTAB Poison 60 Sheer ColdSTAB Ice"),
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
                        new MoveLearnSetEntry(Move.FREEZEDRY,33),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,37),
                        new MoveLearnSetEntry(Move.RECOVER,41),
                        new MoveLearnSetEntry(Move.ICE_BEAM,45),
                        new MoveLearnSetEntry(Move.POISONBURST,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,"tm"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bacteary");

    }


}
