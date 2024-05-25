package drai.dev.gravelmon.pokemon.urzavos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Amphibula extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amphibula() {
        super("Amphibula",
                Type.FIRE, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.BLAZE), Ability.BLAZE,
                12, 458,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FAIRY),
                List.of("A rather relaxed 'Mon that prefers to gaze up at the stars. It prefers to lay about than to battle, especially if it considers the opponents its friends."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amphibula");

    }


}
