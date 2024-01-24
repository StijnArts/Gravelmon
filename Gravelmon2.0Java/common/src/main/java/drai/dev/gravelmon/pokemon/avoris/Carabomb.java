package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Carabomb extends drai.dev.gravelmon.pokemon.Pokemon {
    public Carabomb() {
        super("Carabomb",
                Type.BUG,Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INFILTRATOR,Ability.FLASH_FIRE,Ability.AFTERMATH), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They launch themselves into the air like a rocket as a quick escape from enemies. Launch speeds can reach up to 200 MPH. Do not bother Carabomb while they are asleep, they may explode on contact. In festivals, they are often used as firework displays."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Carabomb");

    }


}
