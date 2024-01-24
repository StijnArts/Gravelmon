package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Indascent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Indascent() {
        super("Indascent",
                Type.FAIRY,Type.PSYCHIC,
                new Stats(61,
                        41,
                        51,
                        71,
                        76,
                        49),
                List.of(Ability.AROMA_VEIL,Ability.FOREWARN,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                8, 165,
                new Stats(0,0,0,1,1,0), 120,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- Sweet Scent Normal - Fairy WindSTAB Fairy 3 Mist Ice 6 ConfusionSTAB Psychic 9 Aromatic Mist Fairy 11 Lucky Chant Normal 13 Swift Normal 17 Aromatherapy Grass 19 Rainbow GustSTAB Fairy 22 Misty Terrain Fairy 29 Mystical Fire Fire 32 Wish Normal 36 Calm Mind Psychic 39 Strange SteamSTAB Fairy 44 Future SightSTAB Psychic 48 Magic Room Psychic 48 Wonder Room Psychic 50 Healing Wish Psychic 60 Misty ExplosionSTAB Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.MIST,3),
                        new MoveLearnSetEntry(Move.CONFUSION,6),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,9),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,11),
                        new MoveLearnSetEntry(Move.SWIFT,13),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,17),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,19),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,22),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,29),
                        new MoveLearnSetEntry(Move.WISH,32),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,39),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,48),
                        new MoveLearnSetEntry(Move.HEALING_WISH,50),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,60),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SMOG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_GAS,"tm"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SMOKEBOMB,"tm"),
                        new MoveLearnSetEntry(Move.WITHDRAW,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Indascent");

    }


}
