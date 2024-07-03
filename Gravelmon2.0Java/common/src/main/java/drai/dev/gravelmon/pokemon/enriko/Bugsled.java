package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Bugsled extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bugsled() {
        super("Bugsled",
                Type.BUG, Type.ICE,
                new Stats(120,
                        100,
                        80,
                        10,
                        60,
                        110),
                List.of(Ability.SPEED_BOOST), Ability.REFRIGERATE,
                13, 165,
                new Stats(0,0,0,0,0,0), 90,
                0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is trapped in a cocoon from which it will never hatch. By gaining momentum, it can accelerate to almost 180 miles per hour in search of a mate."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,10),
                        new MoveLearnSetEntry(Move.HARDEN,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26)                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bugsled");

    }


}
