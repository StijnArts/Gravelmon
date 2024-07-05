package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

public class Figura extends drai.dev.data.pokemon.Pokemon {
    public Figura() {
        super("Figura",
                Type.PSYCHIC,
                new Stats(50,
                        20,
                        45,
                        75,
                        75,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                80, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Believed to be summoned via ancient cave drawings. Figura is two-dimensional; it will always appear flat from any angle to an observer."),
                List.of(new EvolutionEntry("tofigur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.CONVERSION,7),
                        new MoveLearnSetEntry(Move.CONVERSION_2,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,16),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,24),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,28),
                        new MoveLearnSetEntry(Move.PSYBEAM,30),
                        new MoveLearnSetEntry(Move.CALM_MIND,34),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,38),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Figura");

    }


}
