package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beavomnom extends drai.dev.data.pokemon.Pokemon {
    public Beavomnom() {
        super("Beavomnom",
                Type.NORMAL,
                new Stats(75,
                        94,
                        44,
                        49,
                        65,
                        69),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their bite can prove to be lethal due to the bacteria swarming in their mouth. They build dams out of fallen branches, gluing them together with their viscous saliva."),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,13),
                        new MoveLearnSetEntry(Move.TAUNT,17),
                        new MoveLearnSetEntry(Move.YAWN,21),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,37),
                        new MoveLearnSetEntry(Move.AMNESIA,41),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45),
                        new MoveLearnSetEntry(Move.CURSE,49)),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 44, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beavomnom");

    }


}
