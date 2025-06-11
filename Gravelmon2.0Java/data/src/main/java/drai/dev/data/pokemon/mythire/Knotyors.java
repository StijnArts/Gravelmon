package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Knotyors extends drai.dev.data.pokemon.Pokemon {
    public Knotyors() {
        super("Knotyors",
                Type.DRAGON,
                new Stats(87,
                        44,
                        76,
                        76,
                        76,
                        55),
                List.of(Ability.TANGLED_FEET,Ability.LIMBER,Ability.AVARICE), Ability.AVARICE,
                16, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Some believe that the gold nugget that it's wrapped around is actually an egg. These Pokemon are always trying to steal each other's gold nuggets, so some Knotyors will even try to eat their gold to hide it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PAY_DAY,1),
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.COIL,1),
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1)
                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.GEMSTONES)
    .build(), List.of());
	
           setLangFileName("Knotyors");

    }


}
