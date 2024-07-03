package drai.dev.gravelmon;

import com.cobblemon.mod.common.api.pokemon.*;
import com.cobblemon.mod.common.config.starter.*;
import drai.dev.gravelsextendedbattles.*;
import drai.dev.gravelsextendedbattles.starters.*;
import kotlin.*;
import org.apache.commons.lang3.*;

import java.util.*;

public class GravelmonStarters {
    public static void injectStarters() {
//        GravelmonStarterManager.registerNewStarter("Kanto", );
    }

    private static StarterCategoryDataHolder createCategory(String name, List<String> starters){
        return new StarterCategoryDataHolder(StringUtils.capitalize(name), "cobblemon.starterselection.category."+name.toLowerCase().replaceAll(" ",""),
                starters);
    }
}
