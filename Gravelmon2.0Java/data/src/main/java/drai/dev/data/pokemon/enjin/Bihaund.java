package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bihaund extends drai.dev.data.pokemon.Pokemon {
    public Bihaund() {
        super("Bihaund",
                Type.GHOST, Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INTIMIDATE,Ability.UNNERVE), Ability.PETRIFY,
                8, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It emits sonar waves from the eye-like patterns on its hands, using them to echolocate in cold, dark caves. If it were to open its real eyes, anything that sees into them would be turned to ice."),
                List.of(new EvolutionEntry("serpendage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.COLDSNAP,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.SOULCHOMP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bihaund");

    }


}
