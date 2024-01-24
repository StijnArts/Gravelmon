package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Handren extends drai.dev.gravelmon.pokemon.Pokemon {
    public Handren() {
        super("Handren",
                Type.GRASS,
                new Stats(65,
                        52,
                        78,
                        84,
                        102,
                        74),
                List.of(Ability.CHLOROPHYLL), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                159, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The green hand-like goo that covers Handren is loaded with life-promoting nutrients, keeping the core alive. This goo seems to be made up of many tiny Planten."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Handren");

    }


}
