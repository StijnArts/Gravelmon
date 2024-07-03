package drai.dev.gravelmon;

import com.cobblemon.mod.common.config.starter.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;

import java.util.*;

public class Gravelmon
{
	public static final String MOD_ID = "gravelmon";
	public static void init() {
		GravelmonBlocks.BLOCKS.register();
		GravelmonItems.ITEMS.register();
		gravelmonFormEvolutions();
		gravelmonStarterInjections();
	}

	private static void gravelmonStarterInjections() {
		GravelmonStarters.injectStarters();
	}

	private static void gravelmonFormEvolutions() {
		SpeciesManager.registerFormEvolution("sandslash alolan", new EvolutionEntry("sandridger alolan", EvolutionType.LEVEL_UP, List.of(),
				List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))));
	}
}
