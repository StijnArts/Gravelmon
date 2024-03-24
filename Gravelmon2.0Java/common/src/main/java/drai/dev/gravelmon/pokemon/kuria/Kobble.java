package drai.dev.gravelmon.pokemon.kuria;

public class Kobble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kobble() {
        super("Kobble",
                Type.ROCK,Type.PSYCHIC,
                new Stats(50,
                        120,
                        50,
                        30,
                        50,
                        60),
                List.of(Ability.ROUNDRECORD), Ability.ROUNDRECORD,
                7, 360,
                new Stats(0,2,0,0,0,0), 45,
                0.0,
                130, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Kobble spin at a dangerously fast speed. Because of this, they can never tell which direction they are going and often forget what they were even doing in the first place."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kobble");

    }


}
