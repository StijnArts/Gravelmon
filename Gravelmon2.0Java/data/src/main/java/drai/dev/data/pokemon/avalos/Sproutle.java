package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sproutle extends drai.dev.data.pokemon.Pokemon {
    public Sproutle() {
        super("Sproutle",
                Type.GRASS,
                new Stats(57,
                        45,
                        77,
                        31,
                        45,
                        20),
                List.of(Ability.SOLID_ROCK,Ability.CHLOROPHYLL), Ability.TANGLED_FEET,
                8, 346,
                new Stats(0,0,1,0,0,0), 210,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Sproutle were originally just regular pots that were filled with leftover soil that was used to host Beani, enchanting it and thusly bringing Sproutle to life. These small pots love to find seeds to put into their head to see what they bloom into."),
                List.of(new EvolutionEntry("dyramic", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.GROWTH,4),
                        new MoveLearnSetEntry(Move.LEECH_SEED,7),
                        new MoveLearnSetEntry(Move.BULLET_SEED,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.INGRAIN,19),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,22),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,25),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,37),
                        new MoveLearnSetEntry(Move.SEED_BOMB,43),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,48),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm")                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Sproutle");

    }


}
