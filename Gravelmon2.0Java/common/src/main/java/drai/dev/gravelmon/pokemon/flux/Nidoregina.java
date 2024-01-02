package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Nidoregina extends Pokemon {
    public Nidoregina() {
        super("Nidoregina",
                Type.ICE, Type.GROUND,
                new Stats(100, 82, 87, 85, 85, 66),
                List.of(Ability.SNOW_CLOAK, Ability.SLUSH_RUSH), Ability.SHEER_FORCE,
                13, 600,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                253, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("It dwells in palaces of snow, its striking white coat gleaming even brighter than its surroundings. Its greatest rival is NIDOREGUS."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,1),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 37, 50, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
