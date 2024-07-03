package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Fowlkly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fowlkly() {
        super("Fowlkly",
                Type.PSYCHIC, Type.FLYING,
                new Stats(43,
                        43,
                        53,
                        70,
                        53,
                        40),
                List.of(Ability.HUSTLE), Ability.IMMUNITY,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Its not very intelligent but has impressive psychic abilities. Its own psychic moves will often cause it to get confused."),
                List.of(new EvolutionEntry("lunatiken", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))
                ),
                List.of(       new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.ENDEAVOR,10),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,15),
                        new MoveLearnSetEntry(Move.IMPRISON,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,25),
                        new MoveLearnSetEntry(Move.AMNESIA,30),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,45),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,50),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,55)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Fowlkly");

    }


}
