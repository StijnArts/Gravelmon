package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Probopass extends drai.dev.gravelmon.pokemon.Pokemon {
    public Probopass(int dex) {
        super(dex, "Probopass",
                Type.ROCK, Type.GRASS,
                new Stats(75,
                        70,
                        135,
                        90,
                        130,
                        25),
                List.of(Ability.HARVEST,Ability.STURDY), Ability.CHLOROPHYLL,
                0, 4060,
                new Stats(1,0,0,0,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Stone EdgeSTAB Rock - Stealth Rock Rock - Growth Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Probopass");

    }


}
