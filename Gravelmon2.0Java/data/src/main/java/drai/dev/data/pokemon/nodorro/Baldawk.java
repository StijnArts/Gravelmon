package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baldawk extends drai.dev.data.pokemon.Pokemon {
    public Baldawk() {
        super("Baldawk",
                Type.NORMAL, Type.FLYING,
                new Stats(60,
                        80,
                        70,
                        100,
                        80,
                        70),
                List.of(Ability.INNER_FOCUS,Ability.FLUFFY), Ability.DEFIANT,
                16, 402,
                new Stats(2,0,0,0,1,0), 35,
                1.0,
                217, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- PeckSTAB Flying - GustSTAB Flying - Wing AttackSTAB Flying - Fury AttackSTAB Normal - Focus Energy Normal - Chirp Normal 4 GustSTAB Flying 9 Echoed VoiceSTAB Normal 12 Hone Claws Dark 17 Wing AttackSTAB Flying 20 Roost Flying 25 Defog Flying 29 Calm Mind Psychic 38 Snarl Dark 42 Tailwind Flying 46 Sky DiveSTAB Flying 51 CycloneSTAB Flying 63 Brave BirdSTAB Flying 73 HurricaneSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.GUST,4),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,9),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,12),
                        new MoveLearnSetEntry(Move.WING_ATTACK,17),
                        new MoveLearnSetEntry(Move.ROOST,20),
                        new MoveLearnSetEntry(Move.DEFOG,25),
                        new MoveLearnSetEntry(Move.CALM_MIND,29),
                        new MoveLearnSetEntry(Move.SNARL,38),
                        new MoveLearnSetEntry(Move.TAILWIND,42),
                        new MoveLearnSetEntry(Move.SKY_DIVE,46),
                        new MoveLearnSetEntry(Move.CYCLONE,51),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,63),
                        new MoveLearnSetEntry(Move.HURRICANE,73),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baldawk");

    }


}
