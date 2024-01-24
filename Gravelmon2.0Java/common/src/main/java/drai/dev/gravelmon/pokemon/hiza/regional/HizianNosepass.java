package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianNosepass extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianNosepass() {
        super("Nosepass",
                Type.ELECTRIC,Type.ROCK,
                new Stats(40,
                        65,
                        110,
                        50,
                        80,
                        30),
                List.of(Ability.GALVANIZE), Ability.STURDY,
                8, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("This Nosepass variant's body is composed of out of a unique mineral. It is highly magnetic allowing it to walk on cave walls and ceillings."),
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
           setLangFileName("Nosepass");

    }


}
