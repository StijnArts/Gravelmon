{
    name: "Weavilite",
    spritenum: 620,
    megaStone: "weavile-mega",
    megaEvolves: "weavile",
    itemUser: ["weavile"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10243: 760,
    gen: 6,
    isNonstandard: "Past"
}
