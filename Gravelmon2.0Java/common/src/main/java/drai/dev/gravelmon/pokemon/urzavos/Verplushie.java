package drai.dev.gravelmon.pokemon.urzavos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Verplushie extends drai.dev.gravelmon.pokemon.Pokemon {
    public Verplushie() {
        super("Verplushie",
                Type.NORMAL, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 45,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Having grown large enough, this 'Mon takes its previous evolutions into its fluff to keep them warm and safe when their fabric has worn down. Every pattern is unique!"),
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
           setLangFileName("Verplushie");

    }


}
