package drai.dev.data.games.other;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.pokemon.insurgence.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Insurgence extends Game {
    public static final Game INSTANCE = new Insurgence();
    private Insurgence() {
        super("insurgence");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon("bulbasaur-delta," +
                "ivysaur-delta," +
                "venusaur-delta," +
                "charmander-delta," +
                "charmeleon-delta," +
                "charizard-delta," +
                "squirtle-delta," +
                "wartortle-delta," +
                "blastoise-delta," +
                "pawniard-delta," +
                "bisharp-delta," +
                "ralts-delta," +
                "kirlia-delta," +
                "gardevoir-delta," +
                "gallade-delta," +
                "sunkern-delta," +
                "sunflora-delta," +
                "bergmite-delta," +
                "avalugg-delta," +
                "scyther-delta," +
                "scizor-delta," +
                "scraggy-delta," +
                "scrafty-delta," +
                "combee-delta," +
                "vespiquen-delta," +
                "koffing-delta," +
                "weezing-delta," +
                "purrloin-delta," +
                "liepard-delta," +
                "phantump-delta," +
                "trevenant-delta," +
                "snorunt-delta," +
                "glalie-delta," +
                "froslass-delta," +
                "shinx-delta," +
                "luxio-delta," +
                "luxray-delta," +
                "noibat-delta," +
                "noivern-delta," +
                "budew-delta," +
                "roselia-delta," +
                "roserade-delta," +
                "drifloon-delta," +
                "drifblim-delta," +
                "grimer-delta," +
                "muk-delta," +
                "wooper-delta," +
                "quagsire-delta," +
                "munchlax-delta," +
                "snorlax-delta," +
                "misdreavus-delta," +
                "mismagius-delta," +
                "cyndaquil-delta," +
                "quilava-delta," +
                "typhlosion-delta," +
                "treecko-delta," +
                "grovyle-delta," +
                "sceptile-delta," +
                "torchic-delta," +
                "combusken-delta," +
                "blaziken-delta," +
                "turtwig-delta," +
                "grotle-delta," +
                "torterra-delta," +
                "snivy-delta," +
                "servine-delta," +
                "serperior-delta," +
                "froakie-delta," +
                "frogadier-delta," +
                "greninja-delta," +
                "pidgey-delta," +
                "pidgeotto-delta," +
                "pidgeot-delta," +
                "diglett-delta," +
                "dugtrio-delta," +
                "growlithe-delta," +
                "arcanine-delta," +
                "geodude-delta," +
                "graveler-delta," +
                "golem-delta," +
                "tentacool-delta," +
                "tentacruel-delta," +
                "doduo-delta," +
                "dodrio-delta," +
                "tangela-delta," +
                "tangrowth-delta," +
                "ditto-delta," +
                "kabuto-delta," +
                "kabutops-delta," +
                "dratini-delta," +
                "dragonair-delta," +
                "dragonite-delta," +
                "hoothoot-delta," +
                "noctowl-delta," +
                "chinchou-delta," +
                "lanturn-delta," +
                "pichu-delta," +
                "pikachu-delta," +
                "raichu-delta," +
                "aipom-delta," +
                "ambipom-delta," +
                "yanma-delta," +
                "yanmega-delta," +
                "girafarig-delta," +
                "dunsparce-delta," +
                "shuckle-delta," +
                "remoraid-delta," +
                "octillery-delta," +
                "elekid-delta," +
                "electabuzz-delta," +
                "electivire-delta," +
                "magby-delta," +
                "magmar-delta," +
                "magmortar-delta," +
                "lotad-delta," +
                "lombre-delta," +
                "ludicolo-delta," +
                "seedot-delta," +
                "nuzleaf-delta," +
                "shiftry-delta," +
                "sableye-delta," +
                "mawile-delta," +
                "aron-delta," +
                "lairon-delta," +
                "aggron-delta," +
                "meditite-delta," +
                "medicham-delta," +
                "numel-delta," +
                "camerupt-delta," +
                "plusle-delta," +
                "minun-delta," +
                "wailmer-delta," +
                "wailord-delta," +
                "feebas-delta," +
                "milotic-delta," +
                "clamperl-delta," +
                "huntail-delta," +
                "gorebyss-delta," +
                "beldum-delta_spider," +
                "metang-delta_spider," +
                "metagross-delta_spider," +
                "beldum-delta_ruin," +
                "metang-delta_ruin," +
                "metagross-delta_ruin," +
                "buneary-delta," +
                "lopunny-delta," +
                "riolu-delta," +
                "lucario-delta," +
                "croagunk-delta," +
                "toxicroak-delta," +
                "venipede-delta," +
                "whirlipede-delta," +
                "scolipede-delta," +
                "petilil-delta_water," +
                "lilligant-delta_water," +
                "petilil-delta_fairy," +
                "lilligant-delta_fairy," +
                "solosis-delta," +
                "duosion-delta," +
                "reuniclus-delta," +
                "darumaka-delta," +
                "darmanitan-delta," +
                "maractus-delta," +
                "dwebble-delta_berry," +
                "crustle-delta_berry," +
                "dwebble-delta_cake," +
                "crustle-delta_cake," +
                "yamask-delta," +
                "cofagrigus-delta," +
                "emolga-delta," +
                "karrablast-delta," +
                "escavalier-delta," +
                "foongus-delta," +
                "amoonguss-delta," +
                "litwick-delta," +
                "lampent-delta," +
                "chandelure-delta," +
                "axew-delta," +
                "fraxure-delta," +
                "haxorus-delta," +
                "golett-delta," +
                "golurk-delta," +
                "heatmor-delta," +
                "deino-delta," +
                "zweilous-delta," +
                "hydreigon-delta," +
                "larvesta-delta," +
                "volcarona-delta," +
                "amaura-delta," +
                "aurorus-delta," +
                "goomy-delta," +
                "sliggoo-delta," +
                "goodra-delta," +
                "regirock-delta," +
                "regice-delta," +
                "registeel-delta," +
                "meloetta-delta," +
                "hoopa-delta,");
        addNewPokemon(new UFI());
        addNewPokemon(new ShadowMewtwo("", Aspect.SHADOW));
        ArmoredForm.addArmoredForm("mewtwo", Type.PSYCHIC,
                new Stats(106, 110, 90 , 154, 90, 130),
                List.of(Ability.HUBRIS), Ability.HUBRIS,
                21, this.name, List.of(Label.GEN1, Label.INSURGENCE), null, null);
        ArmoredForm.addArmoredForm("tyranitar", Type.ROCK, Type.DARK,
                new Stats(100,
                        134,
                        143,
                        95,
                        130,
                        61),
                List.of(Ability.SAND_STREAM), Ability.SAND_STREAM,
                21, this.name, List.of(Label.GEN2, Label.INSURGENCE), null, null);
        ArmoredForm.addArmoredForm("flygon", Type.GROUND, Type.DRAGON,
                new Stats(80,
                        100,
                        104,
                        80,
                        104,
                        100),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                23, this.name, List.of(Label.GEN3, Label.INSURGENCE), null, null);
        ArmoredForm.addArmoredForm("leavanny", Type.BUG, Type.GRASS,
                new Stats(75,
                        103,
                        104,
                        70,
                        104,
                        92),
                List.of(Ability.SWARM, Ability.CHLOROPHYLL), Ability.OVERCOAT,
                12, this.name, List.of(Label.GEN5, Label.INSURGENCE), null, null);
        ArmoredForm.addArmoredForm("zekrom", Type.DRAGON, Type.ELECTRIC,
                new Stats(100,
                        150,
                        156,
                        120,
                        130,
                        90),
                List.of(Ability.TERAVOLT), Ability.TERAVOLT,
                30, this.name, List.of(Label.GEN5, Label.INSURGENCE), null, null);
        ArmoredForm.addArmoredForm("volcarona", Type.DARK, Type.POISON,
                new Stats(85,
                        60,
                        85 ,
                        135,
                        137,
                        100),
                List.of(Ability.LEVITATE), Ability.ABSOLUTION,
                18, this.name, List.of(Label.GEN5, Label.INSURGENCE), Aspect.DELTA, DeltaVolcarona.getMoves());
    }
}
