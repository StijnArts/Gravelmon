package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Torpepo extends drai.dev.data.pokemon.Pokemon {
    public Torpepo() {
        super("Torpepo",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.MEGA_LAUNCHER,
                12, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("melauncher", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,3),
                        new MoveLearnSetEntry(Move.LEAFAGE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,43),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,48)
                ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Torpepo");

    }


}
