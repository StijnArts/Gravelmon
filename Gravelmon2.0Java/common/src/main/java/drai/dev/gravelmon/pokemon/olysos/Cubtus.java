package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Cubtus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cubtus() {
        super("Cubtus",
                Type.GRASS,
                new Stats(46,
                        68,
                        45,
                        55,
                        35,
                        58),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                5, 65,
                new Stats(0,1,0,0,0,0), 45,
                0.87,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("It's fur may look cuddly, but it's littered with many tiny thorns. However, they rather feel like little dull pin-pricks. The only thing that is not completely covered with thorns is the fur ruffle around the neck. It's rather soft."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cubtus");

    }


}
