package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Wigfoot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wigfoot() {
        super("Wigfoot",
                Type.NORMAL, Type.GROUND,
                new Stats(80,
                        80,
                        120,
                        50,
                        100,
                        50),
                List.of(Ability.DRY_SKIN), Ability.RATTLED,
                15, 165,
                new Stats(0,0,0,0,0,0), 95,
                0.75,
                185, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("It stomps around the deepest forests in Enriko, leaving huge footprints and a trail of hair behind it. Its fur goes for a fortune in certain markets."),
                List.of(new EvolutionEntry("fleesquach", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.STOMP,28),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,32),
                        new MoveLearnSetEntry(Move.SLAM,36),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 43, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wigfoot");

    }


}
