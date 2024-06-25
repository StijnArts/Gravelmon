package drai.dev.gravelmon.pokemon.ottora;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Deeluge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Deeluge() {
        super("Deeluge",
                Type.WATER,
                new Stats(85,
                        50,
                        60,
                        70,
                        95,
                        55),
                List.of(Ability.TORRENT), Ability.STORM_DRAIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite evolving once, Deeluge still can't swim well. It's tube-like tail helps it keep afloat in waters."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Deeluge");

    }


}
