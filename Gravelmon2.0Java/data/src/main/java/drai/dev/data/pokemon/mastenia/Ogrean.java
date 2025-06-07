package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ogrean extends drai.dev.data.pokemon.Pokemon {
    public Ogrean(Stats stats) {
        super("Ogrean",
                Type.DARK, Type.ELECTRIC,
                stats,
                List.of(Ability.RELENTLESS,Ability.MAGIC_BOUNCE), Ability.WIND_POWER,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ogrean can fly as high as the exosphere where they also shed their exoskeleton. They also gather space-like, electrical energy from certain rays at this altitude. Their buzzing roars appears sinister and harsh."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ogrean");
        setCanFly(true);

    }


}
