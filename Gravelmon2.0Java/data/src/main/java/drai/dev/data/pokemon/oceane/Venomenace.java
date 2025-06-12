package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Venomenace extends drai.dev.data.pokemon.Pokemon {
    public Venomenace() {
        super("Venomenace",
                Type.DRAGON, Type.POISON,
                new Stats(94,
                        113,
                        113,
                        98,
                        98,
                        84),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                24, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("Fuelled by an unforgiving rage, it's driven by the revenge of every memory of suffering. Using its large, broad wings it effortlessly flies across the depths and breathes a volley of poison miasma on those down below."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .pseudoLegend()
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
           setLangFileName("Venomenace");

    }


}
