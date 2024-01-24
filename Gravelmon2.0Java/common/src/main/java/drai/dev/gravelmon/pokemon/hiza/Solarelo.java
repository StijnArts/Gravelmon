package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Solarelo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Solarelo() {
        super("Solarelo",
                Type.GROUND,Type.PSYCHIC,
                new Stats(127,
                        74,
                        70,
                        94,
                        70,
                        25),
                List.of(Ability.OWN_TEMPO), Ability.PSYCHIC_SURGE,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("These mysterious Pokémon are believed to have been created by an ancient civilization. When the sun sets, they all vanish in the sands till the next day."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Solarelo");

    }


}
