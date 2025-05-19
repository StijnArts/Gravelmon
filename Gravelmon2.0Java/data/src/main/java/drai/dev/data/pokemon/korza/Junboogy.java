package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Junboogy extends drai.dev.data.pokemon.Pokemon {
    public Junboogy() {
        super("Junboogy",
                Type.BUG,Type.NORMAL,
                new Stats(83,
                        74,
                        68,
                        74,
                        95,
                        91),
                List.of(Ability.DANCER), Ability.KLUTZ,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Despite their dancing skills, they are extremely clumsy. Junboogy love to dance and sing around lights, often attracted to porches and streetlights where they'll party the night away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.STEAMROLLER,10),
                        new MoveLearnSetEntry(Move.FAKE_OUT,15),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,20),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,24),
                        new MoveLearnSetEntry(Move.SILVER_WIND,28),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,33),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,37),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,41),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.WARDANCE,50),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,54),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,59),
                        new MoveLearnSetEntry(Move.LUNGE,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Junboogy");

    }


}
