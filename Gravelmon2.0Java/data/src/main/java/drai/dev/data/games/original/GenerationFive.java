package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.lagoone.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.avoris.regional.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.fliga.regional.*;
import drai.dev.data.pokemon.flux.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.interregional.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

public class GenerationFive extends Game {
    public GenerationFive() {
        super("generation5");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new LagoonanLitwick("", Aspect.LAGOONAN)); TODO
//        pokemon.add(new LagoonanLampent("", Aspect.LAGOONAN));
//        pokemon.add(new LagoonanChandelure("", Aspect.LAGOONAN));

//        pokemon.add(new IonosianKarrablast(588));   Missing Art
//        pokemon.add(new IonosianDruddigon(621));   Missing Stats

        pokemon.add(new FligianVanillite("", Aspect.FLIGIAN));
        pokemon.add(new FligianVanillish("", Aspect.FLIGIAN));

        pokemon.add(new NovranHerdier("", Aspect.NOVRAN));
        pokemon.add(new NovranStoutland("", Aspect.NOVRAN));
        pokemon.add(new NovranVanillite("", Aspect.NOVRAN));
        pokemon.add(new NovranVanillish("", Aspect.NOVRAN));
        pokemon.add(new NovranVanilluxe("", Aspect.NOVRAN));
        pokemon.add(new NovranDruddigon("", Aspect.NOVRAN));

        pokemon.add(new QamoranCubchoo("", Aspect.QAMORAN));
        pokemon.add(new QamoranBeartic("", Aspect.QAMORAN));

