package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ponyata extends drai.dev.data.pokemon.Pokemon {
    public Ponyata() {
        super("Ponyata",
                Type.GHOST, Type.NORMAL,
                new Stats(10,
                        5,
                        70,
                        35,
                        90,
                        29),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("bustag", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(            new MoveLearnSetEntry(Move.ROLE_PLAY,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,5),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,10),
                        new MoveLearnSetEntry(Move.CURSE,15),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,20),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,25),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,30),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,35),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,45),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,50),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,55)            ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Ponyata");

    }


}
