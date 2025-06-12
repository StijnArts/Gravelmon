package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Beaki extends drai.dev.data.pokemon.Pokemon {
    public Beaki() {
        super("Beaki",
                Type.FIRE, Type.FLYING,
                new Stats(85,
                        70,
                        60,
                        75,
                        65,
                        85),
                List.of(Ability.SOUNDPROOF,Ability.STALL,Ability.CACOPHONY), Ability.CACOPHONY,
                22, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They are unable to fly despite their broad pair of wings. Their loud cries carry over the rocky beaches and mountains they live in for miles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,4),
                        new MoveLearnSetEntry(Move.INCINERATE,8),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.ACROBATICS,19),
                        new MoveLearnSetEntry(Move.FLAME_BURST,23),
                        new MoveLearnSetEntry(Move.WING_ATTACK,25),
                        new MoveLearnSetEntry(Move.TAILWIND,31),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,41),
                        new MoveLearnSetEntry(Move.ROOST,45),
                        new MoveLearnSetEntry(Move.BOUNCE,47),
                        new MoveLearnSetEntry(Move.BOOMBURST,53),
                        new MoveLearnSetEntry(Move.OVERHEAT,57),
                        new MoveLearnSetEntry(Move.AEROBLAST,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Beaki");

    }


}
