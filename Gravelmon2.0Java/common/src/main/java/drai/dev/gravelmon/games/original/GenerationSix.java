package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.aristos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.daybreak.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.ionos.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.opalo.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationSix extends Game {
    public GenerationSix() {
        super("generation6");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new IonosianInkay(686));   Missing Art

        pokemon.add(new NovranSkrelp("Skrelp", Aspect.NOVRAN));
        pokemon.add(new NovranDragalge("Dragalge", Aspect.NOVRAN));

        pokemon.add(new VaritasianFlabebe("Flabebe", Aspect.VARITASIAN));
        pokemon.add(new VaritasianFloette("Floette", Aspect.VARITASIAN));
        pokemon.add(new VaritasianPhantump("Phantump", Aspect.VARITASIAN));
        pokemon.add(new VaritasianTrevenant("Trevenant", Aspect.VARITASIAN));

        pokemon.add(new HizianLitleo("Litleo", Aspect.HIZIAN));
        pokemon.add(new HizianPyroar("Pyroar", Aspect.HIZIAN));

//        pokemon.add(new AristosianLitleo(667)); Missing Art


        //Pokemon Insurgance
        pokemon.add(new DeltaFroakie("Froakie", Aspect.DELTA));
        pokemon.add(new DeltaFrogadier("Frogadier", Aspect.DELTA));
        pokemon.add(new DeltaGreninja("Greninja", Aspect.DELTA));
        pokemon.add(new DeltaAmaura("Amaura", Aspect.DELTA));
        pokemon.add(new DeltaAurorus("Aurorus", Aspect.DELTA));
        pokemon.add(new DeltaGoomy("Goomy", Aspect.DELTA));
        pokemon.add(new DeltaSliggoo("Sliggoo", Aspect.DELTA));
        pokemon.add(new DeltaGoodra("Goodra", Aspect.DELTA));
        pokemon.add(new DeltaPhantump("Phantump", Aspect.DELTA));
        pokemon.add(new DeltaTrevenant("Trevenant", Aspect.DELTA));
        pokemon.add(new DeltaBergmite("Bergmite", Aspect.DELTA));
        pokemon.add(new DeltaAvalugg("Avalugg", Aspect.DELTA));
        pokemon.add(new DeltaNoibat("Noibat", Aspect.DELTA));
        pokemon.add(new DeltaNoivern("Noivern", Aspect.DELTA));
        pokemon.add(new DeltaHoopa("Hoopa", Aspect.DELTA));
        pokemon.add(new DeltaHoopaUnleashed("HoopaUnleashed", Aspect.DELTA));

        //X-Species (Xenoverse)
        pokemon.add(new GreninjaX("Greninja", Aspect.X));
        pokemon.add(new AegislashX("Aegislash", Aspect.X));
        pokemon.add(new SwirlixX("Swirlix", Aspect.X));
        pokemon.add(new SlurpuffX("Slurpuff", Aspect.X));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianGoomy("Goomy", Aspect.HOENN));

        //Radical Red
        pokemon.add(new SeviianClauncher("Clauncher", Aspect.SEVIIAN));
        pokemon.add(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN));
        pokemon.add(new SeviianNoibat("Noibat", Aspect.SEVIIAN));
        pokemon.add(new SeviianNoivern("Noivern", Aspect.SEVIIAN));

        //Myth
        pokemon.add(new MythianNoivern("Noivern", Aspect.MYTHIAN));

        //Daybreak
        pokemon.add(new ArmiranFroakie("Froakie", Aspect.ARMIRAN));
        pokemon.add(new ArmiranFrogadier("Frogadier", Aspect.ARMIRAN));
        pokemon.add(new ArmiranGreninja("Greninja", Aspect.ARMIRAN));

        //Vanguard
        pokemon.add(new AyreianFletchling("Fletchling", Aspect.AYREIAN));
        pokemon.add(new AyreianFletchinder("Fletchinder", Aspect.AYREIAN));
        pokemon.add(new AyreianPancham("Pancham", Aspect.AYREIAN));
        pokemon.add(new AyreianPangoro("Pangoro", Aspect.AYREIAN));
        pokemon.add(new AyreianCarbink("Carbink", Aspect.AYREIAN));
        pokemon.add(new AyreianKlefki("Klefki", Aspect.AYREIAN));
        pokemon.add(new AyreianPumpkaboo("Pumpkaboo", Aspect.AYREIAN));
        pokemon.add(new AyreianGourgeist("Gourgeist", Aspect.AYREIAN));
        pokemon.add(new AyreianNoibat("Noibat", Aspect.AYREIAN));
        pokemon.add(new AyreianNoivern("Noivern", Aspect.AYREIAN));

        //Phoenix Rising
        pokemon.add(new RelicSkiddo("Skiddo", Aspect.RELIC));
        pokemon.add(new RelicGogoat("Gogoat", Aspect.RELIC));

        //Kaskadian
        pokemon.add(new KaskadianBunnelby("Bunnelby", Aspect.KASKADIAN));
        pokemon.add(new KaskadianDiggersby("Diggersby", Aspect.KASKADIAN));
        pokemon.add(new KaskadianPhantump("Phantump", Aspect.KASKADIAN));
        pokemon.add(new KaskadianTrevenant("Trevenant", Aspect.KASKADIAN));
        pokemon.add(new KaskadianDiancie("Diancie", Aspect.KASKADIAN));

        //Pokemon Opalo
        pokemon.add(new CefiranKlefki("Klefki", Aspect.CEFIRAN));
    }
}
