package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Valvacid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valvacid() {
        super("Valvacid",
                Type.POISON,
                new Stats(100,
                        85,
                        80,
                        100,
                        65,
                        70),
                List.of(Ability.PRESSURE), Ability.CORROSION,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("If it lashes its arms onto its prey, it will either pump corrosive acids to finish it or drain its life energy. It spits red sludge when angered."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.BIND,12),
                        new MoveLearnSetEntry(Move.DISABLE,16),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,20),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,28),
                        new MoveLearnSetEntry(Move.WRING_OUT,32),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.FACADE,41),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,44),
                        new MoveLearnSetEntry(Move.POISON_JAB,47),
                        new MoveLearnSetEntry(Move.RECOVER,51),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,55),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BREAKDOWN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valvacid");

    }


}
