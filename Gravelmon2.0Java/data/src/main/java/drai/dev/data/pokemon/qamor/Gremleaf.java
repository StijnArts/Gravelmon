package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gremleaf extends drai.dev.data.pokemon.Pokemon {
    public Gremleaf() {
        super("Gremleaf",
                Type.GRASS, Type.FLYING,
                new Stats(65,
                        65,
                        55,
                        65,
                        70,
                        90),
                List.of(Ability.OVERGROW), Ability.RIPEN,
                12, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.875,
                142, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("Little to nothing seems to peek a Gremleaf's curiosity, it goes about its days caring about less and less. Nevertheless, this Pokemon is known for prancing around the jungle floor, flapping wildly to confuse and startle predators while dancing rhythmically to entertain others- all with a completely dull poker face."),
                List.of(new EvolutionEntry("tropifox", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.CUT,6),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,17),
                        new MoveLearnSetEntry(Move.AGILITY,19),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,28),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,34),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.ACROBATICS,45),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,49),
                        new MoveLearnSetEntry(Move.HURRICANE,54),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 3.6, List.of(
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
