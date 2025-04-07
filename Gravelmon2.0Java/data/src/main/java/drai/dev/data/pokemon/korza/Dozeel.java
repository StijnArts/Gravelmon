package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dozeel extends drai.dev.data.pokemon.Pokemon {
    public Dozeel() {
        super("Dozeel",
                Type.WATER,
                new Stats(90,
                        60,
                        95,
                        80,
                        80,
                        65),
                List.of(Ability.ADAPTABILITY,Ability.HYDRATION), Ability.DREAMER,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Dozeel is perpetually sleeping, able to swim and even battle while it slumbers. The pearl atop its forehead is highly prized by collectors."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.GROWL,2),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.SLAM,11),
                        new MoveLearnSetEntry(Move.WRAP,17),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BODY_SLAM,23),
                        new MoveLearnSetEntry(Move.DISABLE,27),
                        new MoveLearnSetEntry(Move.YAWN,32),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,38),
                        new MoveLearnSetEntry(Move.REST,42),
                        new MoveLearnSetEntry(Move.FLAIL,47),
                        new MoveLearnSetEntry(Move.DREAM_EATER,51),
                        new MoveLearnSetEntry(Move.HYPNOSIS,54),
                        new MoveLearnSetEntry(Move.MIST,59),
                        new MoveLearnSetEntry(Move.BATON_PASS,63),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dozeel");

    }


}
