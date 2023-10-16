package com.gravelmon.common.gravelmon.pokemon.xenoverse.xspecies;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class GreninjaX extends Pokemon {
    public GreninjaX(int dexNo) {
        super(dexNo,"GreninjaX",
                Type.FIRE, Type.DARK,
                new Stats(72, 107, 71, 133, 75, 127),
                List.of(Ability.SNIPER), Ability.MAGIC_GUARD,
                15, 400,
                new Stats(0,0,0,0,0,3), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.XENO),
                List.of("It moves under cover of darkness. It throws knives of hell fire at its opponents, piercing their flesh and leaving them with atrocious burns."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_KUNAI,1),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.LICK,10),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,14),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,20),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,23),
                        new MoveLearnSetEntry(Move.SPIKES,23),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,33),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,36),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,43),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,49),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,52),
                        new MoveLearnSetEntry(Move.HAZE,56),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,60),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,70),
                        new MoveLearnSetEntry(Move.FIRE_KUNAI,75),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm")
                        ),
                List.of(Label.XENOVERSE, Label.GEN6),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 48, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Greninja");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