        pokemon.add(new VaritasianYamask("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianKlink("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianKlang("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianTynamo("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianEelektrik("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianEelektross("", Aspect.VARITASIAN));

//        pokemon.add(new HavaiianOshawott(501)); Member of line Not Finished

        pokemon.add(new InterianGenesect("", Aspect.INTERIAN));

//        pokemon.add(new NostanTrubbish()); Missing Art
//        pokemon.add(new NostanGarbodor()); Missing Art

        pokemon.add(new NorheimanSigilyph("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanFoongus("", Aspect.NORHEIMAN));

        pokemon.add(new HizianHeatmor("", Aspect.HIZIAN));
        pokemon.add(new HizianDruddigon("", Aspect.HIZIAN));

        pokemon.add(new AvorianMaractus("", Aspect.AVORIAN));

        //Pokemon Infinity
        pokemon.add(new EghoTrubbish("", Aspect.EGHO));
        pokemon.add(new EghoGarbodor("", Aspect.EGHO));

        //Pokemon Insurgance
        pokemon.add(new DeltaSnivy("", Aspect.DELTA));
        pokemon.add(new DeltaServine("", Aspect.DELTA));
        pokemon.add(new DeltaSerperior("", Aspect.DELTA));
        pokemon.add(new DeltaPurrloin("", Aspect.DELTA));
        pokemon.add(new DeltaLiepard("", Aspect.DELTA));
        pokemon.add(new DeltaVenipede("", Aspect.DELTA));
        pokemon.add(new DeltaWhirlipede("", Aspect.DELTA));
        pokemon.add(new DeltaScolipede("", Aspect.DELTA));
        pokemon.add(new DeltaWaterPetilil("", Aspect.DELTA_WATER));
        pokemon.add(new DeltaWaterLilligant("", Aspect.DELTA_WATER));
        pokemon.add(new DeltaFairyPetilil("", Aspect.DELTA_FAIRY));
        pokemon.add(new DeltaFairyLilligant("", Aspect.DELTA_FAIRY));
        pokemon.add(new DeltaDarumaka("", Aspect.DELTA));
        pokemon.add(new DeltaDarmanitan("", Aspect.DELTA));
        pokemon.add(new DeltaMaractus("", Aspect.DELTA));
        pokemon.add(new DeltaBerryDwebble("", Aspect.DELTA_BERRY));
        pokemon.add(new DeltaBerryCrustle("", Aspect.DELTA_BERRY));
        pokemon.add(new DeltaCakeDwebble("", Aspect.DELTA_CAKE));
        pokemon.add(new DeltaCakeCrustle("", Aspect.DELTA_CAKE));
        pokemon.add(new DeltaScraggy("", Aspect.DELTA));
        pokemon.add(new DeltaScrafty("", Aspect.DELTA));
        pokemon.add(new DeltaYamask("", Aspect.DELTA));
        pokemon.add(new DeltaCofagrigus("", Aspect.DELTA));
        pokemon.add(new DeltaSolosis("", Aspect.DELTA));
        pokemon.add(new DeltaDuosion("", Aspect.DELTA));
        pokemon.add(new DeltaReuniclus("", Aspect.DELTA));
        pokemon.add(new DeltaEmolga("", Aspect.DELTA));
        pokemon.add(new DeltaKarrablast("", Aspect.DELTA));
        pokemon.add(new DeltaEscavalier("", Aspect.DELTA));
        pokemon.add(new DeltaFoongus("", Aspect.DELTA));
        pokemon.add(new DeltaAmoonguss("", Aspect.DELTA));
        pokemon.add(new DeltaLitwick("", Aspect.DELTA));
        pokemon.add(new DeltaLampent("", Aspect.DELTA));
        pokemon.add(new DeltaChandelure("", Aspect.DELTA));
        pokemon.add(new DeltaAxew("", Aspect.DELTA));
        pokemon.add(new DeltaFraxure("", Aspect.DELTA));
        pokemon.add(new DeltaHaxorus("", Aspect.DELTA));
        pokemon.add(new DeltaGolett("", Aspect.DELTA));
        pokemon.add(new DeltaGolurk("", Aspect.DELTA));
        pokemon.add(new DeltaPawniard("", Aspect.DELTA));
        pokemon.add(new DeltaBisharp("", Aspect.DELTA));
        pokemon.add(new DeltaHeatmor("", Aspect.DELTA));
        pokemon.add(new DeltaDeino("", Aspect.DELTA));
        pokemon.add(new DeltaZweilous("", Aspect.DELTA));
        pokemon.add(new DeltaHydreigon("", Aspect.DELTA));
        pokemon.add(new DeltaLarvesta("", Aspect.DELTA));
        pokemon.add(new DeltaVolcarona("", Aspect.DELTA));
        pokemon.add(new DeltaMeloetta("", Aspect.DELTA));

        //X-Species (Xenoverse)
        pokemon.add(new YamaskX("", Aspect.X));
        pokemon.add(new CofagrigusX("", Aspect.X));
        pokemon.add(new JoltikX("", Aspect.X));
        pokemon.add(new GalvantulaX("", Aspect.X));
        pokemon.add(new BisharpX("", Aspect.X));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianMaractus("", Aspect.HOENNIAN));
        pokemon.add(new HoennianSolosis("", Aspect.HOENNIAN));
        pokemon.add(new HoennianDuosion("", Aspect.HOENNIAN));
        pokemon.add(new HoennianReuniclus("", Aspect.HOENNIAN));
        pokemon.add(new HoennianEmolga("", Aspect.HOENNIAN));
        pokemon.add(new HoennianTynamo("", Aspect.HOENNIAN));
        pokemon.add(new HoennianEelektrik("", Aspect.HOENNIAN));
        pokemon.add(new HoennianEelektross("", Aspect.HOENNIAN));
        pokemon.add(new HoennianPawniard("", Aspect.HOENNIAN));
        pokemon.add(new HoennianBisharp("", Aspect.HOENNIAN));

        //Radical Red
        pokemon.add(new SeviianBlitzle("", Aspect.SEVIIAN));
        pokemon.add(new SeviianZebstrika("", Aspect.SEVIIAN));

        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranZorua("", Aspect.ALTERAN));

        //Daybreak
        pokemon.add(new ArmiranRoggenrola("", Aspect.ARMIRAN));
        pokemon.add(new ArmiranBoldore("", Aspect.ARMIRAN));
        pokemon.add(new ArmiranGigalith("", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianDwebble("", Aspect.AYREIAN));
        pokemon.add(new AyreianArchen("", Aspect.AYREIAN));
        pokemon.add(new AyreianArcheops("", Aspect.AYREIAN));
        pokemon.add(new AyreianMinccino("", Aspect.AYREIAN));
        pokemon.add(new AyreianCinccino("", Aspect.AYREIAN));
        pokemon.add(new AyreianDucklett("", Aspect.AYREIAN));
        pokemon.add(new AyreianSwanna("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanillite("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanillish("", Aspect.AYREIAN));
        pokemon.add(new AyreianVanilluxe("", Aspect.AYREIAN));

        //Kaskadian
        pokemon.add(new KaskadianExcadrill("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianGurdurr("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianConkeldurr("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianSolosis("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianDuosion("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianReuniclus("", Aspect.KASKADIAN));
        pokemon.add(new KaskadianGolett("", Aspect.KASKADIAN));

        //Azure (Mystic)
        pokemon.add(new MysticSolosis("", Aspect.MYSTIC));
        pokemon.add(new MysticDuosion("", Aspect.MYSTIC));
        pokemon.add(new MysticReuniclus("", Aspect.MYSTIC));

        //Pokemon Opalo
        pokemon.add(new CefiranPetilil("", Aspect.CEFIRAN));
        pokemon.add(new CefiranLilligant("", Aspect.CEFIRAN));
        pokemon.add(new CefiranGothitelle("", Aspect.CEFIRAN));
        pokemon.add(new CefiranGolett("", Aspect.CEFIRAN));
        pokemon.add(new CefiranGolurk("", Aspect.CEFIRAN));
    }

    private void addMythianPokemon() {
        pokemon.add(new MythianZorua("", Aspect.MYTHIAN));
        pokemon.add(new MythianZoroark("", Aspect.MYTHIAN));
        pokemon.add(new MythianLarvesta("", Aspect.MYTHIAN));
        pokemon.add(new MythianVolcarona("", Aspect.MYTHIAN));
    }
}
