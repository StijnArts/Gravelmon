package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Monymph extends drai.dev.data.pokemon.Pokemon {
    public Monymph() {
        super("Monymph",
                Type.BUG, Type.ROCK,
                new Stats(80,
                        90,
                        120,
                        60,
                        100,
                        50),
                List.of(Ability.BATTLE_ARMOR,Ability.COMPOUND_EYES,Ability.AFTERMATH), Ability.AFTERMATH,
                17, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It exhumes graves for food, carrying the headstone on its back for shelter. During the day, they hide underground, so grave keepers will find their yard mysteriously rearranged overnight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,5),
                        new MoveLearnSetEntry(Move.ACCELEROCK,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,9),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,16),
                        new MoveLearnSetEntry(Move.SANDSTORM,20),
                        new MoveLearnSetEntry(Move.SILVER_WIND,24),
                        new MoveLearnSetEntry(Move.AMNESIA,28),
                        new MoveLearnSetEntry(Move.TOMBSTONER,32),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,36),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,40),
                        new MoveLearnSetEntry(Move.MEGAHORN,43),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_SPOOKY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Monymph");

    }


}
