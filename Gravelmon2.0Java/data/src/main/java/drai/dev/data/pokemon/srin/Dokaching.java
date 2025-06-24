package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dokaching extends drai.dev.data.pokemon.Pokemon {
    public Dokaching(Stats stats) {
        super("Dokaching",
                Type.COSMIC,Type.STEEL,
                stats,
                List.of(Ability.LEVITATE), Ability.GOOD_AS_GOLD,
                14, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("D'oka-ching's body consists of plenty coins. They are nearly impossible to catch due to their constant falling in-and-out of portals. Catching even one of them can corrupt one's soul."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.MAKE_IT_RAIN,1),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,1),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.PAY_DAY,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("D'oka-ching");

    }


}
