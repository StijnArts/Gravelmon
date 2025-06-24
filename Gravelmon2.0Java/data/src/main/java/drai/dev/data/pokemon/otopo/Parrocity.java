package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Parrocity extends drai.dev.data.pokemon.Pokemon {
    public Parrocity() {
        super("Parrocity",
                Type.ELECTRIC, Type.FLYING,
                new Stats(70,
                        35,
                        45,
                        95,
                        65,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                151, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Every time it flaps its wings, electricity is created. The receptacle becomes electrically charged if it is caught in the gust of its wings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,27),
                        new MoveLearnSetEntry(Move.TAILWIND,29),
                        new MoveLearnSetEntry(Move.PECK,30),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,32),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,34),
                        new MoveLearnSetEntry(Move.PLUCK,35),
                        new MoveLearnSetEntry(Move.SWIFT,37),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,42),
                        new MoveLearnSetEntry(Move.ROOST,45),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,47),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,48),
                        new MoveLearnSetEntry(Move.WING_ATTACK,50),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,52),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,55),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,57),
                        new MoveLearnSetEntry(Move.HURRICANE,60)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(26).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Parrocity");

    }


}
