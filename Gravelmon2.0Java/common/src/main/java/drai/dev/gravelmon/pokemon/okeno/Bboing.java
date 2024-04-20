package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bboing extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bboing() {
        super("Bboing",
                Type.DARK, Type.FIGHTING,
                new Stats(90,
                        88,
                        102,
                        50,
                        50,
                        90),
                List.of(Ability.LIMBER,Ability.DANCER,Ability.QUICK_FEET), Ability.QUICK_FEET,
                7, 165,
                new Stats(0,0,1,0,0,0), 60,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,5),
                        new MoveLearnSetEntry(Move.TAUNT,9),
                        new MoveLearnSetEntry(Move.FEINT,13),
                        new MoveLearnSetEntry(Move.WORK_UP,18),
                        new MoveLearnSetEntry(Move.LOW_KICK,20),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,23),
                        new MoveLearnSetEntry(Move.BEAT_UP,25),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,29),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,33),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,38),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,40),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,42),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE,47),
                        new MoveLearnSetEntry(Move.BOUNCE,53),
                        new MoveLearnSetEntry(Move.POWER_TRIP,58),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 9, 31, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("B-boing");

    }


}
