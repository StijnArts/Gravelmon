package drai.dev.gravelmon.pokemon.infinity.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class EghoGloom extends Pokemon {
    public EghoGloom(int dexNo) {
        super(dexNo,"EghoGloom",
                Type.GHOST, Type.POISON,
                new Stats(65, 50, 75, 85, 65, 60),
                List.of(Ability.LEVITATE), Ability.EFFECT_SPORE,
                7, 65,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.AMORPHOUS, EggGroup.MONSTER),
                List.of("Despite their abiotic features, when exposed to enough light, Oddish may evolve into Gloom. Gloom use decorative skulls to scare away other Pokemon."),
                List.of(new EvolutionEntry("viledoom", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.SPORE, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.TOXIC.getName()+"\""))),
                        new EvolutionEntry("mortossum", EvolutionType.LEVEL_UP, List.of(
                                new MoveLearnSetEntry(Move.QUIVER_DANCE, ""),
                                new MoveLearnSetEntry(Move.AROMATHERAPY,"")),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160")))),
                List.of(
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.ACID,9),
                        new MoveLearnSetEntry(Move.POISON_GAS,13),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,26),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,30),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,34),
                        new MoveLearnSetEntry(Move.HEX,38),
                        new MoveLearnSetEntry(Move.TOXIC,42),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,46),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.INGRAIN,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN1),
                4, List.of(
                        new ItemDrop("minecraft:seeds",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 33, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.24, 0.3,
                List.of());
        this.setLangFileName("Gloom");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
