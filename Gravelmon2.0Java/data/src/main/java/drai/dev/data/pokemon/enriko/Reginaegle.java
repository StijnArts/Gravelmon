package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Reginaegle extends drai.dev.data.pokemon.Pokemon {
    public Reginaegle() {
        super("Reginaegle",
                Type.GRASS, Type.FLYING,
                new Stats(50,
                        120,
                        95,
                        100,
                        75,
                        90),
                List.of(Ability.WATER_ABSORB,Ability.WEAK_ARMOR,Ability.AERILATE), Ability.AERILATE,
                16, 165,
                new Stats(0,2,0,1,0,2), 65,
                0.5,
                211, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of("The fact that it has multiple heads would seem like a major downside, but amazingly, Reginaegle has no problem flying or even sharing its food despite its polycephaly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,1),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,30),
                        new MoveLearnSetEntry(Move.WING_ATTACK,34),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,48),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Reginaegle");

    }


}
