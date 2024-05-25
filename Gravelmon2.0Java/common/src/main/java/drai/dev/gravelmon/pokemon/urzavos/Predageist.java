package drai.dev.gravelmon.pokemon.urzavos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Predageist extends drai.dev.gravelmon.pokemon.Pokemon {
    public Predageist() {
        super("Predageist",
                Type.GRASS, Type.GHOST,
                new Stats(75,
                        90,
                        65,
                        55,
                        50,
                        80),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                12, 417,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("A dark force revived a poor Spritten caught in a trap, and now this 'Mon seeks out those that would do harm to others relentlessly."),
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
           setLangFileName("Predageist");

    }


}
