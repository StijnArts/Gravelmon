package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Furyture extends drai.dev.data.pokemon.Pokemon {
    public Furyture() {
        super("Furyture",
                Type.GHOST, Type.NORMAL,
                new Stats(66,
                        88,
                        88,
                        66,
                        98,
                        56),
                List.of(Ability.LEVITATE), Ability.ANGER_POINT,
                12, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Notorious for breaking the spell of young love. Furyture gathers the anger from couples trying to piece together cheap furniture parts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SPITE,8),
                        new MoveLearnSetEntry(Move.BIDE,13),
                        new MoveLearnSetEntry(Move.HEX,18),
                        new MoveLearnSetEntry(Move.FRUSTRATION,26),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,32),
                        new MoveLearnSetEntry(Move.MEGA_KICK,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,56),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,66),
                        new MoveLearnSetEntry(Move.OUTRAGE,78)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Furyture");

    }


}
