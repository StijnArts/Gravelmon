package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class PikachuXFemale extends Pokemon {
    public PikachuXFemale(int dexNo) {
        super(dexNo,"PikachuXFemale",
                Type.FAIRY,
                new Stats(85, 40, 65, 85, 40, 90),
                List.of(Ability.KEEN_EYE), Ability.FRIEND_GUARD,
                4, 60,
                new Stats(0,0,0,2,0,1), 65,
                0,
                105, ExperienceGroup.MEDIUM_FAST,
                70,
                26, List.of(EggGroup.XENO),
                List.of("It is a real anomaly between X Pokémon. Its nature makes it friendly even to human."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,1),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,1),
                        new MoveLearnSetEntry(Move.ICE_BEAM,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1),
                        new MoveLearnSetEntry(Move.TICKLE,4),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,8),
                        new MoveLearnSetEntry(Move.ASSURANCE,12),
                        new MoveLearnSetEntry(Move.FEINT,16),
                        new MoveLearnSetEntry(Move.SWIFT,20),
                        new MoveLearnSetEntry(Move.AGILITY,24),
                        new MoveLearnSetEntry(Move.SLAM,28),
                        new MoveLearnSetEntry(Move.FAKE_OUT,30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,32),
                        new MoveLearnSetEntry(Move.MOONBLAST,36),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,44),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 33, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Pikachu");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(0.5);
        this.setHitbox(0.7, 0.3);
    }
}
