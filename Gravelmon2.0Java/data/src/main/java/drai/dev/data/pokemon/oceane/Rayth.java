package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rayth extends drai.dev.data.pokemon.Pokemon {
    public Rayth() {
        super("Rayth",
                Type.DARK, Type.FIRE,
                new Stats(70,
                        110,
                        70,
                        80,
                        70,
                        90),
                List.of(Ability.INTIMIDATE), Ability.UNNERVE,
                14, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("They often command large groups of normally mischievous Rayscal to do more sinister things like attack ships. Their horns are burning hot to the touch."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.MALICE_STRIKE,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.FIRE_LASH,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
