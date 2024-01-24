package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ferrosaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ferrosaur() {
        super("Ferrosaur",
                Type.STEEL,Type.DRAGON,
                new Stats(50,
                        115,
                        95,
                        66,
                        66,
                        95),
                List.of(Ability.IRON_BARBS,Ability.TOUGH_CLAWS,Ability.SAND_RUSH), Ability.SAND_RUSH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
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
           setLangFileName("Ferrosaur");

    }


}
