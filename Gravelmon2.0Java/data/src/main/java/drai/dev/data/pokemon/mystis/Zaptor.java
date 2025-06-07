package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zaptor extends drai.dev.data.pokemon.Pokemon {
    public Zaptor() {
        super("Zaptor",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(65,
                        65,
                        55,
                        95,
                        55,
                        85),
                List.of(Ability.RELENTLESS,Ability.LIGHTNING_ROD), Ability.TANTRUM,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Zaptor like to hunt in groups, often delegating different roles to other members of the group. Their usual hunting strategy is to chase down prey to the point of exhaustion, shocking them with jolts of electricity to wear them down or paralyse them."),
                List.of(new EvolutionEntry("lectraptor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Zaptor");

    }


}
