package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Malakele extends drai.dev.gravelmon.pokemon.Pokemon {
    public Malakele() {
        super("Malakele",
                Type.GHOST, Type.FIGHTING,
                new Stats(55,
                        75,
                        40,
                        70,
                        25,
                        65),
                List.of(Ability.INSOMNIA,Ability.UNAWARE,Ability.SHADOW_TAG), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Malakel'e gather under the moonlight to practice their chanting. It is said their chants can cause headaches, nausea, and give bad dreams to those who hear it. According to old Havaian legend, these Pokemon represented the spirits of fallen warriors."),
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
           setLangFileName("Malakel-e");

    }


}
