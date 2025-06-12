package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Titanodon extends drai.dev.data.pokemon.Pokemon {
    public Titanodon() {
        super("Titanodon",
                Type.DRAGON, Type.ROCK,
                new Stats(100,
                        135,
                        115,
                        80,
                        95,
                        75),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                25, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Titanodon is a very destructive Pokemon. It can destroy big buildings with ease and is always up for a challenge against other strong Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.HEADBUTT,11),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,15),
                        new MoveLearnSetEntry(Move.SCREECH,21),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,31),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,49),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,56),
                        new MoveLearnSetEntry(Move.BODY_SLAM,60),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,66),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,71),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,77)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(64)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Titanodon");

    }


}
