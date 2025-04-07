package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rockillo extends drai.dev.data.pokemon.Pokemon {
    public Rockillo() {
        super("Rockillo",
                Type.STEEL, Type.ROCK,
                new Stats(40,
                        70,
                        60,
                        15,
                        45,
                        60),
                List.of(Ability.STURDY,Ability.BATTLE_ARMOR), Ability.SOLID_ROCK,
                4, 34,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When in danger Rockillo curls into a ball and rolls away smashing everything on its way into pieces. Rockillo can break through rocks at ease."),
                List.of(new EvolutionEntry("armarolla", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.HEADBUTT,8),
                        new MoveLearnSetEntry(Move.MUD_SHOT,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,14),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,18),
                        new MoveLearnSetEntry(Move.SHARPEN,20),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,24),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,26),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,30),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,33),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,38),
                        new MoveLearnSetEntry(Move.METAL_BURST,41),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,46),
                        new MoveLearnSetEntry(Move.BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rockillo");

    }


}
