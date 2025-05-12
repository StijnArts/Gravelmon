package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grimmposs extends Pokemon {
    public Grimmposs() {
        super("Grimmposs",
                Type.NORMAL, Type.GHOST,
                new Stats(57,
                        100,
                        62,
                        72,
                        101,
                        106),
                List.of(Ability.ADAPTABILITY, Ability.STENCH), Ability.PERISH_BODY,
                12, 150,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ever the survivalist, some departed POUCHELET rise as ghost Pokemon. Having lost its fear of collisions, it floats through everything with glee."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,18),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                        new MoveLearnSetEntry(Move.CURSE,27),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,37),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,42),
                        new MoveLearnSetEntry(Move.SCARY_FACE,46),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,51),
                        new MoveLearnSetEntry(Move.LAST_RESORT,56),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,61),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,65),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.RECYCLE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 42, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
