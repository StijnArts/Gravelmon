package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Milthunk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Milthunk(Stats stats) {
        super("Milthunk",
                Type.PSYCHIC, Type.NORMAL,
                stats,
                List.of(Ability.THICK_FAT,Ability.FOREWARN,Ability.SCRAPPY), Ability.SCRAPPY,
                14, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Milthunk can predict storms by focusing on different wind patterns with its mind. By ringing both the bell on the tip of its tail and around its neck may warn both farmers and other Pokemon to seek shelter. Its milk tastes just as good as a Miltank’s but may come with unknown side effects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.STORED_POWER,1),
                        new MoveLearnSetEntry(Move.ENCORE,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.MILK_DRINK,20),
                        new MoveLearnSetEntry(Move.AFTER_YOU,25),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,30),
                        new MoveLearnSetEntry(Move.PSYCHIC,35),
                        new MoveLearnSetEntry(Move.CALM_MIND,40),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,45),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,50),
                        new MoveLearnSetEntry(Move.LAST_RESORT,55)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 25, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Milthunk");

    }


}
