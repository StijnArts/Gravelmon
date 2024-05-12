package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Darcastro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Darcastro() {
        super("Darcastro",
                Type.DRAGON, Type.DARK,
                new Stats(90,
                        130,
                        95,
                        115,
                        85,
                        85),
                List.of(Ability.ANGER_POINT,Ability.RECKLESS,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,2,0,1,0,0), 15,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These Pokemon soar across the land, compelling local Pokemon to rampage around. Sightings of them are immediately followed with city-wide warnings. In Havai, they are seen as superiors to all Dragon-type Pokemon. It is very difficult to gain trust and loyalty from Darcastro. They do not like taking orders from anyone and rather do things their own way. Once trust is gained, they can be the most loyal partner to a Trainer."),
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
           setLangFileName("Darcastro");

    }


}
