package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bourubble extends drai.dev.data.pokemon.Pokemon {
    public Bourubble() {
        super("Bourubble",
                Type.ROCK,
                new Stats(86,
                        128,
                        127,
                        53,
                        67,
                        54),
                List.of(Ability.STEELWORKER), Ability.STEELWORKER,
                24, 4700,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                231, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Evo Hammer Arm Fighting - Sand Attack Ground - Tackle Normal 5 Sharpen Normal 8 Rock ThrowSTAB Rock 11 Metal Claw Steel 16 Metal Sound Steel 19 Sandstorm Rock 22 Rock SlideSTAB Rock 28 Autotomize Steel 31 Block Normal 34 Body Slam Normal 38 Metal Burst Steel 41 Wide Guard Rock 48 Heavy Slam Steel 53 Double-Edge Normal 60 Rock WreckerSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SHARPEN,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.METAL_CLAW,11),
                        new MoveLearnSetEntry(Move.METAL_SOUND,16),
                        new MoveLearnSetEntry(Move.SANDSTORM,19),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,22),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,28),
                        new MoveLearnSetEntry(Move.BLOCK,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.METAL_BURST,38),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,41),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,53),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,60),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bourubble");

    }


}
