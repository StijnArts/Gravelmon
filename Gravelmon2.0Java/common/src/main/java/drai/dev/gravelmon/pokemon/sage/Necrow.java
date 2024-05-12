package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Necrow extends Pokemon {
    public Necrow() {
        super("Necrow",
                Type.GHOST, Type.FLYING,
                new Stats(70, 65, 65, 60, 55, 110),
                List.of(Ability.SAND_VEIL, Ability.SCAVENGER), Ability.OPPORTUNIST,
                7, 81,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Necrow has been known to lure people into the desert in an attempt to make them get lost. It then quietly watches from afar, awaiting its prey's demise."),
                List.of(new EvolutionEntry("vultergyst", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,9),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,15),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,18),
                        new MoveLearnSetEntry(Move.SAND_TOMB,22),
                        new MoveLearnSetEntry(Move.CURSE,26),
                        new MoveLearnSetEntry(Move.BONE_RUSH,28),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,31),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,36),
                        new MoveLearnSetEntry(Move.AIR_SLASH,41),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,46),
                        new MoveLearnSetEntry(Move.TAILWIND,52),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,58),
                        new MoveLearnSetEntry(Move.TERRORIZE,64),
                        new MoveLearnSetEntry(Move.MEMENTO,70),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.SAGE),
                4, List.of(
                        new ItemDrop("minecraft:bone",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 39, 0.45, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setCanFly(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
