package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranVibrava extends Pokemon {
    public CefiranVibrava(String name, Aspect aspect) {
        super(name, aspect,"CefiranVibrava",
                Type.BUG, Type.DRAGON,
                new Stats(50,70,50,70,50,50),
                List.of(Ability.STEALTH_WINGED), Ability.STEALTH_WINGED,
                11, 153,
                new Stats(0,1,0,1,0,0), 120,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("CefiranFlygon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(
                        new MoveLearnSetEntry(Move.SONIC_BOOM, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 1),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 4),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 7),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 10),
                        new MoveLearnSetEntry(Move.MUDSLAP, 13),
                        new MoveLearnSetEntry(Move.TACKLE, 17),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, 21),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 25),
                        new MoveLearnSetEntry(Move.SUPERSONIC, 29),
                        new MoveLearnSetEntry(Move.SCREECH, 34),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 35),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 39),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 44),
                        new MoveLearnSetEntry(Move.BOOMBURST, 49)
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Vibrava");
        setCanFly(true);
        addAdditionalEvolution("trapinch", new EvolutionEntry("vibrava cefiran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_JUNGLE.getId() + ":" + Biome.IS_JUNGLE.getName()))));
    }
}
