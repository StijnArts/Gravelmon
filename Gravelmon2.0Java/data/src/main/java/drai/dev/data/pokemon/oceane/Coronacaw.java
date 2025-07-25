package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coronacaw extends drai.dev.data.pokemon.Pokemon {
    public Coronacaw() {
        super("Coronacaw",
                Type.NORMAL, Type.FLYING,
                new Stats(70,
                        90,
                        75,
                        90,
                        65,
                        100),
                List.of(Ability.SWIFT_SWIM), Ability.MULTISCALE,
                18, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_2),
                List.of("The Coronacaw with the largest crest will lead the colony. Although seemingly fragile, the crests can withstand tremendous force and make good shields. Shards that break off become 'sea glass' and wash up on beaches, and are very popular with collectors."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SING,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.AQUA_RING,14),
                        new MoveLearnSetEntry(Move.TWISTER,18),
                        new MoveLearnSetEntry(Move.DEFOG,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.TORPEDODASH,32),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setCanFly(true);

    }


}
