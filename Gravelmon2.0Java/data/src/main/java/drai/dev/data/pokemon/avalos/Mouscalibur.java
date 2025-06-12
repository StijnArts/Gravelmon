package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mouscalibur extends drai.dev.data.pokemon.Pokemon {
    public Mouscalibur() {
        super("Mouscalibur",
                Type.FAIRY, Type.ELECTRIC,
                new Stats(65,
                        127,
                        41,
                        107,
                        42,
                        93),
                List.of(Ability.LIGHTNING_ROD), Ability.TECHNICIAN,
                14, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mouscalibur are valiant defenders of both trainers both physical and digital. When it sees people bullying others online, it will personally track them down and destroy the device they most favor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,6),
                        new MoveLearnSetEntry(Move.MACH_BOLT,11),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,15),
                        new MoveLearnSetEntry(Move.PURSUIT,20),
                        new MoveLearnSetEntry(Move.SPARK,25),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,29),
                        new MoveLearnSetEntry(Move.ENERGIZE,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,39),
                        new MoveLearnSetEntry(Move.VENGEANCE,43),
                        new MoveLearnSetEntry(Move.AGILITY,48),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,53),
                        new MoveLearnSetEntry(Move.THUNDER,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,62)
                ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Mouscalibur");

    }


}
