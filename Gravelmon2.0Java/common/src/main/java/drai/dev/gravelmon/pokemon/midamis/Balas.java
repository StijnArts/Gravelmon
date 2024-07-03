package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Balas extends drai.dev.gravelmon.pokemon.Pokemon {
    public Balas() {
        super("Balas",
                Type.GHOST, Type.DARK,
                new Stats(115,
                        115,
                        115,
                        115,
                        115,
                        115),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                37, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                     new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.HELPING_HAND,17),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,19),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,24),
                        new MoveLearnSetEntry(Move.COPYCAT,26),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.ENDEAVOR,34),
                        new MoveLearnSetEntry(Move.DOODLE,38),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.MIND_READER,45),
                        new MoveLearnSetEntry(Move.POLTERGEIST,49),
                        new MoveLearnSetEntry(Move.MEMENTO,55),
                        new MoveLearnSetEntry(Move.EPILOGUE,60)   ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0004, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
