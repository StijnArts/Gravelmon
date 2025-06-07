package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Diggbee extends drai.dev.data.pokemon.Pokemon {
    public Diggbee() {
        super("Diggbee",
                Type.BUG, Type.GROUND,
                new Stats(72,
                        125,
                        92,
                        55,
                        60,
                        71),
                List.of(Ability.EARTH_EATER), Ability.EARTH_EATER,
                14, 920,
                new Stats(0,1,1,0,0,0), 100,
                0.5,
                179, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Baybee that remain in their honey armour for too long evolve into Diggbee. They are used in construction sites as a reliable means to dig up dirt. Their huge claws allow them to breakthrough even bedrock."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,8),
                        new MoveLearnSetEntry(Move.ROTOTILLER,16),
                        new MoveLearnSetEntry(Move.COIL,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(22).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Diggbee");

    }


}
