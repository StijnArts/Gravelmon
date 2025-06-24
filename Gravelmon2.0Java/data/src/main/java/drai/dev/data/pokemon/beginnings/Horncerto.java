package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Horncerto extends drai.dev.data.pokemon.Pokemon {
    public Horncerto() {
        super("Horncerto",
                Type.NORMAL,
                new Stats(91,
                        71,
                        95,
                        71,
                        70,
                        44),
                List.of(Ability.SAP_SIPPER,Ability.RUN_AWAY), Ability.SOUNDPROOF,
                21, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Horncerto's horns once evolving become hollow and tough. Originally thought to be brass, researchers quickly realised they are made out of hardened keratin. The noise produced from them once caused many tales of ghost trains."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TUNDRA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Horncerto");

    }


}
