package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanScatterbug extends drai.dev.data.pokemon.Pokemon {
    public VesitanScatterbug(String name, Aspect aspect) {
        super(name, aspect, "VesitanScatterbug",
                Type.BUG,Type.FAIRY,
                new Stats(38,
                        35,
                        40,
                        35,
                        27,
                        25),
                List.of(Ability.SHIELD_DUST,Ability.COMPOUND_EYES), null,
                3, 25,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Es reguliert seine Körpertemperatur mit dem Puder, das seinen Körper bedeckt, und kommt deswegen in jedem Klima und jeder Region zurecht."),
                List.of(new EvolutionEntry("spewpa vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"9")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"egg")                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 11, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scatterbug");

    }


}
