package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Darcastro extends drai.dev.data.pokemon.Pokemon {
    public Darcastro() {
        super("Darcastro",
                Type.DRAGON, Type.DARK,
                new Stats(90,
                        130,
                        95,
                        115,
                        85,
                        85),
                List.of(Ability.ANGER_POINT,Ability.RECKLESS,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,2,0,1,0,0), 15,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("These Pokemon soar across the land, compelling local Pokemon to rampage around. Sightings of them are immediately followed with city-wide warnings. In Havai, they are seen as superiors to all Dragon-type Pokemon. It is very difficult to gain trust and loyalty from Darcastro. They do not like taking orders from anyone and rather do things their own way. Once trust is gained, they can be the most loyal partner to a Trainer."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Darcastro");

    }


}
