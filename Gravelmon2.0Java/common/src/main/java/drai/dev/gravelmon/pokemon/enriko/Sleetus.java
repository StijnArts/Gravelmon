package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sleetus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sleetus() {
        super("Sleetus",
                Type.ICE, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TINTED_LENS), Ability.ILLUSION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its true body is the red, wormlike thing. It is surrounded by a pink gel with strange properties, causing divers to see it as a harmless fish so it can suck their blood."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sleetus");

    }


}
