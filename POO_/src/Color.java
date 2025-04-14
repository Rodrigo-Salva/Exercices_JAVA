public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarrillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranjo");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color; //El toString sirve para darle una representacion al valor de cada constante
    }
}
