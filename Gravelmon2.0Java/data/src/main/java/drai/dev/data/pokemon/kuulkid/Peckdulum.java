package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peckdulum extends drai.dev.data.pokemon.Pokemon {
    public Peckdulum() {
        super("Peckdulum",
                Type.FLYING,Type.STEEL,
                new Stats(70,
                        96,
                        63,
                        49,
                        65,
                        99),
                List.of(Ability.OWNTEMPO), Ability.OWNTEMPO,
                15, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Scientists still question how this pokemon is able to fly with its hefty steel tail. At the stroke of midnight, Peckdulums will send out a call that is comparable to the chime of a large bell."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 51, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Peckdulum");

    }


}
