package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Alluard extends drai.dev.gravelmon.pokemon.Pokemon {
    public Alluard() {
        super("Alluard",
                Type.LIGHT,Type.GHOST,
                new Stats(100,
                        70,
                        100,
                        85,
                        120,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.CURSED_BODY), Ability.ALLURINGGLOW,
                14, 2949,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.AMORPHOUS),
                List.of("Alluard's teeth are so abnormally large that it can't actually move them. They weigh as much as a car's tire, every single one. Due to this Alluard can only use its teeth as a shield of sorts and attacks with its angler."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Alluard");

    }


}
