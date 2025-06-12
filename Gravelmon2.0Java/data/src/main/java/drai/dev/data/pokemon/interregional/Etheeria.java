package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Etheeria extends drai.dev.data.pokemon.Pokemon {
    public Etheeria() {
        super("Etheeria",
                Type.BUG, Type.ELECTRIC,
                new Stats(76,
                        55,
                        68,
                        105,
                        56,
                        122),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.DETECT,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,9),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,12),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,16),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.UTURN,27),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,35),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,40),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,45),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,51),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,56)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Etheeria");

    }


}
