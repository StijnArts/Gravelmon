package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Xephyron extends drai.dev.data.pokemon.Pokemon {
    public Xephyron() {
        super("Xephyron",
                Type.FLYING, Type.DRAGON,
                new Stats(80,
                        95,
                        60,
                        135,
                        105,
                        125),
                List.of(Ability.AIR_LOCK), Ability.WIND_RIDER,
                54, 150,
                new Stats(0,0,0,2,0,1), 25,
                0.5,
                267, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.AMORPHOUS),
                List.of("- Dragon BreathSTAB Dragon - Shadow Sneak Ghost - HurricaneSTAB Flying - GustSTAB Flying - Ominous Wind Ghost - Tailwind Flying - Icy Wind Ice - Perish Song Normal - TwisterSTAB Dragon - Dragon PulseSTAB Dragon - Air SlashSTAB Flying - Air CutterSTAB Flying 72 Bleakwind StormSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,1),
                        new MoveLearnSetEntry(Move.PERISH_SONG,1),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1),
                        new MoveLearnSetEntry(Move.BLEAKWIND_STORM,72),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Xephyron");

    }


}
