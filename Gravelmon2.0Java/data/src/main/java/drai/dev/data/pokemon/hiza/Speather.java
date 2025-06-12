package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Speather extends drai.dev.data.pokemon.Pokemon {
    public Speather() {
        super("Speather",
                Type.FLYING, Type.WATER,
                new Stats(80,
                        90,
                        70,
                        100,
                        70,
                        90),
                List.of(Ability.WATER_VEIL), Ability.GALE_WINGS,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Being able to pierce the water, they can drop down from high altitudes and dive up to 15 meters deep to catch their prey."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.SUPERSONIC,10),
                        new MoveLearnSetEntry(Move.WING_ATTACK,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.AGILITY,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.MIST,35),
                        new MoveLearnSetEntry(Move.ROOST,40),
                        new MoveLearnSetEntry(Move.HURRICANE,45)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN, Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_SPRING, Biome.IS_SUMMER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
