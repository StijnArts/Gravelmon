package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Towatan extends drai.dev.data.pokemon.Pokemon {
    public Towatan() {
        super("Towatan",
                Type.COSMIC,Type.BUG,
                new Stats(148,
                        78,
                        148,
                        88,
                        148,
                        48),
                List.of(Ability.SHELL_ARMOR), Ability.LIGHTNING_ROD,
                32, 4480,
                new Stats(1,0,1,0,2,0), 3,
                0.0,
                261, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A protector and a vessel of the 'first spirits'. The SORIN on top of To'watan works as a portal to a different world. Its tructure is said to be the inspiration of pagodas. Bacteria might be the reason for its emitting lights."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPORE,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.MEDITATE,1),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.REST,1),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1),
                        new MoveLearnSetEntry(Move.STICKY_WEB,1),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.INFESTATION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,1),
                        new MoveLearnSetEntry(Move.ELECTROWEB,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("To'watan");

    }


}
