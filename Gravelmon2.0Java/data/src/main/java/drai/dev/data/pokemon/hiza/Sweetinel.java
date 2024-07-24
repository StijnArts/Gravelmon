package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sweetinel extends drai.dev.data.pokemon.Pokemon {
    public Sweetinel() {
        super("Sweetinel",
                Type.FAIRY,
                new Stats(105,
                        90,
                        100,
                        70,
                        100,
                        50),
                List.of(Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                17, 165,
                new Stats(3,0,0,0,0,0), 30,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The glutton Sweetinel hoards insane ammounts of food and will fiercely guard its stock till it's all finished."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,3),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,9),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,12),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,15),
                        new MoveLearnSetEntry(Move.ROUND,18),
                        new MoveLearnSetEntry(Move.STRING_SHOT,21),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,24),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,27),
                        new MoveLearnSetEntry(Move.WISH,30),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,33),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,36),
                        new MoveLearnSetEntry(Move.ENDEAVOR,39)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 52, .2,List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sweetinel");

    }


}
