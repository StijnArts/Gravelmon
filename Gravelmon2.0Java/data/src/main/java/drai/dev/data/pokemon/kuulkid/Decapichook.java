package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Decapichook extends drai.dev.data.pokemon.Pokemon {
    public Decapichook() {
        super("Decapichook",
                Type.GHOST,Type.FLYING,
                new Stats(90,
                        74,
                        70,
                        79,
                        70,
                        82),
                List.of(Ability.HEADLESS), Ability.OBLIVIOUS,
                12, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Despite seemingly having eyes, this pokemon is completely blind to its surroundings. Even after this pokemon fully passes, its ghostly head still remains."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Decapichook");

    }


}
