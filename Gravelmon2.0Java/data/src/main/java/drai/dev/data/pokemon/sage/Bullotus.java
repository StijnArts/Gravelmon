package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bullotus extends Pokemon {
    public Bullotus() {
        super("Bullotus",
                Type.GRASS, Type.WATER,
                new Stats(94, 85, 91, 67, 81, 61),
                List.of(Ability.RAIN_DISH, Ability.HYDRATION), Ability.LEAF_GUARD,
                12, 528,
                new Stats(1,0,1,0,0,0), 90,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.GRASS),
                List.of("Bullotus’s booming cry can be heard for miles around. When resting, it floats on the water and looks up, absorbing sunlight with the petals around its neck."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.MUDSLIDE,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,32),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,43),
                        new MoveLearnSetEntry(Move.POWER_WHIP,54),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                        new MoveLearnSetEntry(Move.BRINE,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:lily_pad",90, 1,2)
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 4, 25, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP,Biome.IS_FRESHWATER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE),
                0.4, 0.5,
                List.of(new PokemonForm(
                        "Blue", false,
                        Type.GRASS, Type.WATER,
                        new Stats(94, 85, 91, 67, 81, 61),
                        List.of(Ability.RAIN_DISH, Ability.HYDRATION), Ability.LEAF_GUARD,
                        12, 528,
                        new Stats(1,0,1,0,0,0), 90,
                        0.5,
                        168, ExperienceGroup.MEDIUM_FAST,
                        70,
                        50, List.of(EggGroup.WATER_1, EggGroup.GRASS),
                        List.of(Aspect.BLUE),
                        List.of("Bullotus’s booming cry can be heard for miles around. When resting, it floats on the water and looks up, absorbing sunlight with the petals around its neck."),
                        List.of(),
                        List.of(
                                new MoveLearnSetEntry(Move.UPROAR,1),
                                new MoveLearnSetEntry(Move.MUDSLIDE,1),
                                new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                                new MoveLearnSetEntry(Move.BODY_SLAM,1),
                                new MoveLearnSetEntry(Move.BOUNCE,1),
                                new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                                new MoveLearnSetEntry(Move.SYNTHESIS,32),
                                new MoveLearnSetEntry(Move.HYDRO_PUMP,43),
                                new MoveLearnSetEntry(Move.POWER_WHIP,54),
                                new MoveLearnSetEntry(Move.ROAR,"tm"),
                                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                                new MoveLearnSetEntry(Move.HAIL,"tm"),
                                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                                new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                                new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                                new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                                new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                                new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                                new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                                new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                                new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                                new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                                new MoveLearnSetEntry(Move.RETURN,"tm"),
                                new MoveLearnSetEntry(Move.DIG,"tm"),
                                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                                new MoveLearnSetEntry(Move.FACADE,"tm"),
                                new MoveLearnSetEntry(Move.REST,"tm"),
                                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                                new MoveLearnSetEntry(Move.THIEF,"tm"),
                                new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                                new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                                new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                                new MoveLearnSetEntry(Move.SCALD,"tm"),
                                new MoveLearnSetEntry(Move.ENDURE,"tm"),
                                new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                                new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                                new MoveLearnSetEntry(Move.FLASH,"tm"),
                                new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                                new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                                new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                                new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                                new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                                new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                                new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                                new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                                new MoveLearnSetEntry(Move.SURF,"tm"),
                                new MoveLearnSetEntry(Move.DIVE,"tm"),
                                new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                                new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                                new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                                new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                                new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                                new MoveLearnSetEntry(Move.FLING,"tutor"),
                                new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                                new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                                new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                                new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                                new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                                new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                                new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                                new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                                new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                                new MoveLearnSetEntry(Move.SNORE,"tutor"),
                                new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                                new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                                new MoveLearnSetEntry(Move.AROMATHERAPY,"egg"),
                                new MoveLearnSetEntry(Move.BRINE,"egg"),
                                new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                                new MoveLearnSetEntry(Move.LEAF_SHIELD,"egg"),
                                new MoveLearnSetEntry(Move.LEAF_STORM,"egg"),
                                new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                                new MoveLearnSetEntry(Move.MIST,"egg"),
                                new MoveLearnSetEntry(Move.SOAK,"egg"),
                                new MoveLearnSetEntry(Move.THRASH,"egg"),
                                new MoveLearnSetEntry(Move.YAWN,"egg")
                                ),
                        List.of(Label.SAGE),
                        2, List.of(
                        new ItemDrop("minecraft:lily_pad",90, 1,2)
                        ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 4, 25, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP,Biome.IS_FRESHWATER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                        ), List.of(),
                        List.of(SpawnPreset.WATER_SURFACE)
                )));
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);

    }
}
