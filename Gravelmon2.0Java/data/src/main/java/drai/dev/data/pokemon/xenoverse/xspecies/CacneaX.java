package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CacneaX extends Pokemon {
    public CacneaX(String name, Aspect aspect) {
        super(name, aspect,"CacneaX",
                Type.GRASS, Type.GHOST,
                new Stats(50, 85, 50, 85, 40, 35),
                List.of(Ability.IRON_BARBS), Ability.CURSED_BODY,
                4, 315,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                39, List.of(EggGroup.XENO),
                List.of("Because its appearance resembles a severed head, everyone who fights this Cacnea is scared to death."),
                List.of(new EvolutionEntry("cacturnex", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"gravelmon:xenolith")),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,7),
                        new MoveLearnSetEntry(Move.ASTONISH,10),
                        new MoveLearnSetEntry(Move.CURSE,13),
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,16),
                        new MoveLearnSetEntry(Move.PURSUIT,19),
                        new MoveLearnSetEntry(Move.INGRAIN,22),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,26),
                        new MoveLearnSetEntry(Move.SPIKES,30),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,34),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,42),
                        new MoveLearnSetEntry(Move.GRUDGE,46),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,54),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN3),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 15, 34, 3.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.27, 0.3,
                List.of());
        this.setLangFileName("Cacnea");

        
        this.setBaseScale(1);
        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setAnimationFileName("cacnea_x");
        getPosingFileData().setPortraitData( 1.8f, new Vector3(0, -.7, 0));
        getPosingFileData().setProfileData( .8f, new Vector3(0, 0.5, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose(),
                AnimationData.walkingAnimation()
        ));
    }
}
