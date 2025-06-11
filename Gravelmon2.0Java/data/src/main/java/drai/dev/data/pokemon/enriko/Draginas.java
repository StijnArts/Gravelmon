package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Draginas extends drai.dev.data.pokemon.Pokemon {
    public Draginas() {
        super("Draginas",
                Type.BUG,
                new Stats(65,
                        78,
                        56,
                        65,
                        85,
                        95),
                List.of(Ability.PARENTAL_BOND), Ability.PARENTAL_BOND,
                15, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.BUG),
                List.of("Each Draginas has a giant symbiotic worm living in its digestive tract. When it lays eggs, so does the worm, so the cycle continues."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,10),
                        new MoveLearnSetEntry(Move.GUST,13),
                        new MoveLearnSetEntry(Move.SING,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,21),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.SILVER_WIND,29),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,33),
                        new MoveLearnSetEntry(Move.MOONLIGHT,37),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,41),
                        new MoveLearnSetEntry(Move.AFTER_YOU,45),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,49),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,53),
                        new MoveLearnSetEntry(Move.HURRICANE,57)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Draginas");

    }


}
