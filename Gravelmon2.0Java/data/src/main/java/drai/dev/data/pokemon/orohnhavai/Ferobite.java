package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Ferobite extends drai.dev.data.pokemon.Pokemon {
    public Ferobite() {
        super("Ferobite",
                Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("At a very young age, Ferobite begin to gnaw on almost anything they see. They chase down their prey and bite onto them tightly, not wanting to let go. They like to hunt alongside their parents, learning how to hunt."),
                List.of(new EvolutionEntry("purswayer", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
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

                        new MoveLearnSetEntry(Move.PLAY_ROUGH,44)                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ferobite");

    }


}
