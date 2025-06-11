package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Setsubean extends drai.dev.data.pokemon.Pokemon {
    public Setsubean() {
        super("Setsubean",
                Type.GRASS, Type.PSYCHIC,
                new Stats(85,
                        89,
                        70,
                        89,
                        96,
                        51),
                List.of(Ability.WATER_ABSORB,Ability.COMPETITIVE), Ability.SEED_SOWER,
                17, 0,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("The salty liquid Beani produce slowly evolves into a sort of mental enhancer for the Pokemon, helping it evolve into Setsubean and unlocking it's full telekinetic abilities. If a trainer tastes the post-evolution liquid, they become susceptible to brainwashing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,4),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,16),
                        new MoveLearnSetEntry(Move.SYNTHESIS,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,22),
                        new MoveLearnSetEntry(Move.CONFUSION,25),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,31),
                        new MoveLearnSetEntry(Move.PSYCHIC,34),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,37),
                        new MoveLearnSetEntry(Move.STORED_POWER,40),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,46),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.POWER_WHIP,55),
                        new MoveLearnSetEntry(Move.LEAF_STORM,60)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Setsubean");

    }


}
