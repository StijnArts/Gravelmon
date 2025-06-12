package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gatherelf extends drai.dev.data.pokemon.Pokemon {
    public Gatherelf() {
        super("Gatherelf",
                Type.FAIRY, Type.GROUND,
                new Stats(80,
                        70,
                        60,
                        95,
                        95,
                        85),
                List.of(Ability.SAND_RUSH,Ability.PICKUP,Ability.COMPETITIVE), Ability.COMPETITIVE,
                11, 165,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("When a Gatherelf enters a home, it generally wants to help tidy the place up. Annoy one, however, and it will make a terrible mess and never return."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DUST_KICK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,9),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,12),
                        new MoveLearnSetEntry(Move.BESTOW,15),
                        new MoveLearnSetEntry(Move.SAND_TOMB,18),
                        new MoveLearnSetEntry(Move.DECORATE,22),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,25),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,30),
                        new MoveLearnSetEntry(Move.TIDY_UP,34),
                        new MoveLearnSetEntry(Move.SANDSHOT,40),
                        new MoveLearnSetEntry(Move.SWITCHEROO,44),
                        new MoveLearnSetEntry(Move.PIXIEDUST,50),
                        new MoveLearnSetEntry(Move.DUSTTORNADO,55),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"tm"),
                        new MoveLearnSetEntry(Move.GUST,"tm"),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 26, 41, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Gatherelf");

    }


}
