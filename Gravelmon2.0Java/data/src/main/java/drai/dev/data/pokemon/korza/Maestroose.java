package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Maestroose extends drai.dev.data.pokemon.Pokemon {
    public Maestroose() {
        super("Maestroose",
                Type.NORMAL,Type.FLYING,
                new Stats(85,
                        120,
                        70,
                        70,
                        60,
                        80),
                List.of(Ability.ANGER_POINT), Ability.MOXIE,
                14, 435,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                218, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Very aggressive, Maestroose will chase down anything that disturbs their chorus- mainly children. Well known for their massive annual migrations, where you can hear their faint chorus passing overhead."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INSTRUCT,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,14),
                        new MoveLearnSetEntry(Move.SING,18),
                        new MoveLearnSetEntry(Move.SCREECH,22),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,32),
                        new MoveLearnSetEntry(Move.RETURN,38),
                        new MoveLearnSetEntry(Move.AGILITY,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,46),
                        new MoveLearnSetEntry(Move.BOOMBURST,51),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,57)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maestroose");

    }


}
