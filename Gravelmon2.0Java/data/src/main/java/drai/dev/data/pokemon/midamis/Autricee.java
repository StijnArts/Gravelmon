package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Autricee extends drai.dev.data.pokemon.Pokemon {
    public Autricee() {
        super("Autricee",
                Type.ELECTRIC, Type.FAIRY,
                new Stats(115,
                        115,
                        115,
                        115,
                        115,
                        115),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                36, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.MACH_BOLT,1),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,34),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,39),
                        new MoveLearnSetEntry(Move.CRUNCH,43),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,57)
                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Autricee");

    }


}
