package drai.dev.data.pokemon.daybreak.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmiranArcanine extends Pokemon {
    public ArmiranArcanine(String name, Aspect aspect) {
        super(name, aspect,"ArmiranArcanine",
                Type.WATER,
                new Stats(90, 110, 90, 100, 90, 95),
                List.of(Ability.INTIMIDATE,Ability.WATER_ABSORB), Ability.JUSTIFIED,
                19, 1550,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                194, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("This fleet-footed Pokemon is said to run over 6,200 miles in a single day and night. Supposedly, it can also run on water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.LEER,8),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.HELPING_HAND,12),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.REVERSAL,19),
                        new MoveLearnSetEntry(Move.FIRE_FANG,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,23),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,28),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,34),
                        new MoveLearnSetEntry(Move.CRUNCH,39),
                        new MoveLearnSetEntry(Move.IRON_TAIL,41),
                        new MoveLearnSetEntry(Move.OUTRAGE,43),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,54),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,60),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tutor")
                        ),
                List.of(Label.GEN1,Label.DAYBREAK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Arcanine");
        setCanBreathUnderwater(true);
        setCanSwim(true);
    }
}
