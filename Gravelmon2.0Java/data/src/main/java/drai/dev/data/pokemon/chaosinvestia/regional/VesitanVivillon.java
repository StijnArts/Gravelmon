package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanVivillon extends drai.dev.data.pokemon.Pokemon {
    public VesitanVivillon(String name, Aspect aspect) {
        super(name, aspect, "VesitanVivillon",
                Type.BUG,Type.FAIRY,
                new Stats(88,
                        60,
                        65,
                        98,
                        105,
                        88),
                List.of(Ability.SHIELD_DUST,Ability.COMPOUND_EYES), null,
                12, 170,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Vivillon kommen weltweit mit den unterschiedlichsten Flügelmusterungen vor. In Vesita entwickelte es heilende Kräfte."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.HURRICANE,59),
                        new MoveLearnSetEntry(Move.SAFEGUARD,41),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,35),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,40),
                        new MoveLearnSetEntry(Move.SUPERSONIC,21),
                        new MoveLearnSetEntry(Move.MOONBLAST,49),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,25),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,28),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,45),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,12),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,15),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,31),
                        new MoveLearnSetEntry(Move.POWDER,55),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,1)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 23, 0.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Vivillon");

    }


}
