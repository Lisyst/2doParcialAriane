package data.models;

public class Product {
  private String nombre;
  private String descripcion;
  private String tipo;
  private String precio;
  public Product(String nombre, String descripcion, String tipo, String precio) {
      this.nombre= nombre;
      this.descripcion = descripcion;
      this.tipo = tipo;
      this.precio = precio;
  }

  public String getNombre() {
      return nombre;
  }
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }
  public String getDescripcion() {
      return descripcion;
  }
  public void setEmail(String descripcion) {
      this.descripcion = descripcion;
  }
  public String getTipo() {
      return tipo;
  }
  public void setTipo(String tipo) {
      this.tipo = tipo;
  }
  public String getPrecio() {
      return precio;
  }
  public void setPrecio(String precio) {
      this.precio= precio;
  }
  // methods
  @Override
  public String toString() {
      return this.nombre + "," + this.descripcion + "," + this.tipo + "," + this.precio;
  }
  
}
  

