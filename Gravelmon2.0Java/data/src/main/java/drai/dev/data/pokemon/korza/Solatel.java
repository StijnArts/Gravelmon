package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Solatel extends drai.dev.data.pokemon.Pokemon {
    public Solatel() {
        super("Solatel",
                Type.DARK,
                new Stats(73,
                        79,
                        123,
                        82,
                        86,
                        62),
                List.of(Ability.SOLAR_POWER), Ability.INTIMIDATE,
                17, 1368,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                177, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Solatel's favorite food is honey. It will go to any lengths to get some, and without honey, it will be in a perpetually foul mood. Its spikes can be raised and shine with as much force as the sun."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,3),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,14),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.WORK_UP,24),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,31),
                        new MoveLearnSetEntry(Move.PAYBACK,37),
                        new MoveLearnSetEntry(Move.PURSUIT,41),
                        new MoveLearnSetEntry(Move.MORNING_SUN,46),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,50),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,55),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,61),
                        new MoveLearnSetEntry(Move.SPIKES,65),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,69)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Solatel");

    }


}
