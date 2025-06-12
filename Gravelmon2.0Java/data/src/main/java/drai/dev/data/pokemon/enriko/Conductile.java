package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Conductile extends drai.dev.data.pokemon.Pokemon {
    public Conductile() {
        super("Conductile",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                80, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("By arcing ambient electricity through its pronged horns, it can surge electricity through its teeth, making its bite seriously dangerous."),
                List.of(new EvolutionEntry("batterex", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(               new MoveLearnSetEntry(Move.PERFECT_GLARE,1),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Conductile");

    }


}
