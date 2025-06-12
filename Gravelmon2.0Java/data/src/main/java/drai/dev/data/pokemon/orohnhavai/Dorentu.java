package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Dorentu extends drai.dev.data.pokemon.Pokemon {
    public Dorentu() {
        super("Dorentu",
                Type.NORMAL,
                new Stats(55,
                        45,
                        40,
                        45,
                        40,
                        30),
                List.of(Ability.PICKUP,Ability.RUN_AWAY,Ability.CHEEK_POUCH), Ability.CHEEK_POUCH,
                3, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They live in pairs or in large groups. During summer they gather food and store it in the trunks of trees, preparing for the scarcity of winter."),
                List.of(new EvolutionEntry("grandorent", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.FORESIGHT,11),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,18),
                        new MoveLearnSetEntry(Move.ROUND,22),
                        new MoveLearnSetEntry(Move.BODY_SLAM,25),
                        new MoveLearnSetEntry(Move.ROLLOUT,29),
                        new MoveLearnSetEntry(Move.SLACK_OFF,32),
                        new MoveLearnSetEntry(Move.AFTER_YOU,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,39),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.TREE_TOP)
    .build(), List.of());
	
           setLangFileName("Dorentu");

    }


}
