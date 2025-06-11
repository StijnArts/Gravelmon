package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Oarora extends drai.dev.data.pokemon.Pokemon {
    public Oarora() {
        super("Oarora",
                Type.DRAGON, Type.ICE,
                new Stats(70,
                        70,
                        60,
                        110,
                        100,
                        80),
                List.of(Ability.LEVITATE,Ability.MAGIC_BOUNCE,Ability.PSYCHIC_SURGE), Ability.PSYCHIC_SURGE,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Oarora's scales spark like diamonds and gives off magnetic energy that can break a compass from afar. None truly understands its powers but it is said to gather energy from outer space."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,16),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,24),
                        new MoveLearnSetEntry(Move.BARRIER,34),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,38),
                        new MoveLearnSetEntry(Move.GRAVITY,42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,48),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,55),
                        new MoveLearnSetEntry(Move.PSYSHOCK,62),
                        new MoveLearnSetEntry(Move.ICE_BEAM,68),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"tm"),
                        new MoveLearnSetEntry(Move.COIL,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Oarora");

    }


}
