package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.avoris.regional.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.flux.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.interregional.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.orohnhavai.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationFive extends Game {
    public GenerationFive() {
        super("generation5");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new NovranHerdier(507));
        pokemon.add(new NovranStoutland(508));
        pokemon.add(new NovranVanillite(583));
        pokemon.add(new NovranVanillish(584));
        pokemon.add(new NovranVanilluxe(585));
        pokemon.add(new NovranDruddigon(621));

        pokemon.add(new QamoranCubchoo(613));
        pokemon.add(new QamoranBeartic(614));

        pokemon.add(new VaritasianYamask(562));
        pokemon.add(new VaritasianKlink(599));
        pokemon.add(new VaritasianKlang(600));
        pokemon.add(new VaritasianTynamo(602));
        pokemon.add(new VaritasianEelektrik(603));
        pokemon.add(new VaritasianEelektross(604));

//        pokemon.add(new HavaiianOshawott(501)); NOT FINISHED

        pokemon.add(new InterianGenesect(649));

//        pokemon.add(new NorheimanSigilyph(561)); NOT FINISHED
//        pokemon.add(new NorheimanFoongus(590)); NOT FINISHED

        pokemon.add(new HizianHeatmor(631));
        pokemon.add(new HizianDruddigon(621));

        pokemon.add(new AvorianMaractus(556));

        //Pokemon Infinity
        pokemon.add(new EghoTrubbish(568));
        pokemon.add(new EghoGarbodor(569));

        //Pokemon Insurgance
        pokemon.add(new DeltaSnivy(495));
        pokemon.add(new DeltaServine(496));
        pokemon.add(new DeltaSerperior(497));
        pokemon.add(new DeltaPurrloin(509));
        pokemon.add(new DeltaLiepard(510));
        pokemon.add(new DeltaVenipede(543));
        pokemon.add(new DeltaWhirlipede(544));
        pokemon.add(new DeltaScolipede(545));
        pokemon.add(new DeltaWaterPetilil(548));
        pokemon.add(new DeltaWaterLilligant(549));
        pokemon.add(new DeltaFairyPetilil(548));
        pokemon.add(new DeltaFairyLilligant(549));
        pokemon.add(new DeltaDarumaka(554));
        pokemon.add(new DeltaDarmanitan(555));
        pokemon.add(new DeltaMaractus(556));
        pokemon.add(new DeltaBerryDwebble(557));
        pokemon.add(new DeltaBerryCrustle(558));
        pokemon.add(new DeltaCakeDwebble(557));
        pokemon.add(new DeltaCakeCrustle(558));
        pokemon.add(new DeltaScraggy(559));
        pokemon.add(new DeltaScrafty(560));
        pokemon.add(new DeltaYamask(562));
        pokemon.add(new DeltaCofagrigus(563));
        pokemon.add(new DeltaSolosis(577));
        pokemon.add(new DeltaDuosion(578));
        pokemon.add(new DeltaReuniclus(579));
        pokemon.add(new DeltaEmolga(587));
        pokemon.add(new DeltaKarrablast(588));
        pokemon.add(new DeltaEscavalier(589));
        pokemon.add(new DeltaFoongus(590));
        pokemon.add(new DeltaAmoonguss(591));
        pokemon.add(new DeltaLitwick(607));
        pokemon.add(new DeltaLampent(608));
        pokemon.add(new DeltaChandelure(609));
        pokemon.add(new DeltaAxew(610));
        pokemon.add(new DeltaFraxure(611));
        pokemon.add(new DeltaHaxorus(612));
        pokemon.add(new DeltaGolett(622));
        pokemon.add(new DeltaGolurk(623));
        pokemon.add(new DeltaPawniard(624));
        pokemon.add(new DeltaBisharp(625));
        pokemon.add(new DeltaHeatmor(631));
        pokemon.add(new DeltaDeino(633));
        pokemon.add(new DeltaZweilous(634));
        pokemon.add(new DeltaHydreigon(635));
        pokemon.add(new DeltaLarvesta(636));
        pokemon.add(new DeltaVolcarona(637));
        pokemon.add(new DeltaMeloetta(648));

        //X-Species (Xenoverse)
        pokemon.add(new YamaskX(562));
        pokemon.add(new CofagrigusX(563));
        pokemon.add(new JoltikX(595));
        pokemon.add(new GalvantulaX(596));
        pokemon.add(new BisharpX(625));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianMaractus(556));
        pokemon.add(new HoennianSolosis(577));
        pokemon.add(new HoennianDuosion(578));
        pokemon.add(new HoennianReuniclus(579));
        pokemon.add(new HoennianEmolga(587));
        pokemon.add(new HoennianTynamo(602));
        pokemon.add(new HoennianEelektrik(603));
        pokemon.add(new HoennianEelektross(604));
        pokemon.add(new HoennianPawniard(624));
        pokemon.add(new HoennianBisharp(625));

        //Radical Red
        pokemon.add(new SeviianBlitzle(522));
        pokemon.add(new SeviianZebstrika(523));

        addMythianPokemon();

        //Pokemon Flux
        pokemon.add(new AlteranZorua(570));

        //Daybreak
        pokemon.add(new ArmiranRoggenrola(524));
        pokemon.add(new ArmiranBoldore(525));
        pokemon.add(new ArmiranGigalith(526));

        //Vanguard
        pokemon.add(new AyreianDwebble(557));
        pokemon.add(new AyreianArchen(566));
        pokemon.add(new AyreianArcheops(566));
        pokemon.add(new AyreianMinccino(572));
        pokemon.add(new AyreianCinccino(573));
        pokemon.add(new AyreianDucklett(580));
        pokemon.add(new AyreianSwanna(581));
        pokemon.add(new AyreianVanillite(582));
        pokemon.add(new AyreianVanillish(583));
        pokemon.add(new AyreianVanniluxe(584));

        //Kaskadian
        pokemon.add(new KaskadianExcadrill(530));
        pokemon.add(new KaskadianGurdurr(533));
        pokemon.add(new KaskadianConkeldurr(534));
        pokemon.add(new KaskadianSolosis(577));
        pokemon.add(new KaskadianDuosion(578));
        pokemon.add(new KaskadianReuniclus(579));
        pokemon.add(new KaskadianGolett(622));

        //Azure (Mystic)
        pokemon.add(new MysticSolosis(577));
        pokemon.add(new MysticDuosion(578));
        pokemon.add(new MysticReuniclus(579));

        //Pokemon Opalo
        pokemon.add(new CefiranPetilil(548));
        pokemon.add(new CefiranLilligant(549));
        pokemon.add(new CefiranGothitelle(576));
        pokemon.add(new CefiranGolett(622));
        pokemon.add(new CefiranGolurk(623));

    }

    private void addMythianPokemon() {
        pokemon.add(new MythianZorua(570));
        pokemon.add(new MythianZoroark(571));
        pokemon.add(new MythianLarvesta(636));
        pokemon.add(new MythianVolcarona(637));
    }
}
