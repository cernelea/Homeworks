package homework.pkg12;

public class ConiferTree extends Tree {

    String cones,climate;;
  
    TimberUsage coniferUsage;

    ConiferTree(String treeType, String rootsType, int trunkType, String branchType, String leavesType, String cones, String climate, TimberUsage coniferUsage) {
        this.treeType = treeType;

        this.rootsType = rootsType;

        this.trunkType = trunkType;

        this.branchType = branchType;

        this.leavesType = leavesType;

        this.cones = fruits;

        this.climate = climate;

        this.coniferUsage = coniferUsage;
        System.out.println("Type of this tree is: " + treeType);
        System.out.println("Pine tree has this kind of parts:");
        System.out.println("Roots of this kind of tree are:  " + rootsType);
        System.out.println("Trunk of this kind of tree are:  " + trunkType + "  mm");
        System.out.println("Branch of this kind of tree are:  " + branchType);
        System.out.println("Leaves of this kind of tree are:  " + leavesType);
        System.out.println();
        System.out.println("This tree has this kind of cones: " + cones);
        System.out.println("We can find this type of tree in regions with this climate: " + climate);

        System.out.println();
        System.out.println("Type of timber is: " + coniferUsage.timberType);
        System.out.println("Timber of this kind of tree is used in: " + coniferUsage.timberUsage);
        System.out.println();

    }

    public void message() {
        System.out.println("The name of the class is :" + this.getClass().getSimpleName() + " Hi  All");

    }

}
