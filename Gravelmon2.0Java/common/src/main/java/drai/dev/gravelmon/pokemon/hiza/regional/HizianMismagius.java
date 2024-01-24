package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianMismagius extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianMismagius() {
        super("Mismagius",
                Type.FIRE,Type.PSYCHIC,
                new Stats(60,
                        60,
                        60,
                        105,
                        105,
                        105),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,1,1,0), 45,
                0.5,
                173, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its flames don't weaken even against the coldest winds, it is seen as a symbol of hope in the harsh frigid mountains."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BURN_UP,1)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mismagius");

    }


}
