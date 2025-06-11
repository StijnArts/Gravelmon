package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lunatiken extends drai.dev.data.pokemon.Pokemon {
    public Lunatiken() {
        super("Lunatiken",
                Type.PSYCHIC, Type.FLYING,
                new Stats(77,
                        73,
                        86,
                        105,
                        83,
                        56),
                List.of(Ability.TINTED_LENS), Ability.IMMUNITY,
                14, 165,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Upon evolving, its intelligence and psychic powers grew too much for its small brain to support, causing its behaviour to sometimes be unpredicable."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.ENDEAVOR,10),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,15),
                        new MoveLearnSetEntry(Move.IMPRISON,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,25),
                        new MoveLearnSetEntry(Move.AMNESIA,30),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.CALM_MIND,45),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,50),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,55)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_ARID)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Lunatiken");

    }


}
