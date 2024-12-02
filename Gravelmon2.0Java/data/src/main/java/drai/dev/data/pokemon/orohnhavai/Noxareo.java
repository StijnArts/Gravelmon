package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Noxareo extends drai.dev.data.pokemon.Pokemon {
    public Noxareo() {
        super("Noxareo",
                Type.DRAGON,
                new Stats(60,
                        90,
                        65,
                        65,
                        55,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Noxareo enjoy causing ruckus for their own amusement. These troublesome Pokemon are known for causing damage with their reckless behavior. Studies show that its recklessness pumps itself up with energy and gets other Noxareo pumped up. However, they get too carried away and end up causing tremendous damage."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Noxareo");

    }


}
