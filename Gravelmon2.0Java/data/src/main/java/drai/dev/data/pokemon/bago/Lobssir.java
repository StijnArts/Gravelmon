package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lobssir extends drai.dev.data.pokemon.Pokemon {
    public Lobssir() {
        super("Lobssir",
                Type.STEEL,Type.FIGHTING,
                new Stats(100,
                        85,
                        118,
                        35,
                        77,
                        42),
                List.of(), null,
                UnitConverter.feetToMeters(4, 8), 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 30, 54, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN, Biome.IS_COLD_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Lobssir");

    }


}
