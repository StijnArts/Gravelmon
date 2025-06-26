package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Elemuttal extends drai.dev.data.pokemon.Pokemon {
    public Elemuttal() {
        super("Elemuttal",
                Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 91,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("There are a few different variations of this 'Mon with distinct patches of colored fur on their back. Scientists have often wondered if they share a common Ancestor with Eevee."),
                List.of(new EvolutionEntry("caniflame", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON.getWeight(1)/3)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Elemuttal");
        getForms().add(PokemonForm.fromPokemon(this, Aspect.YELLOW).setEvolutions(List.of(new EvolutionEntry("thounder", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"))))));
        getForms().add(PokemonForm.fromPokemon(this, Aspect.BLUE).setEvolutions(List.of(new EvolutionEntry("permafruff", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"))))));
    }


}
