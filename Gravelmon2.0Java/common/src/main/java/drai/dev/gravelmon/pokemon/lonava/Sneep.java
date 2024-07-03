package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Sneep extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sneep() {
        super("Sneep",
                Type.ICE,
                new Stats(87,
                        55,
                        98,
                        55,
                        98,
                        55),
                List.of(Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                10, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Able to continue grazing in even the most frigid of weather, Sneep's face is constantly coated in snow. Dorhouse that have lost their stumps sometimes sleep inside its stiff wool."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.FLATTER,11),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.BRINE,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,29),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,32),
                        new MoveLearnSetEntry(Move.ICE_BEAM,36),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,40),
                        new MoveLearnSetEntry(Move.FREEZEDRY,46),
                        new MoveLearnSetEntry(Move.DISABLE,51),
                        new MoveLearnSetEntry(Move.BLIZZARD,55)                       ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 42, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sneep");

    }


}
