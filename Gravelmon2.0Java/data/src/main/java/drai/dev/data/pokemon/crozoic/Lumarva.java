package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumarva extends drai.dev.data.pokemon.Pokemon {
    public Lumarva() {
        super("Lumarva",
                Type.ELECTRIC,Type.ICE,
                new Stats(35,
                        40,
                        30,
                        65,
                        30,
                        70),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                2, 18,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("They live in groups that use coordinated flashes of light to confuse predators that would eat them. The glowing bulb on the end of its tail is highly nutritious and said to heighten the senses."),
                List.of(new EvolutionEntry("glowpa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lumarva");

    }


}
