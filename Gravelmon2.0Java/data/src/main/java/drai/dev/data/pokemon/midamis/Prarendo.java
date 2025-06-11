package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Prarendo extends drai.dev.data.pokemon.Pokemon {
    public Prarendo() {
        super("Prarendo",
                Type.GRASS, Type.ELECTRIC,
                new Stats(75,
                        65,
                        55,
                        90,
                        60,
                        45),
                List.of(Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                12, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("paradeano", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(   new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.TICKLE,14),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.WORRY_SEED,31),
                        new MoveLearnSetEntry(Move.FACEPLANT,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,38),
                        new MoveLearnSetEntry(Move.ROTOTILLER,43),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,48),
                        new MoveLearnSetEntry(Move.POWER_WHIP,53)                     ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Prarendo");

    }


}
