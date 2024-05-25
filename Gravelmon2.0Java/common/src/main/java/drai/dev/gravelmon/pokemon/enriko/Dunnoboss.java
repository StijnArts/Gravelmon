package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dunnoboss extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dunnoboss() {
        super("Dunnoboss",
                Type.DARK, Type.FIGHTING,
                new Stats(100,
                        135,
                        90,
                        75,
                        75,
                        80),
                List.of(Ability.GUTS,Ability.NO_GUARD,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                22, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Dunnoboss will never abandon whatever duty they are given. Fancy establishments tend to hire them as bouncers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SNARL,5),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.ARM_THRUST,15),
                        new MoveLearnSetEntry(Move.DETECT,19),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,29),
                        new MoveLearnSetEntry(Move.BULK_UP,34),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,38),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,42),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,47),
                        new MoveLearnSetEntry(Move.BLOCK,51),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Dunnoboss");

    }


}
