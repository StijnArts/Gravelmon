package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rotomb extends Pokemon {
    public Rotomb() {
        super("Rotomb",
                Type.ELECTRIC, Type.GHOST,
                new Stats(50,
                        108,
                        108,
                        108,
                        108,
                        108),
                List.of(Ability.LEVITATE, Ability.HAUNTING), Ability.MALICE,
                3, 3,
                new Stats(0,0,0,1,0,1), 45,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,10),
                        new MoveLearnSetEntry(Move.CHARGE,15),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,20),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,25),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,30),
                        new MoveLearnSetEntry(Move.HEX,35),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,40),
                        new MoveLearnSetEntry(Move.TRICK,45),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.UPROAR,55)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
    }
}
