package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Chompper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chompper() {
        super("Chompper",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), Ability.STRONG_JAW,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Chompper is easily frightened and freezes itself during panic attacks. Surviving only on a meager diet of frost and snow forces this Pokemon to constantly keep on eating."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.MIST,14),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.STOMP,21),
                        new MoveLearnSetEntry(Move.STOCKPILE,24),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,41),
                        new MoveLearnSetEntry(Move.WORK_UP,45),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chompper");

    }


}
