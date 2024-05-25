package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Davolee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Davolee() {
        super("Davolee",
                Type.NORMAL,
                new Stats(75,
                        75,
                        75,
                        75,
                        75,
                        75),
                List.of(Ability.RUN_AWAY), Ability.ANTICIPATION,
                7, 165,
                new Stats(0,1,0,1,0,1), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.WATER_1),
                List.of("Davolee are said to be the offspring of Psyduck and some other Bird Pokemon. The flail wildly when attacked. They are like Eevee, and they evolve three ways into three very different Pokemon."),
                List.of(new EvolutionEntry("dauriasse", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone"),
                        new EvolutionEntry("poiriasse", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:shiny_stone"),
                        new EvolutionEntry("groviasse", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,10),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.HELPING_HAND,25),
                        new MoveLearnSetEntry(Move.FLAIL,30),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,35),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,40),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,45),
                        new MoveLearnSetEntry(Move.THRASH,50),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 6, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Davolee");

    }


}
