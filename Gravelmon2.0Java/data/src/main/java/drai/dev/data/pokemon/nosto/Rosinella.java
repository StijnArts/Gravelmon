package drai.dev.data.pokemon.nosto;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rosinella extends drai.dev.data.pokemon.Pokemon {
    public Rosinella() {
        super("Rosinella",
                Type.FAIRY,
                new Stats(43,
                        45,
                        43,
                        61,
                        59,
                        33),
                List.of(Ability.CUTE_CHARM,Ability.HARVEST,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                2, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.0,
                57, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("These tiny Pokemon are very adventurous and tend to be oblivious when it comes to danger. They often get lost."),
                List.of(new EvolutionEntry("sinsenella", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,10),
                        new MoveLearnSetEntry(Move.VINE_WHIP,15),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,22),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,24),
                        new MoveLearnSetEntry(Move.WISH,28),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,33),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,37),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,41),
                        new MoveLearnSetEntry(Move.SYNTHESIS,45),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,1)
                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rosinella");

    }


}
