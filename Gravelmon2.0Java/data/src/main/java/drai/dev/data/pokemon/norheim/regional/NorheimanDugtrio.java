package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanDugtrio extends drai.dev.data.pokemon.Pokemon {
    public NorheimanDugtrio(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Dugtrio",
                Type.GHOST, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Three times spookier than Norheiman Diglett. This haunting trio has lost their ability to burrow themselves deep underground. Instead, they move sideways at a slow speed. Their hands primary purpose is to wave them around, scaring off foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,20),
                        new MoveLearnSetEntry(Move.CURSE,24),
                        new MoveLearnSetEntry(Move.MAGNITUDE,27),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,32),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,37),
                        new MoveLearnSetEntry(Move.FLING,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,51),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dugtrio");

    }


}
