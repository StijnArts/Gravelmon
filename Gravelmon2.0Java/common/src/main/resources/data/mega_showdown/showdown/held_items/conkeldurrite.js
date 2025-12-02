{
    name: "Conkeldurrite",
    spritenum: 620,
    megaStone: "conkeldurr-mega",
    megaEvolves: "conkeldurr",
    itemUser: ["conkeldurr"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10220: 760,
    gen: 6,
    isNonstandard: "Past"
}
