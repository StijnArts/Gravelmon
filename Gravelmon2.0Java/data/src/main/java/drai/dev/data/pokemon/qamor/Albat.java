package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Albat extends drai.dev.data.pokemon.Pokemon {
    public Albat() {
        super("Albat",
                Type.GRASS, Type.FLYING,
                new Stats(55,
                        50,
                        48,
                        50,
                        52,
                        65),
                List.of(Ability.OVERGROW), Ability.RIPEN,
                5, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Albat is short tempered and often throws tantrums when it doesnt get its way. Its downy fur protects it from harsh weather."),
                List.of(new EvolutionEntry("gremleaf", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.CUT,7),
                        new MoveLearnSetEntry(Move.GUST,9),
                        new MoveLearnSetEntry(Move.SCARY_FACE,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,17),
                        new MoveLearnSetEntry(Move.AGILITY,19),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,21),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,25),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.ACROBATICS,38),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,41),
                        new MoveLearnSetEntry(Move.HURRICANE,48),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
