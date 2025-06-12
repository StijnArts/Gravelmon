package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Icthymp extends drai.dev.data.pokemon.Pokemon {
    public Icthymp() {
        super("Icthymp",
                Type.STEEL,
                new Stats(45,
                        65,
                        60,
                        35,
                        60,
                        55),
                List.of(Ability.BULLETPROOF), Ability.PROPELLER_TAIL,
                12, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,12),
                        new MoveLearnSetEntry(Move.METAL_SOUND,16),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,20),
                        new MoveLearnSetEntry(Move.DISCHARGE,24),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,32),
                        new MoveLearnSetEntry(Move.LOCKON,36),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,42),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,48),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,54)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
