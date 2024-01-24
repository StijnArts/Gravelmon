package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reefazoid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reefazoid() {
        super("Reefazoid",
                Type.FAIRY,Type.ROCK,
                new Stats(97,
                        96,
                        126,
                        96,
                        114,
                        26),
                List.of(Ability.BATTLE_ARMOR), Ability.MAGIC_GUARD,
                8, 165,
                new Stats(0,0,2,0,1,0), 45,
                0.5,
                250, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The Cupscape itself has evolved, and grows a much larger exterior. The Hypnode takes advantage of this and makes it into a pilot-able armor for itself. Its rock-hard coral surface is considered unbreakable."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reefazoid");

    }


}
