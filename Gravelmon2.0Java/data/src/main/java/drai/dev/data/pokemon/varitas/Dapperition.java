package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Dapperition extends drai.dev.data.pokemon.Pokemon {
    public Dapperition() {
        super("Dapperition",
                Type.GHOST,
                new Stats(90,
                        65,
                        80,
                        105,
                        95,
                        85),
                List.of(Ability.SHADOW_TAG), Ability.OVERCOAT,
                16, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dapperition's body is made of shadows, allowing it to move freely just about anywhere. Don't be fooled by their armless appearance. They can easily hypnotize someone using the pattern on their chest and suddenly form eerie arms to snatch them up."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,3),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,6),
                        new MoveLearnSetEntry(Move.NUZZLE,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,14),
                        new MoveLearnSetEntry(Move.SPARK,18),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,23),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,27),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,30),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,35),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,38),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,43),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.LASH_OUT,52)                  ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 65, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                List.of());
           setLangFileName("Dapperition");

    }


}
