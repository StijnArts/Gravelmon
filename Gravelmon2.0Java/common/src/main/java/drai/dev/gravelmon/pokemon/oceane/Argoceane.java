package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Argoceane extends drai.dev.gravelmon.pokemon.Pokemon {
    public Argoceane() {
        super("Argoceane",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(105,
                        90,
                        100,
                        125,
                        160,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's been credited with the creation of all ocean life. Whenever there is a mass extinction, it pours out with recovery and diversification. Its large, cornucopian shell is always brimming with life energy."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.HOWL,7),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,14),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.BODY_SLAM,28),
                        new MoveLearnSetEntry(Move.REST,35),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,42),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,49),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,56),
                        new MoveLearnSetEntry(Move.CRUNCH,63),
                        new MoveLearnSetEntry(Move.WISH,70),
                        new MoveLearnSetEntry(Move.GYRO_BALL,77),
                        new MoveLearnSetEntry(Move.PERISH_SONG,84),
                        new MoveLearnSetEntry(Move.BOOMBURST,91),
                        new MoveLearnSetEntry(Move.VITALTIDE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.OCEAN_MONUMENT),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
