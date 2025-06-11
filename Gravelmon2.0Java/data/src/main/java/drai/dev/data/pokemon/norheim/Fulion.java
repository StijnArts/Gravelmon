package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fulion extends drai.dev.data.pokemon.Pokemon {
    public Fulion() {
        super("Fulion",
                Type.STEEL, Type.FIRE,
                new Stats(75,
                        100,
                        100,
                        100,
                        75,
                        75),
                List.of(Ability.STEELY_SPIRIT), Ability.STEELY_SPIRIT,
                17, 0,
                new Stats(0,0,0,0,0,0), 56,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROAR,8),
                        new MoveLearnSetEntry(Move.FLAME_BURST,20),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,28),
                        new MoveLearnSetEntry(Move.FIRE_FANG,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,45),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,50),
                        new MoveLearnSetEntry(Move.CRUNCH,56),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,62)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Fulion");

    }


}
