package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pharature extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pharature() {
        super("Pharature",
                Type.NORMAL,Type.FLYING,
                new Stats(80,
                        102,
                        70,
                        88,
                        60,
                        86),
                List.of(Ability.KEEN_EYE,Ability.TANGLED_FEET), Ability.BIG_PECKS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pharature is rarely around its young ones. Instead, this large bird soars the sky by itself, covering parts of the sun with its massive wingspread. This Pokémon is also the family emblem of the royal family of Ionia and is commonly seen on post cards as stamps."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pharature");

    }


}
