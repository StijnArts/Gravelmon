package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Relode extends drai.dev.data.pokemon.Pokemon {
    public Relode() {
        super("Relode",
                Type.STEEL, Type.ROCK,
                new Stats(87,
                        89,
                        112,
                        54,
                        45,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FAIRY),
                List.of("Despite their age, some continue to use Relode as personal bodyguards due to their reliability. At point blank, their blast can bust a hole through a tank's hull."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,9),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,14),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,17),
                        new MoveLearnSetEntry(Move.PROTECT,22),
                        new MoveLearnSetEntry(Move.SLASH,27),
                        new MoveLearnSetEntry(Move.IRON_HEAD,30),
                        new MoveLearnSetEntry(Move.BLOCK,35),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,38),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,42),
                        new MoveLearnSetEntry(Move.SPIN_TAIL,47),
                        new MoveLearnSetEntry(Move.METEOR_MASH,54),
                        new MoveLearnSetEntry(Move.WORK_UP,61),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,66),
                        new MoveLearnSetEntry(Move.METAL_BLAST,73)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
           setLangFileName("Relode");

    }


}
