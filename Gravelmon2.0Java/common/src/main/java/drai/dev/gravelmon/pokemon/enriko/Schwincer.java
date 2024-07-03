package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Schwincer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Schwincer() {
        super("Schwincer",
                Type.DARK,
                new Stats(40,
                        90,
                        60,
                        70,
                        70,
                        120),
                List.of(Ability.PICKUP), Ability.CONTRARY,
                13, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                90, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("An infamous kleptomaniac. Their claws are especially adept at gripping onto anything metal. Some people have become lost exploring their burrows, trying to strike it rich."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.PAY_DAY,9),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.THIEF,16),
                        new MoveLearnSetEntry(Move.DIG,20),
                        new MoveLearnSetEntry(Move.SILVER_WIND,23),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,27),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.UTURN,36),
                        new MoveLearnSetEntry(Move.CRABHAMMER,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,44),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Schwincer");

    }


}
