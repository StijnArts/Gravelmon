package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maskape extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maskape() {
        super("Maskape",
                Type.NORMAL,
                new Stats(43,
                        63,
                        32,
                        45,
                        42,
                        55),
                List.of(Ability.INTIMIDATE,Ability.RELENTLESS,Ability.TANGLED_FEET), Ability.TANGLED_FEET,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal 7 Tickle Normal 13 Low Kick Fighting 19 Double Team Normal 22 SwiftSTAB Normal 26 SlamSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TICKLE,7),
                        new MoveLearnSetEntry(Move.LOW_KICK,13),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,19),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.SLAM,26),
                        new MoveLearnSetEntry(Move.VINESWING,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maskape");

    }


}
