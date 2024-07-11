package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.theos.Yolkoo;
import drai.dev.data.pokemon.theos.regional.*;
import drai.dev.data.pokemon.theos.regional.TheossianBellsprout;
import drai.dev.data.pokemon.theos.regional.TheossianFlabebe;
import drai.dev.data.pokemon.theos.regional.TheossianHoppip;
import drai.dev.data.pokemon.theos.regional.TheossianJumpluff;
import drai.dev.data.pokemon.theos.regional.TheossianSkiploom;
import drai.dev.data.pokemon.theos.regional.TheossianVictreebel;
import drai.dev.data.pokemon.theos.regional.TheossianWeepinbell;
import drai.dev.data.pokemon.theos.regional.TheossianYanma;
import drai.dev.data.pokemon.theos.regional.TheossianYanmega;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Theos extends drai.dev.data.games.registry.Game {
    public Theos() {
        super("Theos");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new TheossianSunflora("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianSpinarak("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianAriados("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianRaichu("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianMareep("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianFlaaffy("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianAmpharos("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianHoppip("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianSkiploom("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianJumpluff("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianTauros("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianMiltank("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianGrowlithe("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianArcanine("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianWooper("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianQuagsire("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianHeracross("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianVenonat("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianVenomoth("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianShinx("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianLuxio("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianLuxray("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianOddish("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianGloom("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianVileplume("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianBellossom("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianCroagunk("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianToxicroak("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianBellsprout("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianWeepinbell("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianVictreebel("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianYanma("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianYanmega("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianFlabebe("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianFloette("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianFlorges("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianCottonee("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianWhimsicott("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianPetilil("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianLilligant("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianDwebble("", Aspect.THEOSSIAN));
        pokemon.add(new TheossianCrustle("", Aspect.THEOSSIAN));
        pokemon.add(new Meowdow());
        pokemon.add(new Purrleo());
        pokemon.add(new Herculeo());
        pokemon.add(new Bullit());
        pokemon.add(new Bombull());
        pokemon.add(new Brassear());
        pokemon.add(new Hippony());
        pokemon.add(new Gallocamp());
        pokemon.add(new Aquastrian());
        pokemon.add(new Quillit());
        pokemon.add(new Quillistic());
        pokemon.add(new Kestling());
        pokemon.add(new Kestric());
        pokemon.add(new Falconik());
        pokemon.add(new Cricky());
        pokemon.add(new Crickick());
        pokemon.add(new Pestor());
        pokemon.add(new Punkosom());
//        pokemon.add(new Cupilla());   Missing Stats
        pokemon.add(new Silkute());
        pokemon.add(new Flutterfly());
        pokemon.add(new Squibble());
        pokemon.add(new Searell());
        pokemon.add(new Hopple());
        pokemon.add(new Hoppuff());
        pokemon.add(new Bunursery());
        pokemon.add(new Yolkoo()); //Renamed from Chickoo
        pokemon.add(new Cherishen());
        pokemon.add(new Roostuff());
        pokemon.add(new Sqworm());
        pokemon.add(new Tunnoworm()); //Renamed from Burroworm
        pokemon.add(new Ostoe());
        pokemon.add(new Ostretch());
        pokemon.add(new Fawnix());
        pokemon.add(new Foresteer());
        pokemon.add(new Moofy());
        pokemon.add(new Stoatic());
        pokemon.add(new Seedlee());
        pokemon.add(new Petalite());
        pokemon.add(new Mofly()); //Renamed from Humini
        pokemon.add(new Humoth());
        pokemon.add(new Carefeely());
        pokemon.add(new Quackle());
        pokemon.add(new Paraduck());
        pokemon.add(new Psychick());
        pokemon.add(new Psyfan());
        pokemon.add(new Magoo());
        pokemon.add(new Bugritty());
        pokemon.add(new Wizzip());
        pokemon.add(new Skeetle());
        pokemon.add(new Atlasect());
        pokemon.add(new Beetile());
        pokemon.add(new Trunklit());
        pokemon.add(new Smogophant());
        pokemon.add(new Grizzle());
        pokemon.add(new Grumbear());
        pokemon.add(new Cheekmunk());
        pokemon.add(new Chippunch());
        pokemon.add(new Nibblit());
        pokemon.add(new Lumbash());
        pokemon.add(new Moleer());
        pokemon.add(new Tremole());
        pokemon.add(new Crystone());
        pokemon.add(new Crysaur());
        pokemon.add(new Dinomond());
        pokemon.add(new Hoonoes());
        pokemon.add(new Younoes());
        pokemon.add(new Eyenoes());
        pokemon.add(new Zippit());
        pokemon.add(new Ampire());
        pokemon.add(new Venotrap()); //Renamed from Snaptrap
        pokemon.add(new Faupent());
        pokemon.add(new Shroolie());
        pokemon.add(new Pixcess());
        pokemon.add(new Elegantus());
        pokemon.add(new Slicoth()); //Renamed from Slowth
        pokemon.add(new Mosstire()); //Renamed from Mossloth
        pokemon.add(new Mantice());
        pokemon.add(new Mantislash());
        pokemon.add(new Howligoon());
        pokemon.add(new Boomian());
        pokemon.add(new Peckit());
        pokemon.add(new Luvzonica());
        pokemon.add(new Flossway());
        pokemon.add(new Dracopuff());
        pokemon.add(new Scalyx());
        pokemon.add(new Psyguana());
        pokemon.add(new Gulling());
        pokemon.add(new Parrate());
        pokemon.add(new Blobish());
        pokemon.add(new Decoyster());
    }

}
