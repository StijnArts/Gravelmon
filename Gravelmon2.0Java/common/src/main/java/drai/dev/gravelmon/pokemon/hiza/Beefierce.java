package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beefierce extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beefierce() {
        super("Beefierce",
                Type.FIGHTING, Type.GROUND,
                new Stats(104,
                        120,
                        88,
                        25,
                        78,
                        50),
                List.of(Ability.RATTLED), Ability.RATTLED,
                16, 165,
                new Stats(0,2,0,0,0,0), 60,
                0.75,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Beefierce are large and strong but are easily startled by loud noises. A stampede of Beefierce will completely destroy anything in its way."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beefierce");

    }


}
