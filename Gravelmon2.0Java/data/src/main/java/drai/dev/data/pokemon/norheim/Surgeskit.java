package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Surgeskit extends drai.dev.data.pokemon.Pokemon {
    public Surgeskit() {
        super("Surgeskit",
                Type.BUG, Type.ELECTRIC,
                new Stats(60,
                        110,
                        50,
                        80,
                        50,
                        104),
                List.of(Ability.SWIFT_SWIM), Ability.ELECTRIC_SURGE,
                12, 165,
                new Stats(0,1,0,0,0,1), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,8),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,12),
                        new MoveLearnSetEntry(Move.TORMENT,16),
                        new MoveLearnSetEntry(Move.ELECTROWEB,19),
                        new MoveLearnSetEntry(Move.ROUND,23),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.QUASH,30),
                        new MoveLearnSetEntry(Move.LUNGE,34),
                        new MoveLearnSetEntry(Move.OVERDRIVE,38),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,41),
                        new MoveLearnSetEntry(Move.SUPER_FANG,45),
                        new MoveLearnSetEntry(Move.SCREECH,49),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,52),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,56)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
           setLangFileName("Surgeskit");
        addAdditionalEvolution("surskit", new EvolutionEntry("surgeskit", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:thunder_stone"));

    }


}
