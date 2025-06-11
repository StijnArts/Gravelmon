package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Crimgon extends drai.dev.data.pokemon.Pokemon {
    public Crimgon() {
        super("Crimgon",
                Type.STEEL, Type.DRAGON,
                new Stats(70,
                        90,
                        130,
                        65,
                        80,
                        55),
                List.of(Ability.ANGER_SHELL,Ability.HEAVY_METAL), Ability.SHELL_ARMOR,
                23, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crimgon is capable of retracting its limbs inside its shell. Inside the shell, it builds up anger, ready to attack with its spiky head. The limbs themselves are soft, unlike the shell."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.SHARPEN,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,30),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,36),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,40),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,62),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .belowY(10)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crimgon");

    }


}
