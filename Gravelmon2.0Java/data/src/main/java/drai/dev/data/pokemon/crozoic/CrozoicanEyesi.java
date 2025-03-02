package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class CrozoicanEyesi extends drai.dev.data.pokemon.Pokemon {
    public CrozoicanEyesi(String name, Aspect aspect) {
        super(name, aspect, "Eyesi",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(45,
                        50,
                        45,
                        65,
                        45,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 82,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.DRAGON),
                List.of("It relies on electric currents from the ground to achieve lift without much effort. Its feathers stick out in the presence of these currents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TWIN_BEAM,1),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.RESONATE,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,1),
                        new MoveLearnSetEntry(Move.GLARE,"tm")                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Eyesi");

    }


}
