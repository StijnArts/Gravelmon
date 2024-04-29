package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bubblea extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bubblea() {
        super("Bubblea",
                Type.WATER, Type.FAIRY,
                new Stats(60,
                        60,
                        80,
                        85,
                        110,
                        80),
                List.of(Ability.RAIN_DISH), Ability.AROMA_VEIL,
                12, 165,
                new Stats(0,0,0,0,2,0), 63,
                0.35,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.FAIRY),
                List.of("Bubblea are known to float around large bodies of water, like lakes. Rumors say that popping Bubblea's bubbles by force brings it immense pain."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,6),
                        new MoveLearnSetEntry(Move.CHARM,9),
                        new MoveLearnSetEntry(Move.SLAM,12),
                        new MoveLearnSetEntry(Move.BOUNCE,15),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,19),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,21),
                        new MoveLearnSetEntry(Move.AQUA_RING,24),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,27),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,30),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,33),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 7, 34, 4, List.of(
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
