package drai.dev.data.pokemon.avoris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toxiscore extends drai.dev.data.pokemon.Pokemon {
    public Toxiscore() {
        super("Toxiscore",
                Type.FIRE,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.BLAZE), Ability.POISON_TOUCH,
                10, 290,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They secrete venom from their sharp claws and tail. The flames they emit may also contain toxins. Being a combination of fire and poison proves them to be a deadly weapon, as their attacks can leave severe toxic burns. Toxiscore are known to harbor resentment toward people who mistreat them. As it grows more rage, so does the heat of their fire. These Pokémon are cunning and sly, strategizing their attacks in advance."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxiscore");

    }


}