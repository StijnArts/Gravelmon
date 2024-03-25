package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lohopper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lohopper() {
        super("Lohopper",
                Type.BUG,Type.FIGHTING,
                new Stats(59,
                        79,
                        60,
                        50,
                        50,
                        70),
                List.of(Ability.INNER_FOCUS), Ability.SWARM,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lophopper work in great numbers. They practice stealth tactics and locate themselves using sound and by guidance of the stars. Their primary target is usually on people´s crops. Despite being skillful thieves, they will not escape being caught stealing. Instead, they offer a fair fight and will accept defeat if proven hors de combat."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lohopper");

    }


}
