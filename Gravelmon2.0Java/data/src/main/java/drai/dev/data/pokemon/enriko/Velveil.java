package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Velveil extends drai.dev.data.pokemon.Pokemon {
    public Velveil() {
        super("Velveil",
                Type.FAIRY,
                new Stats(45,
                        65,
                        50,
                        40,
                        40,
                        40),
                List.of(Ability.FOREWARN,Ability.INNER_FOCUS,Ability.PRESSURE), Ability.PRESSURE,
                6, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Groups of Velveil form in circles under the light of the full moon and stare up at the moon overhead. It is impossible to distract them during their ritual."),
                List.of(new EvolutionEntry("lunartic", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SING,3),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,7),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,11),
                        new MoveLearnSetEntry(Move.GLARE,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,18),
                        new MoveLearnSetEntry(Move.ASSIST,21),
                        new MoveLearnSetEntry(Move.CHARM,25),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,31),
                        new MoveLearnSetEntry(Move.SLASH,36),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,39),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,43),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,47),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,55)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Velveil");

    }


}
