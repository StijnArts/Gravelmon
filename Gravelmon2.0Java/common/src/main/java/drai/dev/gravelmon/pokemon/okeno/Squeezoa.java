package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Squeezoa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squeezoa() {
        super("Squeezoa",
                Type.WATER,Type.POISON,
                new Stats(130,
                        64,
                        92,
                        64,
                        100,
                        80),
                List.of(Ability.CLEAR_BODY), Ability.HYDRATION,
                23, 165,
                new Stats(0,0,0,0,2,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_3),
                List.of("The underside of its body is composed of many poisonous tentacles and frills — touching them results in stinging pain. However, it is a gentle Pokemon and people have learned to ride it across the seas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,10),
                        new MoveLearnSetEntry(Move.PURIFY,16),
                        new MoveLearnSetEntry(Move.SLUDGE,23),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,30),
                        new MoveLearnSetEntry(Move.REFRESH,37),
                        new MoveLearnSetEntry(Move.BRINE,44),
                        new MoveLearnSetEntry(Move.LIFE_DEW,50),
                        new MoveLearnSetEntry(Move.BEACHTIDE,55),
                        new MoveLearnSetEntry(Move.RECOVER,60),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,70),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,80),
                        new MoveLearnSetEntry(Move.POISON_STING,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 23, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
