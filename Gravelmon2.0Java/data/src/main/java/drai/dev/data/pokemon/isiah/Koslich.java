package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Koslich extends drai.dev.data.pokemon.Pokemon {
    public Koslich() {
        super("Koslich",
                Type.DARK,
                new Stats(94,
                        69,
                        131,
                        131,
                        124,
                        87
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,8),
                        new MoveLearnSetEntry(Move.ASSIST,13),
                        new MoveLearnSetEntry(Move.PURSUIT,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.PAY_DAY,25),
                        new MoveLearnSetEntry(Move.TORMENT,28),
                        new MoveLearnSetEntry(Move.FAKE_OUT,32),
                        new MoveLearnSetEntry(Move.CORNER,37),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,40),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,44),
                        new MoveLearnSetEntry(Move.DARK_PULSE,49)              ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Koslich");

    }


}
