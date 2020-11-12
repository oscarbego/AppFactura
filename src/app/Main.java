package app;

public class Main {


    public static void main(String args [])
    {
        Articulo arti1 = new Articulo();
        
        arti1.nom = "Chocolate";
        arti1.precio_u = 10;
        arti1.descrip = "Chocolate Amargo";
        
        
        
        Articulo arti2 = new Articulo();
        
        arti2.nom = "Limonada";
        arti2.precio_u = 20;
        arti2.descrip = "Liminada para Llevar";
        
        
        Factura f1 = new Factura();
        
        
        f1.mostrarFactura();    
        System.out.println(".............................................");
        System.out.println("");
        
        f1.agregarPedido(10, arti1);
        f1.agregarPedido(1, arti2);
        
        
        f1.mostrarFactura();
        System.out.println(".............................................");
        System.out.println("");
        
        
        f1.actualizarPedido(0, arti1);
        
        
        f1.mostrarFactura();
        System.out.println(".............................................");
        System.out.println("");
        
        
        f1.eliminarPedido("Chocolate");
        
        
        f1.mostrarFactura();
        System.out.println(".............................................");
        System.out.println("");
        
    }
}
