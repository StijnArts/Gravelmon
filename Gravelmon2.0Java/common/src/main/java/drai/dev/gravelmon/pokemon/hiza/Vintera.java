package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Vintera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vintera() {
        super("Vintera",
                Type.ICE,
                new Stats(100,
                        120,
                        95,
                        145,
                        120,
                        90),
                List.of(Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                37, 165,
                new Stats(0,0,0,3,0,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The Pokemon that caused a 100 years of winter in a distant past. The gases spewing out of its body instantly freeze anything that touches it."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.CURSE,9),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.PROTECT,15),
                        new MoveLearnSetEntry(Move.AVALANCHE,18),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.ICE_FANG,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.RECOVER,30),
                        new MoveLearnSetEntry(Move.CRUNCH,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,51)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0003, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vintera");

    }


}
