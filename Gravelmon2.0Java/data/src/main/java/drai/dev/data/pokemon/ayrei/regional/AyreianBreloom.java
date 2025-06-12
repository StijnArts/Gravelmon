package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianBreloom extends drai.dev.data.pokemon.Pokemon {
    public AyreianBreloom(String name, Aspect aspect) {
        super(name, aspect, "Breloom",
                Type.POISON,Type.ICE,
                new Stats(60,
                        60,
                        80,
                        70,
                        130,
                        60),
                List.of(Ability.CORROSION,Ability.UNBURDEN), null,
                12, 392,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("It scatters poisonous spores and throws powerful punches while its foe is hampered by inhaled spores."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACID,8),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,22),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,0),
                        new MoveLearnSetEntry(Move.ICY_WIND,12),
                        new MoveLearnSetEntry(Move.AMNESIA,29),
                        new MoveLearnSetEntry(Move.TOXIC,33),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,50),
                        new MoveLearnSetEntry(Move.POISON_GAS,19),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.FROST_BREATH,39),
                        new MoveLearnSetEntry(Move.ICE_BEAM,44),
                        new MoveLearnSetEntry(Move.STUN_SPORE,5),
                        new MoveLearnSetEntry(Move.SLUDGE,26),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FROST_WALKER,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"egg")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Breloom");

    }


}
