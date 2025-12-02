{
    name: "Epochblastoisite",
    spritenum: 620,
    megaStone: "blastoise-epoch_mega",
    megaEvolves: "blastoise",
    itemUser: ["blastoise"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== epoch)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10143: 760,
    gen: 6,
    isNonstandard: "Past"
}
