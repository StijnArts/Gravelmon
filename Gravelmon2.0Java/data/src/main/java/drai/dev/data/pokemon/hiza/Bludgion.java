package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bludgion extends drai.dev.data.pokemon.Pokemon {
    public Bludgion() {
        super("Bludgion",
                Type.ICE, Type.STEEL,
                new Stats(81,
                        122,
                        60,
                        72,
                        80,
                        77),
                List.of(Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                12, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It utilizes its powerful tail to break through thick layers of ice. If one of the tail spikes break, it eventually regenerates."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.ICE_BALL,5),
                        new MoveLearnSetEntry(Move.FROST_BREATH,12),
                        new MoveLearnSetEntry(Move.METAL_CLAW,16),
                        new MoveLearnSetEntry(Move.ICE_SHARD,21),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.METEOR_MASH,30),
                        new MoveLearnSetEntry(Move.ICYCHARGE,34),
                        new MoveLearnSetEntry(Move.SLAM,39),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,46),
                        new MoveLearnSetEntry(Move.GUILLOTINE,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PEAK)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bludgion");

    }


}
