package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tasmevil extends drai.dev.data.pokemon.Pokemon {
    public Tasmevil() {
        super("Tasmevil",
                Type.DARK,
                new Stats(53,
                        95,
                        80,
                        70,
                        54,
                        81),
                List.of(Ability.ANGER_POINT,Ability.RIVALRY,Ability.GLUTTONY), Ability.GLUTTONY,
                10, 165,
                new Stats(0,2,0,0,0,0), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("They are known to attack even when unprovoked, however due to their nocturnal nature they are mostly passive during the day."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.TACKLE,1),
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
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tasmevil");

    }


}
