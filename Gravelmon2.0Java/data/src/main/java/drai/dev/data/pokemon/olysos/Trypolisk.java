package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trypolisk extends drai.dev.data.pokemon.Pokemon {
    public Trypolisk() {
        super("Trypolisk",
                Type.ROCK, Type.STEEL,
                new Stats(80,
                        110,
                        160,
                        50,
                        110,
                        30),
                List.of(Ability.STURDY,Ability.LEVITATE), Ability.MAGNET_PULL,
                18, 5838,
                new Stats(0,1,2,0,0,0), 45,
                0.0,
                250, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its ragged, lengthy structure now houses multiple glowing eyes, each tuned to magnetic frequencies. Legends speak of Trypolisk's ability to decipher the earth's magnetic heartbeat, providing an uncanny sense of impending geological shifts. Trainers who encounter Trypolisk may unknowingly witness its influence, as the very ground seems to respond to the guardian's silent commands."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(37).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Trypolisk");

    }


}
