package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Behitle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Behitle() {
        super("Behitle",
                Type.BUG,
                new Stats(20,
                        60,
                        50,
                        50,
                        60,
                        70),
                List.of(Ability.HEATPROOF), Ability.HEATPROOF,
                3, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They are commonly seem running at high speeds during the day. They move slower during rainy days with the fear of slipping and flipping upside down."),
                List.of(new EvolutionEntry("hotroach", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))
                ),
                List.of(       new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.WRAP,5),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.COIL,25),
                        new MoveLearnSetEntry(Move.SLAM,30),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,35),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.FIRE_LASH,45),
                        new MoveLearnSetEntry(Move.LUNGE,50),
                        new MoveLearnSetEntry(Move.BURN_UP,55)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 30, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Behitle");

    }


}
