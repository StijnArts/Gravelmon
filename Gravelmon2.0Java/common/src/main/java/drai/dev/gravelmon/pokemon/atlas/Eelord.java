package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Eelord extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eelord() {
        super("Eelord",
                Type.WATER, Type.DRAGON,
                new Stats(85,
                        110,
                        72,
                        120,
                        72,
                        86),
                List.of(Ability.FEROCIOUS,Ability.SWIFT_SWIM,Ability.IMMUNITY), Ability.IMMUNITY,
                31, 165,
                new Stats(0,2,0,0,0,0), 30,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("Rumors say Eelord's blood can cure every disease. It has been hunted all over the world for its blood, and now only a few remain."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THRASH,1),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.LIQUIDATION,50),
                        new MoveLearnSetEntry(Move.COIL,55),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORPEDODASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 35, 56, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
