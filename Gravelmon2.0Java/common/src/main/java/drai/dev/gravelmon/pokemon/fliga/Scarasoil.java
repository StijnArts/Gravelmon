package drai.dev.gravelmon.pokemon.fliga;

public class Scarasoil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scarasoil() {
        super("Scarasoil",
                Type.GROUND,Type.BUG,
                new Stats(55,
                        40,
                        70,
                        45,
                        55,
                        65),
                List.of(Ability.HEATPROOF,Ability.SAND_RUSH), Ability.EARTH_EATER,
                8, 0,
                new Stats(0,0,0,0,0,0), 185,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of("- Tackle Normal - String Shot Bug - Defense Curl Normal 3 Mud-SlapSTAB Ground 5 Sand Attack Ground 8 Rollout Rock 12 Bug BiteSTAB Bug 16 DigSTAB Ground 20 Spikes Ground 23 MagnitudeSTAB Ground 24 Sticky Web Bug 27 Mud BombSTAB Ground 34 X-ScissorSTAB Bug 38 Whirlwind Normal 42 Stealth Rock Rock 46 EarthquakeSTAB Ground 48 Bug BuzzSTAB Bug 53 Shell Smash Normal 57 Gunk Shot Poison 60 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.DIG,16),
                        new MoveLearnSetEntry(Move.SPIKES,20),
                        new MoveLearnSetEntry(Move.MAGNITUDE,23),
                        new MoveLearnSetEntry(Move.STICKY_WEB,24),
                        new MoveLearnSetEntry(Move.MUD_BOMB,27),
                        new MoveLearnSetEntry(Move.XSCISSOR,34),
                        new MoveLearnSetEntry(Move.WHIRLWIND,38),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,48),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,57),
                        new MoveLearnSetEntry(Move.FISSURE,60)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scarasoil");

    }


}
