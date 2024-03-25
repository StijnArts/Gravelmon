package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Andracarina extends drai.dev.gravelmon.pokemon.Pokemon {
    public Andracarina() {
        super("Andracarina",
                Type.FLYING,Type.POISON,
                new Stats(211,
                        41,
                        83,
                        89,
                        103,
                        43),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(3,0,0,0,0,0), 30,
                0.0,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-026 Nebula. One of the Ultra Beasts. Inside its cloudy body is a gigantic cloud of colorful yet highly corrosive gas. It leaves trails of shrivelled plants in it's wake."),
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
           setLangFileName("Andracarina");

    }


}
