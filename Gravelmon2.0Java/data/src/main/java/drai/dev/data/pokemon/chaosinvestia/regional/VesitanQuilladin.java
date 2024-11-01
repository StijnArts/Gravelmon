package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanQuilladin extends drai.dev.data.pokemon.Pokemon {
    public VesitanQuilladin(String name, Aspect aspect) {
        super(name, aspect, "VesitanQuilladin",
                Type.WATER,Type.PSYCHIC,
                new Stats(61,
                        53,
                        65,
                        57,
                        78,
                        95),
                List.of(Ability.TORRENT,Ability.BULLETPROOF), null,
                7, 290,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Die Krone auf seinem Kopf schützt es vor Ablenkungen, sodass es in Ruhe zur jeder Zeit meditieren kann. Das Auge auf dem Bauch dient zur Abschreckung."),
                List.of(new EvolutionEntry("chesnaught vesitan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,52),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,39),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.AQUA_RING,20),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SNORE,44),
                        new MoveLearnSetEntry(Move.REST,30),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.PSYBEAM,26)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quilladin");

    }


}
