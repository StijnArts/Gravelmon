package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Emberge extends Pokemon {
    public Emberge() {
        super("Emberge",
                Type.FIRE, Type.GHOST,
                new Stats(45,
                        40,
                        65,
                        40,
                        65,
                        15),
                List.of(Ability.FLAME_BODY), Ability.REGENERATOR,
                5, 150,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                54, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.FLYING),
                List.of("This Pokemon is born at sites of calamitous fires. Though still hot to the touch, its flames only burn at 200 degrees Fahrenheit."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WILLOWISP,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SOFTBOILED,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_FOREST)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NEAR_LAVA)
    .build(), List.of());
	
        setCanFly(true);
    }
}
