package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zappinch extends drai.dev.data.pokemon.Pokemon {
    public Zappinch() {
        super("Zappinch",
                Type.ELECTRIC, Type.FLYING,
                new Stats(40,
                        20,
                        40,
                        60,
                        35,
                        60),
                List.of(Ability.STATIC,Ability.KEEN_EYE), Ability.COMPETITIVE,
                0, 0,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Zappinch was originally assumed to be a Normal-type Pokémon until it was found that its claws can absorb electricity. Zappinch nest in pylons and can be found in cosmopolitan places."),
                List.of(new EvolutionEntry("parrocity", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,27),
                        new MoveLearnSetEntry(Move.TAILWIND,29),
                        new MoveLearnSetEntry(Move.PECK,30),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,32),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,34),
                        new MoveLearnSetEntry(Move.PLUCK,35),
                        new MoveLearnSetEntry(Move.SWIFT,37),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,42),
                        new MoveLearnSetEntry(Move.ROOST,45),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,47),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,48),
                        new MoveLearnSetEntry(Move.WING_ATTACK,50),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,52),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,55),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,57),
                        new MoveLearnSetEntry(Move.HURRICANE,60)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Zappinch");

    }


}
