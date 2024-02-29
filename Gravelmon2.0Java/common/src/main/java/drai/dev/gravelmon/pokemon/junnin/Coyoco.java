package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Coyoco extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coyoco() {
        super("Coyoco",
                Type.FIRE,
                new Stats(80,
                        52,
                        70,
                        78,
                        50,
                        50),
                List.of(Ability.FLAME_BODY), Ability.MOXIE,
                5, 165,
                new Stats(1,0,0,1,0,0), 120,
                0.5,
                133, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When Coyoco howl, their body compresses and fire spews from their mouth. Its body acts as a bag coated with a fireproof lining filled with hot coals."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CUDDLE,3),
                        new MoveLearnSetEntry(Move.POUND,5),
                        new MoveLearnSetEntry(Move.SINGE,7),
                        new MoveLearnSetEntry(Move.HOWL,9),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.TACKLE,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,17),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,19),
                        new MoveLearnSetEntry(Move.FORESIGHT,21),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,25),
                        new MoveLearnSetEntry(Move.SWAGGER,27),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,31),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.POWER_TRIP,39),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,41),
                        new MoveLearnSetEntry(Move.OVERHEAT,49),
                        new MoveLearnSetEntry(Move.FIREWALL,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.NUZZLE,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.RAGE,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 38, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coyoco");

    }


}
