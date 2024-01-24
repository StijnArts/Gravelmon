package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rudester extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rudester() {
        super("Rudester",
                Type.NORMAL,Type.FLYING,
                new Stats(80,
                        100,
                        80,
                        75,
                        67,
                        86),
                List.of(Ability.EARLY_BIRD,Ability.INTIMIDATE,Ability.PECKINGORDER), Ability.PECKINGORDER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Hyper VoiceSTAB Normal - ScratchSTAB Normal - Chirp Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rudester");

    }


}
