package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Theragong extends drai.dev.gravelmon.pokemon.Pokemon {
    public Theragong() {
        super("Theragong",
                Type.STEEL,Type.FAIRY,
                new Stats(55,
                        75,
                        85,
                        55,
                        85,
                        25),
                List.of(Ability.CLEAR_BODY,Ability.HEAVY_METAL,Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                133, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Theragong emit calming vibrations from their metal disc. They're popular among complementary therapists, practitioners of alternative medicine and ASMR fanatics alike."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Theragong");

    }


}
