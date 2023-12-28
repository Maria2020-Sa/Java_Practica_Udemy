import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private int contadorCliente;

    public Cliente (Date fechaRegistro, boolean vip){
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente (){
        return this.idCliente;
    }

    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }

    public void setFechaRegistro (Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    public boolean getVip (){
        return this.vip;
    }

    public void setVip (boolean vip){
        this.vip = vip;
    }

    public int getContadorCliente (){
        return contadorCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "\"\n\t\t\tCliente {" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                ", contadorCliente=" + contadorCliente +
                '}';
    }
}
