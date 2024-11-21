package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
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
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class GenerationFive extends Game {
    public GenerationFive() {
        super("generation5");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new IonosianKarrablast(588));   Missing Art
//        pokemon.add(new IonosianDruddigon(621));   Missing Stats

        addNewPokemon(new FligianVanillite("", Aspect.FLIGIAN));
        addNewPokemon(new FligianVanillish("", Aspect.FLIGIAN));

        addNewPokemon(new NovranHerdier("", Aspect.NOVRAN));
        addNewPokemon(new NovranStoutland("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanillite("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanillish("", Aspect.NOVRAN));
        addNewPokemon(new NovranVanilluxe("", Aspect.NOVRAN));
        addNewPokemon(new NovranDruddigon("", Aspect.NOVRAN));

        addNewPokemon(new QamoranCubchoo("", Aspect.QAMORAN));
        addNewPokemon(new QamoranBeartic("", Aspect.QAMORAN));

        addNewPokemon(new VaritasianYamask("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlink("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlang("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTynamo("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektrik("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektross("", Aspect.VARITASIAN));

//        pokemon.add(new HavaiianOshawott(501)); Member of line Not Finished

        addNewPokemon(new InterianGenesect("", Aspect.INTERIAN));

//        pokemon.add(new NostanTrubbish()); Missing Art
//        pokemon.add(new NostanGarbodor()); Missing Art

        addNewPokemon(new NorheimanSigilyph("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanFoongus("", Aspect.NORHEIMAN));

        addNewPokemon(new HizianHeatmor("", Aspect.HIZIAN));
        addNewPokemon(new HizianDruddigon("", Aspect.HIZIAN));

        addNewPokemon(new AvorianMaractus("", Aspect.AVORIAN));

        //Pokemon Infinity
        addNewPokemon(new EghoTrubbish("", Aspect.EGHO));
        addNewPokemon(new EghoGarbodor("", Aspect.EGHO));

        //Pokemon Insurgance
        addNewPokemon(new DeltaSnivy("", Aspect.DELTA));
        addNewPokemon(new DeltaServine("", Aspect.DELTA));
        addNewPokemon(new DeltaSerperior("", Aspect.DELTA));
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
        addNewPokemon(new DeltaDeino("", Aspect.DELTA));
        addNewPokemon(new DeltaZweilous("", Aspect.DELTA));
        addNewPokemon(new DeltaHydreigon("", Aspect.DELTA));
        addNewPokemon(new DeltaLarvesta("", Aspect.DELTA));
        addNewPokemon(new DeltaVolcarona("", Aspect.DELTA));
        addNewPokemon(new DeltaMeloetta("", Aspect.DELTA));

        //X-Species (Xenoverse)
        addNewPokemon(new YamaskX("", Aspect.X));
        addNewPokemon(new CofagrigusX("", Aspect.X));
        addNewPokemon(new JoltikX("", Aspect.X));
        addNewPokemon(new GalvantulaX("", Aspect.X));
        addNewPokemon(new BisharpX("", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianMaractus("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSolosis("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDuosion("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianReuniclus("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEmolga("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTynamo("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektrik("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektross("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianPawniard("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianBisharp("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianBlitzle("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianZebstrika("", Aspect.SEVIIAN));

        addMythianPokemon();

        //Pokemon Flux
        addNewPokemon(new AlteranZorua("", Aspect.ALTERAN));

        //Daybreak
        addNewPokemon(new ArmiranRoggenrola("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranBoldore("", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGigalith("", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianDwebble("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArchen("", Aspect.AYREIAN));
        addNewPokemon(new AyreianArcheops("", Aspect.AYREIAN));
        addNewPokemon(new AyreianMinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCinccino("", Aspect.AYREIAN));
        addNewPokemon(new AyreianDucklett("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSwanna("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillite("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanillish("", Aspect.AYREIAN));
        addNewPokemon(new AyreianVanilluxe("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianExcadrill("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGurdurr("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianConkeldurr("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianSolosis("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDuosion("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianReuniclus("", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianGolett("", Aspect.KASKADIAN));

        //Azure (Mystic)
        addNewPokemon(new MysticSolosis("", Aspect.MYSTIC));
        addNewPokemon(new MysticDuosion("", Aspect.MYSTIC));
        addNewPokemon(new MysticReuniclus("", Aspect.MYSTIC));

        //Pokemon Opalo
        addNewPokemon(new CefiranPetilil("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranLilligant("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGothitelle("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolett("", Aspect.CEFIRAN));
        addNewPokemon(new CefiranGolurk("", Aspect.CEFIRAN));
    }

    private void addMythianPokemon() {
        addNewPokemon(new MythianZorua("", Aspect.MYTHIAN));
        addNewPokemon(new MythianZoroark("", Aspect.MYTHIAN));
        addNewPokemon(new MythianLarvesta("", Aspect.MYTHIAN));
        addNewPokemon(new MythianVolcarona("", Aspect.MYTHIAN));
    }
}
