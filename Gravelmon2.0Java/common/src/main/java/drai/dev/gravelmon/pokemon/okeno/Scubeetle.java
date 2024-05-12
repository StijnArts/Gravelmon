package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scubeetle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scubeetle() {
        super("Scubeetle",
                Type.WATER, Type.BUG,
                new Stats(100,
                        80,
                        80,
                        70,
                        60,
                        80),
                List.of(Ability.SWIFT_SWIM,Ability.FILTER,Ability.WATER_BUBBLE), Ability.WATER_BUBBLE,
                8, 165,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of(""),
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
           setLangFileName("Scubeetle");

    }


}
