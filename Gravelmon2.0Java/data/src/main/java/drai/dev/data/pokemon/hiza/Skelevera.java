package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Skelevera extends drai.dev.data.pokemon.Pokemon {
    public Skelevera() {
        super("Skelevera",
                Type.GHOST,
                new Stats(40,
                        60,
                        50,
                        50,
                        55,
                        50),
                List.of(Ability.CURSED_BODY), Ability.CURSED_BODY,
                5, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.HUMAN_LIKE),
                List.of("This Pokemon was at first believed to be a human brought back to life through dark magic. The colored parts of its body are actually a sticky goop that hold the bones it collects together."),
                List.of(new EvolutionEntry("orcleton", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.BONE_CLUB,6),
                        new MoveLearnSetEntry(Move.DISABLE,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,14),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,17),
                        new MoveLearnSetEntry(Move.PURSUIT,22),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,27),
                        new MoveLearnSetEntry(Move.BONE_RUSH,31),
                        new MoveLearnSetEntry(Move.TORMENT,33),
                        new MoveLearnSetEntry(Move.CURSE,38),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,41),
                        new MoveLearnSetEntry(Move.BONEMERANG,46)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Skelevera");

    }


}
