package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Frazzelle extends drai.dev.data.pokemon.Pokemon {
    public Frazzelle() {
        super("Frazzelle",
                Type.ELECTRIC, Type.GRASS,
                new Stats(60,
                        80,
                        60,
                        80,
                        65,
                        124),
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                12, 165,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They can store electricity in their antlers. They protect the forest by guiding lightnings away from the trees."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SPARK,6),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,10),
                        new MoveLearnSetEntry(Move.STOMP,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,19),
                        new MoveLearnSetEntry(Move.JUMP_KICK,21),
                        new MoveLearnSetEntry(Move.HORN_LEECH,25),
                        new MoveLearnSetEntry(Move.DISCHARGE,28),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,36),
                        new MoveLearnSetEntry(Move.NATURE_POWER,44),
                        new MoveLearnSetEntry(Move.THUNDER,49),
                        new MoveLearnSetEntry(Move.MEGAHORN,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Frazzelle");

    }


}
