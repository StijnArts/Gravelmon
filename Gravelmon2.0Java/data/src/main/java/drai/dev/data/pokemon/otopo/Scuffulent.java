package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scuffulent extends drai.dev.data.pokemon.Pokemon {
    public Scuffulent() {
        super("Scuffulent",
                Type.GROUND, Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Scuffulents are easily enraged since they are frequently stomped on. It will seize its attacker by the feet, drag him underground, and pound him to death."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NEEDLE_ARM,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,4),
                        new MoveLearnSetEntry(Move.BULLDOZE,7),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,10),
                        new MoveLearnSetEntry(Move.ARM_THRUST,13),
                        new MoveLearnSetEntry(Move.MAGNITUDE,16),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,19),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,22),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,25),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,28),
                        new MoveLearnSetEntry(Move.REVENGE,31),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,37),
                        new MoveLearnSetEntry(Move.SANDSTORM,40),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,43),
                        new MoveLearnSetEntry(Move.SPIKES,46),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,49)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scuffulent");

    }


}
