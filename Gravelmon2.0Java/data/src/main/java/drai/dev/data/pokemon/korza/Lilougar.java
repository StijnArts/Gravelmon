package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lilougar extends drai.dev.data.pokemon.Pokemon {
    public Lilougar() {
        super("Lilougar",
                Type.GRASS,Type.PSYCHIC,
                new Stats(90,
                        70,
                        79,
                        108,
                        80,
                        108),
                List.of(Ability.OVERGROW), Ability.TELEPATHY,
                13, 449,
                new Stats(0,0,0,2,0,1), 45,
                0.875,
                240, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Lilougar have incredible psychic ability, allowing it to accelerate plant growth and listen to the minds of other creatures. Some trainers claim to be able to telepathically communicate with their Lilougar."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,11),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.CALM_MIND,21),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.PSYCH_UP,29),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,33),
                        new MoveLearnSetEntry(Move.SEED_BOMB,38),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,44),
                        new MoveLearnSetEntry(Move.SYNTHESIS,48),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,53),
                        new MoveLearnSetEntry(Move.PSYCHIC,59),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lilougar");

    }


}
