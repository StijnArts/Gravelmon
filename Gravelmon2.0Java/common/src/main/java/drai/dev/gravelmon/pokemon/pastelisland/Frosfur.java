package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Frosfur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frosfur() {
        super("Frosfur",
                Type.ICE,
                new Stats(80,
                        110,
                        65,
                        70,
                        90,
                        65),
                List.of(Ability.REFRIGERATE), Ability.REFRIGERATE,
                18, 620,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Frosfur can generate a spine-chilling breeze by shaking it's fur. Washing this Pokémon can be hard as it freezes the water. It's loyal to the end, and will sit alongside their trainers no matter what happens."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Frosfur");

    }


}
