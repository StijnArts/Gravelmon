package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bufierce extends drai.dev.data.pokemon.Pokemon {
    public Bufierce() {
        super("Bufierce",
                Type.FIGHTING, Type.GROUND,
                new Stats(50,
                        95,
                        55,
                        20,
                        55,
                        50),
                List.of(Ability.RATTLED), Ability.RATTLED,
                10, 165,
                new Stats(0,1,0,0,0,0), 120,
                0.75,
                69, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Small and clumsy, Bufierce it has difficulty running, so it tends to stick next to bigger Pokemon to feel safe."),
                List.of(new EvolutionEntry("Beefierce", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "day")))
                ),
                List.of(     new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,7),
                        new MoveLearnSetEntry(Move.TAUNT,14),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,21),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,28),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,35),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,49),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,63),
                        new MoveLearnSetEntry(Move.ENDEAVOR,70),
                        new MoveLearnSetEntry(Move.MEGAHORN,77),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,84),
                        new MoveLearnSetEntry(Move.HEADLONG_RUSH,91)
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bufierce");

    }


}
