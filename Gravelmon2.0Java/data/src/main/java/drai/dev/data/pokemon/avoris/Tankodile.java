package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tankodile extends drai.dev.data.pokemon.Pokemon {
    public Tankodile() {
        super("Tankodile",
                Type.GRASS, Type.WATER,
                new Stats(94,
                        104,
                        76,
                        66,
                        76,
                        77),
                List.of(Ability.ROUGH_SKIN,Ability.DAMP,Ability.STORM_DRAIN), Ability.STORM_DRAIN,
                22, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their bodies can expand to store up to 300 gallons of water. The flower on their back spins as it shoots water from their tails. Many are used by locals for water transport purposes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.ABSORB,6),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.GROWTH,15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,18),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,30),
                        new MoveLearnSetEntry(Move.THORN_FALL,35),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.WATERFALL,44),
                        new MoveLearnSetEntry(Move.SEED_BOMB,47),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,51)
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Tankodile");

    }


}
