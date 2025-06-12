package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MysticBlaziken extends Pokemon {
    public MysticBlaziken(String name, Aspect aspect) {
        super(name, aspect,"MysticBlaziken",
                Type.ROCK, Type.POISON,
                new Stats(80, 110, 120, 70, 80, 70),
                List.of(Ability.INSOMNIA), Ability.MERCILESS,
                19, 520,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                264, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.POISON_STING,7),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,11),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,15),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,18),
                        new MoveLearnSetEntry(Move.POISON_TAIL,22),
                        new MoveLearnSetEntry(Move.SANDSTORM,26),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,33),
                        new MoveLearnSetEntry(Move.CROSS_POISON,39),
                        new MoveLearnSetEntry(Move.AXE_KICK,44),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50)
                ),
                List.of(Label.GEN3,Label.AZURE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Blaziken");
    }
}
