package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Infesteak extends drai.dev.data.pokemon.Pokemon {
    public Infesteak() {
        super("Infesteak",
                Type.FLYING, Type.POISON,
                new Stats(60,
                        50,
                        120,
                        75,
                        50,
                        60),
                List.of(Ability.UNAWARE,Ability.LIQUID_OOZE,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo/Poison type.) The worm embedded in its body impairs its vision, but also alerts it to danger. The bone in its gut can be removed and used as a weapon."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Infesteak");

    }


}
