package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kidling extends Pokemon {
    public Kidling() {
        super("Kidling",
                Type.FIRE,
                new Stats(43, 63, 47, 57, 40, 59),
                List.of(Ability.BLAZE), Ability.FLASH_FIRE,
                4, 52,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                28, ExperienceGroup.MEDIUM_SLOW,
                70,
                41, List.of(EggGroup.FIELD),
                List.of("Kidling headbutts humans and Pokémon as a sign of affection. When its head makes contact, even gently, the flame on its tail flares up briefly."),
                List.of(new EvolutionEntry("pyroat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg"),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.STOMP,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.HEADBUTT,13),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,16),
                        new MoveLearnSetEntry(Move.AGILITY,19),
                        new MoveLearnSetEntry(Move.MUDSLIDE,22),
                        new MoveLearnSetEntry(Move.BULK_UP,25),
                        new MoveLearnSetEntry(Move.BRACE,28),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,31),
                        new MoveLearnSetEntry(Move.BATTERING_RAM,34),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,37),
                        new MoveLearnSetEntry(Move.SWAGGER,40),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.STANDOFF,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,49),
                        new MoveLearnSetEntry(Move.SKULL_BASH,52)
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:flint",50, 1,2),
                        new ItemDrop("minecraft:leather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.9, 0.7,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        this.setBaseScale(0.9);

        this.setModeled(true);
    }
}
