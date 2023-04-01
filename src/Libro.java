public enum Libro {

    JHTP6("Java How to Program 6e","2005"),
    CHTP4("C How to Program 4e", "2004"),
    IW3HTP3("Internet & World Wide Wed How to Program 3e", "2004"),
    CPPHTP4("C++ How to Program 4e", "2003"),
    VBHTP("Visual Basic .NET How to Program 2e", "2002"),
    CSHARPHTP("C# How to Program", "2002");

    private final String titulo;
    private final String anioCopyrigth;

    Libro(String tituloLibro, String anio) {
        titulo = tituloLibro;
        anioCopyrigth = anio;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAnioCopyrigth(){
        return anioCopyrigth;
    }
}
