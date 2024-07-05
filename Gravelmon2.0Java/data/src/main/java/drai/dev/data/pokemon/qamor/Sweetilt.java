package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Sweetilt extends drai.dev.data.pokemon.Pokemon {
    public Sweetilt() {
        super("Sweetilt",
                Type.GRASS,
                new Stats(53,
                        42,
                        53,
                        47,
                        70,
                        38),
                List.of(Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                4, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Sweetilt's fragile body makes them easy prey, so they hide among sugarcane stalks for most of the day. They are able to produce a very sweet, sugary juice"),
                List.of(new EvolutionEntry("stiltotem", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,5),
                        new MoveLearnSetEntry(Move.BLOCK,8),
                        new MoveLearnSetEntry(Move.MINIMIZE,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.PURSUIT,19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,21),
                        new MoveLearnSetEntry(Move.TORMENT,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,30),
                        new MoveLearnSetEntry(Move.BOUNCE,35),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,38),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,40)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sweetilt");

    }


}
