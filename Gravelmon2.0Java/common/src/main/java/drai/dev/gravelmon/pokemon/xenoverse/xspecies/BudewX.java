package drai.dev.gravelmon.pokemon.xenoverse.xspecies;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class BudewX extends Pokemon {
    public BudewX(int dexNo) {
        super(dexNo,"BudewX",
                Type.SOUND, Type.POISON,
                new Stats(40, 30, 35, 70, 55, 50),
                List.of(Ability.SERENE_GRACE), Ability.SOUNDPROOF,
                2, 12,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.XENO),
                List.of("If you put your ear to its sound organ, you will hear the sound of a soft breathing. When it's fired up, the sound becomes deafening."),
                List.of(new EvolutionEntry("roseliax", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.SUPERSONIC,7),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,10),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN4),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 4, 17, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Budew");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
