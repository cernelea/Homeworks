package homework.pkg12;

public class MainMethodClass {

    public static void main(String[] args) {

       

        TropicalTree coconutTree = new TropicalTree("Coconut Tree","Tap Roots", 300, "No braches(Palm family)", "pinnate leaves", "coconut");
        System.out.println();
        TimberUsage usage2=new TimberUsage("Sawn Timber"," House construction ");
        ConiferTree pineTree=new ConiferTree("Pine","Tap Roots",900,"Pseudo whorls","Colytedons","Monoecious","From temperate-arctic to semidesert",usage2);
    
        Tree tree1=new Tree();
        
    tree1.message();
    
    pineTree.message();
    
    }

}
