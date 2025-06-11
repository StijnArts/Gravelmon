package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Diamondure extends drai.dev.data.pokemon.Pokemon {
    public Diamondure(Stats stats) {
        super("Diamondure",
                Type.STEEL,
                stats,
                List.of(Ability.STURDY,Ability.CLEAR_BODY,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                18, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their indestructibly-hard heads polished to perfection captivate lovers of both toughness and beauty. It's believed that they all have one small structural weak point, the position of which is unique to each Diamondure."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        learnSet.add(new MoveLearnSetEntry(Move.ROCK_POLISH, 35));
           setLangFileName("Diamondure");

    }


}
