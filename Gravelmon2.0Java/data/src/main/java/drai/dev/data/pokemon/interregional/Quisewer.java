package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Quisewer extends drai.dev.data.pokemon.Pokemon {
    public Quisewer() {
        super("Quisewer",
                Type.POISON, Type.DARK,
                new Stats(70,
                        72,
                        114,
                        81,
                        95,
                        51),
                List.of(Ability.STENCH,Ability.STICKY_HOLD,Ability.GOOEY), Ability.GOOEY,
                18, 165,
                new Stats(2,0,0,0,0,0), 80,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Quisewer's horrid appearance makes it an unpopular choice among trainers. They are known to be insanely greedy, only obeying those who feed it lots of garbage."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.MUD_SHOT,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,24),
                        new MoveLearnSetEntry(Move.FLING,27),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,30),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,36),
                        new MoveLearnSetEntry(Move.RECYCLE,40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,45),
                        new MoveLearnSetEntry(Move.TORMENT,51),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,56),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,62),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Quisewer");

    }


}
