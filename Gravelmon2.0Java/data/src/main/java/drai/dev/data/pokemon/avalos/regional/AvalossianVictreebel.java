package drai.dev.data.pokemon.avalos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvalossianVictreebel extends drai.dev.data.pokemon.Pokemon {
    public AvalossianVictreebel(String name, Aspect aspect) {
        super(name, aspect, "Paras",
                Type.GRASS, Type.DARK,
                new Stats(75,
                        100,
                        75,
                        110,
                        70,
                        75),
                List.of(Ability.CORROSION), Ability.SCAVENGE,
                17, 0,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.BULLET_SEED,16),
                        new MoveLearnSetEntry(Move.POWER_TRIP,19),
                        new MoveLearnSetEntry(Move.INGRAIN,22),
                        new MoveLearnSetEntry(Move.PAYBACK,26),
                        new MoveLearnSetEntry(Move.SPIKES,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,34),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,42),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,46),
                        new MoveLearnSetEntry(Move.SANDSTORM,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,54)
                ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	setLangFileName("Paras");

    }
}
