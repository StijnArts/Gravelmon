package drai.dev.data.games.pokemmo;


import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.theos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Theos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Theos();
    private Theos() {
        super("Theos");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new TheossianRaichu("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianTauros("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianGrowlithe("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianArcanine("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianVenonat("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianVenomoth("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianOddish("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianGloom("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianVileplume("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianBellsprout("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianWeepinbell("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianVictreebel("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianSunflora("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianSpinarak("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianAriados("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianMareep("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianFlaaffy("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianAmpharos("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianHoppip("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianSkiploom("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianJumpluff("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianMiltank("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianWooper("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianQuagsire("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianHeracross("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianBellossom("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianYanma("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianShinx("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianLuxio("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianLuxray("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianCroagunk("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianToxicroak("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianYanmega("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianCottonee("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianWhimsicott("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianPetilil("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianLilligant("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianDwebble("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianCrustle("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianFlabebe("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianFloette("", Aspect.THEOSSIAN));
        addNewPokemon(new TheossianFlorges("", Aspect.THEOSSIAN));

        addNewPokemon(new Meowdow());
        addNewPokemon(new Purrleo());
        addNewPokemon(new Herculeo());
        addNewPokemon(new Bullit());
        addNewPokemon(new Bombull());
        addNewPokemon(new Brassear());
        addNewPokemon(new Hippony());
        addNewPokemon(new Gallocamp());
        addNewPokemon(new Aquastrian());
        addNewPokemon(new Quillit());
        addNewPokemon(new Quillistic());
        addNewPokemon(new Kestling());
        addNewPokemon(new Kestric());
        addNewPokemon(new Falconik());
        addNewPokemon(new Cricky());
        addNewPokemon(new Crickick());
        addNewPokemon(new Pestor());
        addNewPokemon(new Punkosom());
        addNewPokemon(new Cupilla());
        addNewPokemon(new Silkute());
        addNewPokemon(new Flutterfly());
        addNewPokemon(new Squibble());
        addNewPokemon(new Searell());
        addNewPokemon(new Hopple());
        addNewPokemon(new Hoppuff());
        addNewPokemon(new Bunursery());
        addNewPokemon(new Yolkoo()); //Renamed from Chickoo
        addNewPokemon(new Cherishen());
        addNewPokemon(new Roostuff());
        addNewPokemon(new Sqworm());
        addNewPokemon(new Tunnoworm()); //Renamed from Burroworm
        addNewPokemon(new Ostoe());
        addNewPokemon(new Ostretch());
        addNewPokemon(new Fawnix());
        addNewPokemon(new Foresteer());
        addNewPokemon(new Moofy());
        addNewPokemon(new Stoatic());
        addNewPokemon(new Seedlee());
        addNewPokemon(new Petalite());
        addNewPokemon(new Mofly()); //Renamed from Humini
        addNewPokemon(new Humoth());
        addNewPokemon(new Carefeely());
        addNewPokemon(new Quackle());
        addNewPokemon(new Paraduck());
        addNewPokemon(new Psychick());
        addNewPokemon(new Psyfan());
        addNewPokemon(new Magoo());
        addNewPokemon(new Bugritty());
        addNewPokemon(new Wizzip());
        addNewPokemon(new Skeetle());
        addNewPokemon(new Atlasect());
        addNewPokemon(new Beetile());
        addNewPokemon(new Trunklit());
        addNewPokemon(new Smogophant());
        addNewPokemon(new Grizzle());
        addNewPokemon(new Grumbear());
        addNewPokemon(new Cheekmunk());
        addNewPokemon(new Chippunch());
        addNewPokemon(new Nibblit());
        addNewPokemon(new Lumbash());
        addNewPokemon(new Moleer());
        addNewPokemon(new Tremole());
        addNewPokemon(new Crystone());
        addNewPokemon(new Crysaur());
        addNewPokemon(new Dinomond());
        addNewPokemon(new Hoonoes());
        addNewPokemon(new Younoes());
        addNewPokemon(new Eyenoes());
        addNewPokemon(new Zippit());
        addNewPokemon(new Ampire());
        addNewPokemon(new Venotrap()); //Renamed from Snaptrap
        addNewPokemon(new Faupent());
        addNewPokemon(new Shroolie());
        addNewPokemon(new Pixcess());
        addNewPokemon(new Elegantus());
        addNewPokemon(new Slicoth()); //Renamed from Slowth
        addNewPokemon(new Mosstire()); //Renamed from Mossloth
        addNewPokemon(new Mantice());
        addNewPokemon(new Mantislash());
        addNewPokemon(new Howligoon());
        addNewPokemon(new Boomian());
        addNewPokemon(new Peckit());
        addNewPokemon(new Luvzonica());
        addNewPokemon(new Flossway());
        addNewPokemon(new Dracopuff());
        addNewPokemon(new Scalyx());
        addNewPokemon(new Psyguana());
        addNewPokemon(new Gulling());
        addNewPokemon(new Parrate());
        addNewPokemon(new Blobish());
        addNewPokemon(new Decoyster());
    }

}
