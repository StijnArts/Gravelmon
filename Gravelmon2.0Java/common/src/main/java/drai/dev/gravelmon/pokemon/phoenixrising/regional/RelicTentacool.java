package drai.dev.gravelmon.pokemon.phoenixrising.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class RelicTentacool extends Pokemon {
    public RelicTentacool(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"RelicTentacool",
                Type.WATER, Type.PSYCHIC,
                new Stats(80, 40, 35, 60, 65, 55),
                List.of(Ability.FOREWARN), Ability.FOREWARN,
                11, 634,
                new Stats(1,0,0,0,0,0), 63,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.WATER_3),
                List.of("Relic Tentacool's Source of power is the orb it holds in its tentacles. It is incredibly vulnerable without the orb, so it will defend it with its life."),
                List.of(new EvolutionEntry("relictentacruel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.BIND,6),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.CONFUSION,14),
                        new MoveLearnSetEntry(Move.POWER_TRICK,16),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,20),
                        new MoveLearnSetEntry(Move.HEX,22),
                        new MoveLearnSetEntry(Move.WATER_PULSE,27),
                        new MoveLearnSetEntry(Move.PSYBEAM,29),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm")
                        ),
                List.of(Label.PHOENIX_RISING, Label.GEN1),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.COMMON, 9, 31, 9.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.MAXY, "48")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Tentacool");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
    }
}
