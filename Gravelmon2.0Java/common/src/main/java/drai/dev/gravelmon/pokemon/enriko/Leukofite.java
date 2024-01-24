package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Leukofite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Leukofite() {
        super("Leukofite",
                Type.FIGHTING,Type.FLYING,
                new Stats(60,
                        80,
                        60,
                        100,
                        140,
                        80),
                List.of(Ability.IMMUNITY,Ability.LIQUID_OOZE,Ability.POISON_HEAL), Ability.POISON_HEAL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("(Fighting/Hemo type.) It can see bacteria and viruses on any surface, sending it into an outrage. Anything it deems unclean is drowned in its slime."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Leukofite");

    }


}
