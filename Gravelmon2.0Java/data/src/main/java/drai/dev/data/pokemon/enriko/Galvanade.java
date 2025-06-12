package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Galvanade extends drai.dev.data.pokemon.Pokemon {
    public Galvanade() {
        super("Galvanade",
                Type.ICE, Type.ELECTRIC,
                new Stats(106,
                        67,
                        78,
                        87,
                        70,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of("The face of every ice cream parlor in Enriko. Its two heads contain different blends of ultra-sour slush; when mixed, it's potent enough to melt through solid stone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,4),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,15),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,22),
                        new MoveLearnSetEntry(Move.ROAR,26),
                        new MoveLearnSetEntry(Move.ICE_BEAM,32),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,37),
                        new MoveLearnSetEntry(Move.MINIMIZE,41),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,50),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,53),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,58),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,64)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Galvanade");

    }


}
