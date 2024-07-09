package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class PyukumukuX extends Pokemon {
    public PyukumukuX(String name, Aspect aspect) {
        super(name, aspect,"PyukumukuX",
                Type.FIGHTING,
                new Stats(55, 130, 60, 5, 30, 130),
                List.of(Ability.IRON_FIST), Ability.SHEER_FORCE,
                7, 101,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                134, ExperienceGroup.FAST,
                70,
                39, List.of(EggGroup.XENO),
                List.of("It is way bigger than the actual Pyukumuku. Expelling its internal organs, it propels itself to strike its opponent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.BATON_PASS,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,5),
                        new MoveLearnSetEntry(Move.TAUNT,10),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,15),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,20),
                        new MoveLearnSetEntry(Move.BULK_UP,25),
                        new MoveLearnSetEntry(Move.SWAGGER,30),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,35),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,40),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,45),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,50),
                        new MoveLearnSetEntry(Move.REVERSAL,55),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,60),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN7),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 20, 37, 3.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END, Biome.IS_DEEP_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.27, 0.3,
                List.of());
        this.setLangFileName("Pyukumuku");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanBreathUnderwater(true);
        this.setCanSwim(true);
        this.setModeled(true);
        this.setBaseScale(0.8);
    }
}
