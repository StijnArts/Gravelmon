package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lamber extends drai.dev.data.pokemon.Pokemon {
    public Lamber() {
        super("Lamber",
                Type.FIRE,
                new Stats(45,
                        40,
                        54,
                        51,
                        62,
                        45),
                List.of(Ability.FLAME_BODY), Ability.FLUFFY,
                5, 82,
                new Stats(0,0,0,0,1,0), 75,
                0.875,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Lamber are commonly kept for their wool. It is said that nothing is warmer than a pair of Lamber wool socks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,9),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.STOMP,15),
                        new MoveLearnSetEntry(Move.SAFEGUARD,18),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,21),
                        new MoveLearnSetEntry(Move.BODY_SLAM,25),
                        new MoveLearnSetEntry(Move.FLAMEWOOL,32),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,37),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.HEAL_BELL,51),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,56)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lamber");

    }


}
