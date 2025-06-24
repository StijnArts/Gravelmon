package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Heartbill extends drai.dev.data.pokemon.Pokemon {
    public Heartbill(Stats stats) {
        super("Heartbill",
                Type.FAIRY,Type.FLYING,
                stats,
                List.of(Ability.SERENE_GRACE), Ability.BIG_PECKS,
                16, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- PeckSTAB Flying - Charm Fairy - Fairy WindSTAB Fairy - Play RoughSTAB Fairy - Brave BirdSTAB Flying - Feather Dance Flying - GustSTAB Flying - Wing AttackSTAB Flying - Attract Normal"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Heartbill");

    }


}
