package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bagarrough extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bagarrough() {
        super("Bagarrough",
                Type.FIGHTING,Type.GROUND,
                new Stats(100,
                        125,
                        100,
                        55,
                        80,
                        80),
                List.of(Ability.DESERTBODY,Ability.OPPORTUNIST), Ability.MOXIE,
                20, 1051,
                new Stats(1,2,0,0,0,0), 45,
                0.5,
                247, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("After evolving, they spend most of their time teaching weak Pokémon new moves. Their headbands grow back, so when their body is torn after a fight, they use it to patch themselves up."),
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
           setLangFileName("Bagarrough");

    }


}
