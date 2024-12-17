package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Daemoth extends Pokemon {
    public Daemoth() {
        super("Daemoth",
                Type.GRASS, Type.PSYCHIC,
                new Stats(80,
                        65,
                        75,
                        130,
                        105,
                        75),
                List.of(Ability.OVERGROW), Ability.TINTED_LENS,
                15, 387,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG, EggGroup.GRASS),
                List.of("It's said that the eyes on DAEMOTH's wings can see many different futures. It hides from people to protect them from the fate it foresees."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,1),
                        new MoveLearnSetEntry(Move.FORESTS_CURSE,1),
                        new MoveLearnSetEntry(Move.PSYBEAM,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,11),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,20),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,26),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,39),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,46),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,54),
                        new MoveLearnSetEntry(Move.LEAF_STORM,61),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.STRING_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 32, 45, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
