package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Azumarill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Azumarill(int dex) {
        super(dex, "Azumarill",
                Type.WATER, Type.FAIRY,
                new Stats(100,
                        60,
                        85,
                        60,
                        85,
                        50),
                List.of(Ability.THICK_FAT,Ability.HUGE_POWER), Ability.SAP_SIPPER,
                8, 285,
                new Stats(3,0,0,0,0,0), 75,
                0.5,
                189, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.WATER_1),
                List.of("By keeping still and listening intently, it can tell what is in even wild, fast-moving rivers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,2),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,13),
                        new MoveLearnSetEntry(Move.AQUASLAP,15),
                        new MoveLearnSetEntry(Move.HELPING_HAND,21),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,24),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,28),
                        new MoveLearnSetEntry(Move.AQUA_RING,32),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,51),
                        new MoveLearnSetEntry(Move.SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.COPYCAT,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Azumarill");

    }


}
