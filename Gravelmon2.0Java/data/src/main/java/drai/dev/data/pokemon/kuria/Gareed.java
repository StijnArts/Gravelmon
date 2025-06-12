package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gareed extends drai.dev.data.pokemon.Pokemon {
    public Gareed() {
        super("Gareed",
                Type.GRASS, Type.FIRE,
                new Stats(41,
                        41,
                        51,
                        66,
                        51,
                        50),
                List.of(Ability.LEVITATE), Ability.PRANKSTER,
                4, 6,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                75, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("Gareed smell heavily of garlic. It is said that in ancient times when people were afraid of vampires, they would keep Gareed around."),
                List.of(new EvolutionEntry("gnarlic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,9),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,12),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.BIDE,23),
                        new MoveLearnSetEntry(Move.FLAME_BURST,27),
                        new MoveLearnSetEntry(Move.SEED_BOMB,31),
                        new MoveLearnSetEntry(Move.EXPLOSION,34),
                        new MoveLearnSetEntry(Move.INFERNO,39),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,42),
                        new MoveLearnSetEntry(Move.SYNTHESIS,45)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gareed");

    }


}
