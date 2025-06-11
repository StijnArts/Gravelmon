package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Slowpose extends drai.dev.data.pokemon.Pokemon {
    public Slowpose() {
        super("Slowpose",
                Type.NORMAL,Type.GHOST,
                new Stats(90,
                        65,
                        65,
                        40,
                        40,
                        15),
                List.of(Ability.OWN_TEMPO,Ability.STAKEOUT), Ability.IMMUNITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its frozen, vacant expression reminiscent of Slowpoke is actually a defense mechanisim of its vitals shutting down to disinterest predators, yet it mysteriously stays alive. It feeds by using its tail to attract bug pokemon and in more recent years, scavenging through trash."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Slowpose");

    }


}
