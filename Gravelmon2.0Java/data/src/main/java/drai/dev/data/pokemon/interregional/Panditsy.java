package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Panditsy extends drai.dev.data.pokemon.Pokemon {
    public Panditsy() {
        super("Panditsy",
                Type.NORMAL,
                new Stats(80,
                        80,
                        80,
                        80,
                        80,
                        80),
                List.of(Ability.OWN_TEMPO,Ability.UNAWARE,Ability.CONTRARY), Ability.CONTRARY,
                14, 165,
                new Stats(0,0,0,2,0,0), 40,
                0.5,
                190, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("Panditsy's unsteady movements are so mesmerizing that just a few moments of observation cause trainers and Pokemon to move in the same fashion. The hypnotic swirl on their head can be dangerous if one is not careful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.ASSIST,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,"tm")                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO, Biome.IS_HILLS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Panditsy");
        addAdditionalEvolution("spinda", new EvolutionEntry("panditsy", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:moon_stone"));

    }


}
