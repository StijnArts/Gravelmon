package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Protebat extends drai.dev.data.pokemon.Pokemon {
    public Protebat() {
        super("Protebat",
                Type.ROCK, Type.FLYING,
                new Stats(76,
                        87,
                        88,
                        44,
                        78,
                        56),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 125,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MINERAL),
                List.of("Because of the rocky armor covering its body, Protebat's wings are useless for flight, but it uses them to guard against attacks. It can fold completely into a ball and resemble an ordinary stone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,1),
                        new MoveLearnSetEntry(Move.WINDBLAST,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.BODY_PRESS,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,1)
                ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.AMETHYST_GEODE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Protebat");

    }


}
