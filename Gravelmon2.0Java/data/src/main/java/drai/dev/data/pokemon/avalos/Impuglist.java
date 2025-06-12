package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Impuglist extends drai.dev.data.pokemon.Pokemon {
    public Impuglist() {
        super("Impuglist",
                Type.DARK, Type.FIRE,
                new Stats(48,
                        90,
                        59,
                        21,
                        56,
                        46),
                List.of(Ability.HEATRUSH,Ability.STAMINA), Ability.ANGER_POINT,
                9, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("tarturough", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,9),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,12),
                        new MoveLearnSetEntry(Move.INCINERATE,19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,23),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,27),
                        new MoveLearnSetEntry(Move.SCARY_FACE,30),
                        new MoveLearnSetEntry(Move.OBSTRUCT,35),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,40),
                        new MoveLearnSetEntry(Move.FALSE_SURRENDER,45),
                        new MoveLearnSetEntry(Move.INFERNO,50),
                        new MoveLearnSetEntry(Move.OUTRAGE,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,60),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm")
                ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(9)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_WASTELAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Impuglist");

    }


}
