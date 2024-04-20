package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pomegrenade extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pomegrenade");

    }


}
