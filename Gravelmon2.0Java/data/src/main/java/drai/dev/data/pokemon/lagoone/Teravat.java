package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Teravat extends drai.dev.data.pokemon.Pokemon {
    public Teravat() {
        super("Teravat",
                Type.ELECTRIC, Type.FLYING,
                new Stats(59,
                        40,
                        82,
                        102,
                        89,
                        123),
                List.of(Ability.ILLUMINATE), Ability.ADAPTABILITY,
                12, 150,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("As they fly their wings flap so fast that it generates energy. When that energy is discharged their bodies glow as bright as the sun."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.FLASH,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,9),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,16),
                        new MoveLearnSetEntry(Move.WHIRLWIND,21),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,25),
                        new MoveLearnSetEntry(Move.ROOST,30),
                        new MoveLearnSetEntry(Move.DRILL_PECK,34),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,40),
                        new MoveLearnSetEntry(Move.AGILITY,46),
                        new MoveLearnSetEntry(Move.AIR_SLASH,53),
                        new MoveLearnSetEntry(Move.THUNDER,61)           ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Teravat");

    }


}
