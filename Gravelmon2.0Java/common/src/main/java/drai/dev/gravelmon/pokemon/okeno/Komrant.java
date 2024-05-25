package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Komrant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Komrant() {
        super("Komrant",
                Type.BUG,
                new Stats(52,
                        71,
                        55,
                        32,
                        40,
                        50),
                List.of(Ability.BATTLE_ARMOR,Ability.UNDERLING,Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Komrant are very strong in spite of their size. They gather in groups to lift huge ground blocks to build the lairs of their partners."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,3),
                        new MoveLearnSetEntry(Move.WORK_UP,7),
                        new MoveLearnSetEntry(Move.TEAMUP,11),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,15),
                        new MoveLearnSetEntry(Move.ROTOTILLER,19),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,22),
                        new MoveLearnSetEntry(Move.STRENGTH,26),
                        new MoveLearnSetEntry(Move.BULLDOZE,30),
                        new MoveLearnSetEntry(Move.UTURN,34),
                        new MoveLearnSetEntry(Move.DIG,38),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,43),
                        new MoveLearnSetEntry(Move.SUPERPOWER,47),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Komrant");

    }


}
