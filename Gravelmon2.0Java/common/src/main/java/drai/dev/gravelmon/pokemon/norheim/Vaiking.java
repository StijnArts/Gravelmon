package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Vaiking extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vaiking() {
        super("Vaiking",
                Type.STEEL,Type.FIGHTING,
                new Stats(75,
                        120,
                        130,
                        50,
                        50,
                        75),
                List.of(Ability.BATTLE_ARMOR), Ability.STEELY_SPIRIT,
                8, 165,
                new Stats(0,1,2,0,0,0), 30,
                0.0,
                165, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MINERAL),
                List.of("When a leader Falinks leaves the group, it may evolve into a Vaiking. They have excellent combat skills with both spear and shield."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaiking");

    }


}
