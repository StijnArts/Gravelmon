package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.daybreak.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.insurgence.delta.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.opalo.regional.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;

public class GenerationSix extends Game {
    public GenerationSix() {
        super("generation6");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new IonosianInkay(686));   Missing Art

        addNewPokemon(new NovranSkrelp("Skrelp", Aspect.NOVRAN));
        addNewPokemon(new NovranDragalge("Dragalge", Aspect.NOVRAN));

        addNewPokemon(new VaritasianFlabebe("Flabebe", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianFloette("Floette", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianPhantump("Phantump", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTrevenant("Trevenant", Aspect.VARITASIAN));

        addNewPokemon(new HizianLitleo("Litleo", Aspect.HIZIAN));
        addNewPokemon(new HizianPyroar("Pyroar", Aspect.HIZIAN));

//        pokemon.add(new AristosianLitleo(667)); Missing Art


        //Pokemon Insurgance
        addNewPokemon(new DeltaFroakie("Froakie", Aspect.DELTA));
        addNewPokemon(new DeltaFrogadier("Frogadier", Aspect.DELTA));
        addNewPokemon(new DeltaGreninja("Greninja", Aspect.DELTA));
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
        addNewPokemon(new DeltaHoopa("Hoopa", Aspect.DELTA));
        addNewPokemon(new DeltaHoopaUnleashed("Hoopa", Aspect.DELTA_UNLEASHED));

        //X-Species (Xenoverse)
        addNewPokemon(new GreninjaX("Greninja", Aspect.X));
        addNewPokemon(new AegislashX("Aegislash", Aspect.X));
        addNewPokemon(new SwirlixX("Swirlix", Aspect.X));
        addNewPokemon(new SlurpuffX("Slurpuff", Aspect.X));

        //Pokemon Blazing Emerald
        addNewPokemon(new HoennianGoomy("Goomy", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianClauncher("Clauncher", Aspect.SEVIIAN));
        addNewPokemon(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoibat("Noibat", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoivern("Noivern", Aspect.SEVIIAN));

        //Myth
        addNewPokemon(new MythianNoivern("Noivern", Aspect.MYTHIAN));

        //Daybreak
        addNewPokemon(new ArmiranFroakie("Froakie", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranFrogadier("Frogadier", Aspect.ARMIRAN));
        addNewPokemon(new ArmiranGreninja("Greninja", Aspect.ARMIRAN));

        //Vanguard
        addNewPokemon(new AyreianFletchling("Fletchling", Aspect.AYREIAN));
        addNewPokemon(new AyreianFletchinder("Fletchinder", Aspect.AYREIAN));
        addNewPokemon(new AyreianPancham("Pancham", Aspect.AYREIAN));
        addNewPokemon(new AyreianPangoro("Pangoro", Aspect.AYREIAN));
        addNewPokemon(new AyreianCarbink("Carbink", Aspect.AYREIAN));
        addNewPokemon(new AyreianKlefki("Klefki", Aspect.AYREIAN));
        addNewPokemon(new AyreianPumpkaboo("Pumpkaboo", Aspect.AYREIAN));
        addNewPokemon(new AyreianGourgeist("Gourgeist", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoibat("Noibat", Aspect.AYREIAN));
        addNewPokemon(new AyreianNoivern("Noivern", Aspect.AYREIAN));

        //Phoenix Rising
        addNewPokemon(new RelicSkiddo("Skiddo", Aspect.RELIC));
        addNewPokemon(new RelicGogoat("Gogoat", Aspect.RELIC));

        //Kaskadian
        addNewPokemon(new KaskadianBunnelby("Bunnelby", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDiggersby("Diggersby", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianPhantump("Phantump", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianTrevenant("Trevenant", Aspect.KASKADIAN));
        addNewPokemon(new KaskadianDiancie("Diancie", Aspect.KASKADIAN));

        //Pokemon Opalo
        addNewPokemon(new CefiranKlefki("Klefki", Aspect.CEFIRAN));
    }
}
