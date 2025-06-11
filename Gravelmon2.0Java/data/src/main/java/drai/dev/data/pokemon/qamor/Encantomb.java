package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Encantomb extends drai.dev.data.pokemon.Pokemon {
    public Encantomb() {
        super("Encantomb",
                Type.GROUND, Type.DRAGON,
                new Stats(90,
                        90,
                        120,
                        45,
                        115,
                        38),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                16, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                174, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("Mightiro who have fallen in battle rise up as an Encantomb. Encantomb's body is constructed from surrounding material around it such as dirt, bone, or chalk."),
                List.of(new EvolutionEntry("gorsylum", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,20),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,25),
                        new MoveLearnSetEntry(Move.STOMP,30),
                        new MoveLearnSetEntry(Move.DIG,35),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,40),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,45),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,50),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,65),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(36)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Encantomb");

    }


}
