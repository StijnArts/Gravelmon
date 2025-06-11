package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Drenchest extends drai.dev.data.pokemon.Pokemon {
    public Drenchest() {
        super("Drenchest",
                Type.GHOST, Type.DARK,
                new Stats(102,
                        114,
                        100,
                        70,
                        63,
                        41),
                List.of(Ability.JACKPOT,Ability.STEELWORKER,Ability.CURSED_BODY), Ability.CURSED_BODY,
                10, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Expeditions to find its hoard of valuables invariably end in disaster. Some say they form from the souls of pirates who lost everything trying to strike it rich."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,20),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.NUGGETFLING,30),
                        new MoveLearnSetEntry(Move.GRUDGE,35),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.SOULCHOMP,47),
                        new MoveLearnSetEntry(Move.GOLD_BREAKER,55)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
