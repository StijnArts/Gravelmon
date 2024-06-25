package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Anglow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anglow() {
        super("Anglow",
                Type.LIGHT, Type.GHOST,
                new Stats(60,
                        50,
                        70,
                        60,
                        80,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.CURSED_BODY), Ability.ALLURINGGLOW,
                8, 165,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.AMORPHOUS),
                List.of("While Anglow's teeth look like they are for biting, they're actually a defense machanism. Not only does the intimidation often scare opponents, it's also extremely useful as the teeth are as hard as diamond, making it so that Anglow can block incoming attacks with it."),
                List.of(new EvolutionEntry("alluard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(             new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.WILLOWISP,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,28),
                        new MoveLearnSetEntry(Move.CURSE,34),
                        new MoveLearnSetEntry(Move.IMPRISON,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,52),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,58)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 22, 43, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Anglow");

    }


}
