package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Skowl extends drai.dev.data.pokemon.Pokemon {
    public Skowl() {
        super("Skowl",
                Type.FLYING, Type.GHOST,
                new Stats(46,
                        65,
                        41,
                        60,
                        78,
                        45),
                List.of(Ability.NOCTURNAL), Ability.INSOMNIA,
                4, 165,
                new Stats(0,0,0,0,1,0), 150,
                0.5,
                67, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Active during the night, groups of Skowl gather at spots where there is supernatural activity, especially on nights of the full moon when activity is peaked. An old tale says if Skowl are on top your roof during the nights of a full moon, those who reside in the house will be cursed with misfortunes."),
                List.of(new EvolutionEntry("owlminous", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "night")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ASTONISH,5),
                        new MoveLearnSetEntry(Move.PURSUIT,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,11),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,14),
                        new MoveLearnSetEntry(Move.SCREECH,19),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,22),
                        new MoveLearnSetEntry(Move.AIR_SLASH,26),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,29),
                        new MoveLearnSetEntry(Move.CURSE,31),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,36),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,38),
                        new MoveLearnSetEntry(Move.PERISH_SONG,42),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,47),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,55),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,62),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm")                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
