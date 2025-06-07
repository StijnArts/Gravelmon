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
        addNewPokemon(new DeltaBulbasaur("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaIvysaur("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaVenusaur("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaCharmander("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaCharmeleon("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaCharizard("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaSquirtle("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaWartortle("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaBlastoise("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaPidgey("", Aspect.DELTA));
        addNewPokemon(new DeltaPidgeotto("", Aspect.DELTA));
        addNewPokemon(new DeltaPidgeot("", Aspect.DELTA));
        addNewPokemon(new DeltaPikachu("", Aspect.DELTA));
        addNewPokemon(new DeltaRaichu("", Aspect.DELTA));
        addNewPokemon(new DeltaDiglett("", Aspect.DELTA));
        addNewPokemon(new DeltaDugtrio("", Aspect.DELTA));
        addNewPokemon(new DeltaGrowlithe("", Aspect.DELTA));
        addNewPokemon(new DeltaArcanine("", Aspect.DELTA));
        addNewPokemon(new DeltaTentacool("", Aspect.DELTA));
        addNewPokemon(new DeltaTentacruel("", Aspect.DELTA));
        addNewPokemon(new DeltaGeodude("", Aspect.DELTA));
        addNewPokemon(new DeltaGraveler("", Aspect.DELTA));
        addNewPokemon(new DeltaGolem("", Aspect.DELTA));
        addNewPokemon(new DeltaDoduo("", Aspect.DELTA));
        addNewPokemon(new DeltaDodrio("", Aspect.DELTA));
        addNewPokemon(new DeltaGrimer("", Aspect.DELTA));
        addNewPokemon(new DeltaMuk("", Aspect.DELTA));
        addNewPokemon(new DeltaKoffing("", Aspect.DELTA));
        addNewPokemon(new DeltaWeezing("", Aspect.DELTA));
        addNewPokemon(new DeltaTangela("", Aspect.DELTA));
        addNewPokemon(new DeltaScyther("", Aspect.DELTA));
        addNewPokemon(new DeltaElectabuzz("", Aspect.DELTA));
        addNewPokemon(new DeltaMagmar("", Aspect.DELTA));
        addNewPokemon(new DeltaDitto("", Aspect.DELTA));
        addNewPokemon(new DeltaKabuto("", Aspect.DELTA));
        addNewPokemon(new DeltaKabutops("", Aspect.DELTA));
        addNewPokemon(new DeltaSnorlax("", Aspect.DELTA));
        addNewPokemon(new DeltaDratini("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaDragonair("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaDragonite("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaCyndaquil("Cyndaquil", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaQuilava("Quilava", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaTyphlosion("Typhlosion", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaHoothoot("Hoothoot", Aspect.DELTA));
        addNewPokemon(new DeltaNoctowl("Noctowl", Aspect.DELTA));
        addNewPokemon(new DeltaChinchou("Chinchou", Aspect.DELTA));
        addNewPokemon(new DeltaLanturn("Lanturn", Aspect.DELTA));
        addNewPokemon(new DeltaPichu("Pichu", Aspect.DELTA));
        addNewPokemon(new DeltaAipom("Aipom", Aspect.DELTA));
        addNewPokemon(new DeltaSunkern("Sunkern", Aspect.DELTA));
        addNewPokemon(new DeltaSunflora("Sunflora", Aspect.DELTA));
        addNewPokemon(new DeltaYanma("Yanma", Aspect.DELTA));
        addNewPokemon(new DeltaWooper("Wooper", Aspect.DELTA));
        addNewPokemon(new DeltaQuagsire("Quagsire", Aspect.DELTA));
        addNewPokemon(new DeltaMisdreavus("Misdreavus", Aspect.DELTA));
        addNewPokemon(new DeltaGirafarig("Girafarig", Aspect.DELTA));
        addNewPokemon(new DeltaDunsparce("Dunsparce", Aspect.DELTA));
        addNewPokemon(new DeltaScizor("Scizor", Aspect.DELTA));
        addNewPokemon(new DeltaShuckle("Shuckle", Aspect.DELTA));
        addNewPokemon(new DeltaRemoraid("Remoraid", Aspect.DELTA));
        addNewPokemon(new DeltaOctillery("Octillery", Aspect.DELTA));
        addNewPokemon(new DeltaElekid("Elekid", Aspect.DELTA));
        addNewPokemon(new DeltaMagby("Magby", Aspect.DELTA));
        addNewPokemon(new DeltaTreecko("Treecko", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaGrovyle("Grovyle", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaSceptile("Sceptile", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaTorchic("Torchic", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaCombusken("Combusken", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaBlaziken("Blaziken", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaLotad("Lotad", Aspect.DELTA));
        addNewPokemon(new DeltaLombre("Lombre", Aspect.DELTA));
        addNewPokemon(new DeltaLudicolo("Ludicolo", Aspect.DELTA));
        addNewPokemon(new DeltaSeedot("Seedot", Aspect.DELTA));
        addNewPokemon(new DeltaNuzleaf("Nuzleaf", Aspect.DELTA));
        addNewPokemon(new DeltaShiftry("Shiftry", Aspect.DELTA));
        addNewPokemon(new DeltaRalts("Ralts", Aspect.DELTA));
        addNewPokemon(new DeltaKirlia("Kirlia", Aspect.DELTA));
        addNewPokemon(new DeltaGardevoir("Gardevoir", Aspect.DELTA));
        addNewPokemon(new DeltaSableye("Sableye", Aspect.DELTA));
        addNewPokemon(new DeltaMawile("Mawile", Aspect.DELTA));
        addNewPokemon(new DeltaAron("Aron", Aspect.DELTA));
        addNewPokemon(new DeltaLairon("Lairon", Aspect.DELTA));
        addNewPokemon(new DeltaAggron("Aggron", Aspect.DELTA));
        addNewPokemon(new DeltaMeditite("Meditite", Aspect.DELTA));
        addNewPokemon(new DeltaMedicham("Medicham", Aspect.DELTA));
        addNewPokemon(new DeltaPlusle("Plusle", Aspect.DELTA));
        addNewPokemon(new DeltaMinun("Minun", Aspect.DELTA));
        addNewPokemon(new DeltaRoselia("Roselia", Aspect.DELTA));
        addNewPokemon(new DeltaWailmer("Wailmer", Aspect.DELTA));
        addNewPokemon(new DeltaWailord("Wailord", Aspect.DELTA));
        addNewPokemon(new DeltaNumel("Numel", Aspect.DELTA));
        addNewPokemon(new DeltaCamerupt("Camerupt", Aspect.DELTA));
        addNewPokemon(new DeltaFeebas("Feebas", Aspect.DELTA));
        addNewPokemon(new DeltaMilotic("Milotic", Aspect.DELTA));
        addNewPokemon(new DeltaSnorunt("Snorunt", Aspect.DELTA));
        addNewPokemon(new DeltaGlalie("Glalie", Aspect.DELTA));
        addNewPokemon(new DeltaClamperl("Clamperl", Aspect.DELTA));
        addNewPokemon(new DeltaHuntail("Huntail", Aspect.DELTA));
        addNewPokemon(new DeltaGorebyss("Gorebyss", Aspect.DELTA));
        addNewPokemon(new DeltaSpiderBeldum("Beldum", Aspect.DELTA_SPIDER).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaSpiderMetang("Metang", Aspect.DELTA_SPIDER).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaSpiderMetagross("Metagross", Aspect.DELTA_SPIDER).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaRuinBeldum("Beldum", Aspect.DELTA_RUIN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaRuinMetang("Metang", Aspect.DELTA_RUIN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaRuinMetagross("Metagross", Aspect.DELTA_RUIN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaRegirock("Regirock", Aspect.DELTA).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new DeltaRegice("Regice", Aspect.DELTA).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new DeltaRegisteel("Registeel", Aspect.DELTA).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new DeltaTurtwig("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaGrotle("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaTorterra("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaShinx("", Aspect.DELTA));
        addNewPokemon(new DeltaLuxio("", Aspect.DELTA));
        addNewPokemon(new DeltaLuxray("", Aspect.DELTA));
        addNewPokemon(new DeltaBudew("", Aspect.DELTA));
        addNewPokemon(new DeltaRoserade("", Aspect.DELTA));
        addNewPokemon(new DeltaCombee("", Aspect.DELTA));
        addNewPokemon(new DeltaVespiquen("", Aspect.DELTA));
        addNewPokemon(new DeltaAmbipom("", Aspect.DELTA));
        addNewPokemon(new DeltaDrifloon("", Aspect.DELTA));
        addNewPokemon(new DeltaDrifblim("", Aspect.DELTA));
        addNewPokemon(new DeltaBuneary("", Aspect.DELTA));
        addNewPokemon(new DeltaLopunny("", Aspect.DELTA));
        addNewPokemon(new DeltaMismagius("", Aspect.DELTA));
        addNewPokemon(new DeltaMunchlax("", Aspect.DELTA));
        addNewPokemon(new DeltaRiolu("", Aspect.DELTA));
        addNewPokemon(new DeltaLucario("", Aspect.DELTA));
        addNewPokemon(new DeltaCroagunk("", Aspect.DELTA));
        addNewPokemon(new DeltaToxicroak("", Aspect.DELTA));
        addNewPokemon(new DeltaTangrowth("", Aspect.DELTA));
        addNewPokemon(new DeltaElectivire("", Aspect.DELTA));
        addNewPokemon(new DeltaMagmortar("", Aspect.DELTA));
        addNewPokemon(new DeltaYanmega("", Aspect.DELTA));
        addNewPokemon(new DeltaGallade("", Aspect.DELTA));
        addNewPokemon(new DeltaFroslass("", Aspect.DELTA));
        addNewPokemon(new DeltaSnivy("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaServine("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaSerperior("", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaPurrloin("", Aspect.DELTA));
        addNewPokemon(new DeltaLiepard("", Aspect.DELTA));
        addNewPokemon(new DeltaVenipede("", Aspect.DELTA));
        addNewPokemon(new DeltaWhirlipede("", Aspect.DELTA));
        addNewPokemon(new DeltaScolipede("", Aspect.DELTA));
        addNewPokemon(new DeltaWaterPetilil("", Aspect.DELTA_WATER));
        addNewPokemon(new DeltaWaterLilligant("", Aspect.DELTA_WATER));
        addNewPokemon(new DeltaFairyPetilil("", Aspect.DELTA_FAIRY));
        addNewPokemon(new DeltaFairyLilligant("", Aspect.DELTA_FAIRY));
        addNewPokemon(new DeltaDarumaka("", Aspect.DELTA));
        addNewPokemon(new DeltaDarmanitan("", Aspect.DELTA));
        addNewPokemon(new DeltaMaractus("", Aspect.DELTA));
        addNewPokemon(new DeltaBerryDwebble("", Aspect.DELTA_BERRY));
        addNewPokemon(new DeltaBerryCrustle("", Aspect.DELTA_BERRY));
        addNewPokemon(new DeltaCakeDwebble("", Aspect.DELTA_CAKE));
        addNewPokemon(new DeltaCakeCrustle("", Aspect.DELTA_CAKE));
        addNewPokemon(new DeltaScraggy("", Aspect.DELTA));
        addNewPokemon(new DeltaScrafty("", Aspect.DELTA));
        addNewPokemon(new DeltaYamask("", Aspect.DELTA));
        addNewPokemon(new DeltaCofagrigus("", Aspect.DELTA));
        addNewPokemon(new DeltaSolosis("", Aspect.DELTA));
        addNewPokemon(new DeltaDuosion("", Aspect.DELTA));
        addNewPokemon(new DeltaReuniclus("", Aspect.DELTA));
        addNewPokemon(new DeltaEmolga("", Aspect.DELTA));
        addNewPokemon(new DeltaKarrablast("", Aspect.DELTA));
        addNewPokemon(new DeltaEscavalier("", Aspect.DELTA));
        addNewPokemon(new DeltaFoongus("", Aspect.DELTA));
        addNewPokemon(new DeltaAmoonguss("", Aspect.DELTA));
        addNewPokemon(new DeltaLitwick("", Aspect.DELTA));
        addNewPokemon(new DeltaLampent("", Aspect.DELTA));
        addNewPokemon(new DeltaChandelure("", Aspect.DELTA));
        addNewPokemon(new DeltaAxew("", Aspect.DELTA));
        addNewPokemon(new DeltaFraxure("", Aspect.DELTA));
        addNewPokemon(new DeltaHaxorus("", Aspect.DELTA));
        addNewPokemon(new DeltaGolett("", Aspect.DELTA));
        addNewPokemon(new DeltaGolurk("", Aspect.DELTA));
        addNewPokemon(new DeltaPawniard("", Aspect.DELTA));
        addNewPokemon(new DeltaBisharp("", Aspect.DELTA));
        addNewPokemon(new DeltaHeatmor("", Aspect.DELTA));
        addNewPokemon(new DeltaDeino("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaZweilous("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaHydreigon("", Aspect.DELTA).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new DeltaLarvesta("", Aspect.DELTA));
        addNewPokemon(new DeltaVolcarona("", Aspect.DELTA));
        addNewPokemon(new DeltaMeloetta("", Aspect.DELTA).addLabels(Label.MYTHICAL));
        addNewPokemon(new DeltaFroakie("Froakie", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaFrogadier("Frogadier", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaGreninja("Greninja", Aspect.DELTA).addLabels(Label.STARTER));
        addNewPokemon(new DeltaAmaura("Amaura", Aspect.DELTA));
        addNewPokemon(new DeltaAurorus("Aurorus", Aspect.DELTA));
        addNewPokemon(new DeltaGoomy("Goomy", Aspect.DELTA));
        addNewPokemon(new DeltaSliggoo("Sliggoo", Aspect.DELTA));
        addNewPokemon(new DeltaGoodra("Goodra", Aspect.DELTA));
        addNewPokemon(new DeltaPhantump("Phantump", Aspect.DELTA));
        addNewPokemon(new DeltaTrevenant("Trevenant", Aspect.DELTA));
        addNewPokemon(new DeltaBergmite("Bergmite", Aspect.DELTA));
        addNewPokemon(new DeltaAvalugg("Avalugg", Aspect.DELTA));
        addNewPokemon(new DeltaNoibat("Noibat", Aspect.DELTA));
        addNewPokemon(new DeltaNoivern("Noivern", Aspect.DELTA));
        addNewPokemon(new DeltaHoopa("Hoopa", Aspect.DELTA).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new DeltaHoopaUnleashed("Hoopa", Aspect.DELTA_UNLEASHED).addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new UFI().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new SpaceMew("", Aspect.SPACE).addLabels(Label.MYTHICAL));
        addNewPokemon(new ShadowMewtwo("", Aspect.SHADOW).addLabels(Label.LEGENDARY));
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
