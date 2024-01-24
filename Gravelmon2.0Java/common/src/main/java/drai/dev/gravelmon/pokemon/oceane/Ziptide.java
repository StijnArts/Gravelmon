package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ziptide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ziptide() {
        super("Ziptide",
                Type.ELECTRIC,
                new Stats(50,
                        100,
                        50,
                        75,
                        75,
                        100),
                List.of(Ability.ANTICIPATION), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                158, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ziptide live for speed. They're usually seen zig zagging wherever you can find mad waves, bro. Taking a ziptide is harder said than done, if you're even fast enough to catch one."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ziptide");

    }


}
