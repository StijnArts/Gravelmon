package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Probat extends Pokemon {
    public Probat() {
        super("Probat",
                Type.PSYCHIC, Type.FLYING,
                new Stats(85,
                        60,
                        75,
                        105,
                        80,
                        130),
                List.of(Ability.SURVEILLANCE, Ability.SOUNDPROOF), Ability.ECHOLOCATION,
                13, 1221,
                new Stats(0,0,0,0,0,3), 90,
                0.5,
                241, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PSYCHIC,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.TOXIC,1),
                        new MoveLearnSetEntry(Move.POISON_FANG,15),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,27),
                        new MoveLearnSetEntry(Move.BITE,34),
                        new MoveLearnSetEntry(Move.HAZE,41),
                        new MoveLearnSetEntry(Move.PSYSHOCK,48),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,55),
                        new MoveLearnSetEntry(Move.AIR_SLASH,62),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,69),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.GUST,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 45, 53, 0.02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_GRASSLAND, Biome.IS_HILLS, Biome.IS_JUNGLE, Biome.IS_SKY, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"false"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_FREEZING))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanFly(true);
        addAdditionalEvolution("golbat", new EvolutionEntry("omeon", EvolutionType.ITEM_INTERACT, false, List.of(new MoveLearnSetEntry(Move.PSYCHIC, "")),
                List.of(),List.of(),"gravelmon:amaze_drive"));
    }
}
