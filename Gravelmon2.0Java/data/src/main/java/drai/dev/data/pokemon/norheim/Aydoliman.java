package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Aydoliman extends drai.dev.data.pokemon.Pokemon {
    public Aydoliman(Stats stats) {
        super("Aydoliman",
                Type.FIGHTING, Type.GROUND,
                stats,
                List.of(Ability.INNER_FOCUS,Ability.SAND_SPIT,Ability.SCRAPPY), Ability.SCRAPPY,
                18, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A slow mobile idol depicting fallen heroes of great battles. Aydoliman guards entrances of holy buildings, prepared to strike with its large fists of hardened clay. It is capable of throwing its opponents at incredible distances."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.VITAL_THROW,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,8),
                        new MoveLearnSetEntry(Move.MAGNITUDE,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.MEDITATE,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,29),
                        new MoveLearnSetEntry(Move.AMNESIA,35),
                        new MoveLearnSetEntry(Move.REVERSAL,40),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,55)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Aydoliman");

    }


}
