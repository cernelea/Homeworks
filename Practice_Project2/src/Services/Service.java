package Services;

import com.tekwill.figuresTemplate.Figures;
import com.tekwill.figuresTemplate.Rectangles;
import com.tekwill.figuresTemplate.CalculationsRectangles;

public class Service implements Modifiable {

    private Figures[] rectangleList = new Rectangles[4];

    public void create(int index, int id, String name) {
        try {
            Figures rectangle = new Rectangles(id, name);

            rectangleList[index] = rectangle;

        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Too many object created in this array check again");

        }

    }

    public Figures find(int id) {
        for (int i = 0; i < rectangleList.length; i++) {

            if (rectangleList[i] != null && rectangleList[i].getId() == id) {

                return rectangleList[i];

            }

        }

        return null;

    }

    public Figures find(String name) {
        for (Figures rectangle : rectangleList) {

            if (rectangle != null && rectangle.getName() == name) {
                return rectangle;

            }

        }
        return null;

    }

    public Figures update(int id, int newId, String name) {
        Figures foundById = this.find(id);
        if (foundById != null) {

//            for (int i = 0; i < rectangleList.length; i++) {
//                if (rectangleList[i] != null && rectangleList[i].getId() == id) {
            foundById.setId(newId);

            foundById.setName(name);
            return foundById;

//                }
//            }
        }
        return null;
    }

    public void delete(int id, String name) {
        Figures foundById = this.find(id);
        Figures foundByName = this.find(name);
        if (foundById != null & foundByName != null) {
            for (int i = 0; i < rectangleList.length; i++) {
                if (rectangleList[i] != null && rectangleList[i].getId() == id & rectangleList[i].getName() == name) {

                    rectangleList[i] = null;

                }

            }

        }

    }

    public void showList() {
        for (int i = 0; i < rectangleList.length; i++) {
            System.out.println(rectangleList[i]);

        }

    }
    
    
    
    

}
