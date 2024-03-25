package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Growlain extends drai.dev.gravelmon.pokemon.Pokemon {
    public Growlain() {
        super("Growlain",
                Type.ROCK,Type.DRAGON,
                new Stats(80,
                        120,
                        130,
                        80,
                        70,
                        100),
                List.of(Ability.INFURIATE), Ability.INFURIATE,
                42, 0,
                new Stats(0,1,2,0,0,0), 35,
                0.0,
                261, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A legendary beast of the Ancient Kingdom. Was referred to as the 'Warrior', and was cursed to grow bones as heavy armor to inhibit it's brutality. This failed, however, and now Growlian seeks an opponent strong enough to give it its eternal slumber."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Growlain");

    }


}
