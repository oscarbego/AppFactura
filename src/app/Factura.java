package app;

import java.util.Date;

public class Factura {

    //Datos de la empresa    
    //Empresa empresa;
    
    public String folio = "";
    public Date fecha = new Date();
    
    public Cliente cliente;
    
    public Pedido lista_pedidos [] = new Pedido[10];
 
    public double subTotal;
    public double iva;
    public double total;
    
    // le voy a cambiar el nombre a agregarPedido_2
    private void agregarPedido_2(int canti, Articulo arti)
    {
        canti = Math.abs(canti);
        
        if(canti >= 1)
        {
            Pedido p = new Pedido(canti, arti);

            for(int i = 0; i < lista_pedidos.length; i++)
            {
                if(lista_pedidos[i] == null)
                {
                    lista_pedidos[i] = p;
                    break;
                }
            }

            subTotal += p.getImporte();
            iva = .16 * subTotal;
            total = iva + subTotal;
        }
    }
    
    
    public void eliminarPedido(String nom)
    {
        Pedido p = null;
        
        for(int i = 0; i < lista_pedidos.length; i++)
        {
            if( lista_pedidos[i] != null && lista_pedidos[i].getArticulo().nom.equals(nom))
            {
                p = lista_pedidos[i];
                lista_pedidos[i] = null;
                break;
            }
        }
        
        if(p != null){
            
            subTotal -= p.getImporte();
            iva = .16 * subTotal;
            total = iva + subTotal;
        }
        
    }
    
    // le voy a cambiar el nombre a agregarPedido
    public void agregarPedido(int canti, Articulo arti)
    {
        canti = Math.abs(canti);
        
        eliminarPedido(arti.nom);
        
        if(canti >= 1)
            agregarPedido_2(canti, arti);
    }
    
    
    public void mostrarFactura()
    { 
        if(cliente != null)
        {
            System.out.println("Datos del Cleinte: ");
            System.out.println("Nombre: " + cliente.nombre);
            System.out.println("RFC: " + cliente.rfc);
        }
        
        System.out.println("-------------------------------");
        System.out.println("Lista de Articulos de la Factura");
        
        System.out.print("Cantidad | ");
        System.out.print(" Nombre | ");
        System.out.print(" Precio/U | ");
        System.out.println(" Importe ");
        System.out.println("");
        
        for(int i = 0; i < lista_pedidos.length; i++)
        {
            if(lista_pedidos[i] != null)
            {
                System.out.print(lista_pedidos[i].getCanti() + "  ");
                System.out.print(lista_pedidos[i].getArticulo().nom + "  ");
                System.out.print(lista_pedidos[i].getArticulo().precio_u + "  ");
                System.out.println(lista_pedidos[i].getImporte() + "  ");
            }
        }
        
        System.out.println("");
        
        System.out.println("SubTotal: " + subTotal);        
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
    
    }
    
}


/*
    

    | cantidad | nombre del producto | precio / u | importe |
     -------------------------------------------------------
        10        Chocolate                 10         100




    ---------------------------------------------------------
                                                SubTotal $100
                                                IVA      $16
                                                Total    $116
*/




