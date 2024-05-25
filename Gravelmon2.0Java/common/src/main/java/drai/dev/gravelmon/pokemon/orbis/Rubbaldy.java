package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Rubbaldy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rubbaldy() {
        super("Rubbaldy",
                Type.NORMAL,
                new Stats(180,
                        65,
                        60,
                        40,
                        79,
                        59),
                List.of(Ability.VOLT_ABSORB), Ability.VOLT_ABSORB,
                9, 242,
                new Stats(3,0,0,0,0,0), 85,
                0.5,
                126, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Rubbaldy get their name from having skin as thick as rubber, giving them resistance to electricity. They are loved by children due to their playful and bouncy nature. They will always stay with their trainers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.BOUNCE,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.HEAL_BELL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rubbaldy");

    }


}
