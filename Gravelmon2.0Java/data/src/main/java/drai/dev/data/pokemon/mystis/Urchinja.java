package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Urchinja extends drai.dev.data.pokemon.Pokemon {
    public Urchinja() {
        super("Urchinja",
                Type.POISON, Type.DARK,
                new Stats(50,
                        110,
                        55,
                        48,
                        25,
                        112),
                List.of(Ability.TECHNICIAN), Ability.SKILL_LINK,
                8, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Urchinja have a mysterious ability to retract their spines and 'feet' at will. It is unknown how many they have in total, as a fully spiny Urchinja can wipe out a horde of enemies faster than the eye can see. The spines are actually quite fragile, but Urchinja can use that to its advantage."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.BANEFUL_BUNKER,1),
                        new MoveLearnSetEntry(Move.RUSHDOWN,1),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.CLONEATTACK,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.SUDDEN_STRIKE,1),
                        new MoveLearnSetEntry(Move.PRICKLEBARBS,1),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,1),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Urchinja");

    }


}
