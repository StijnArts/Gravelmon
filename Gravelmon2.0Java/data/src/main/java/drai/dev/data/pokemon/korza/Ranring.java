package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ranring extends drai.dev.data.pokemon.Pokemon {
    public Ranring() {
        super("Ranring",
                Type.ICE,Type.FIRE,
                new Stats(76,
                        62,
                        59,
                        84,
                        54,
                        100),
                List.of(Ability.FLAME_BODY), Ability.PRANKSTER,
                10, 300,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("A mon that prefers living around waterfalls, rapids, and other fast-moving currents. Some fisherman see the bright red body and believe it to be a much rarer mon, and eagerly try to catch it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TAUNT,10),
                        new MoveLearnSetEntry(Move.UTURN,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,31),
                        new MoveLearnSetEntry(Move.AGILITY,36),
                        new MoveLearnSetEntry(Move.THIEF,40),
                        new MoveLearnSetEntry(Move.ENCORE,46),
                        new MoveLearnSetEntry(Move.TRICK,50),
                        new MoveLearnSetEntry(Move.FEINT,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ranring");

    }


}
