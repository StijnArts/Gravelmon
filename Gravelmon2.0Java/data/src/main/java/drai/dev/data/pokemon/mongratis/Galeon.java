package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Galeon extends drai.dev.data.pokemon.Pokemon {
    public Galeon() {
        super("Galeon",
                Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(44)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
        addAdditionalEvolution("eevee", new EvolutionEntry("galeon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.IRON_DEFENSE, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"minecraft:elytra"))));
           setLangFileName("Nimbeon");

    }


}
