package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shurisan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shurisan() {
        super("Shurisan",
                Type.FIGHTING,
                new Stats(51,
                        91,
                        63,
                        91,
                        67,
                        124),
                List.of(Ability.LIMBER,Ability.DEFIANT,Ability.COMPETITIVE), Ability.COMPETITIVE,
                14, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.DOUBLE_SLAP,1),
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,1),
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.UPPERHAND,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.ENSNARE,1)                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 43, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE, Biome.IS_BAMBOO)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Shurisan");

    }


}
