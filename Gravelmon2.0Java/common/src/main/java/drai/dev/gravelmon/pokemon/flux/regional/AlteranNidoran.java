package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AlteranNidoran extends Pokemon {
    public AlteranNidoran(int dexNo) {
        super(dexNo,"AlteranNidoran",
                Type.ICE,
                new Stats(55, 47, 52, 45, 40, 36),
                List.of(Ability.SNOW_CLOAK, Ability.SLUSH_RUSH), Ability.ADAPTABILITY,
                4, 70,
                new Stats(1,0,0,0,0,0), 235,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                List.of("AAn old lineage of NIDORAN. The males and females look alike, but come in two distinct coats. This form lives out in areas blanketed by snow."),
                List.of(new EvolutionEntry("nidorime", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FREEZEDRY,30),
                        new MoveLearnSetEntry(Move.AFTER_YOU,35),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,40),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50),
                        new MoveLearnSetEntry(Move.SHEER_COLD,55),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                ),
                List.of(Label.GEN1,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 27, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of(new PokemonForm(
                        "Summer", false,
                        Type.GROUND,
                        new Stats(46, 52,42,40,40,55),
                        List.of(Ability.SAND_VEIL, Ability.SAND_RUSH), Ability.ADAPTABILITY,
                        5, 90,
                        new Stats(1,0,0,0,0,1), 200,
                        0.5,
                        146, ExperienceGroup.SLOW,
                        70,
                        32, List.of(EggGroup.FIELD, EggGroup.MONSTER),
                        List.of(),
                        List.of("An old lineage of NIDORAN. The males and females look alike, but come in two distinct coats. Its dark coat blends in with dry, rugged terrain."),
                        List.of(new EvolutionEntry("nidorime", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")), List.of(Aspect.SUMMER))),
                        List.of(
                                new MoveLearnSetEntry(Move.LEER,1),
                                new MoveLearnSetEntry(Move.TACKLE,1),
                                new MoveLearnSetEntry(Move.DUST_KICK,5),
                                new MoveLearnSetEntry(Move.FOCUS_ENERGY,10),
                                new MoveLearnSetEntry(Move.MUD_SHOT,15),
                                new MoveLearnSetEntry(Move.SANDSTORM,20),
                                new MoveLearnSetEntry(Move.BULLDOZE,25),
                                new MoveLearnSetEntry(Move.DRILL_RUN,30),
                                new MoveLearnSetEntry(Move.QUASH,35),
                                new MoveLearnSetEntry(Move.SPIKES,40),
                                new MoveLearnSetEntry(Move.SWAGGER,45),
                                new MoveLearnSetEntry(Move.EARTH_POWER,50),
                                new MoveLearnSetEntry(Move.FISSURE,55),
                                new MoveLearnSetEntry(Move.COUNTER,"egg"),
                                new MoveLearnSetEntry(Move.DISABLE,"egg"),
                                new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                                new MoveLearnSetEntry(Move.ICE_FANG,"egg")
                                ),
                        List.of(Label.GEN1,Label.FLUX),
                        0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 27, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        0.3, 0.3
                )));
        this.setLangFileName("Nidoran");
        this.setPortraitXYZ(0,1.8,0);
    }
}
