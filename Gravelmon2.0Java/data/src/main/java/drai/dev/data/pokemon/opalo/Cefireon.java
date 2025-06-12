package drai.dev.data.pokemon.opalo;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cefireon extends Pokemon {
    public Cefireon() {
        super("Cefireon",
                Type.FLYING,
                new Stats(65,65,60,130,110,95),
                List.of(Ability.LIGHTNING_ROD), Ability.COMPOUND_EYES,
                10, 290,
                new Stats(0,0,0,2,0,1), 45,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                35, List.of(EggGroup.FIELD),
                List.of("Draconeon are considered exotic and are rarely seen outside of Blackthorn City in Johto. Though smaller than most dragons, Draconeon are fierce and passionate."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND, 1),
                        new MoveLearnSetEntry(Move.SILVER_WIND, 1),
                        new MoveLearnSetEntry(Move.HELPING_HAND, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 5),
                        new MoveLearnSetEntry(Move.GUST, 9),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER, 17),
                        new MoveLearnSetEntry(Move.TAILWIND, 21),
                        new MoveLearnSetEntry(Move.TWISTER, 25),
                        new MoveLearnSetEntry(Move.DEFOG, 29),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, 33),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 37),
                        new MoveLearnSetEntry(Move.AGILITY, 41),
                        new MoveLearnSetEntry(Move.HURRICANE, 45)
                ),
                List.of(Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
        addAdditionalEvolution("eevee", new EvolutionEntry("cefireon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:air_stone"));
    }
}
