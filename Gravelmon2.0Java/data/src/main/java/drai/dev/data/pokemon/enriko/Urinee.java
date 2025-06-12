package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Urinee extends drai.dev.data.pokemon.Pokemon {
    public Urinee() {
        super("Urinee",
                Type.WATER,
                new Stats(50,
                        30,
                        10,
                        40,
                        30,
                        50),
                List.of(Ability.HUSTLE), Ability.HUSTLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As a bottomfeeder, it gets its nutrients from whatever filth it can find. Its unusual appearance, which resembles a urinal, helps it blend into its environment."),
                List.of(new EvolutionEntry("turmoilet", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"180")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.ACID,12),
                        new MoveLearnSetEntry(Move.WATER_GUN,18),
                        new MoveLearnSetEntry(Move.SLUDGE,25)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Urinee");

    }


}
