package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pomegrenade extends drai.dev.data.pokemon.Pokemon {
    public Pomegrenade() {
        super("Pomegrenade",
                Type.GRASS, Type.FIRE,
                new Stats(42,
                        57,
                        75,
                        30,
                        50,
                        41),
                List.of(Ability.SOLAR_POWER), Ability.AFTERMATH,
                3, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Due to looking similar to a delicious pomeg berry, is is chasen by hungry Pokemon. When badly hurt, as a last resort it will burst into flames like a bomb."),
                List.of(new EvolutionEntry("artreelery", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))
                ),
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
                        new MoveLearnSetEntry(Move.SYNTHESIS,45)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pomegrenade");

    }


}
