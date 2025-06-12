package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Impanzee extends drai.dev.data.pokemon.Pokemon {
    public Impanzee() {
        super("Impanzee",
                Type.FIRE, Type.DARK,
                new Stats(70,
                        95,
                        50,
                        60,
                        45,
                        100),
                List.of(Ability.BLAZE), Ability.PRANKSTER,
                12, 513,
                new Stats(0,1,0,0,0,1), 45,
                0.5,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("beelzeboon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,20),
                        new MoveLearnSetEntry(Move.FAKE_OUT,27),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,34),
                        new MoveLearnSetEntry(Move.CRUNCH,44),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,49)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_FOREST)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Impanzee");

    }


}
