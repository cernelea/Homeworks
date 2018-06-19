package homework.pkg12;

public class TropicalTree extends Tree {

    String fruits;
  

    TropicalTree(String treeType,String rootsType, int trunkType, String branchType, String leavesType, String fruits) {
        this.treeType=treeType;
        
        this.rootsType = rootsType;

        this.trunkType = trunkType;

        this.branchType = branchType;

        this.leavesType = leavesType;

        this.fruits = fruits;
        
        System.out.println("Type of this tree is  " + treeType);
         System.out.println("Tropical tree has this kind of parts:");
        System.out.println("Roots of this kind of tree are:  " + rootsType);
        System.out.println("Trunk of this kind of tree are:  " + trunkType + "  mm");
        System.out.println("Branch of this kind of tree are:  " + branchType);
        System.out.println("Leaves of this kind of tree are:  " + leavesType);

        System.out.println("This tree has this kind of fruits: " + fruits);

    
    }
    
    
    
    
 

}
