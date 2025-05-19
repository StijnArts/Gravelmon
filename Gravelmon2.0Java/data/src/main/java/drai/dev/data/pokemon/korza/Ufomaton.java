package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ufomaton extends drai.dev.data.pokemon.Pokemon {
    public Ufomaton() {
        super("Ufomaton",
                Type.STEEL,Type.PSYCHIC,
                new Stats(55,
                        45,
                        120,
                        130,
                        90,
                        85),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                26, 1043,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("The mon's slimy body is solidified enough to withstand exposure outside of its suit, but still prefers the suit's safety. Ufomaton have a unique form of communication, creating crop circles whose shapes are only visible from high above."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.CROPCIRCLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,10),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,14),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,18),
                        new MoveLearnSetEntry(Move.PSYBEAM,24),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,34),
                        new MoveLearnSetEntry(Move.PSYSHOCK,38),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,43),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,49),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ufomaton");

    }


}
