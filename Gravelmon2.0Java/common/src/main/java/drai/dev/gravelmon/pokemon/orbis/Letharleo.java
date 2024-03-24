package drai.dev.gravelmon.pokemon.orbis;

public class Letharleo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Letharleo() {
        super("Letharleo",
                Type.NORMAL,Type.WATER,
                new Stats(140,
                        165,
                        80,
                        100,
                        120,
                        65),
                List.of(Ability.TRUANT), Ability.TRUANT,
                21, 1980,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                252, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Letharleo spend 90% of their day asleep. They only wake up to eat and battle and will fall asleep instantly afterwards. Its a common sight for ferries and boats to be delayed due to sunbathing Letharleo on the pier."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROAR,5),
                        new MoveLearnSetEntry(Move.SWAGGER,9),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.AMNESIA,17),
                        new MoveLearnSetEntry(Move.FEINT,20),
                        new MoveLearnSetEntry(Move.BODY_SLAM,23),
                        new MoveLearnSetEntry(Move.DIVE,27),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,30),
                        new MoveLearnSetEntry(Move.COUNTER,33),
                        new MoveLearnSetEntry(Move.SNORE,37),
                        new MoveLearnSetEntry(Move.REST,37),
                        new MoveLearnSetEntry(Move.LIQUIDATION,41)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Letharleo");

    }


}