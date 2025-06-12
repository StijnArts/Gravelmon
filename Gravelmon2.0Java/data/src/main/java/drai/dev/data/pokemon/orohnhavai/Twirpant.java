package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Twirpant extends drai.dev.data.pokemon.Pokemon {
    public Twirpant() {
        super("Twirpant",
                Type.BUG, Type.FIGHTING,
                new Stats(55,
                        70,
                        65,
                        35,
                        35,
                        50),
                List.of(Ability.INNER_FOCUS,Ability.DEFIANT,Ability.FRISK), Ability.FRISK,
                4, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Twirpant will train 24/7 and go through some of the harshest physical training ever just to get stronger. Some will even train to the point of fainting. Armies of them train hard to protect its nest from invading Dartibi."),
                List.of(new EvolutionEntry("kombantis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(            new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.PESTER,14),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,22),
                        new MoveLearnSetEntry(Move.SUBMISSION,27),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,35),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,41),
                        new MoveLearnSetEntry(Move.DETECT,48),
                        new MoveLearnSetEntry(Move.SUPERPOWER,52)            ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Twirpant");

    }


}
