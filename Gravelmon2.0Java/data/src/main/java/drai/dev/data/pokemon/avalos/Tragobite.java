package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tragobite extends drai.dev.data.pokemon.Pokemon {
    public Tragobite() {
        super("Tragobite",
                Type.GROUND,
                new Stats(84,
                        90,
                        72,
                        72,
                        81,
                        51),
                List.of(Ability.OPENMAW), Ability.STRONG_JAW,
                11, 221,
                new Stats(1,0,0,0,0,0), 70,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,12),
                        new MoveLearnSetEntry(Move.DIG,16),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,20),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.SAND_TOMB,28),
                        new MoveLearnSetEntry(Move.AMBUSCADE,32),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,36),
                        new MoveLearnSetEntry(Move.FIRE_FANG,40),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,43),
                        new MoveLearnSetEntry(Move.AMNESIA,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,48),
                        new MoveLearnSetEntry(Move.FISSURE,51),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tragobite");

    }


}
