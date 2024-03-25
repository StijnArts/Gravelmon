package drai.dev.gravelmon.pokemon.goetia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hallowither extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hallowither() {
        super("Hallowither",
                Type.GHOST,Type.GRASS,
                new Stats(130,
                        80,
                        120,
                        80,
                        95,
                        65),
                List.of(Ability.SPIRITBOUND), Ability.GRASSY_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When the souls of the deceased are not escorted to the afterlife by Dusknoir, they become trapped in our world, alone and scared. Hallowither draws in these lost souls to give them shelter, and allows them to gain new life as ghost pokemon. Even when dormant, it controls the very land it rests on."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hallowither");

    }


}
