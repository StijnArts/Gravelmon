package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Moluschant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moluschant() {
        super("Moluschant",
                Type.DARK, Type.PSYCHIC,
                new Stats(74,
                        59,
                        100,
                        106,
                        80,
                        30),
                List.of(Ability.MAGICIAN), Ability.PROTEAN,
                6, 165,
                new Stats(0,0,1,1,0,0), 90,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its shell gives it power to use several elemental moves. If the shell is cracked those moves may backfire or come out as the wrong element."),
                List.of(),
                List.of(          new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.PAYBACK,9),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.SWAGGER,18),
                        new MoveLearnSetEntry(Move.SLASH,21),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,24),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,27),
                        new MoveLearnSetEntry(Move.SWITCHEROO,33),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,37),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,47)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Moluschant");

    }


}
