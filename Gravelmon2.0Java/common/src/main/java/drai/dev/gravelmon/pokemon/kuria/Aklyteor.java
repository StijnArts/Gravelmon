package drai.dev.gravelmon.pokemon.kuria;

public class Aklyteor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aklyteor() {
        super("Aklyteor",
                Type.ROCK,Type.COSMIC,
                new Stats(90,
                        135,
                        115,
                        60,
                        90,
                        65),
                List.of(Ability.SOLID_ROCK,Ability.ENTERSPHERE), Ability.ROCK_HEAD,
                24, 2771,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                226, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
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
           setLangFileName("Aklyteor");

    }


}
