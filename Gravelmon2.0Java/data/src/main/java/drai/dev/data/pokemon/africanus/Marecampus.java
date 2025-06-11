package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marecampus extends drai.dev.data.pokemon.Pokemon {
    public Marecampus() {
        super("Marecampus",
                Type.WATER,Type.POISON,
                new Stats(100,
                        95,
                        130,
                        71,
                        87,
                        72),
                List.of(Ability.SWIFT_SWIM), null,
                19, 225,
                new Stats(0,0,1,0,0,1), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("Marecampus es un fiero pokémon enviado por Neptuno,sus devastadores coletazos pueden provocar olas de hasta 7 metros."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,32),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,40),
                        new MoveLearnSetEntry(Move.AQUA_JET,24),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,44),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.CROSS_POISON,36),
                        new MoveLearnSetEntry(Move.COLANEPTUNO,55),
                        new MoveLearnSetEntry(Move.LIQUIDATION,48),
                        new MoveLearnSetEntry(Move.POISON_TAIL,20),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.POISON_STING,10)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Marecampus");

    }


}
