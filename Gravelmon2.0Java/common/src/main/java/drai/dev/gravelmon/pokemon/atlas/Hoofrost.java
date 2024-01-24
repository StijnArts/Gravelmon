package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hoofrost extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoofrost() {
        super("Hoofrost",
                Type.ICE,Type.NORMAL,
                new Stats(55,
                        80,
                        80,
                        62,
                        67,
                        35),
                List.of(Ability.SNOW_CLOAK,Ability.OBLIVIOUS,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When snowstorms hit, these Pokémon can be seen gathering in big herds so they don't get lost. Its rock-hard ice hooves are durable enough to climb up rocky mountains."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoofrost");

    }


}
