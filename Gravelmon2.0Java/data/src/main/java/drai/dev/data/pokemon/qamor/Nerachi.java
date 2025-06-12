package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Nerachi extends drai.dev.data.pokemon.Pokemon {
    public Nerachi() {
        super("Nerachi",
                Type.WATER, Type.ROCK,
                new Stats(126,
                        46,
                        90,
                        60,
                        85,
                        30),
                List.of(Ability.STURDY,Ability.PICKUP,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                22, 165,
                new Stats(2,0,0,0,0,0), 50,
                0.5,
                196, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Nerachi are kind, slow swimming Pokemon who have taken it upon themselves to protect coral reefs and the Pokemon who call it home. They collect garbage and litter and keep it in their shells, which turns the trash into beautiful pearls."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,15),
                        new MoveLearnSetEntry(Move.RECYCLE,19),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,21),
                        new MoveLearnSetEntry(Move.FLING,27),
                        new MoveLearnSetEntry(Move.STOCKPILE,30),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,33),
                        new MoveLearnSetEntry(Move.POWER_GEM,35),
                        new MoveLearnSetEntry(Move.BELCH,40),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.PURIFY,47),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,50),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.REEFBARRIER,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 31, 47, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
