package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Singlaze extends drai.dev.data.pokemon.Pokemon {
    public Singlaze() {
        super("Singlaze",
                Type.ICE, Type.FIRE,
                new Stats(85,
                        15,
                        75,
                        20,
                        75,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("twicing", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
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
                        new MoveLearnSetEntry(Move.SOLARFLARE,52),
                        new MoveLearnSetEntry(Move.HEALING_WISH,60)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Singlaze");

    }


}
