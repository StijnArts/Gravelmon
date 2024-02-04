package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wormeaty extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wormeaty() {
        super("Wormeaty",
                Type.FLYING,Type.POISON,
                new Stats(70,
                        60,
                        150,
                        105,
                        60,
                        70),
                List.of(Ability.UNAWARE,Ability.LIQUID_OOZE,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("(Hemo/Poison type.)A vast colony of symbiotic worms slithers in and out of its body. The worms govern its every move, although they cannot suppress its hunger."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wormeaty");

    }


}
