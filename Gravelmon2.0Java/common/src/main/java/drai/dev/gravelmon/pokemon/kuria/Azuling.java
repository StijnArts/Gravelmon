package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Azuling extends drai.dev.gravelmon.pokemon.Pokemon {
    public Azuling() {
        super("Azuling",
                Type.NORMAL,Type.FLYING,
                new Stats(45,
                        25,
                        30,
                        54,
                        57,
                        40),
                List.of(Ability.KEEN_EYE,Ability.EARLY_BIRD), Ability.ALLSEEING,
                3, 14,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Azuling are some of the most cheerful Pokémon in the world. They live a relaxed life and have no worries at all. This is due to their high intelligence making it easy to outsmart any threat."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Azuling");

    }


}
