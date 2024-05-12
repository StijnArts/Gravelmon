package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Guardihand extends drai.dev.gravelmon.pokemon.Pokemon {
    public Guardihand() {
        super("Guardihand",
                Type.ROCK, Type.PSYCHIC,
                new Stats(75,
                        120,
                        80,
                        120,
                        80,
                        50),
                List.of(Ability.REFLEXSTRIKE), Ability.REFLEXSTRIKE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Erosion over time has made its body crumble, although its soul will never waver. It will make sure no intruders pass through the area it is protecting. Even after thousands of years of dormancy, it still remains extremely powerful. Artwork from ancient times depicts it as a protector of an ancient civilisation."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Guardihand");

    }


}
