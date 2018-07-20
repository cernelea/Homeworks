package Services;

import com.tekwill.figuresTemplate.Figures;

public interface Modifiable {

    void create(int index, int id, String name);

    void delete(int id, String name);

//    void delete(int id);
//
//    void delete(String name);

    Figures find(int id);

    Figures find(String name);

    Figures update(int id, int newId, String name);

}
