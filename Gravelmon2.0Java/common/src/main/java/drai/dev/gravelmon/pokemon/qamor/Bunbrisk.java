package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bunbrisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bunbrisk() {
        super("Bunbrisk",
                Type.ICE,Type.NORMAL,
                new Stats(78,
                        77,
                        60,
                        70,
                        63,
                        72),
                List.of(Ability.SCRAPPY), Ability.SLUSH_RUSH,
                9, 165,
                new Stats(1,1,0,0,0,0), 100,
                0.5,
                147, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Feudal Bunbrisk Feudal Form move swiftly through wintery forests. This form evolves from Frodent who face new challenges and enemies head on."),
                List.of(new EvolutionEntry("wintweasel", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:foreign_hat")),
                List.of(
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.MIST,16),
                        new MoveLearnSetEntry(Move.ICE_FANG,20),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,30),
                        new MoveLearnSetEntry(Move.HYPER_FANG,36),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,46),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 34, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bunbrisk");

    }


}
