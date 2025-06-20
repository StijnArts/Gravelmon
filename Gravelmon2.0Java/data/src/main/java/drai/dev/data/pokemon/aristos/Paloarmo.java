package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Paloarmo extends drai.dev.data.pokemon.Pokemon {
    public Paloarmo() {
        super("Pharoar",
                Type.GROUND, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RIVALRY,Ability.SAND_RUSH,Ability.SAND_FORCE), Ability.SAND_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They often ambush prey by popping out of sand and deliver decisive blows with both their claws and tail. Their beautiful manes also inspired the fashion of ancient civilizations. Like Pyroar, the females are more aggressive while the males act more refined."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pharoar");

    }


}
