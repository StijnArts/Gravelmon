package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rattata extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rattata() {
        super("Rattata",
                Type.NORMAL,
                new Stats(30,
                        56,
                        35,
                        25,
                        35,
                        72),
                List.of(Ability.RUN_AWAY,Ability.GUTS), Ability.SIMPLE,
                3, 35,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Rattata are popular pokemon among youngsters. Known for their soft and energetic character."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,7)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rattata");

    }


}
