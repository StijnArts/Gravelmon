package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Wisopotron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wisopotron() {
        super("Wisopotron",
                Type.BUG,Type.FIGHTING,
                new Stats(90,
                        100,
                        111,
                        85,
                        89,
                        10),
                List.of(Ability.INNER_FOCUS,Ability.OWN_TEMPO), Ability.REGENERATOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Awake at night only to study the stars. Wisopotron always fall asleep twenty minutes after dawn with its face facing towards the sun. The back of this Pokémon is always hidden in the shadows and is a way of balancing its body heat. It is also covered with polypores which functions in a similar way as elytrons, offering excellent defense. The star shaped head along with its long neck works as an offensive weapon, much like a morning star."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wisopotron");

    }


}
