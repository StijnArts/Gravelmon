package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AyreianQuaquaval extends Pokemon {
    public AyreianQuaquaval(String name, Aspect aspect) {
        super(name, aspect,"AyreianQuaquaval",
                Type.WATER, Type.PSYCHIC,
                new Stats(90,110,65,95,100,70),
                List.of(Ability.TORRENT, Ability.MINDTUNING ), Ability.TECHNICIAN,
                18, 619,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                262, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.GRASS),
                List.of("After reaching a crystal clear state of mind, this Pokemon can execute even the most head-spinning dance moves flawlessly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 1),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN, 1),
                        new MoveLearnSetEntry(Move.WORK_UP, 7),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 10),
                        new MoveLearnSetEntry(Move.AQUA_JET, 13),
                        new MoveLearnSetEntry(Move.HEART_STAMP, 17),
                        new MoveLearnSetEntry(Move.FLIP_TURN, 21),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 27),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT, 32),
                        new MoveLearnSetEntry(Move.LIFE_DEW, 38),
                        new MoveLearnSetEntry(Move.LIQUIDATION, 43),
                        new MoveLearnSetEntry(Move.PSYCHIC, 47),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE, 52),

                        new MoveLearnSetEntry(Move.TAKE_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.AIR_SLASH, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.ENCORE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS, "tutor"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, "tutor"),
                        new MoveLearnSetEntry(Move.TERA_BLAST, "tutor"),

                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN, "egg"),
                        new MoveLearnSetEntry(Move.ROOST, "egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT, "egg")
                ),
                List.of(Label.GEN9,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 47, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Quaquaval");
        this.setPortraitXYZ(0,1.8,0);
        this.setCanSwim(true);
    }
}
