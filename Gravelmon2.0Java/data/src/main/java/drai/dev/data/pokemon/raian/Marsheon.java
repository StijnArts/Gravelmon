package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marsheon extends drai.dev.data.pokemon.Pokemon {
    public Marsheon(Stats stats) {
        super("Marsheon",
                Type.GROUND,
                stats,
                List.of(Ability.MUDSPLASH), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .eeveelution()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("eevee", new EvolutionEntry("marsheon", EvolutionType.ITEM_INTERACT, false, List.of(new MoveLearnSetEntry(Move.CURSE, "")),
                List.of(),List.of(),"cobblemon:sun_stone"));
           setLangFileName("Marsheon");

    }


}
