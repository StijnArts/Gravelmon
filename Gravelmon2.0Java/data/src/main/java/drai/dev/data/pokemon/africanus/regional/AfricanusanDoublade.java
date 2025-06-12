package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanDoublade extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanDoublade(String name, Aspect aspect) {
        super(name, aspect, "Doublade",
                Type.STEEL,Type.FIGHTING,
                new Stats(70,
                        120,
                        110,
                        45,
                        65,
                        50),
                List.of(Ability.NO_GUARD), null,
                8, 20,
                new Stats(0,0,2,0,0,0), 222,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Al adquirir almas de guerreros más poderosos, se divide en dos espadas. Se comunican entre sí mediante telepatía y coordinan los ataques para rebanar al enemigo."),
                List.of(new EvolutionEntry("africanusanaegislash", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ANCHOR_SHOT,35),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,47),
                        new MoveLearnSetEntry(Move.SLASH,29),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,32),
                        new MoveLearnSetEntry(Move.METAL_SOUND,8),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,18),
                        new MoveLearnSetEntry(Move.PURSUIT,13),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,5),
                        new MoveLearnSetEntry(Move.POWER_TRICK,39),
                        new MoveLearnSetEntry(Move.IRON_HEAD,42),
                        new MoveLearnSetEntry(Move.BITTER_BLADE,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,20)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA, Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Doublade");

    }


}
