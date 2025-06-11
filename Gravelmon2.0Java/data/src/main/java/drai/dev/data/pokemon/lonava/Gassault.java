package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gassault extends drai.dev.data.pokemon.Pokemon {
    public Gassault() {
        super("Gassault",
                Type.FIGHTING, Type.GHOST,
                new Stats(54,
                        98,
                        78,
                        45,
                        56,
                        87),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gassault are brutal pranksters, attacking passing trainers with a Shadow Punch before vanishing into the dark. Their violent nature culminates in trainers widely avoiding raising one, in fear of constant attack."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.KNOCKBACK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,4),
                        new MoveLearnSetEntry(Move.COUNTER,8),
                        new MoveLearnSetEntry(Move.DETECT,12),
                        new MoveLearnSetEntry(Move.REVENGE,16),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,21),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.MEGA_KICK,32),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,36),
                        new MoveLearnSetEntry(Move.REVERSAL,40),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,44)                    ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Gassault");

    }


}
