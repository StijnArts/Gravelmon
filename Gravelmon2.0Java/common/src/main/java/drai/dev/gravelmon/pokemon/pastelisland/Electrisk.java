package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Electrisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Electrisk() {
        super("Electrisk",
                Type.ELECTRIC, Type.FLYING,
                new Stats(80,
                        70,
                        65,
                        110,
                        75,
                        88),
                List.of(Ability.STATIC,Ability.BIG_PECKS), Ability.GALE_WINGS,
                34, 952,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                220, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("With a flap of their mighty wings, Electrisk cause the sky to rumble. Those lucky enough to witness an Electrisk fly will see nothing but a blur."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Electrisk");

    }


}
