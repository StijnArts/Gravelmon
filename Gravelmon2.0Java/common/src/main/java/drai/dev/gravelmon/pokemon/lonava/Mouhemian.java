package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mouhemian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mouhemian() {
        super("Mouhemian",
                Type.GRASS,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OWN_TEMPO,Ability.LEAF_GUARD,Ability.TANGLING_HAIR), Ability.TANGLING_HAIR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Mouhemian are passive, sometimes to a fault. They rarely bathe, so aren't popular with urban-dwelling trainers; more alternative, travelling trainers love it however. Their large, misty eyes have been the subject of many traditional folk songs."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mouhemian");

    }


}
