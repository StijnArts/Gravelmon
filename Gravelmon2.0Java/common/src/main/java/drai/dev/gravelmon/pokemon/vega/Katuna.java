package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Katuna extends Pokemon {
    public Katuna() {
            super( "Katuna",
                    Type.WATER,
                    new Stats(40, 64, 60, 40, 50, 64),
                    List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                    3, 45,
                    new Stats(0,0,0,0,0,1), 45,
                    0.875,
                    66, ExperienceGroup.MEDIUM_SLOW,
                    70,
                    50, List.of(EggGroup.WATER_1, EggGroup.WATER_2),
                    List.of("Due to the shape of its body, water flows quickly and easily past it. This makes it a fast swimmer. "),
                    List.of(new EvolutionEntry("maelstream", EvolutionType.LEVEL_UP, List.of(),
                            List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                    List.of(
                            new MoveLearnSetEntry(Move.TACKLE,1),
                            new MoveLearnSetEntry(Move.LEER,4),
                            new MoveLearnSetEntry(Move.WATER_GUN,9),
                            new MoveLearnSetEntry(Move.WATER_SPORT,12),
                            new MoveLearnSetEntry(Move.AQUA_JET,17),
                            new MoveLearnSetEntry(Move.AGILITY,20),
                            new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                            new MoveLearnSetEntry(Move.WATER_PULSE,28),
                            new MoveLearnSetEntry(Move.TAUNT,33),
                            new MoveLearnSetEntry(Move.AQUA_TAIL,36),
                            new MoveLearnSetEntry(Move.SCARY_FACE,41),
                            new MoveLearnSetEntry(Move.DIVE,44),
                            new MoveLearnSetEntry(Move.HYDRO_PUMP,49),
                            new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                            new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                            new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                            new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                            new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                            new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                            new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                            new MoveLearnSetEntry(Move.HAZE,"tm"),
                            new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                            new MoveLearnSetEntry(Move.SURF,"tm"),
                            new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                            new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                            new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                            new MoveLearnSetEntry(Move.REST,"tutor"),
                            new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                            new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                            new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                            new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                            new MoveLearnSetEntry(Move.BLIZZARD,"egg"),
                            new MoveLearnSetEntry(Move.CORNER,"egg"),
                            new MoveLearnSetEntry(Move.CRASH_IMPACT,"egg"),
                            new MoveLearnSetEntry(Move.CURSE,"egg"),
                            new MoveLearnSetEntry(Move.CURSED_WRATH,"egg"),
                            new MoveLearnSetEntry(Move.DISABLE,"egg"),
                            new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                            new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                            new MoveLearnSetEntry(Move.DRILL_RUN,"egg"),
                            new MoveLearnSetEntry(Move.FROSTBITE,"egg"),
                            new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                            new MoveLearnSetEntry(Move.ICICLE_CRASH,"egg"),
                            new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                            new MoveLearnSetEntry(Move.POSSESS,"egg"),
                            new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                            new MoveLearnSetEntry(Move.RAGE,"egg"),
                            new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                            new MoveLearnSetEntry(Move.SCALD,"egg"),
                            new MoveLearnSetEntry(Move.SPITE,"egg"),
                            new MoveLearnSetEntry(Move.SPLASH,"egg"),
                            new MoveLearnSetEntry(Move.STARFREEZE,"egg"),
                            new MoveLearnSetEntry(Move.TORMENT,"egg")
                            ),
                    List.of(Label.DENEB),
                    0, List.of(), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 6, 19, 8.0, List.of(
                            new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                            new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                    ), List.of(),
                    List.of(SpawnPreset.UNDERWATER),
                    0.4, 0.3,
                    List.of());
            this.setPortraitXYZ(0.1,2.0,0.0);
            this.setModeled(true);
            this.setBaseScale(0.9);
            this.setCanSwim(true);
            this.setAvoidsLand(true);
            this.setSwimSpeed(0.2);
            this.setCanBreathUnderwater(true);
            this.setHitbox(0.7,0.7);
        }
}
