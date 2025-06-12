package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fishereel extends drai.dev.data.pokemon.Pokemon {
    public Fishereel(Stats stats) {
        super("Fishereel",
                Type.WATER,
                stats,
                List.of(Ability.REELIN), Ability.ANALYTIC,
                16, 513,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("It's not a great swimmer, so it fishes on the water's edge. When it dips its head into the water, it does so to attract prey with its fish-like guise."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SNATCH,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Fishereel");

    }


}
