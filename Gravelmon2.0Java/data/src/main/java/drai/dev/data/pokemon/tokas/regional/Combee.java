package drai.dev.data.pokemon.tokas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Combee extends drai.dev.data.pokemon.Pokemon {
    public Combee(String name, Aspect aspect) {
        super(name, aspect, "Combee",
                Type.BUG, Type.FLYING,
                new Stats(30,
                        30,
                        42,
                        30,
                        42,
                        70),
                List.of(Ability.HONEY_GATHER), Ability.HUSTLE,
                3, 55,
                new Stats(0,0,0,0,0,1), 120,
                0.875,
                49, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- GustSTAB Flying - Sweet Scent Normal 13 Bug BiteSTAB Bug 29 Bug BuzzSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,13),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,29),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm")                        ),
                List.of(Label.TOKAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Combee");

    }


}
