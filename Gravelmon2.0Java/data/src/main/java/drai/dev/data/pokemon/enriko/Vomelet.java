package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vomelet extends drai.dev.data.pokemon.Pokemon {
    public Vomelet() {
        super("Vomelet",
                Type.POISON, Type.ROCK,
                new Stats(85,
                        125,
                        100,
                        65,
                        100,
                        55),
                List.of(Ability.POISON_POINT,Ability.GOOEY,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                18, 165,
                new Stats(0,0,2,0,0,0), 90,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Its shell is a foot thick and harder than stone. Its courtship ritual involves rolling into each other at ludicrous speed until one of them cracks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,34),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,39),
                        new MoveLearnSetEntry(Move.GLARE,43),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,48),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,52),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,56),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,66)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 46, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TREE_TOP),
                0.28, 0.3,
                List.of());
           setLangFileName("Vomelet");

    }


}
