package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Albagross extends drai.dev.data.pokemon.Pokemon {
    public Albagross() {
        super("Albagross",
                Type.DARK, Type.FLYING,
                new Stats(88,
                        118,
                        84,
                        65,
                        65,
                        68),
                List.of(Ability.SUPER_LUCK,Ability.SNIPER,Ability.AVARICE), Ability.AVARICE,
                17, 165,
                new Stats(1,2,0,0,0,0), 45,
                0.5,
                220, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Ulike Piratross, Albagross are great at hunting. This doesn't stop them from stealing food from other Pokemon, however, and they are even more relentless when doing so."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.HAZE,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.SCREECH,15),
                        new MoveLearnSetEntry(Move.PLUCK,18),
                        new MoveLearnSetEntry(Move.PURSUIT,23),
                        new MoveLearnSetEntry(Move.SWAGGER,27),
                        new MoveLearnSetEntry(Move.BRINE,32),
                        new MoveLearnSetEntry(Move.TORMENT,38),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,44),
                        new MoveLearnSetEntry(Move.SNATCH,49),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,53),
                        new MoveLearnSetEntry(Move.SWITCHEROO,60),
                        new MoveLearnSetEntry(Move.DRILL_PECK,66),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
