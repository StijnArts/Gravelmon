package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Moucroon extends drai.dev.data.pokemon.Pokemon {
    public Moucroon() {
        super("Moucroon",
                Type.FIGHTING, Type.GROUND,
                new Stats(80,
                        130,
                        65,
                        55,
                        95,
                        75),
                List.of(Ability.HUSTLE), Ability.HUSTLE,
                17, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A vicious Pokemon that hibernates during the Spring. If awoke during it’s 3 month hibernation, it will hunt down the one who awoke it relentlessly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,6),
                        new MoveLearnSetEntry(Move.BONE_CLUB,12),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,21),
                        new MoveLearnSetEntry(Move.BONEMERANG,27),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,30),
                        new MoveLearnSetEntry(Move.SLASH,36),
                        new MoveLearnSetEntry(Move.BONE_RUSH,42),
                        new MoveLearnSetEntry(Move.SUBMISSION,45),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,51),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,57),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,60),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Moucroon");

    }


}
