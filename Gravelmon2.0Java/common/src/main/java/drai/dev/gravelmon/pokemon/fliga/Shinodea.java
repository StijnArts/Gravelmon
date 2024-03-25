package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Shinodea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shinodea() {
        super("Shinodea",
                Type.BUG,Type.DARK,
                new Stats(75,
                        100,
                        70,
                        100,
                        60,
                        65),
                List.of(Ability.TECHNICIAN), Ability.OPPORTUNIST,
                8, 120,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                160, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("As Fligian Nincada grow and evolve, their hunting techniques of sneak attacks and preying on the oblivious lead them to evolve into Shinodea. Shinodea wield razor sharp wings, capable of slicing ignorant quarry into ribbons before they even have a chance to react."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,21),
                        new MoveLearnSetEntry(Move.MIND_READER,25),
                        new MoveLearnSetEntry(Move.CLONEATTACK,27),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,29),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,33),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,46),
                        new MoveLearnSetEntry(Move.MINIMIZE,50),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,"tm"),
                        new MoveLearnSetEntry(Move.TWINBLADE,"tm"),
                        new MoveLearnSetEntry(Move.GUST,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shinodea");

    }


}
