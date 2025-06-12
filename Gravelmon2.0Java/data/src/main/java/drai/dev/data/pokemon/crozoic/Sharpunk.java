package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sharpunk extends drai.dev.data.pokemon.Pokemon {
    public Sharpunk() {
        super("Sharpunk",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SAND_FORCE,Ability.TANTRUM), Ability.HUSTLE,
                8, 120,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("spurocious", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHEDFANGS,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.OBSTRUCT,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)
                ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
           setLangFileName("Sharpunk");

    }


}
