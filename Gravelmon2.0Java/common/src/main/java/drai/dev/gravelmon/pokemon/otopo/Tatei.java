package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tatei extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tatei() {
        super("Tatei",
                Type.DARK, Type.FAIRY,
                new Stats(58,
                        83,
                        42,
                        43,
                        48,
                        54),
                List.of(Ability.INNER_FOCUS,Ability.FOREWARN), Ability.UNDERLING,
                10, 322,
                new Stats(0,1,0,0,0,0), 190,
                0.75,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Tatei are well-liked by criminal gangs. They exploit their adorable looks to fool their foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.CHARM,3),
                        new MoveLearnSetEntry(Move.DISABLE,5),
                        new MoveLearnSetEntry(Move.CONFUSION,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,15),
                        new MoveLearnSetEntry(Move.ASSURANCE,17),
                        new MoveLearnSetEntry(Move.ENDURE,19),
                        new MoveLearnSetEntry(Move.SWAGGER,22),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.TORMENT,28),
                        new MoveLearnSetEntry(Move.DARK_PULSE,33),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tatei");

    }


}
