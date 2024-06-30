package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.avoris.regional.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.enjin.regional.*;
import drai.dev.gravelmon.pokemon.fliga.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
//import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.neonintendo.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationThree extends Game {
    public GenerationThree() {
        super("generation3");
    }

    @Override
    public void registerPokemon() {

//        pokemon.add(new IonosianTrapinch(328));   Missing Stats
//        pokemon.add(new IonosianVibrava(329));   Missing Stats
//        pokemon.add(new IonosianFlygon(330));   Missing Stats

        pokemon.add(new FligianTreecko("Treecko", Aspect.FLIGIAN));
        pokemon.add(new FligianGrovyle("Grovyle", Aspect.FLIGIAN));
        pokemon.add(new FligianSceptile("Sceptile", Aspect.FLIGIAN));
        pokemon.add(new FligianRalts("Ralts", Aspect.FLIGIAN));
        pokemon.add(new FligianKirlia("Kirlia", Aspect.FLIGIAN));
        pokemon.add(new FligianGardevoir("Gardevoir", Aspect.FLIGIAN));
        pokemon.add(new FligianSlakoth("Slakoth", Aspect.FLIGIAN));
        pokemon.add(new FligianVigoroth("Vigoroth", Aspect.FLIGIAN));
        pokemon.add(new FligianNincada("Nincada", Aspect.FLIGIAN));
        pokemon.add(new FligianDuskull("Duskull", Aspect.FLIGIAN));
        pokemon.add(new FligianDusclops("Dusclops", Aspect.FLIGIAN));

//        pokemon.add(new EnjinnianElectrike(309));Member of line Not Finished
//        pokemon.add(new EnjinnianManectric(310));Member of line Not Finished

        pokemon.add(new EnjinnianSableye("Sableye", Aspect.ENJINNIAN));

        pokemon.add(new NeoCacnea("Cacnea", Aspect.NEO));

        pokemon.add(new NovranHuntail("Huntail", Aspect.NOVRAN));
        pokemon.add(new NovranGorebyss("Gorebyss", Aspect.NOVRAN));

        pokemon.add(new QamoranSpoink("Spoink", Aspect.QAMORAN));
        pokemon.add(new QamoranGrumpig("Grumpig", Aspect.QAMORAN));

        pokemon.add(new NorheimanMasquerain("Masquerain", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        pokemon.add(new NorheimanWailmer("Wailmer", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanNumel("Numel", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanCorphish("Corphish", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanCrawdaunt("Crawdaunt", Aspect.NORHEIMAN, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));


        pokemon.add(new VaritasianSwablu("Swablu", Aspect.VARITASIAN));
        pokemon.add(new VaritasianAltaria("Altaria", Aspect.VARITASIAN));

        pokemon.add(new AvorianRoselia("Roselia", Aspect.AVORIAN));

        pokemon.add(new HizianNosepass("Nosepass", Aspect.HIZIAN));
        pokemon.add(new HizianSkitty("Skitty", Aspect.HIZIAN));
        pokemon.add(new HizianDelcatty("Delcatty", Aspect.HIZIAN));
        pokemon.add(new HizianAron("Aron", Aspect.HIZIAN));
        pokemon.add(new HizianLairon("Lairon", Aspect.HIZIAN));
        pokemon.add(new HizianAggron("Aggron", Aspect.HIZIAN));
        pokemon.add(new HizianLileep("Lileep", Aspect.HIZIAN));
        pokemon.add(new HizianCradily("Cradily", Aspect.HIZIAN));
        pokemon.add(new HizianAnorith("Anorith", Aspect.HIZIAN));
        pokemon.add(new HizianArmaldo("Armaldo", Aspect.HIZIAN));
        pokemon.add(new HizianTropius("Tropius", Aspect.HIZIAN));
        pokemon.add(new HizianLuvdisc("Luvdisc", Aspect.HIZIAN));

//        pokemon.add(new AristosianNumel(322)); Missing Art
//        pokemon.add(new AristosianTaillow(276)); Member of line not finished
//        pokemon.add(new AristosianNosepass(299)); Missing Art
        pokemon.add(new AristosianTropius("Tropius", Aspect.ARISTOSIAN));

        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        pokemon.add(new SeviianFeebas("Feebas", Aspect.SEVIIAN));
        pokemon.add(new SeviianMilotic("Milotic", Aspect.SEVIIAN));

        //Pokemon Flux
        pokemon.add(new AlteranShroomish("Shroomish", Aspect.ALTERAN));
        pokemon.add(new AlteranBreloom("Breloom", Aspect.ALTERAN));

        //Daybreak
        pokemon.add(new ArmiranSceptile("Sceptile", Aspect.ARMIRAN));
        pokemon.add(new ArmiranSwellow("Swellow", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianTorchic("Torchic", Aspect.AYREIAN));
        pokemon.add(new AyreianCombusken("Combusken", Aspect.AYREIAN));
        pokemon.add(new AyreianBlaziken("Blaziken", Aspect.AYREIAN));
        pokemon.add(new AyreianNosepass("Nosepass", Aspect.AYREIAN));
        pokemon.add(new AyreianAron("Aron", Aspect.AYREIAN));
        pokemon.add(new AyreianLairon("Lairon", Aspect.AYREIAN));
        pokemon.add(new AyreianAggron("Aggron", Aspect.AYREIAN));
        pokemon.add(new AyreianRoselia("Roselia", Aspect.AYREIAN));
        pokemon.add(new AyreianNumel("Numel", Aspect.AYREIAN));
        pokemon.add(new AyreianCamerupt("Camerupt", Aspect.AYREIAN));
        pokemon.add(new AyreianTrapinch("Trapinch", Aspect.AYREIAN));
        pokemon.add(new AyreianVibrava("Vibrava", Aspect.AYREIAN));
        pokemon.add(new AyreianFlygon("Flygon", Aspect.AYREIAN));
        pokemon.add(new AyreianSwablu("Swablu", Aspect.AYREIAN));
        pokemon.add(new AyreianAltaria("Altaria", Aspect.AYREIAN));
        pokemon.add(new AyreianLunatone("Lunatone", Aspect.AYREIAN));
        pokemon.add(new AyreianRelicanth("Relicanth", Aspect.AYREIAN));
        pokemon.add(new AyreianLuvdisc("Luvdisc", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicRoselia("Roselia", Aspect.RELIC));
        pokemon.add(new RelicSpinda("Spinda", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianExploud("Exploud", Aspect.KASKADIAN));
        pokemon.add(new GutsyCastform("Castform", Aspect.GUTSY));
        pokemon.add(new WindyCastform("Castform", Aspect.WINDY));
        pokemon.add(new SmoggyCastform("Castform", Aspect.SMOGGY));
        pokemon.add(new DustyCastform("Castform", Aspect.DUSTY));
        pokemon.add(new SandyCastform("Castform", Aspect.SANDY));
        pokemon.add(new SwarmyCastform("Castform", Aspect.SWARMY));
        pokemon.add(new SpookyCastform("Castform", Aspect.SPOOKY));
        pokemon.add(new WhirlyCastform("Castform", Aspect.WHIRLY));
        pokemon.add(new AllergyCastform("Castform", Aspect.ALLERGY));
        pokemon.add(new ZappyCastform("Castform", Aspect.ZAPPY));
        pokemon.add(new ZennyCastform("Castform", Aspect.ZENNY));
        pokemon.add(new SorceryCastform("Castform", Aspect.SORCERY));
        pokemon.add(new ShadyCastform("Castform", Aspect.SHADY));
        pokemon.add(new LovelyCastform("Castform", Aspect.LOVELY));
        pokemon.add(new KaskadianTropius("Tropius", Aspect.KASKADIAN));

        //Azure (Mystic)
        pokemon.add(new MysticTreecko("Treecko", Aspect.MYSTIC));
        pokemon.add(new MysticGrovyle("Grovyle", Aspect.MYSTIC));
        pokemon.add(new MysticSceptile("Sceptile", Aspect.MYSTIC));
        pokemon.add(new MysticTorchic("Torchic", Aspect.MYSTIC));
        pokemon.add(new MysticCombusken("Combusken", Aspect.MYSTIC));
        pokemon.add(new MysticBlaziken("Blaziken", Aspect.MYSTIC));
        pokemon.add(new MysticMudkip("Mudkip", Aspect.MYSTIC));
        pokemon.add(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC));
        pokemon.add(new MysticSwampert("Swampert", Aspect.MYSTIC));
        pokemon.add(new MysticPoochyena("Poochyena", Aspect.MYSTIC));
        pokemon.add(new MysticMightyena("Mightyena", Aspect.MYSTIC));

        //Pokemon Opalo
        pokemon.add(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN));
        pokemon.add(new CefiranHariyama("Hariyama", Aspect.CEFIRAN));
        pokemon.add(new CefiranSableye("Sableye", Aspect.CEFIRAN));
        pokemon.add(new CefiranNumel("Numel", Aspect.CEFIRAN));
        pokemon.add(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN));
        pokemon.add(new CefiranVibrava("Vibrava", Aspect.CEFIRAN));
        pokemon.add(new CefiranFlygon("Flygon", Aspect.CEFIRAN));
        pokemon.add(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN));
        pokemon.add(new CefiranGlalie("Glalie", Aspect.CEFIRAN));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        pokemon.add(new EghoLotad("Lotad", Aspect.EGHO));
        pokemon.add(new EghoLombre("Lombre", Aspect.EGHO));
        pokemon.add(new EghoLudicolo("Ludicolo", Aspect.EGHO));
        pokemon.add(new EghoAzurill("Azurill", Aspect.EGHO));
        pokemon.add(new EghoSwablu("Swablu", Aspect.EGHO));
        pokemon.add(new EghoAltaria("Altaria", Aspect.EGHO));
    }

    private void addDeltaPokemon() {
        //Pokemon Insurgance
        pokemon.add(new DeltaTreecko("Treecko", Aspect.DELTA));
        pokemon.add(new DeltaGrovyle("Grovyle", Aspect.DELTA));
        pokemon.add(new DeltaSceptile("Sceptile", Aspect.DELTA));
        pokemon.add(new DeltaTorchic("Torchic", Aspect.DELTA));
        pokemon.add(new DeltaCombusken("Combusken", Aspect.DELTA));
        pokemon.add(new DeltaBlaziken("Blaziken", Aspect.DELTA));
        pokemon.add(new DeltaLotad("Lotad", Aspect.DELTA));
        pokemon.add(new DeltaLombre("Lombre", Aspect.DELTA));
        pokemon.add(new DeltaLudicolo("Ludicolo", Aspect.DELTA));
        pokemon.add(new DeltaSeedot("Seedot", Aspect.DELTA));
        pokemon.add(new DeltaNuzleaf("Nuzleaf", Aspect.DELTA));
        pokemon.add(new DeltaShiftry("Shiftry", Aspect.DELTA));
        pokemon.add(new DeltaRalts("Ralts", Aspect.DELTA));
        pokemon.add(new DeltaKirlia("Kirlia", Aspect.DELTA));
        pokemon.add(new DeltaGardevoir("Gardevoir", Aspect.DELTA));
        pokemon.add(new DeltaSableye("Sableye", Aspect.DELTA));
        pokemon.add(new DeltaMawile("Mawile", Aspect.DELTA));
        pokemon.add(new DeltaAron("Aron", Aspect.DELTA));
        pokemon.add(new DeltaLairon("Lairon", Aspect.DELTA));
        pokemon.add(new DeltaAggron("Aggron", Aspect.DELTA));
        pokemon.add(new DeltaMeditite("Meditite", Aspect.DELTA));
        pokemon.add(new DeltaMedicham("Medicham", Aspect.DELTA));
        pokemon.add(new DeltaPlusle("Plusle", Aspect.DELTA));
        pokemon.add(new DeltaMinun("Minun", Aspect.DELTA));
        pokemon.add(new DeltaRoselia("Roselia", Aspect.DELTA));
        pokemon.add(new DeltaWailmer("Wailmer", Aspect.DELTA));
        pokemon.add(new DeltaWailord("Wailord", Aspect.DELTA));
        pokemon.add(new DeltaNumel("Numel", Aspect.DELTA));
        pokemon.add(new DeltaCamerupt("Camerupt", Aspect.DELTA));
        pokemon.add(new DeltaFeebas("Feebas", Aspect.DELTA));
        pokemon.add(new DeltaMilotic("Milotic", Aspect.DELTA));
        pokemon.add(new DeltaSnorunt("Snorunt", Aspect.DELTA));
        pokemon.add(new DeltaGlalie("Glalie", Aspect.DELTA));
        pokemon.add(new DeltaClamperl("Clamperl", Aspect.DELTA));
        pokemon.add(new DeltaHuntail("Huntail", Aspect.DELTA));
        pokemon.add(new DeltaGorebyss("Gorebyss", Aspect.DELTA));
        pokemon.add(new DeltaSpiderBeldum("Beldum", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaSpiderMetang("Metang", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaSpiderMetagross("Metagross", Aspect.DELTA_SPIDER));
        pokemon.add(new DeltaRuinBeldum("Beldum", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRuinMetang("Metang", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRuinMetagross("Metagross", Aspect.DELTA_RUIN));
        pokemon.add(new DeltaRegirock("Regirock", Aspect.DELTA));
        pokemon.add(new DeltaRegice("Regice", Aspect.DELTA));
        pokemon.add(new DeltaRegisteel("Registeel", Aspect.DELTA));
    }

    private void addXPokemon() {
        //X-Species (Xenoverse)
        pokemon.add(new RoseliaX("",Aspect.X));
        pokemon.add(new CarvanhaX("",Aspect.X));
        pokemon.add(new SharpedoX("",Aspect.X));
        pokemon.add(new CacneaX("",Aspect.X));
        pokemon.add(new CacturneX("",Aspect.X));
    }
}
