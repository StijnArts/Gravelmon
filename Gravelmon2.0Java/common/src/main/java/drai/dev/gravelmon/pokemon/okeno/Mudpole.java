package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mudpole extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mudpole() {
        super("Mudpole",
                Type.GROUND,Type.POISON,
                new Stats(52,
                        52,
                        42,
                        40,
                        45,
                        61),
                List.of(Ability.POISON_TOUCH,Ability.STICKY_HOLD,Ability.HYDRATION), Ability.HYDRATION,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("It lives in mud, which it absorbs into a second skin. The mud forms blisters that are filled with poison, and if any Pokémon bites into it, they will be knocked out cold."),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mudpole");

    }


}
