package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bombeetle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bombeetle() {
        super("Bombeetle",
                Type.BUG, Type.FIGHTING,
                new Stats(84,
                        114,
                        84,
                        61,
                        61,
                        72),
                List.of(Ability.BATTLE_ARMOR,Ability.JAWBREAKER,Ability.GUTS), Ability.GUTS,
                17, 165,
                new Stats(0,3,0,0,0,0), 50,
                0.5,
                205, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("All the energy stored while it was Chococoon is converted into this Pokemon's intense fighting spirit. It attacks with mighty punches."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WIDE_GUARD,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,29),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,33),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.BODY_PRESS,40),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,44),
                        new MoveLearnSetEntry(Move.LUNGE,48),
                        new MoveLearnSetEntry(Move.POWER_TRIP,51),
                        new MoveLearnSetEntry(Move.BLOCK,55),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,60),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,65),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 45, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bombeetle");

    }


}
