package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Zerbrahg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zerbrahg() {
        super("Zerbrahg",
                Type.PSYCHIC,
                new Stats(40,
                        80,
                        60,
                        120,
                        120,
                        65),
                List.of(Ability.PRANKSTER,Ability.ANALYTIC,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Curious beings, Zerbarhg typically try to avoid contact with other Pokemon, but rather study them from afar. No one has yet to discover what this research is for."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPEED_SWAP,1)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zerbrahg");

    }


}
