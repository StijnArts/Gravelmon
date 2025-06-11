package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Artifire extends drai.dev.data.pokemon.Pokemon {
    public Artifire() {
        super("Artifire",
                Type.FIRE, Type.BUG,
                new Stats(35,
                        96,
                        35,
                        121,
                        90,
                        113),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                15, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.SINGE,3),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOG,11),
                        new MoveLearnSetEntry(Move.ME_FIRST,16),
                        new MoveLearnSetEntry(Move.SWIFT,21),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,43),
                        new MoveLearnSetEntry(Move.ACROBATICS,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,60),
                        new MoveLearnSetEntry(Move.BARRAGE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CHERRY_GROVE)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
