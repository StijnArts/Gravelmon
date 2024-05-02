package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Troopant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Troopant() {
        super("Troopant",
                Type.BUG,
                new Stats(30,
                        55,
                        45,
                        50,
                        45,
                        45),
                List.of(Ability.GUTS,Ability.STEADFAST,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colonies of Troopant can be found almost anywhere. They will go on raids in search for food especially for fruits and berries because of their sweetness and for the seeds, which they store in their abdomen. They shoot them out like bullets to harm its foes. They are most aggressive in huge numbers."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Troopant");

    }


}
