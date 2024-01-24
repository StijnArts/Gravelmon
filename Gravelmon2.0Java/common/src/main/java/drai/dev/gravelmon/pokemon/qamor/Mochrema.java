package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Mochrema extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mochrema() {
        super("Mochrema",
                Type.GROUND,Type.FAIRY,
                new Stats(110,
                        30,
                        78,
                        82,
                        100,
                        75),
                List.of(Ability.FLAME_BODY), Ability.SWEET_VEIL,
                8, 165,
                new Stats(1,0,0,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mochrema has a constant stream of foamy substance seeping out of pours in its skin around its head and neck. Its head is partially hollow, and a supply of dark, sweet sap is stored on top. One sip of the sap was said to be a cure all- from depression to headaches to severe illnesses. Scientific research concluded that that's not entirely true, but it still tastes great nonetheless."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mochrema");

    }


}
