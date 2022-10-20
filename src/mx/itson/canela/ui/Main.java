/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.canela.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.canela.entidades.Ingrediente;
import mx.itson.canela.entidades.Paso;
import mx.itson.canela.entidades.Receta;
import mx.itson.canela.entidades.Usuario;
import mx.itson.canela.enumeradores.Dificultad;

/**
 *
 * @author julio
 */
public class Main {

    public static void main(String[] args) {
        // Comentario para ver si github funciona
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescripcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setTiempo(62);

        List<Ingrediente> ingrediente = new ArrayList<>();

        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        ingrediente.add(ingrediente1);
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        ingrediente.add(ingrediente2);
        
        receta.setIngredientes(ingrediente);
        
        List<Paso> paso = new ArrayList<>();
        
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescripcion("Horno precalentado a 180 °C.");
       
        Paso paso2 = new Paso();
        paso2.setOrden(2);
        paso2.setDescripcion("Mezcla la harina para brownies chocolate Fudge de Betty Crocker® con el agua, el aceite y los huevos. Vierte la mezcla en un molde cuadrado de 30 x 20 cm previamente en harinado y hornea a 180 °C durante 25 minutos. Retira del horno y enfría.");
        
        Paso paso3 = new Paso();
        paso3.setOrden(3);
        paso3.setDescripcion(" Bate el queso crema con la Leche Condensada LA LECHERA®, la ralladura de limón, la mantequilla y un poco de colorante hasta integrar por completo y refrigera por 20 minutos.");
       
        Paso paso4 = new Paso();
        paso4.setOrden(4);
        paso4.setDescripcion(" Desmolda y corta en cuadros. Unta los brownies con un poco de betún; dibuja el cabello y la boca con el chocolate fundido, coloca los ojos de azúcar y la nariz con las lunetas. Ofrece.");
        
        receta.setPasos(paso);
        
        receta.setDificultad(Dificultad.FACIL);
       
        Usuario usuario = new Usuario();
        usuario.setNombre("Rodolfo");
        usuario.setCorreoElectronico("rodolfoelreno@gmail.com");
        usuario.setContrasena("hesoyam");
        
        receta.setUsuario(usuario);
        
        
        System.out.println("*** RECETAS NESTLE ***");
        System.out.println("Subido por: "+receta.getUsuario().getNombre());
        System.out.println(receta.getNombre());
        System.out.println(receta.getDescripcion());
        System.out.println("Porciones: "+receta.getNumeroPorciones());
        System.out.println("Tiempo de preparacion: "+receta.getTiempo()+ "minutos");
        
        System.out.println("Pasos:");
        for(Paso p : receta.getPasos()){
            System.out.println(p.getOrden()+".-"+p.getDescripcion());
        }
        
        System.out.println("Ingredientes:");
        for(Ingrediente i : receta.getIngredientes()){
            System.out.println("-"+i.getNombre());
        }
        
    }
}
