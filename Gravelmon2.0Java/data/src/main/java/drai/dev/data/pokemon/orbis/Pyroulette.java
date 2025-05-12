package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pyroulette extends drai.dev.data.pokemon.Pokemon {
    public Pyroulette() {
        super("Pyroulette",
                Type.PSYCHIC,
                new Stats(97,
                        79,
                        113,
                        127,
                        83,
                        71),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                19, 2130,
                new Stats(0,0,0,0,0,0), 29,
                0.5,
                283, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Pyroulette are exclusively owned by family owners of the Metroville Casino and have been passed down for generations. They possess a bizarre and mysterious energy."),
                List.of(),
                List.of(                   ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(50).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyroulette");

    }


}
