package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kitsu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kitsu() {
        super("Kitsu",
                Type.FIRE, Type.COSMIC,
                new Stats(79,
                        84,
                        66,
                        55,
                        66,
                        65),
                List.of(Ability.BLAZE), Ability.SUPERNOVA,
                9, 173,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Kitsu start out active but as they get stronger begin to sleep more than they are awake. This is due to the amount of heat they exhaust daily. Waking one up from their slumber will result in an unfavorable heatwave!"),
                List.of(new EvolutionEntry("kitsurah", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,12),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,17),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.FIRE_FANG,24),
                        new MoveLearnSetEntry(Move.AGILITY,29),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,36),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,41),
                        new MoveLearnSetEntry(Move.INFERNO,44),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,48),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,53)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kitsu");

    }


}
