package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mouskrow extends drai.dev.data.pokemon.Pokemon {
    public Mouskrow() {
        super("Mouskrow",
                Type.NORMAL,
                new Stats(62,
                        51,
                        55,
                        35,
                        45,
                        32),
                List.of(Ability.OVERCOAT), Ability.MOUNTAINEER,
                4, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Stumbling upon a Mouskrow community, you will find burrows in which they live in. To avoid getting lost, they create trails around their area. They have trails leading to other Mouskrow communities to assist each other with delivering food and supplies. Their thick coats turn white in the winter so they can blend in with the snow to hide from enemies."),
                List.of(new EvolutionEntry("mousummit", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))
                ),
                List.of(      new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,2),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,7),
                        new MoveLearnSetEntry(Move.ICY_WIND,11),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,15),
                        new MoveLearnSetEntry(Move.ICE_SHARD,19),
                        new MoveLearnSetEntry(Move.STOMP,23),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,27),
                        new MoveLearnSetEntry(Move.AVALANCHE,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,41),
                        new MoveLearnSetEntry(Move.BOUNCE,44),
                        new MoveLearnSetEntry(Move.SHEER_COLD,49),
                        new MoveLearnSetEntry(Move.JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MILK_DRINK,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm")
                ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mouskrow");

    }


}
