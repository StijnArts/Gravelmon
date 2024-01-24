package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mantaqua extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mantaqua() {
        super("Mantaqua",
                Type.WATER,
                new Stats(89,
                        49,
                        69,
                        59,
                        79,
                        99),
                List.of(Ability.HYDRATION), Ability.WATER_VEIL,
                8, 165,
                new Stats(1,0,0,0,0,1), 150,
                0.5,
                155, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("- Tackle Normal - BubbleSTAB Water - Refresh Normal 5 Acid Armor Poison 9 Aqua SlapSTAB Water 11 Supersonic Normal 14 Bubble BeamSTAB Water 17 Aqua Ring Water 19 Glow Signal Psychic 21 Mist Ice 25 Air Slash Flying 29 Water PulseSTAB Water 31 Soak Water 34 Calm Mind Psychic 37 Life Dew Water 39 U-turn Bug 41 Bounce Flying 45 LiquidationSTAB Water 49 Safeguard Normal 51 Recover Normal 54 Moonlight Fairy 57 Beach TideSTAB Water 59 Heal Pulse Psychic 61 Sparkling AriaSTAB Water 65 Starstream Psychic 69 Vortex DrainSTAB Water 71 Hydro PumpSTAB Water 74 Healing Wish Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,5),
                        new MoveLearnSetEntry(Move.AQUASLAP,9),
                        new MoveLearnSetEntry(Move.SUPERSONIC,11),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.GLOWSIGNAL,19),
                        new MoveLearnSetEntry(Move.MIST,21),
                        new MoveLearnSetEntry(Move.AIR_SLASH,25),
                        new MoveLearnSetEntry(Move.WATER_PULSE,29),
                        new MoveLearnSetEntry(Move.SOAK,31),
                        new MoveLearnSetEntry(Move.CALM_MIND,34),
                        new MoveLearnSetEntry(Move.LIFE_DEW,37),
                        new MoveLearnSetEntry(Move.UTURN,39),
                        new MoveLearnSetEntry(Move.BOUNCE,41),
                        new MoveLearnSetEntry(Move.LIQUIDATION,45),
                        new MoveLearnSetEntry(Move.SAFEGUARD,49),
                        new MoveLearnSetEntry(Move.RECOVER,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,54),
                        new MoveLearnSetEntry(Move.BEACHTIDE,57),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,59),
                        new MoveLearnSetEntry(Move.SPARKLING_ARIA,61),
                        new MoveLearnSetEntry(Move.STARSTREAM,65),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,69),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,71),
                        new MoveLearnSetEntry(Move.HEALING_WISH,74)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mantaqua");

    }


}
