package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Draguma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Draguma() {
        super("Draguma",
                Type.DRAGON, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.AIRBORNE), Ability.AIRBORNE,
                8, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.AMORPHOUS),
                List.of("Draguma uses psychic propulsion from the organs on its wing membranes to silently float in the air. It's been spotted lifting off small objects high into the atmosphere."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENERGYLOOP,1)                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Draguma");

    }


}
