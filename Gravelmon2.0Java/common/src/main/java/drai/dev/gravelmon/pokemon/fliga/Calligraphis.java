package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Calligraphis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Calligraphis() {
        super("Calligraphis",
                Type.GHOST,Type.WATER,
                new Stats(41,
                        73,
                        73,
                        107,
                        113,
                        163),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                34, 0,
                new Stats(0,0,0,0,0,3), 30,
                0.0,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-025 Inkstroke. One of the Ultra Beasts. Its body can fit into any gap, even if the gap is down to the molecular level. Despite this, it's body possess volume like any other living creature."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Calligraphis");

    }


}
