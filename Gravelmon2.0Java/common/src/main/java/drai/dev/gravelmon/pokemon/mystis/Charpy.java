package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Charpy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Charpy() {
        super("Charpy",
                Type.FIRE, Type.FLYING,
                new Stats(50,
                        70,
                        45,
                        30,
                        45,
                        80),
                List.of(Ability.BLAZE), Ability.MOUNTAINEER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FLYING),
                List.of("Whenever this Pokémon and Lavat meet, they have duels to show off their prowess. This applies to their evolved forms, too."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Charpy");

    }


}
