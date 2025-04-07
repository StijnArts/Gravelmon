package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wormeaty extends drai.dev.data.pokemon.Pokemon {
    public Wormeaty() {
        super("Wormeaty",
                Type.FLYING, Type.POISON,
                new Stats(70,
                        60,
                        150,
                        105,
                        60,
                        70),
                List.of(Ability.UNAWARE,Ability.LIQUID_OOZE,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo/Poison type.)A vast colony of symbiotic worms slithers in and out of its body. The worms govern its every move, although they cannot suppress its hunger."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wormeaty");

    }


}
