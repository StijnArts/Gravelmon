package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Selveger extends drai.dev.data.pokemon.Pokemon {
    public Selveger() {
        super("Selveger",
                Type.GRASS, Type.GROUND,
                new Stats(103,
                        127,
                        90,
                        90,
                        90,
                        80),
                List.of(Ability.PRESSURE), Ability.TOUGH_CLAWS,
                28, 165,
                new Stats(1,2,0,0,0,0), 3,
                0.5,
                270, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,1),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,6),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,13),
                        new MoveLearnSetEntry(Move.SCARY_FACE,22),
                        new MoveLearnSetEntry(Move.DIG,29),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,37),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,45),
                        new MoveLearnSetEntry(Move.ROAR,53),
                        new MoveLearnSetEntry(Move.SAVAGESLASH,62),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,70),
                        new MoveLearnSetEntry(Move.SUPERPOWER,79),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,87),
                        new MoveLearnSetEntry(Move.FISSURE,94)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Selveger");

    }


}
