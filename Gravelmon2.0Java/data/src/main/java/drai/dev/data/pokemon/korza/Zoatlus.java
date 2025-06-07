package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zoatlus extends drai.dev.data.pokemon.Pokemon {
    public Zoatlus() {
        super("Zoatlus",
                Type.ROCK,Type.FLYING,
                new Stats(75,
                        90,
                        75,
                        90,
                        65,
                        120),
                List.of(Ability.ROCK_HEAD), Ability.STEADFAST,
                21, 608,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                180, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("A long-extinct mon, believed to rule the skies of their time. Their extravagant plumage is theorized to be how their social heirarchy was determined, and were often found with extra decorations stuck inside."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,6),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,13),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,19),
                        new MoveLearnSetEntry(Move.BATON_PASS,23),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,28),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,32),
                        new MoveLearnSetEntry(Move.ACROBATICS,37),
                        new MoveLearnSetEntry(Move.AIR_SLASH,43),
                        new MoveLearnSetEntry(Move.POWER_GEM,48),
                        new MoveLearnSetEntry(Move.TAILWIND,54),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,59),
                        new MoveLearnSetEntry(Move.HURRICANE,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Zoatlus");

    }


}
