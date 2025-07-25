package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Batterex extends drai.dev.data.pokemon.Pokemon {
    public Batterex() {
        super("Batterex",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(98,
                        85,
                        85,
                        48,
                        76,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Its entire skeleton is lined with copper alloy, forming an open circuit that closes when it shuts its jaws. Its blunt teeth serve as capacitors to fill its target with lethal amounts of electricity."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.PERFECT_GLARE,1),
                        new MoveLearnSetEntry(Move.ELECTROWEB,1),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.COIL,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.ATTRACT,18),
                        new MoveLearnSetEntry(Move.FLAIL,24),
                        new MoveLearnSetEntry(Move.HISS,30),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,36),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,41),
                        new MoveLearnSetEntry(Move.COIL,45),
                        new MoveLearnSetEntry(Move.WRING_OUT,51),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,57),
                        new MoveLearnSetEntry(Move.PERFECT_GLARE,62),
                        new MoveLearnSetEntry(Move.DISCHARGE,67)         ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Batterex");

    }


}
