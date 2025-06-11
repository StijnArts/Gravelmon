package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ratonine extends drai.dev.data.pokemon.Pokemon {
    public Ratonine() {
        super("Ratonine",
                Type.NORMAL, Type.FIGHTING,
                new Stats(75,
                        120,
                        65,
                        40,
                        70,
                        90),
                List.of(Ability.HUSTLE,Ability.GUTS,Ability.ANGER_POINT), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                90, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its tail splits into several prehensile whips. It also has a cruel fighting style; other Fighting-types don't like being associated with it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.SWAGGER,20),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,26),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.JUMP_KICK,36),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,42),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Ratonine");

    }


}
