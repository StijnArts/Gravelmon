package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Strelair extends drai.dev.data.pokemon.Pokemon {
    public Strelair() {
        super("Strelair",
                Type.GRASS, Type.FLYING,
                new Stats(35,
                        85,
                        60,
                        85,
                        40,
                        75),
                List.of(Ability.WATER_ABSORB,Ability.SECONDWIND,Ability.AERILATE), Ability.AERILATE,
                11, 165,
                new Stats(0,1,0,1,0,1), 180,
                0.5,
                84, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FLYING),
                List.of("Strelair's leaves generate enough lift to uproot itself and soar through the air. When it lands, it simply roots back into the ground."),
                List.of(new EvolutionEntry("reginaegle", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone"),
                        new EvolutionEntry("wyfern", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.GROWTH,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.ACROBATICS,26),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,30),
                        new MoveLearnSetEntry(Move.WING_ATTACK,34),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,48),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Strelair");

    }


}
