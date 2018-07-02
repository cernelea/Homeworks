
import com.tekwill.services.ShoeService;
import com.tekwill.services.Modifiable;
import com.tekwill.model.Product;

public class App {

    public static void main(String[] args) {

        Modifiable service = new ShoeService();

        service.create(0, "Nike", 49, " sport");
        service.create(1, "Reebok", 48, "casual");
        service.create(2, "Adidas", 48, "running");
        service.showShoeList();

        System.out.println("");

        Product findObject2 = service.find(1);
        System.out.println(findObject2 + "\t find operation by ID");
        System.out.println("");

        Product findByName = service.find("Nike");
        System.out.println(findByName + " Overloaded find operation by Name" + "\n ");

        Product updateObject3 = service.update(2, "Puma", 48.0, "Performance");

        System.out.println(updateObject3 + "\tUpdate operation");
        System.out.println("");

        Product deletee = service.delete(2);
        service.showShoeList();
        service.delete(1);
        service.showShoeList();
        service.delete(0);
        service.showShoeList();
        System.out.println("Delete operation");

    }

}
