package pruebagit;

import com.pruebagit.classes.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PruebaGit {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("pedro", "sanchez", 22));
        personas.add(new Persona("elver", "gonzales", 25));
        personas.add(new Persona("nicolas", "cage", 24));

        for (Persona p : personas) {
            String info = "nombre: "
                    + p.getNombre()
                    + " "
                    + "apellido: "
                    + p.getApellido()
                    + " "
                    + "edad: "
                    + p.getEdad().toString();
            JOptionPane.showMessageDialog(null, info);
        }

    }

}
