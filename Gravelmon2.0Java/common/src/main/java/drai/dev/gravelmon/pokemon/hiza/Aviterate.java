package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Aviterate extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aviterate() {
        super("Aviterate",
                Type.FIRE, Type.ELECTRIC,
                new Stats(80,
                        90,
                        75,
                        90,
                        75,
                        120),
                List.of(Ability.BLAZE), Ability.IGNITION,
                19, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("As it dashes through the land it leaves behind a trail of flames. It casts lightning from the skies, incinerating the land bellow."),
                List.of(),
                List.of(             new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAUNT,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.INCINERATE,12),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,16),
                        new MoveLearnSetEntry(Move.FIRE_FANG,20),
                        new MoveLearnSetEntry(Move.HEADBUTT,24),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,28),
                        new MoveLearnSetEntry(Move.UPROAR,32),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,36),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,40),
                        new MoveLearnSetEntry(Move.THRASH,44),
                        new MoveLearnSetEntry(Move.THUNDER,48)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aviterate");

    }


}
