package drai.dev.data.pokemon.mystis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisanImpidimp extends drai.dev.data.pokemon.Pokemon {
    public MystisanImpidimp(String name, Aspect aspect) {
        super(name, aspect, "MystisanImpidimp",
                Type.FIRE,
                new Stats(45,
                        55,
                        30,
                        65,
                        40,
                        30),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                4, 55,
                new Stats(0,0,0,0,0,0), 255,
                0.75,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Impidimp");

    }


}
