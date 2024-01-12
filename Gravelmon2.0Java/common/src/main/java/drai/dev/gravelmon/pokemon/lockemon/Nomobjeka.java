package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nomobjeka extends Pokemon {
    public Nomobjeka() {
        super("Nomobjeka",
                Type.FIGHTING, Type.FAIRY,
                new Stats(80,
                        95,
                        60,
                        95,
                        70,
                        90),
                List.of(Ability.DEFIANT, Ability.DRUIDRY), Ability.CONTRARY,
                6, 131,
                new Stats(0,1,0,1,0,0), 127,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.HUMAN_LIKE),
                List.of("The existence of Nomobjeka, a fun-loving guardian Pokémon, was just recently proven. It goes out in search of fainted wild Pokémon and guards them until they recover. These Pokémon can only be found in hidden areas shrouded by foliage, making them a rare sight in the wild."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,7),
                        new MoveLearnSetEntry(Move.FEINT,12),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,16),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,20),
                        new MoveLearnSetEntry(Move.RECOVER,24),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,28),
                        new MoveLearnSetEntry(Move.MOONBLAST,32),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,36),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,40),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,48),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,52),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,56)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 47, 11.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
