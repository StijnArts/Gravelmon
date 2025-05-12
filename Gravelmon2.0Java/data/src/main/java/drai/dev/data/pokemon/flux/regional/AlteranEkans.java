package drai.dev.data.pokemon.flux.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AlteranEkans extends Pokemon {
    public AlteranEkans(String name, Aspect aspect) {
        super(name, aspect,"AlteranEkans",
                Type.FIGHTING,
                new Stats(35, 60, 44, 40, 54, 55),
                List.of(Ability.GUTS, Ability.SHED_SKIN), Ability.TECHNICIAN,
                7, 80,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Alteran EKANS wrestle their prey rather than use venom. When faced with tougher foes, it wraps its body into a wheel shape and rolls away at high speed."),
                List.of(new EvolutionEntry("alteranarbok", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,4),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.SCREECH,17),
                        new MoveLearnSetEntry(Move.REVENGE,20),
                        new MoveLearnSetEntry(Move.STOCKPILE,25),
                        new MoveLearnSetEntry(Move.SWALLOW,25),
                        new MoveLearnSetEntry(Move.SPIT_UP,25),
                        new MoveLearnSetEntry(Move.ENDURE,28),
                        new MoveLearnSetEntry(Move.REVERSAL,33),
                        new MoveLearnSetEntry(Move.QUASH,36),
                        new MoveLearnSetEntry(Move.POWER_WHIP,41),
                        new MoveLearnSetEntry(Move.TAUNT,44),
                        new MoveLearnSetEntry(Move.COIL,49),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,52),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"egg")
                        ),
                List.of(Label.GEN1,Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4.05, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Ekans");
    }
}
