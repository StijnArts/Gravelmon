package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Blitzchief extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blitzchief() {
        super("Blitzchief",
                Type.ELECTRIC,Type.DARK,
                new Stats(50,
                        95,
                        70,
                        95,
                        70,
                        85),
                List.of(Ability.STATIC), Ability.STATIC,
                9, 165,
                new Stats(0,1,0,1,0,0), 75,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They are mostly nocturnal and can be seen searching for food in dumpsters. It specifically looks for discarded batteries and electronics to chew on."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.POWER_TRIP,10),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.FLATTER,20),
                        new MoveLearnSetEntry(Move.BITE,25),
                        new MoveLearnSetEntry(Move.SPARK,30),
                        new MoveLearnSetEntry(Move.TORMENT,35),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.BULLET_SEED,45),
                        new MoveLearnSetEntry(Move.CRUNCH,50),
                        new MoveLearnSetEntry(Move.AURA_WHEEL,55),
                        new MoveLearnSetEntry(Move.THRASH,60)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 46, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Blitzchief");

    }


}
