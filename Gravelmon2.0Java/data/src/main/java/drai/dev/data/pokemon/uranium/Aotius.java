package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Aotius extends Pokemon {
    public Aotius() {
        super("Aotius",
                Type.FLYING, Type.FIRE,
                new Stats(110,
                        100,
                        110,
                        160,
                        100,
                        120),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                48, 3592,
                new Stats(1,0,1,0,1,0), 3,
                0.5,
                360, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("W h i t e l i g h t s h i n e s"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ATOMIC_PUNCH,1),
                        new MoveLearnSetEntry(Move.NUCLEAR_WASTE,10),
                        new MoveLearnSetEntry(Move.HALFLIFE,30)
                        ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .aboveY(200)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
