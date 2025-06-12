package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pooyo extends drai.dev.data.pokemon.Pokemon {
    public Pooyo() {
        super("Pooyo",
                Type.GROUND,
                new Stats(30,
                        20,
                        40,
                        70,
                        20,
                        65),
                List.of(Ability.SAND_VEIL,Ability.GOOEY,Ability.SAND_FORCE), Ability.SAND_FORCE,
                4, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.75,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It's body is made mostly of extremely fertile soil. Wherever it roams, plants always grow behind it."),
                List.of(new EvolutionEntry("poogurt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,14),
                        new MoveLearnSetEntry(Move.MUD_SHOT,21),
                        new MoveLearnSetEntry(Move.SANDSTORM,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,29),
                        new MoveLearnSetEntry(Move.MINIMIZE,33),
                        new MoveLearnSetEntry(Move.ROTOTILLER,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.SHORE_UP,49),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,54),
                        new MoveLearnSetEntry(Move.FISSURE,90)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_CROPS)
    .build(), List.of());
	
           setLangFileName("Pooyo");

    }


}
