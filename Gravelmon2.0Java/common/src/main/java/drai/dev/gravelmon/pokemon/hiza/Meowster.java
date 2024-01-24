package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Meowster extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meowster() {
        super("Meowster",
                Type.NORMAL,Type.DARK,
                new Stats(100,
                        85,
                        80,
                        55,
                        80,
                        45),
                List.of(Ability.HUGE_POWER), Ability.HUGE_POWER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A feral pokemon with gigantic claws that can cut through trees. It seems to be stuck inside a cage, but the cage acts like shell to protect both its weakspots and other pokemon from Meowster itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meowster");

    }


}
