package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ottoil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ottoil() {
        super("Ottoil",
                Type.POISON,
                new Stats(35,
                        60,
                        40,
                        50,
                        50,
                        60),
                List.of(Ability.DAMP,Ability.STRONG_JAW,Ability.POISON_TOUCH), Ability.POISON_TOUCH,
                7, 165,
                new Stats(0,0,0,0,0,1), 230,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It didn't appear in the region until modern times, but it doesn't cause trouble with the native Pokemon. A film of waterproof goo keeps it insulated in chilly water."),
                List.of(new EvolutionEntry("slithotter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(       new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FEINT,3),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,6),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,12),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,15),
                        new MoveLearnSetEntry(Move.BITE,18),
                        new MoveLearnSetEntry(Move.VENOSHOCK,21),
                        new MoveLearnSetEntry(Move.SCREECH,24),
                        new MoveLearnSetEntry(Move.TOXIC,27),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,30),
                        new MoveLearnSetEntry(Move.MEMENTO,33),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.BELCH,39),
                        new MoveLearnSetEntry(Move.EXPLOSION,42)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
