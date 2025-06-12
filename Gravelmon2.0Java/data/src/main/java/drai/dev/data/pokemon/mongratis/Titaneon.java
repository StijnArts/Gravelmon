package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Titaneon extends drai.dev.data.pokemon.Pokemon {
    public Titaneon() {
        super("Titaneon",
                Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Titaneon came from an anonymous 'leak' of new Eeveelutions that were supposedly going to be in Sword+Shield and has been submitted to the Fakemon Festival Pack by PansyGum. These designs/sprites are originally from the Fakemon Festival Pack."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(44)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("eevee", new EvolutionEntry("titaneon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.IRON_DEFENSE, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"minecraft:iron_helmet"))));
           setLangFileName("Titaneon");

    }


}
