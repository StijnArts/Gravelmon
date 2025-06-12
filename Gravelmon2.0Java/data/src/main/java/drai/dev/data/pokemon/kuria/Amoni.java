package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Amoni extends drai.dev.data.pokemon.Pokemon {
    public Amoni() {
        super("Amoni",
                Type.ICE, Type.FIRE,
                new Stats(35,
                        60,
                        30,
                        82,
                        30,
                        73),
                List.of(Ability.BLAST), Ability.THERMALPOWER,
                2, 168,
                new Stats(0,0,0,1,0,0), 60,
                0.0,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("adizine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")
                                ))),
                List.of(
                        new MoveLearnSetEntry(Move.LIGHTUP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.HAZE,11),
                        new MoveLearnSetEntry(Move.FLASH,16),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,20),
                        new MoveLearnSetEntry(Move.ICYCHARGE,26),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,33),
                        new MoveLearnSetEntry(Move.METEORSHOWER,38),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,42),
                        new MoveLearnSetEntry(Move.WISH,48),
                        new MoveLearnSetEntry(Move.SOLARFLARE,52)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Amoni");

    }


}
