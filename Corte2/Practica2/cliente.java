package inheritance;

import java.util.Date;

public class cliente extends person {
    private final int idcliente;
    private Date fechaRegsitro;
    private boolean vip;
    private static int contadorcliente;
    
    public cliente(Date fechaRegsitri, boolean vip, String nombre, 
            char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);
        this.idcliente = ++cliente.contadorcliente;
        this.fechaRegsitro = fechaRegsitri;
        this.vip = vip;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Es VIP: " + this.vip; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    public int getIdCliente() {
        return idcliente;
    }

    public Date getFechaRegsitri() {
        return fechaRegsitro;
    }

    public void setFechaRegsitri(Date fechaRegsitri) {
        this.fechaRegsitro = fechaRegsitri;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idcliente);
        sb.append(", fechaRegsitri=").append(this.fechaRegsitro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    } 
    
}
