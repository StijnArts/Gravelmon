package drai.dev.data.pokemon.orbis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ditto extends drai.dev.data.pokemon.Pokemon {
    public Ditto(String name, Aspect aspect) {
        super(name, aspect, "Ditto",
                Type.NORMAL,
                new Stats(48,
                        48,
                        48,
                        48,
                        48,
                        48),
                List.of(Ability.LIMBER), Ability.IMPOSTER,
                3, 40,
                new Stats(1,0,0,0,0,0), 35,
                0.0,
                101, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("Ditto rearranges its cell structure to transform itself into other shapes. However, if it tries to transform itself into something by relying on its memory, this Pokémon manages to get details wrong."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRANSFORM,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ditto");

    }


}
