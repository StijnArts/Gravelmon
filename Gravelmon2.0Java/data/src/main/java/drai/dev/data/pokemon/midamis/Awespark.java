package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Awespark extends drai.dev.data.pokemon.Pokemon {
    public Awespark() {
        super("Awespark",
                Type.ELECTRIC,
                new Stats(45,
                        35,
                        35,
                        50,
                        45,
                        35),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                3, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("awesurge", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN, Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Awespark");

    }


}
