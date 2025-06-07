package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mystinoll extends drai.dev.data.pokemon.Pokemon {
    public Mystinoll() {
        super("Mystinoll",
                Type.PSYCHIC,
                new Stats(121,
                        61,
                        60,
                        120,
                        73,
                        85),
                List.of(Ability.SHED_SKIN,Ability.FOREWARN), Ability.HEALER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                182, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("The excess power from Mawoboll's discarded shells is reabsorbed by the pokemon all at once, giving it unimaginable power. The sudden change causes its body to break apart, revealing its true form inside."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mystinoll");

    }


}
