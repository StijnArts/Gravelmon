package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Anglow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anglow() {
        super("Anglow",
                Type.LIGHT,Type.GHOST,
                new Stats(60,
                        50,
                        70,
                        60,
                        80,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.CURSED_BODY), Ability.ALLURINGGLOW,
                8, 165,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.AMORPHOUS),
                List.of("While Anglow's teeth look like they are for biting, they're actually a defense machanism. Not only does the intimidation often scare opponents, it's also extremely useful as the teeth are as hard as diamond, making it so that Anglow can block incoming attacks with it."),
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
           setLangFileName("Anglow");

    }


}
