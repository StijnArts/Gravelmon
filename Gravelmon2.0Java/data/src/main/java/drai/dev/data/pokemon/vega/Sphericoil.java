package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sphericoil extends Pokemon {
    public Sphericoil() {
        super( "Sphericoil",
                Type.ELECTRIC,
                new Stats(80	,
                        50,
                        70	,
                        105,
                        95,
                        165),
                List.of(Ability.SOUNDPROOF), Ability.STATIC,
                15, 1232,
                new Stats(0,2,0,0,0,0), 45,
                -1,
                208, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Despite its similarity to a Master Ball, it's unknown if the two are related in the same way that Voltorb is to Poke Ball."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,1),
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.LOCKON,5),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,22),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,29),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,35),
                        new MoveLearnSetEntry(Move.ROCK_TUMBLE,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,57),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,62),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE, SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setPreEvolution("electrode");
        addAdditionalEvolution("electrode", new EvolutionEntry("sphericoil", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:thunder_stone"));
    }
}
