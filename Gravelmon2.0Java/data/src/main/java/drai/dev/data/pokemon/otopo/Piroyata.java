package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Piroyata extends drai.dev.data.pokemon.Pokemon {
    public Piroyata() {
        super("Piroyata",
                Type.DARK, Type.FAIRY,
                new Stats(90,
                        90,
                        100,
                        85,
                        75,
                        100),
                List.of(Ability.INNER_FOCUS,Ability.FOREWARN), Ability.INTIMIDATE,
                23, 0,
                new Stats(1,1,0,0,0,1), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Unless you can defeat it in battle, it's best to avoid eye contact with this Pokémon. Despite its huge and massive bulk, Piroyata has a swift fighting skill."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASSURANCE,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,1),
                        new MoveLearnSetEntry(Move.DARK_PULSE,1),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,1),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.BARRAGE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(56).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Piroyata");

    }


}
