package drai.dev.data.pokemon.mikitari;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kocomb extends drai.dev.data.pokemon.Pokemon {
    public Kocomb() {
        super("Kocomb",
                Type.BUG,
                new Stats(73,
                        54,
                        54,
                        34,
                        32,
                        23),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                6, 125,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its shell is covered by sweet substance that a certain Pokémon loves to lick. In exchange for its sweet taste, that Pokémon protects Kocomb from predators."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.PROTECT,"tm")                        ),
                List.of(Label.MIKITARI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kocomb");

    }


}
