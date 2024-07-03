package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Bagly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bagly() {
        super("Bagly",
                Type.DARK,
                new Stats(60,
                        50,
                        75,
                        40,
                        80,
                        35),
                List.of(Ability.INFILTRATOR,Ability.HARVEST,Ability.THICK_FAT), Ability.THICK_FAT,
                4, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.75,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It's face is supposedly so ugly it keeps itself hidden under a paper bag. It can commonly be seen around Poke Marts, scouring the dumpsters."),
                List.of(new EvolutionEntry("haggage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.PLAY_NICE,15),
                        new MoveLearnSetEntry(Move.TAUNT,18),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,22),
                        new MoveLearnSetEntry(Move.SLAM,25)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, 8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Bagly");

    }


}
