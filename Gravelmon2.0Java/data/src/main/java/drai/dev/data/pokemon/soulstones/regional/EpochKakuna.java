package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochKakuna extends drai.dev.data.pokemon.Pokemon {
    public EpochKakuna(String name, Aspect aspect) {
        super(name, aspect, "EpochKakuna",
                Type.BUG,Type.STEEL,
                new Stats(45,
                        20,
                        40,
                        25,
                        35,
                        40),
                List.of(Ability.SHED_SKIN,Ability.SHIELD_DUST), Ability.WIMP_OUT,
                6, 100,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It is used for surveillance measures and employs an innocuous Kakuna disguise to avoid attracting attention."),
                List.of(new EvolutionEntry("epochbeedrill", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_CAGE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.QUICKSILVER,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kakuna");

    }


}
