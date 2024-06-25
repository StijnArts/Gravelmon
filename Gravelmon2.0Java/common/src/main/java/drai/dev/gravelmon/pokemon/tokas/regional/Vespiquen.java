package drai.dev.gravelmon.pokemon.tokas.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Vespiquen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vespiquen(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Vespiquen",
                Type.BUG, Type.FLYING,
                new Stats(70,
                        80,
                        102,
                        80,
                        102,
                        40),
                List.of(Ability.PRESSURE), Ability.UNNERVE,
                12, 385,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Evo Slash Normal - GustSTAB Flying - Poison Sting Poison - Confuse Ray Ghost - Slash Normal - Destiny Bond Ghost - Sweet Scent Normal - Fell StingerSTAB Bug 5 Fury CutterSTAB Bug 9 Pursuit Dark 13 Fury Swipes Normal 17 Defend Order Bug 25 Power Gem Rock 29 Heal Order Bug 33 Toxic Poison 37 Air SlashSTAB Flying 41 Captivate Normal 45 Attack OrderSTAB Bug 49 Swagger Normal 53 Destiny Bond Ghost 57 Fell StingerSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,5),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.DEFEND_ORDER,17),
                        new MoveLearnSetEntry(Move.POWER_GEM,25),
                        new MoveLearnSetEntry(Move.HEAL_ORDER,29),
                        new MoveLearnSetEntry(Move.TOXIC,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,37),
                        new MoveLearnSetEntry(Move.CAPTIVATE,41),
                        new MoveLearnSetEntry(Move.ATTACK_ORDER,45),
                        new MoveLearnSetEntry(Move.SWAGGER,49),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,53),
                        new MoveLearnSetEntry(Move.FELL_STINGER,57),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm")                        ),
                List.of(Label.TOKAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vespiquen");

    }


}
