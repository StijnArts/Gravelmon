package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Woolam extends drai.dev.gravelmon.pokemon.Pokemon {
    public Woolam() {
        super("Woolam",
                Type.NORMAL,
                new Stats(80,
                        50,
                        50,
                        55,
                        70,
                        25),
                List.of(Ability.FUR_COAT), Ability.SAP_SIPPER,
                8, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Woolam are bred for their wool, which is used for knitting woven items like blankets, sweaters, and scarves. The quality of their wool is mostly dependent on their diet."),
                List.of(new EvolutionEntry("alpalaine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LICK,8),
                        new MoveLearnSetEntry(Move.STOMP,12),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.SAFEGUARD,23),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,29),
                        new MoveLearnSetEntry(Move.YAWN,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.DISCHARGE,41),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,47),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,53),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SOLIDKICK,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROCUTE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
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
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 26, 6.7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Woolam");

    }


}
