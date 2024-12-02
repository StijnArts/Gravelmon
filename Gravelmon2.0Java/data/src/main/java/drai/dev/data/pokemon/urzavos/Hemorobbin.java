package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hemorobbin extends drai.dev.data.pokemon.Pokemon {
    public Hemorobbin(Stats stats) {
        super("Hemorobbin",
                Type.DARK, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 1873,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Though these 'Mons have a spiked, boney carapace, they still have an exposed spot on their back. The carapace can expand along with the ichor sack."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hemorobbin");

    }


}
