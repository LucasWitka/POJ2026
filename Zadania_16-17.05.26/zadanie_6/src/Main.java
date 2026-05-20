void main() {
    ChemicalElement tlen = new ChemicalElement("Oxygenium", "O", 8);
    ChemicalElement zinc = new ChemicalElement("Zinc", "Zn", 30);
    System.out.println(tlen.getName());
    System.out.println(tlen.getAtomicNumber());
    System.out.println(tlen.isATransitionMetal());
    System.out.println();
    System.out.println(zinc.getSymbol());
    System.out.println(zinc.isATransitionMetal());


}