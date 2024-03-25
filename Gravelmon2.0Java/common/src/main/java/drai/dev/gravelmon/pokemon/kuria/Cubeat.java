package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cubeat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cubeat() {
        super("Cubeat",
                Type.SOUND,
                new Stats(55,
                        65,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.KLUTZ,Ability.GUTS), Ability.REVERB,
                6, 109,
                new Stats(0,1,0,0,0,0), 170,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They sing softly for others to hear in the forest. If they get a big audience, Cubeat use the speakers on their body to amplify their sound."),
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
           setLangFileName("Cubeat");

    }


}
