package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class NidorimeWinterCoat extends Pokemon {
    public NidorimeWinterCoat() {
        super("NidorimeWinterCoat",
                Type.ICE, Type.GROUND,
                new Stats(75, 62, 67, 60, 55, 46),
                List.of(Ability.SNOW_CLOAK, Ability.SLUSH_RUSH), Ability.ADAPTABILITY,
                8, 200,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                128, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("By migrating from colder regions to more temperate regions, this Mon can find better food and shelter to prepare for evolution."),
                List.of(new EvolutionEntry("nidoregina", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,22),
                        new MoveLearnSetEntry(Move.ICY_WIND,29),
                        new MoveLearnSetEntry(Move.FREEZEDRY,36),
                        new MoveLearnSetEntry(Move.AFTER_YOU,43),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,50),
                        new MoveLearnSetEntry(Move.SWAGGER,57),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,64),
                        new MoveLearnSetEntry(Move.SHEER_COLD,71),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 36, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setLangFileName("Nidorime");
    }
}
