package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terrevour extends drai.dev.data.pokemon.Pokemon {
    public Terrevour() {
        super("Terrevour",
                Type.GROUND, Type.DARK,
                new Stats(85,
                        115,
                        70,
                        80,
                        70,
                        90),
                List.of(Ability.SAND_FORCE), Ability.STRONG_JAW,
                18, 781,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Terrevour will attempt to devour any Pokémon, being able to even bite through Aggron's steel. Old tyrants would feed Pokémon who failed in battle to their Terrevour."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,6),
                        new MoveLearnSetEntry(Move.SAND_TOMB,9),
                        new MoveLearnSetEntry(Move.SCARY_FACE,12),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.TORMENT,18),
                        new MoveLearnSetEntry(Move.DIG,21),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,33),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,36),
                        new MoveLearnSetEntry(Move.THRASH,39)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Terrevour");

    }


}
