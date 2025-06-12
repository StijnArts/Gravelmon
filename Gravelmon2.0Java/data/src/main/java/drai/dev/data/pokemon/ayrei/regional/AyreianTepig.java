package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianTepig extends drai.dev.data.pokemon.Pokemon {
    public AyreianTepig(String name, Aspect aspect) {
        super(name, aspect, "AyreianTepig",
                Type.FIRE,Type.GROUND,
                new Stats(75,
                        73,
                        45,
                        35,
                        35,
                        45),
                List.of(Ability.BLAZE,Ability.HUSTLE), null,
                5, 99,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It can be seen sleeping soundly in lava lakes. A sick Tepig can be dangerous, as it will drool the accumulated magma from its nostrils."),
                List.of(new EvolutionEntry("pignite ayreian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,35),
                        new MoveLearnSetEntry(Move.MUD_SHOT,13),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,10),
                        new MoveLearnSetEntry(Move.FIRECRACKERS,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,31),
                        new MoveLearnSetEntry(Move.MAGNITUDE,25),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.BULLDOZE,21),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,19),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.BURN_UP,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tepig");

    }


}
