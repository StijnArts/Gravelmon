package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gachigachoo extends Pokemon {
    public Gachigachoo() {
        super("Gachigachoo",
                Type.ELECTRIC, Type.ICE,
                new Stats(55, 62, 70, 63, 80, 100),
                List.of(Ability.STATIC), Ability.CHEEK_POUCH,
                6, 75,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.FAIRY, EggGroup.FIELD),
                List.of("It withstands low temperatures thanks to its thick fur coat. If you rub that, it will charge with static electricity and electrocute."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CHARGE,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,16),
                        new MoveLearnSetEntry(Move.ICE_BALL,21),
                        new MoveLearnSetEntry(Move.TICKLE,25),
                        new MoveLearnSetEntry(Move.SWIFT,29),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,34),
                        new MoveLearnSetEntry(Move.FROST_BREATH,40),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,45),
                        new MoveLearnSetEntry(Move.FROSTBITE,51),
                        new MoveLearnSetEntry(Move.DISCHARGE,55),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,"egg"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"egg"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"egg"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());


        this.setBaseScale(1);
        this.setHitbox(1,1);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 1.7f, new Vector3(0, -.65, 0));
        getPosingFileData().setProfileData( .9f, new Vector3(0, .5, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().clearAnimations()
        ));
    }
}
