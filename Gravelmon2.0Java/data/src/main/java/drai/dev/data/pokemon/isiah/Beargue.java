package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beargue extends drai.dev.data.pokemon.Pokemon {
    public Beargue() {
        super("Beargue",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("urslash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,4),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.LEER,13),
                        new MoveLearnSetEntry(Move.ROAR,16),
                        new MoveLearnSetEntry(Move.SWAGGER,19),
                        new MoveLearnSetEntry(Move.ASSURANCE,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,25),
                        new MoveLearnSetEntry(Move.TAUNT,28),
                        new MoveLearnSetEntry(Move.CRUNCH,31),
                        new MoveLearnSetEntry(Move.YAWN,34),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,36),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,44)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Beargue");

    }


}
