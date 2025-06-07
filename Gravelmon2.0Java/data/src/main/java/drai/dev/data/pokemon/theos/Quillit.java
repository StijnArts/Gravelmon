package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quillit extends drai.dev.data.pokemon.Pokemon {
    public Quillit() {
        super("Quillit",
                Type.NORMAL,
                new Stats(55,
                        48,
                        63,
                        25,
                        41,
                        38),
                List.of(Ability.RUN_AWAY,Ability.ROUGH_SKIN), Ability.SCRAPPY,
                3, 39,
                new Stats(0,0,1,0,0,0), 240,
                0.5,
                54, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Quillit are shy and timid. When they get startled, they will curl up into a ball and harden their quills to ward off predators."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Quillit");

    }


}
