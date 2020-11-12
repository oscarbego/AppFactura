package app;

public class Pedido {

    //Accesos
    private Articulo arti;
    private int cantidad;
    private double importe;
    
    
    //Constructor
    public Pedido(int c, Articulo arti)
    {
        cantidad = c;
        this.arti = arti;
        importe = c * arti.precio_u;
    } 
    
    
//    public void setImporte(double importe)
//    {
//        this.importe = importe;
//    }
    
    
    public Articulo getArticulo()
    {
        return arti;
    }
    
    public int getCanti()
    {
        return cantidad;
    }
    
    public double getImporte()
    {
        return importe;
    }
    
    /*
        set = asigna

        get = lee 

    */
}
