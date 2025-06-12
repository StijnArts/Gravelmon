package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class TrishoutTerrestrial extends Pokemon {
    public TrishoutTerrestrial(String name, Aspect aspect) {
        super(name, aspect,"TrishoutTerrestrial",
                Type.FIRE, Type.SOUND,
                new Stats(88, 105, 55, 80, 44, 78),
                List.of(Ability.GUTS), Ability.VOICE_TUNING,
                9, 200,
                new Stats(0,2,0,0,0,0), 45,
                -1,
                64, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("It has become more competitive thanks to the Red Energy. It goes wild during battle, releasing scorching flames from its horn."),
                List.of(new EvolutionEntry("trishout terrestrial=false", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of()),
                        new EvolutionEntry("trishoutxenoversal", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:xenoversal_ring"))).notOptional(),
                        new EvolutionEntry("trishoutastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:terrestrial_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional(),
                        new EvolutionEntry("trishoutastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "gravelmon:xenoversal_ring"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))).notOptional()),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.JET_STRIKE,1),
                        new MoveLearnSetEntry(Move.CHEERING,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABBLE,8),
                        new MoveLearnSetEntry(Move.HOWL,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,17),
                        new MoveLearnSetEntry(Move.FIRE_FANG,21),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,38),
                        new MoveLearnSetEntry(Move.SWAGGER,40),
                        new MoveLearnSetEntry(Move.BOOMBURST,45),
                        new MoveLearnSetEntry(Move.ROAR,51),
                        new MoveLearnSetEntry(Move.SCARY_FACE,56),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.BLAST_BURN,"tutor"),
                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.SCORCHED_ASHES,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Trishout");

        
        this.setHitbox(0.7, 1.1);
        this.setBaseScale(1);
        getSpeciesFileData().addBasicVariation("MayTheEpicGamer");
        getPosingFileData().setAnimationFileName("trishout_terrestrial");
        getPosingFileData().setPortraitData( 2.5f, new Vector3(0.0, 1.1, 0));
        getPosingFileData().setProfileData( .7f, new Vector3(0, 0.7, 0));
        getPosingFileData().head = "head_2";
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().withBlink().markAsBackupPose()
        ));
    }
}
