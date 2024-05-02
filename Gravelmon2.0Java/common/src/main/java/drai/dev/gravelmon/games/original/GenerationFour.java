package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.fliga.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.hub.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.interregional.regional.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.ionos.regional.*;
import drai.dev.gravelmon.pokemon.lagoone.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.rica.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

import java.util.*;

public class GenerationFour extends Game {
    public GenerationFour() {
        super("generation4");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new LagoonanFinneon(456));
        pokemon.add(new LagoonanLumineon(457));

//        pokemon.add(new IonosianShellos(422));   Missing Stats
//        pokemon.add(new IonosianGastrodon(423));   Missing Art
//        pokemon.add(new IonosianMimeJr(439));   Missing Art
//        pokemon.add(new IonosianMunchlax(446));   Missing Stats

        pokemon.add(new FligianShellos(422));
        pokemon.add(new FligianGastrodon(423));
        pokemon.add(new FligianHappiny(440));
        pokemon.add(new FligianGallade(475));
        pokemon.add(new FligianDusknoir(477));

        pokemon.add(new RicanShellos(422));
        pokemon.add(new RicanGastrodon(423));

        pokemon.add(new NovranCranidos(408));
        pokemon.add(new NovranRampardos(409));
        pokemon.add(new NovranBonsly(438));
        pokemon.add(new NovranCherubi(420));
        pokemon.add(new NovranCherrim(421));

        pokemon.add(new QamoranCombee(415));
        pokemon.add(new QamoranTangrowth(465));

//        pokemon.add(new NorheimanShinx(403)); Member of line Not Finished
//        pokemon.add(new NorheimanLuxio(404)); Missing Art
//        pokemon.add(new NorheimanLuxray(405)); Member of line Not Finished
        pokemon.add(new NorheimanMismagius(429, new Stats(495, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));

//        pokemon.add(new VaritasianBonsly(438)); Member of line Not Finished
//        pokemon.add(new VaritasianMimeJr(439)); Missing Art
        pokemon.add(new VaritasianMunchlax(446));
//        pokemon.add(new VaritasianMantyke(458)); Member of line Not Finished

        pokemon.add(new InterianPiplup(393));
        pokemon.add(new InterianPrinplup(394));
        pokemon.add(new InterianEmpoleon(395, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))));
        pokemon.add(new InterianArceus(493));
//
        pokemon.add(new HubianTogekiss(468));

        pokemon.add(new HizianMismagius(429));
        pokemon.add(new HizianHonchkrow(430));
        pokemon.add(new HizianGliscor(472));
        pokemon.add(new HizianSkorupi(451));
        pokemon.add(new HizianDrapion(452));

        //Pokemon Infinity
        pokemon.add(new EghoHappiny(440));
        pokemon.add(new EghoMagnezone(462));
        pokemon.add(new EghoTangrowth(465));

        //Pokemon Insurgance
        addDeltaPokemon();

        //X-species
        pokemon.add(new BudewX(406));
        pokemon.add(new RoseradeX(407));
        pokemon.add(new SpiritombX(442));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianTangrowth(465));
        pokemon.add(new HoennianRegigigas(486));

        //Radical Red
        pokemon.add(new SeviianCarnivine(455));
        pokemon.add(new SeviianMantyke(458));

        addMythianPokemon();

        //Daybreak
        pokemon.add(new ArmiranGarchomp(445));
        pokemon.add(new ArmiranHippopotas(449));
        pokemon.add(new ArmiranHippowdon(450));

        //Vanguard
        pokemon.add(new AyreianShinx(403));
        pokemon.add(new AyreianLuxio(404));
        pokemon.add(new AyreianLuxray(405));
        pokemon.add(new AyreianBudew(406));
        pokemon.add(new AyreianRoserade(407));
        pokemon.add(new AyreianDrifloon(425));
        pokemon.add(new AyreianDrifblim(426));

        //Phoenix Rising
        pokemon.add(new RelicBudew(406));
        pokemon.add(new RelicRoserade(407));
        pokemon.add(new RelicAmbipom(424));

        //Kaskadian
        pokemon.add(new KaskadianBidoof(399));
        pokemon.add(new KaskadianBibarel(400));
        pokemon.add(new KaskadianShinx(403));
        pokemon.add(new KaskadianLuxio(404));
        pokemon.add(new KaskadianLuxray(405));
        pokemon.add(new KaskadianAmbipom(424));
        pokemon.add(new AmazeAllDrifblim(426));
        pokemon.add(new KaskadianSkuntank(435));
        pokemon.add(new KaskadianSnover(459));
        pokemon.add(new KaskadianAbomasnow(460));
        pokemon.add(new SolRotom(479));
        pokemon.add(new SwayRotom(479));
        pokemon.add(new BrawlRotom(479));
        pokemon.add(new WebRotom(479));
        pokemon.add(new JunkRotom(479));
        pokemon.add(new HomeRotom(479));
        pokemon.add(new BassRotom(479));
        pokemon.add(new TwirlRotom(479));
        pokemon.add(new MixRotom(479));

        //Azure (Mystic)
        pokemon.add(new MysticRiolu(447));
        pokemon.add(new MysticLucario(448));

        //Pokemon Opalo
        pokemon.add(new CefiranSnover(459));
        pokemon.add(new CefiranAbomasnow(460));
        pokemon.add(new CefiranFroslass(478));

    }

    private void addDeltaPokemon() {
        pokemon.add(new DeltaTurtwig(387));
        pokemon.add(new DeltaGrotle(388));
        pokemon.add(new DeltaTorterra(389));
        pokemon.add(new DeltaShinx(403));
        pokemon.add(new DeltaLuxio(404));
        pokemon.add(new DeltaLuxray(405));
        pokemon.add(new DeltaBudew(406));
        pokemon.add(new DeltaRoserade(407));
        pokemon.add(new DeltaCombee(415));
        pokemon.add(new DeltaVespiquen(416));
        pokemon.add(new DeltaAmbipom(424));
        pokemon.add(new DeltaDrifloon(425));
        pokemon.add(new DeltaDrifblim(426));
        pokemon.add(new DeltaBuneary(427));
        pokemon.add(new DeltaLopunny(428));
        pokemon.add(new DeltaMismagius(429));
        pokemon.add(new DeltaMunchlax(446));
        pokemon.add(new DeltaRiolu(447));
        pokemon.add(new DeltaLucario(448));
        pokemon.add(new DeltaCroagunk(453));
        pokemon.add(new DeltaToxicroak(454));
        pokemon.add(new DeltaTangrowth(465));
        pokemon.add(new DeltaElectivire(466));
        pokemon.add(new DeltaMagmortar(467));
        pokemon.add(new DeltaYanmega(469));
        pokemon.add(new DeltaGallade(475));
        pokemon.add(new DeltaFroslass(478));
    }

    private void addMythianPokemon() {
        pokemon.add(new MythianRiolu(447));
        pokemon.add(new MythianLucario(448));
    }


}
