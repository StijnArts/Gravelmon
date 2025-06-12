package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Palegon extends drai.dev.data.pokemon.Pokemon {
    public Palegon(Stats stats) {
        super("Palegon",
                Type.DRAGON, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Some Pokémon never see the light of day. One such Pokémon is Palegon, a cave dwelling, fire breathing lizard. A dragon whom is cold on the outside yet warm on the inside. At least the fire that burns within it. Palegon will only accept the strongest of trainers."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_NETHER_SOUL_SAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palegon");

    }


}
