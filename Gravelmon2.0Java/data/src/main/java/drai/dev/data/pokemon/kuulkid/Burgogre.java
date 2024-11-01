package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Burgogre extends drai.dev.data.pokemon.Pokemon {
    public Burgogre() {
        super("Burgogre",
                Type.GRASS,Type.FIGHTING,
                new Stats(116,
                        107,
                        82,
                        72,
                        80,
                        46),
                List.of(Ability.THICK_FAT), Ability.THICK_FAT,
                14, 0,
                new Stats(1,1,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burgogre");

    }


}
