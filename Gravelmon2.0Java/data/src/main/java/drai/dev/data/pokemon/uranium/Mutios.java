package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mutios extends Pokemon {
    public Mutios() {
        super("Mutios",
                Type.GHOST, Type.WATER,
                new Stats(110,
                        100,
                        120,
                        110,
                        160,
                        100),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                48, 3592,
                new Stats(1,0,1,0,1,0), 3,
                0.5,
                360, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("B l a c k s h a d e p r o t e c t s"),
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
    .setBiomes(Biome.IS_GLACIAL)
    .aboveY(200)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
