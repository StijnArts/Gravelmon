package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tentalum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tentalum() {
        super("Tentalum",
                Type.PSYCHIC,
                new Stats(50,
                        50,
                        50,
                        70,
                        55,
                        45),
                List.of(Ability.OWN_TEMPO,Ability.WONDER_SKIN,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("It sits motionless for hours until the sun shines on it just right. It's believed that it uses the sun's rays to tell the time so it can stick to its routine."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tentalum");

    }


}
