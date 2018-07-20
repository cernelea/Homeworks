
import com.tekwill.figuresTemplate.CalculationsRectangles;
import com.tekwill.figuresTemplate.Figures;
import com.tekwill.figuresTemplate.Rectangles;

import Services.Service;
import Services.Modifiable;

public class App {

    public static void main(String[] args) {

        Service service = new Service();
        service.create(0, 20, "Patrat");
        service.create(1, 30, "Triunghi");
        service.create(2, 40, "Cerc");
        service.create(3, 50, "Pohui");
   
      
        service.showList();
        System.out.println("");

        Figures findRectangle = service.find("Patrat");
        System.out.println(findRectangle);
        System.out.println("");
        Figures findRectangle2 = service.find(40);
        System.out.println(findRectangle2);
        System.out.println("");

        service.update(50, 100, "romb");
        service.showList();
        System.out.println("update1");

        service.delete(100, "romb");
        service.showList();
        System.out.println("");
        service.delete(30, "Triunghi");
        service.showList();

        service.update(40, 80, "pohui");

        service.update(40, 80, "pohui");
        service.showList();
    }

}
