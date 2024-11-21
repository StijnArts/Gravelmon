package drai.dev.data.games.original;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.aristos.regional.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.enjin.regional.*;
import drai.dev.data.pokemon.fliga.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.neonintendo.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

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

        addNewPokemon(new FligianTreecko("Treecko", Aspect.FLIGIAN));
        addNewPokemon(new FligianGrovyle("Grovyle", Aspect.FLIGIAN));
        addNewPokemon(new FligianSceptile("Sceptile", Aspect.FLIGIAN));
        addNewPokemon(new FligianRalts("Ralts", Aspect.FLIGIAN));
        addNewPokemon(new FligianKirlia("Kirlia", Aspect.FLIGIAN));
        addNewPokemon(new FligianGardevoir("Gardevoir", Aspect.FLIGIAN));
        addNewPokemon(new FligianSlakoth("Slakoth", Aspect.FLIGIAN));
        addNewPokemon(new FligianVigoroth("Vigoroth", Aspect.FLIGIAN));
        addNewPokemon(new FligianNincada("Nincada", Aspect.FLIGIAN));
        addNewPokemon(new FligianDuskull("Duskull", Aspect.FLIGIAN));
        addNewPokemon(new FligianDusclops("Dusclops", Aspect.FLIGIAN));

//        pokemon.add(new EnjinnianElectrike(309));Member of line Not Finished
//        pokemon.add(new EnjinnianManectric(310));Member of line Not Finished

        addNewPokemon(new EnjinnianSableye("Sableye", Aspect.ENJINNIAN));

        addNewPokemon(new NeoCacnea("Cacnea", Aspect.NEO));

        addNewPokemon(new NovranHuntail("Huntail", Aspect.NOVRAN));
        addNewPokemon(new NovranGorebyss("Gorebyss", Aspect.NOVRAN));

        addNewPokemon(new QamoranSpoink("Spoink", Aspect.QAMORAN));
        addNewPokemon(new QamoranGrumpig("Grumpig", Aspect.QAMORAN));

        addNewPokemon(new NorheimanMasquerain("Masquerain", Aspect.NORHEIMAN, new Stats(454, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.HP))));
        addNewPokemon(new NorheimanWailmer("Wailmer", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanNumel("Numel", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCorphish("Corphish", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCrawdaunt("Crawdaunt", Aspect.NORHEIMAN, new Stats(468, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));


        addNewPokemon(new VaritasianSwablu("Swablu", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAltaria("Altaria", Aspect.VARITASIAN));

        addNewPokemon(new AvorianRoselia("Roselia", Aspect.AVORIAN));

        addNewPokemon(new HizianNosepass("Nosepass", Aspect.HIZIAN));
        addNewPokemon(new HizianSkitty("Skitty", Aspect.HIZIAN));
        addNewPokemon(new HizianDelcatty("Delcatty", Aspect.HIZIAN));
        addNewPokemon(new HizianAron("Aron", Aspect.HIZIAN));
        addNewPokemon(new HizianLairon("Lairon", Aspect.HIZIAN));
        addNewPokemon(new HizianAggron("Aggron", Aspect.HIZIAN));
        addNewPokemon(new HizianLileep("Lileep", Aspect.HIZIAN));
        addNewPokemon(new HizianCradily("Cradily", Aspect.HIZIAN));
        addNewPokemon(new HizianAnorith("Anorith", Aspect.HIZIAN));
        addNewPokemon(new HizianArmaldo("Armaldo", Aspect.HIZIAN));
        addNewPokemon(new HizianTropius("Tropius", Aspect.HIZIAN));
        addNewPokemon(new HizianLuvdisc("Luvdisc", Aspect.HIZIAN));

//        pokemon.add(new AristosianNumel(322)); Missing Art
//        pokemon.add(new AristosianTaillow(276)); Member of line not finished
//        pokemon.add(new AristosianNosepass(299)); Missing Art
        addNewPokemon(new AristosianTropius("Tropius", Aspect.ARISTOSIAN));

        addEghoPokemon();

        addDeltaPokemon();

        addXPokemon();

        //Radical Red
        addNewPokemon(new SeviianFeebas("Feebas", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMilotic("Milotic", Aspect.SEVIIAN));

        //Pokemon Flux
        addNewPokemon(new AlteranShroomish("Shroomish", Aspect.ALTERAN));
        addNewPokemon(new AlteranBreloom("Breloom", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranSceptile("Sceptile", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranSwellow("Swellow", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianTorchic("Torchic", Aspect.AYREIAN));
        addNewPokemon(new AyreianCombusken("Combusken", Aspect.AYREIAN));
        addNewPokemon(new AyreianBlaziken("Blaziken", Aspect.AYREIAN));
        addNewPokemon(new AyreianNosepass("Nosepass", Aspect.AYREIAN));
        addNewPokemon(new AyreianAron("Aron", Aspect.AYREIAN));
        addNewPokemon(new AyreianLairon("Lairon", Aspect.AYREIAN));
        addNewPokemon(new AyreianAggron("Aggron", Aspect.AYREIAN));
        addNewPokemon(new AyreianRoselia("Roselia", Aspect.AYREIAN));
        addNewPokemon(new AyreianNumel("Numel", Aspect.AYREIAN));
        addNewPokemon(new AyreianCamerupt("Camerupt", Aspect.AYREIAN));
        addNewPokemon(new AyreianTrapinch("Trapinch", Aspect.AYREIAN));
        addNewPokemon(new AyreianVibrava("Vibrava", Aspect.AYREIAN));
        addNewPokemon(new AyreianFlygon("Flygon", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwablu("Swablu", Aspect.AYREIAN));
        addNewPokemon(new AyreianAltaria("Altaria", Aspect.AYREIAN));
        addNewPokemon(new AyreianLunatone("Lunatone", Aspect.AYREIAN));
        addNewPokemon(new AyreianRelicanth("Relicanth", Aspect.AYREIAN));
        addNewPokemon(new AyreianLuvdisc("Luvdisc", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicRoselia("Roselia", Aspect.RELIC));
        addNewPokemon(new RelicSpinda("Spinda", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianExploud("Exploud", Aspect.KASKADIAN));
        addNewPokemon(new GutsyCastform("Castform", Aspect.GUTSY));
        addNewPokemon(new WindyCastform("Castform", Aspect.WINDY));
        addNewPokemon(new SmoggyCastform("Castform", Aspect.SMOGGY));
        addNewPokemon(new DustyCastform("Castform", Aspect.DUSTY));
        addNewPokemon(new SandyCastform("Castform", Aspect.SANDY));
        addNewPokemon(new SwarmyCastform("Castform", Aspect.SWARMY));
        addNewPokemon(new SpookyCastform("Castform", Aspect.SPOOKY));
        addNewPokemon(new WhirlyCastform("Castform", Aspect.WHIRLY));
        addNewPokemon(new AllergyCastform("Castform", Aspect.ALLERGY));
        addNewPokemon(new ZappyCastform("Castform", Aspect.ZAPPY));
        addNewPokemon(new ZennyCastform("Castform", Aspect.ZENNY));
        addNewPokemon(new SorceryCastform("Castform", Aspect.SORCERY));
        addNewPokemon(new ShadyCastform("Castform", Aspect.SHADY));
        addNewPokemon(new LovelyCastform("Castform", Aspect.LOVELY));
        addNewPokemon(new KaskadianTropius("Tropius", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticTreecko("Treecko", Aspect.MYSTIC));
        addNewPokemon(new MysticGrovyle("Grovyle", Aspect.MYSTIC));
        addNewPokemon(new MysticSceptile("Sceptile", Aspect.MYSTIC));
        addNewPokemon(new MysticTorchic("Torchic", Aspect.MYSTIC));
        addNewPokemon(new MysticCombusken("Combusken", Aspect.MYSTIC));
        addNewPokemon(new MysticBlaziken("Blaziken", Aspect.MYSTIC));
        addNewPokemon(new MysticMudkip("Mudkip", Aspect.MYSTIC));
        addNewPokemon(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC));
        addNewPokemon(new MysticSwampert("Swampert", Aspect.MYSTIC));
        addNewPokemon(new MysticPoochyena("Poochyena", Aspect.MYSTIC));
        addNewPokemon(new MysticMightyena("Mightyena", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranMakuhita("Makuhita", Aspect.CEFIRAN));
        addNewPokemon(new CefiranHariyama("Hariyama", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSableye("Sableye", Aspect.CEFIRAN));
        addNewPokemon(new CefiranNumel("Numel", Aspect.CEFIRAN));
        addNewPokemon(new CefiranCamerupt("Camerupt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranVibrava("Vibrava", Aspect.CEFIRAN));
        addNewPokemon(new CefiranFlygon("Flygon", Aspect.CEFIRAN));
        addNewPokemon(new CefiranSnorunt("Snorunt", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGlalie("Glalie", Aspect.CEFIRAN));

    }

    private void addEghoPokemon() {
        //Pokemon Infinity
        addNewPokemon(new EghoLotad("Lotad", Aspect.EGHO));
        addNewPokemon(new EghoLombre("Lombre", Aspect.EGHO));
        addNewPokemon(new EghoLudicolo("Ludicolo", Aspect.EGHO));
        addNewPokemon(new EghoAzurill("Azurill", Aspect.EGHO));
        addNewPokemon(new EghoSwablu("Swablu", Aspect.EGHO));
        addNewPokemon(new EghoAltaria("Altaria", Aspect.EGHO));
    }

    private void addDeltaPokemon() {
        //Pokemon Insurgance
        addNewPokemon(new DeltaTreecko("Treecko", Aspect.DELTA));
        addNewPokemon(new DeltaGrovyle("Grovyle", Aspect.DELTA));
        addNewPokemon(new DeltaSceptile("Sceptile", Aspect.DELTA));
        addNewPokemon(new DeltaTorchic("Torchic", Aspect.DELTA));
        addNewPokemon(new DeltaCombusken("Combusken", Aspect.DELTA));
        addNewPokemon(new DeltaBlaziken("Blaziken", Aspect.DELTA));
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
        addNewPokemon(new DeltaSpiderBeldum("Beldum", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaSpiderMetang("Metang", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaSpiderMetagross("Metagross", Aspect.DELTA_SPIDER));
        addNewPokemon(new DeltaRuinBeldum("Beldum", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRuinMetang("Metang", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRuinMetagross("Metagross", Aspect.DELTA_RUIN));
        addNewPokemon(new DeltaRegirock("Regirock", Aspect.DELTA));
        addNewPokemon(new DeltaRegice("Regice", Aspect.DELTA));
        addNewPokemon(new DeltaRegisteel("Registeel", Aspect.DELTA));
    }

    private void addXPokemon() {
        //X-Species (Xenoverse)
        addNewPokemon(new RoseliaX("",Aspect.X));
        addNewPokemon(new CarvanhaX("",Aspect.X));
        addNewPokemon(new SharpedoX("",Aspect.X));
        addNewPokemon(new CacneaX("",Aspect.X));
        addNewPokemon(new CacturneX("",Aspect.X));
    }
}
