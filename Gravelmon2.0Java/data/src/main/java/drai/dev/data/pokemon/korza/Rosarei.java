package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rosarei extends drai.dev.data.pokemon.Pokemon {
    public Rosarei() {
        super("Rosarei",
                Type.GHOST,
                new Stats(48,
                        30,
                        42,
                        62,
                        36,
                        81),
                List.of(Ability.CURSED_BODY), Ability.INFILTRATOR,
                4, 12,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Rosarei lurk in dark places, where its shiny metal and gentle glow entrances people into following them to places they cannot return. Each soul it takes becomes a bead in its string."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rosarei");

    }


}