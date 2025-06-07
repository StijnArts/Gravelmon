package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whaste extends drai.dev.data.pokemon.Pokemon {
    public Whaste() {
        super("Whaste",
                Type.GHOST, Type.POISON,
                new Stats(140,
                        70,
                        75,
                        100,
                        110,
                        60),
                List.of(Ability.WEAK_ARMOR,Ability.STENCH), Ability.SCREEN_CLEANER,
                89, 5,
                new Stats(0,0,0,1,2,0), 45,
                0.5,
                210, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Whaste lifelessly drift along with the oceans currents collecting trash on their backs and have been given the nickname 'cleaners of the sea' because of this. Bird Pokemon like Seadeek often seek rest on their backs when they have to travel long distances. Depending on the items found on their backs can alter their abilities and moves."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.YAWN,8),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.MUD_BOMB,18),
                        new MoveLearnSetEntry(Move.RECYCLE,21),
                        new MoveLearnSetEntry(Move.FLING,26),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,29),
                        new MoveLearnSetEntry(Move.SWALLOW,32),
                        new MoveLearnSetEntry(Move.STOCKPILE,32),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,37),
                        new MoveLearnSetEntry(Move.TOXIC,41),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,44),
                        new MoveLearnSetEntry(Move.AMNESIA,48),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,51),
                        new MoveLearnSetEntry(Move.BELCH,60)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(45).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Whaste");

    }


}
