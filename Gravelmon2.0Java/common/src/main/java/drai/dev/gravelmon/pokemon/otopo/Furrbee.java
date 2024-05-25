package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Furrbee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Furrbee() {
        super("Furrbee",
                Type.BUG, Type.FLYING,
                new Stats(90,
                        50,
                        60,
                        85,
                        60,
                        50),
                List.of(Ability.HONEY_GATHER), Ability.HONEY_GATHER,
                0, 0,
                new Stats(1,0,0,1,0,0), 0,
                0.5,
                138, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("According to several Pokefans, Furrbee make the greatest pollen of all Pokémon. Pollen from Furrbee is utilised in both human and Pokémon dishes."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Furrbee");

    }


}
