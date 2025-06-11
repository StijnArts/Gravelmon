package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Scoprikon extends drai.dev.data.pokemon.Pokemon {
    public Scoprikon() {
        super("Scoprikon",
                Type.WATER, Type.POISON,
                new Stats(80,
                        85,
                        82,
                        97,
                        73,
                        73),
                List.of(Ability.POISON_POINT,Ability.SWIFT_SWIM,Ability.INTIMIDATE), Ability.INTIMIDATE,
                10, 165,
                new Stats(0,0,0,2,0,0), 65,
                0.5,
                152, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("They spit out very toxic saliva onto its enemies, poisoning or paralyzing them. They dwell in deep waters, waiting for prey to come in contact with its sharp fins."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.ACID,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,11),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,13),
                        new MoveLearnSetEntry(Move.SLUDGE,17),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,24),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,30),
                        new MoveLearnSetEntry(Move.BRINE,34),
                        new MoveLearnSetEntry(Move.POISONBURST,39),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,43),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,55),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
