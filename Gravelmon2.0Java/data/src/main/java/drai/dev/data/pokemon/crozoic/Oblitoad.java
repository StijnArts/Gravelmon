package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oblitoad extends drai.dev.data.pokemon.Pokemon {
    public Oblitoad(Stats stats) {
        super("Oblitoad",
                Type.DARK,Type.STEEL,
                stats,
                List.of(Ability.DRONINGNOISE,Ability.HEAVY_METAL), Ability.CONTRARY,
                10, 1486,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Its rumbling croaking can bring water to a boil. After using its call to forcibly evict all other life from a pond it has claimed, it will try to eat whatever's left."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,1),
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.PUNISHMENT,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,1),
                        new MoveLearnSetEntry(Move.RESONATE,1),
                        new MoveLearnSetEntry(Move.METAL_BURST,1),
                        new MoveLearnSetEntry(Move.POWER_SHIFT,1),
                        new MoveLearnSetEntry(Move.NATURESCALL,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Oblitoad");

    }


}
