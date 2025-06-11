package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bloomage extends Pokemon {
    public Bloomage() {
        super("Bloomage",
                Type.FIRE, Type.GRASS,
                new Stats(80, 70, 75, 100, 90, 105),
                List.of(Ability.VEGETATE, Ability.SOLAR_POWER), Ability.BLOOMSPRING,
                17, 3180,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FLYING),
                List.of("Shooting fireballs everywhere, they are known for causing trouble and chaos wherever they run to."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,4),
                        new MoveLearnSetEntry(Move.GROWTH,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,17),
                        new MoveLearnSetEntry(Move.BULLET_SEED,21),
                        new MoveLearnSetEntry(Move.HEADBUTT,24),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,28),
                        new MoveLearnSetEntry(Move.WORRY_SEED,33),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.SEED_BOMB,44),
                        new MoveLearnSetEntry(Move.OVERHEAT,48),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,48),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"egg"),
                        new MoveLearnSetEntry(Move.SPICY_EXTRACT,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
