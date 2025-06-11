package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Nordirk extends drai.dev.data.pokemon.Pokemon {
    public Nordirk() {
        super("Nordirk",
                Type.ICE,
                new Stats(55,
                        45,
                        45,
                        45,
                        55,
                        45),
                List.of(Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                7, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nordirk carve intricate tunnel systems inside of glaciers, collecting blue ice back to their dens to be crafted into weapons and armor."),
                List.of(new EvolutionEntry("vikice", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31"))),
                        new EvolutionEntry("valkryce", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.AVALANCHE,16),
                        new MoveLearnSetEntry(Move.HAIL,20),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,24),
                        new MoveLearnSetEntry(Move.UPROAR,28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,32),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,38),
                        new MoveLearnSetEntry(Move.ICE_BEAM,44),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,60),
                        new MoveLearnSetEntry(Move.DIG,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nordirk");

    }


}
