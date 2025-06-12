package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanSeadra extends drai.dev.data.pokemon.Pokemon {
    public NorheimanSeadra(String name, Aspect aspect) {
        super(name, aspect, "Seadra",
                Type.DRAGON,
                new Stats(55,
                        60,
                        65,
                        110,
                        65,
                        85),
                List.of(Ability.SWIFT_SWIM,Ability.SNIPER,Ability.OUTBURST), Ability.OUTBURST,
                7, 165,
                new Stats(0,0,0,2,0,0), 65,
                0.875,
                154, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("queendra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,15),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,33),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,39),
                        new MoveLearnSetEntry(Move.SAFEGUARD,46),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,53),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,60),
                        new MoveLearnSetEntry(Move.OUTRAGE,67),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,74)
                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setAvoidsLand(true);
        setCanBreathUnderwater(true);
           setLangFileName("Seadra");
        addAdditionalEvolution("horsea", new EvolutionEntry("seadra norheiman", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"))));
    }


}
