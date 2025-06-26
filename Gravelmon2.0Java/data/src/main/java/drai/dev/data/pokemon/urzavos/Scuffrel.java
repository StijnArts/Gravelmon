package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scuffrel extends drai.dev.data.pokemon.Pokemon {
    public Scuffrel() {
        super("Scuffrel",
                Type.NORMAL, Type.FIGHTING,
                new Stats(66,
                        90,
                        76,
                        50,
                        64,
                        94),
                List.of(Ability.PICKUP,Ability.MOXIE), Ability.SCRAPPY,
                9, 299,
                new Stats(0,0,0,0,0,0), 127,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Scuffrel get into frequent battles with neighboring 'Mons for both territory and to test their abilities. Bird 'Mons of all kinds are their mortal enemies, and they will attack them on sight."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scuffrel");

    }


}
