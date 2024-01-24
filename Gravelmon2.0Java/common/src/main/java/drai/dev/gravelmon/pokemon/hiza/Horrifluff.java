package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Horrifluff extends drai.dev.gravelmon.pokemon.Pokemon {
    public Horrifluff() {
        super("Horrifluff",
                Type.BUG,Type.DARK,
                new Stats(70,
                        114,
                        65,
                        65,
                        100,
                        81),
                List.of(Ability.FLUFFY), Ability.OVERCOAT,
                8, 165,
                new Stats(0,1,0,0,1,0), 55,
                0.5,
                200, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Horrifluff uses its body to nest and carry Hairubbs. Despite its size, its capable of silently creeping behind its prey for a deadly pounce."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,6),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.STUN_SPORE,18),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,21),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,26),
                        new MoveLearnSetEntry(Move.XSCISSOR,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,35),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,40),
                        new MoveLearnSetEntry(Move.LUNGE,48),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Horrifluff");

    }


}
