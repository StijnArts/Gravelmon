package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mosskrat extends Pokemon {
    public Mosskrat() {
        super("Mosskrat",
                Type.GRASS, Type.WATER,
                new Stats(80,
                        90,
                        90,
                        90,
                        80,
                        65),
                List.of(Ability.RAIN_DISH, Ability.BLOOMSPRING), Ability.SAP_SIPPER,
                9, 185,
                new Stats(0,0,2,0,0,0), 127,
                0.5,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of("Mosskrat run around in small packs, they choose the leader by who has the longest tail, although some packs follow alternate colored Mosskrat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,3),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,9),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.LEECH_SEED,24),
                        new MoveLearnSetEntry(Move.AFTER_YOU,27),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,36),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,39),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
    }
}
