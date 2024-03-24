package drai.dev.gravelmon.pokemon.nodorro;

public class Gallade extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gallade() {
        super("Gallade",
                Type.PSYCHIC,Type.FIGHTING,
                new Stats(80,
                        125,
                        65,
                        65,
                        115,
                        80),
                List.of(Ability.STEADFAST), Ability.JUSTIFIED,
                16, 564,
                new Stats(0,3,0,0,0,0), 6,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- Shining Blade Light"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHININGBLADE,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gallade");

    }


}
