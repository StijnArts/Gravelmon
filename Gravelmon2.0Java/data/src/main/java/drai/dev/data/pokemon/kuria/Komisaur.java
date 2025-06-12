package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Komisaur extends drai.dev.data.pokemon.Pokemon {
    public Komisaur() {
        super("Komisaur",
                Type.ROCK, Type.COSMIC,
                new Stats(55,
                        70,
                        90,
                        30,
                        55,
                        33),
                List.of(Ability.SOLID_ROCK,Ability.ENTERSPHERE), Ability.STURDY,
                7, 536,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                88, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("clusteorus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(          new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.BLOCK,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.COUNTER,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55)              ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END, Biome.IS_BADLANDS, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Komisaur");

    }


}
