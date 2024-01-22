package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Capyba extends Pokemon {
    public Capyba() {
        super( "Capyba",
                Type.NORMAL,
                new Stats(58,
                        54,
                        45,
                        28,
                        40,
                        40),
                List.of(Ability.UNAWARE), Ability.OBLIVIOUS,
                3, 68,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their body hair is soft and fluffy. They can hide a berry within their hair."),
                List.of(new EvolutionEntry("Capiland", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.MUDSLAP,9),
                        new MoveLearnSetEntry(Move.BULLDOZE,12),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.BURROW,25),
                        new MoveLearnSetEntry(Move.HELPING_HAND,28),
                        new MoveLearnSetEntry(Move.ENDEAVOR,33),
                        new MoveLearnSetEntry(Move.ENDURE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.AMNESIA,44),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,49),
                        new MoveLearnSetEntry(Move.BITE,"tutor"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.YAWN,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BURROW,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.THRASH,"egg"),
                        new MoveLearnSetEntry(Move.FACADE,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 19, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
