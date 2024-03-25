package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cephalofear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cephalofear() {
        super("Cephalofear",
                Type.PSYCHIC,Type.NORMAL,
                new Stats(74,
                        98,
                        63,
                        93,
                        93,
                        69),
                List.of(Ability.DAZZLING,Ability.STICKY_HOLD), Ability.MAGIC_GUARD,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Despite its far more intimidating appearance, Cephalofear are still quite shy, and prefer to hide their face (or what little remains to fit inside) within the small brown bag it has held onto. To scare away foes or hypnotize prey, it will flash multiple colors across its body, sending any who gaze upon it into a fugue state."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LUMINA_CRASH,45)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cephalofear");

    }


}
