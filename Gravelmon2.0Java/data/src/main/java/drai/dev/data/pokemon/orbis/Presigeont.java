package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Presigeont extends drai.dev.data.pokemon.Pokemon {
    public Presigeont() {
        super("Presigeont",
                Type.NORMAL, Type.FLYING,
                new Stats(115,
                        93,
                        65,
                        80,
                        90,
                        45),
                List.of(Ability.BIG_PECKS), Ability.ANGER_POINT,
                15, 520,
                new Stats(2,1,0,0,0,0), 45,
                0.5,
                220, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- Work Up Normal - RageSTAB Normal - Wing AttackSTAB Flying - Roost Flying - Brave BirdSTAB Flying"),
                List.of(),
                List.of(                      ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(34).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Presigeont");

    }


}
