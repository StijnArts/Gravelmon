package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Purrbal extends drai.dev.data.pokemon.Pokemon {
    public Purrbal() {
        super("Purrbal",
                Type.BUG, Type.FAIRY,
                new Stats(65,
                        20,
                        45,
                        55,
                        100,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("papillow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.STUN_SPORE,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,15),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,22),
                        new MoveLearnSetEntry(Move.HELPING_HAND,26),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.ACROBATICS,31),
                        new MoveLearnSetEntry(Move.XSCISSOR,35),
                        new MoveLearnSetEntry(Move.MOONLIGHT,39),
                        new MoveLearnSetEntry(Move.UTURN,43),
                        new MoveLearnSetEntry(Move.POWDER,47),
                        new MoveLearnSetEntry(Move.MOONBLAST,52)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Purrbal");

    }


}
