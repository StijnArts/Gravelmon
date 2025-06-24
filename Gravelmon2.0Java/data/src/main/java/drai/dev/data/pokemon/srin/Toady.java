package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toady extends drai.dev.data.pokemon.Pokemon {
    public Toady(Stats stats) {
        super("Toady",
                Type.GROUND,Type.FIGHTING,
                stats,
                List.of(Ability.SIMPLE,Ability.STICKY_HOLD), Ability.RATTLED,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.FISSURE,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .setMinLevel(40).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MANGROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Toadyō");

    }


}
