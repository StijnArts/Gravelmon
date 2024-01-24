package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nymphemeral extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nymphemeral() {
        super("Nymphemeral",
                Type.BUG,Type.GHOST,
                new Stats(70,
                        70,
                        85,
                        85,
                        90,
                        50),
                List.of(Ability.CURSED_BODY,Ability.SHADOW_TAG,Ability.PERISH_BODY), Ability.PERISH_BODY,
                8, 165,
                new Stats(0,0,0,0,2,0), 80,
                0.5,
                158, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The discarded husk of a Maynoon that had reached the end of its life. It's possessed by some lingering essence of its former self, so it floats aimlessly throughout the night."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nymphemeral");

    }


}
