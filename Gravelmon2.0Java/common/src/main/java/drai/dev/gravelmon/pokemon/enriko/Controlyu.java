package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Controlyu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Controlyu() {
        super("Controlyu",
                Type.PSYCHIC,Type.DARK,
                new Stats(35,
                        40,
                        30,
                        140,
                        160,
                        95),
                List.of(Ability.ANALYTIC), Ability.ADAPTABILITY,
                14, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("It devours the memories of its prey, leaving them a mindless husk afterwards. The larger its brain, the stronger it is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.BIND,5),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.CONFUSION,10),
                        new MoveLearnSetEntry(Move.POISON_FANG,13),
                        new MoveLearnSetEntry(Move.CRUNCH,17),
                        new MoveLearnSetEntry(Move.PSYBEAM,21),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.FACADE,26),
                        new MoveLearnSetEntry(Move.SNARL,30),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.AMNESIA,43),
                        new MoveLearnSetEntry(Move.DARK_PULSE,46),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Controlyu");

    }


}
