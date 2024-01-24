package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Strappen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Strappen() {
        super("Strappen",
                Type.ICE,Type.FIGHTING,
                new Stats(50,
                        65,
                        45,
                        50,
                        40,
                        70),
                List.of(Ability.BATTLE_ARMOR,Ability.BIG_PECKS,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("It moves by sliding across the ground as if it were ice-skating. If it falls over, its hard head armor protects it from any injury."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RUSHDOWN,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Strappen");

    }


}
