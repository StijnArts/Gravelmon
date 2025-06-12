package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Moltank extends drai.dev.data.pokemon.Pokemon {
    public Moltank() {
        super("Moltank",
                Type.FIRE, Type.GROUND,
                new Stats(105,
                        70,
                        105,
                        70,
                        105,
                        40),
                List.of(Ability.MAGMA_ARMOR), Ability.BULLETPROOF,
                33, 165,
                new Stats(0,0,1,0,1,0), 150,
                0.25,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Moltank lives deep underground inside fiery hot caves, when the herds move too much they can cause small tremors on the surface."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.YAWN,9),
                        new MoveLearnSetEntry(Move.INCINERATE,14),
                        new MoveLearnSetEntry(Move.MAGNITUDE,18),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,23),
                        new MoveLearnSetEntry(Move.EARTH_POWER,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.SNORE,39),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,51),
                        new MoveLearnSetEntry(Move.ERUPTION,59)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_LAVA)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
