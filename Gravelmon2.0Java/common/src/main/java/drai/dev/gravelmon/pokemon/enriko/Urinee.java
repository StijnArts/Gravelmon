package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Urinee extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 2, List.of(
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Urinee");

    }


}
