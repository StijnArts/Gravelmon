package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationFour extends Original {
    public GenerationFour() {
        super("generation4");
    }

    @Override
    public void registerPokemon() {
        //Pokemon Infinity
        pokemon.add(new EhgoHappiny(440));
        pokemon.add(new EhgoMagnezone(462));
        pokemon.add(new EhgoTangrowth(465));

        //Pokemon Insurgance
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

        //X-species
        pokemon.add(new BudewX(406));
        pokemon.add(new RoseradeX(407));
        pokemon.add(new SpiritombX(442));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianTangrowth(465));
        pokemon.add(new HoennianRegigigas(486));

    }
}
