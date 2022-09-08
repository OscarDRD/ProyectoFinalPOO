package Modelo;
import Vista.Error;
public class Empleado{
    private String cedula, celular, telFijo,numeroHorasExDiurnas,numeroHorasExNocturna;
    private String salarioBase,valorHora,valorHorasExDiurnas,valorHorasExNocturna,salario;
    private String subsidioTrnasporte;
    private String nombres,apellidos, genero, direccion,eMail,depto;
    Error ER=new Error();
    private String BaseDatos[][]= new String [100][17];

    public void setBaseDatos(String[][] BaseDatos) {
        this.BaseDatos = BaseDatos;
    }

    public String[][] getBaseDatos() {
        return BaseDatos;
    }
    
    public int Comprobar(){
        int num = 0;
            for(int j=0;j<100;j++){
               if(BaseDatos[j][0]==null || BaseDatos[j][0]==""){
                   num=j;
                   break;
               } 
            }
            System.out.println("NUMERO: "+num);    
            return num;
        }
        
    public void LlenarMatriz(int x){
            BaseDatos[x][0]=this.getCedula();
            BaseDatos[x][1]=this.getNombres();
            BaseDatos[x][2]=this.getApellidos();
            BaseDatos[x][3]=this.getCelular();
            BaseDatos[x][4]=this.getGenero();
            BaseDatos[x][5]=this.getDireccion();
            BaseDatos[x][6]=this.getTelFijo();
            BaseDatos[x][7]=this.geteMail();
            BaseDatos[x][8]=this.getDepto();
            BaseDatos[x][9]=this.getSalarioBase();
            BaseDatos[x][10]=this.getValorHora();
            BaseDatos[x][11]=this.getNumeroHorasExDiurnas();
            BaseDatos[x][12]=this.getNumeroHorasExNocturna();
            BaseDatos[x][13]=this.getValorHorasExDiurnas();
            BaseDatos[x][14]=this.getValorHorasExNocturna();
            BaseDatos[x][15]=this.getSubsidioTrnasporte();
            BaseDatos[x][16]=this.getSalario();
            setBaseDatos(BaseDatos);
        }
        
    public void Imprimir(){
            for(int j=0;j<100;j++){
                for(int i=0;i<17;i++){
                    System.out.print(BaseDatos[j][i]+" ");
                }
                 System.out.println();
            }           
        }
        
    public int Buscar(String x){ 
            int id=0;
            for(int j=0;j<100;j++){
                if(BaseDatos[j][0]==null){
                    ER.setError("NO EXISTE");
                    ER.setVisible(true);
                    id=-1;
                    break;
                }
                else if(BaseDatos[j][0].equals(x)){
                    id=j;
                    break;
                }
            }
            return id;
        }
    
    public void Eliminar(int y){
            BaseDatos[y][0]=null;
            BaseDatos[y][1]=null;
            BaseDatos[y][2]=null;
            BaseDatos[y][3]=null;
            BaseDatos[y][4]=null;
            BaseDatos[y][5]=null;
            BaseDatos[y][6]=null;
            BaseDatos[y][7]=null;
            BaseDatos[y][8]=null;
            BaseDatos[y][9]=null;
            BaseDatos[y][10]=null;
            BaseDatos[y][11]=null;
            BaseDatos[y][12]=null;
            BaseDatos[y][13]=null;
            BaseDatos[y][14]=null;
            BaseDatos[y][15]=null;
            BaseDatos[y][16]=null;
            setBaseDatos(BaseDatos);
            Imprimir();
        }
    
    
    public boolean ComprobarGuardar(String cedula){
        boolean finall=false;
        for(int j=0;j<100;j++){
               if(BaseDatos[j][0]==null|| BaseDatos[j][0]==""){
                   finall=false;
                   break;
               }else if(BaseDatos[j][0].equals(cedula)){
                   finall=true;
                   break;
               }
            }    
            return finall;
    }
    public void Intercambiar(int DondeEsta, int ultimooo){
         BaseDatos[ultimooo][0]=BaseDatos[DondeEsta][0];
         BaseDatos[ultimooo][1]=BaseDatos[DondeEsta][2];
         BaseDatos[ultimooo][2]=BaseDatos[DondeEsta][2];
         BaseDatos[ultimooo][3]=BaseDatos[DondeEsta][3];
         BaseDatos[ultimooo][4]=BaseDatos[DondeEsta][4];
         BaseDatos[ultimooo][5]=BaseDatos[DondeEsta][5];
         BaseDatos[ultimooo][6]=BaseDatos[DondeEsta][6];
         BaseDatos[ultimooo][7]=BaseDatos[DondeEsta][7];
         BaseDatos[ultimooo][8]=BaseDatos[DondeEsta][8];
         BaseDatos[ultimooo][9]=BaseDatos[DondeEsta][9];
         BaseDatos[ultimooo][10]=BaseDatos[DondeEsta][10];
         BaseDatos[ultimooo][11]=BaseDatos[DondeEsta][11];
         BaseDatos[ultimooo][12]=BaseDatos[DondeEsta][12];
         BaseDatos[ultimooo][13]=BaseDatos[DondeEsta][13];
         BaseDatos[ultimooo][14]=BaseDatos[DondeEsta][14];
         BaseDatos[ultimooo][15]=BaseDatos[DondeEsta][15];
         BaseDatos[ultimooo][16]=BaseDatos[DondeEsta][16];
         Eliminar(DondeEsta);
    }   
    public int Ubicar(){
        int id=0;
            for(int j=99;j>0;j--){
                if(BaseDatos[j][0]!=null){
                    id=j;
                    break;
                }
            }
            return id;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
        System.out.println("dato que llega: "+cedula);
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    public void setNumeroHorasExDiurnas(String numeroHorasExDiurnas) {
        this.numeroHorasExDiurnas = numeroHorasExDiurnas;
    }

    public void setNumeroHorasExNocturna(String numeroHorasExNocturna) {
        this.numeroHorasExNocturna = numeroHorasExNocturna;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setValorHora(String valorHora) {
        this.valorHora = valorHora;
    }

    public void setValorHorasExDiurnas(String valorHorasExDiurnas) {
        this.valorHorasExDiurnas = valorHorasExDiurnas;
    }

    public void setValorHorasExNocturna(String valorHorasExNocturna) {
        this.valorHorasExNocturna = valorHorasExNocturna;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public  void setSubsidioTrnasporte(String subsidioTrnasporte) {
        this.subsidioTrnasporte = subsidioTrnasporte;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelFijo() {
        return telFijo;
    }

    public String getNumeroHorasExDiurnas() {
        return numeroHorasExDiurnas;
    }

    public String getNumeroHorasExNocturna() {
        return numeroHorasExNocturna;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public String getValorHora() {
        return valorHora;
    }

    public String getValorHorasExDiurnas() {
        return valorHorasExDiurnas;
    }

    public String getValorHorasExNocturna() {
        return valorHorasExNocturna;
    }

    public String getSalario() {
        return salario;
    }

    public String getSubsidioTrnasporte() {
        return subsidioTrnasporte;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String geteMail() {
        return eMail;
    }

    public String getDepto() {
        return depto;
    }
}
