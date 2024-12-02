package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lepikite extends drai.dev.data.pokemon.Pokemon {
    public Lepikite() {
        super("Lepikite",
                Type.BUG, Type.FLYING,
                new Stats(55,
                        30,
                        50,
                        80,
                        71,
                        94),
                List.of(Ability.UNBURDEN,Ability.PINWHEEL,Ability.SIMPLE), Ability.SIMPLE,
                10, 165,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Lepikite spin sticky silk that can be attached to any surface to avoid being carried by the wind. Children will often play with them and attempt to cut their threads."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.GUST,10),
                        new MoveLearnSetEntry(Move.PURSUIT,13),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,21),
                        new MoveLearnSetEntry(Move.WHIRLWIND,24),
                        new MoveLearnSetEntry(Move.THREADLASH,28),
                        new MoveLearnSetEntry(Move.SILVER_WIND,32),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.UTURN,40),
                        new MoveLearnSetEntry(Move.TAILWIND,42),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,46),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,50),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,"tm"),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
