package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class UnownXenoverse extends Pokemon {
    public UnownXenoverse(String name, Aspect aspect) {
        super(name, aspect,"UnownXenoverse",
                Type.PSYCHIC,
                new Stats(48, 72, 48, 72, 48, 48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 50,
                new Stats(0,1,0,1,0,0), 225,
                0,
                118, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("For centuries they have been considered sacred as their appearance resembles the symbol on the Luxflon's gem."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1)
                ),
                List.of(Label.XENOVERSE, Label.GEN2),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.END_CITY)
    .build(), List.of());
	
        this.setLangFileName("Unown");
        
    }
}
