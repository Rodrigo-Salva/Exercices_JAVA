public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;//Es una constante ue hemos puesto y no se puede modificar
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    //Constantes para cada color
    public static final String  COLOR_ROJO = "Rojo";
    public static final String  COLOR_AMARILLO = "Amarillo";
    public static final String  COLOR_AZUL = "Azul";
    public static final String  COLOR_BLANCO = "Blanco";
    public static final String  COLOR_GRIS = "Gris Oscuro";

    //Constructor
    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor ) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    //Sobrecarga de constructor de todos los atributos
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    //Getters and Setters
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();//Solucionando problemas en nuesto codigo con un patron de diseño
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length){
            this.ruedas[indiceRuedas++] = rueda;//Es para incrementar las ruedas
         }
        return this;
    }
    /*En este caso se usa this.(El atributo), que sirve para poder diriguirnos al mismo atributo de la clases, en cambio
     en un metodo podemos usar el mismo nombre que del atributo y no pasario nada (en ese caso no se usa el 'this').....
      ---RECORDAR QUE MAYORMENTE SE USA SI HAY UNA VARIABLE IGUAL A LA DE LOS ATRIBUTOS*/

    public String verDetalle() {
        String detalle =   "id: " + this.id +
                "\nmazda.fabricante = " + this.getFabricante() +
                "\nmazda.modelo = " + this.getModelo();
        if (this.getTipo() != null){
            detalle +="\nAuto.Tipo: " + this.getTipo().getDescripcion();
        }
        if (this.getMotor() != null){
            detalle +="\nmazda.cilindrada = " + this.motor.getCilindrada();
        }
        detalle +="\nmazda.patenteColor = " + colorPatente +//Aqui estamos implementando el atributo estatico(static)
                "\nmazda.color = " + this.color;

        if (conductor != null){
            detalle += "\nConductor subaru: " + this.getConductor().toString();//Para poder invocar al conductor de subaru
        }

        if (getRuedas() != null){
            detalle += "\nRuedas del automovil: ";
            for (Rueda R: this.getRuedas()){
                detalle += "\nFabricante: " + R.getFabricante() + ", Aro: " + R.getAro() + ", Ancho: " + R.getAncho();
            }
        }
        return detalle;
    }


    //Metodo acelerar
    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rmp";
    }

    //Metodo frenar
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenado!";
    } 

    //Metodo convinando acelerar y frenar
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar +"\n" + frenar;
    }

    public double calcularConsumo(int km, double porcetajeBencina){
        return km/(this.getEstanque().getCapacidad() * porcetajeBencina);
    }

    public double calcularConsumo(int km, int porcetajeBencina){
        return km/(this.getEstanque().getCapacidad() * (porcetajeBencina)/100f);
    }

    public static double calcularConsumoEstatico(int km, int porcetajeBencina){
        return km/(Automovil.capacidadEstanqueEstatico * (porcetajeBencina)/100f);
    }

    //Metodo equals
    @Override//Sobre escribiendo un metodo(pero solo es informativo y documentacion)
    public boolean equals(Object obj) {
        if (this == obj){//Si son los mismos objetos solo que sea true
            return true;
        }
        if(!(obj instanceof Automovil)){//Esta parte sirve para poder comparar diferentes tipos de datos(peras con manzanas)
            return false;
        }
        Automovil automovil = (Automovil) obj;
        return (this.fabricante != null && this.modelo!= null
                && this.fabricante.equals(automovil.getFabricante())
                && this.modelo.equals(automovil.getModelo()));//En este apartado podemos comparar el modelo con el fabricante
    }

    @Override
    public String toString() {
        return this.id +" : " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.fabricante.compareTo(a.fabricante);
    }
}
