package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Elepod extends drai.dev.data.pokemon.Pokemon {
    public Elepod() {
        super("Elepod",
                Type.ELECTRIC, Type.COSMIC,
                new Stats(60,
                        40,
                        50,
                        75,
                        71,
                        55),
                List.of(Ability.STATIC,Ability.STORM_DRAIN), Ability.LIQUIDCONDUCTION,
                3, 58,
                new Stats(0,0,0,1,0,0), 190,
                0.75,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Elepod conducts electricty inside its protective bubble, but gets distracted by all the pretty sparks. This often leads to it bumping into a comet. They fight often with Mojicle."),
                List.of(new EvolutionEntry("jellectric", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.CHARGE,5),
                        new MoveLearnSetEntry(Move.ELECTROWEB,10),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,16),
                        new MoveLearnSetEntry(Move.MINIMIZE,21),
                        new MoveLearnSetEntry(Move.BRINE,25),
                        new MoveLearnSetEntry(Move.RECOVER,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,36),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,41),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,45),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,50),
                        new MoveLearnSetEntry(Move.THUNDER,56),
                        new MoveLearnSetEntry(Move.ELECTRIFY,61)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Elepod");

    }


}
