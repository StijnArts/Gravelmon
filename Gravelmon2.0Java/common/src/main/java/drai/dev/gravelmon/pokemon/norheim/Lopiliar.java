package drai.dev.gravelmon.pokemon.norheim;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Lopiliar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lopiliar() {
        super("Lopiliar",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        80,
                        50,
                        82,
                        80,
                        78),
                List.of(Ability.KEEN_EYE,Ability.INFILTRATOR), Ability.MAGICIAN,
                13, 0,
                new Stats(0,0,0,0,0,0), 56,
                -1,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MILK_DRINK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.GRUDGE,8),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.CONFUSION,18),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,22),
                        new MoveLearnSetEntry(Move.MEMENTO,26),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,30),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,34),
                        new MoveLearnSetEntry(Move.PSYSHOCK,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,46),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,52)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 54, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lopiliar");

    }


}
