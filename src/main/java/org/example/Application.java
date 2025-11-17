import java.util.Scanner;
public class Application {
    static Scanner sc = new Scanner(System.in);
    static String usuario;
    static String nnombre;
    static String allnombre;
    static String nivel;


    public static void main(String[] args) {
        /*Bienvenida*/
        char simbolo = (char) 42;
        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                ║");
        System.out.println("║  L     I  N     N    GGGG     OOO     L     Y     N     N      ║");
        System.out.println("║  L     I  N N   N   G        O   O    L     Y     N N   N      ║");
        System.out.println("║  L     I  N  N  N   G  GG    O   O    L     Y     N  N  N      ║");
        System.out.println("║  L     I  N   N N   G   G    O   O    L     Y     N   N N      ║");
        System.out.println("║  LLLL  I  N     N    GGG      OOO     LLL   Y     N     N      ║");
        System.out.println("║                                                                ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝");
        System.out.println("+=====================================================+");
        System.out.println("║               ¡Bienvenido a Lingolyn!               ║");
        System.out.println("+=====================================================+");
        registro();
        moduloGeneral();
    }

    public static void registro(){
        System.out.println("Por favor, ingresa tu nombre (como quieres que te llamemos");
        usuario = sc.nextLine();
    }

    public static void moduloGeneral() {
        /*Preguntar que desea practicar*/
        int opcionprincipal;
        System.out.println("Hola " + usuario + ", ¿Qué modo deseas practicar? ");
        System.out.print("1. Spelling Bee (deletreo)\n2. Vocabulario (ampliar palabras)\nElige 1 o 2: ");
        /*leer que desea practicar*/
        do {
            opcionprincipal = sc.nextInt();
            switch (opcionprincipal) {
                case 1:
                    nivel="el nivel";
                    System.out.println(usuario + ", elegiste: Spelling Bee.");

                    /*DECLARACION DE NIVELES SPELLING BEE*/
                    String [] nsbBasico = {"add", "eye", "ear", "boat", "happy", "lion", "night", "milk", "uncle", "thank"};
                    String [] nsbMedio = {"chef", "brush", "sister", "desert", "kitchen", "Monday", "breakfast", "horse", "quite", "listen"};
                    String [] nsbNormal = {"intelligent", "incredible", "classmate", "celebration", "scissors", "television", "kilometer", "diagram", "January", "Mexican"};
                    String [] nsbDificil = {"disappear", "apologize", "appreciate", "immediately", "knock", "license", "weigh", "rhyme", "multimedia", "mysterious"};
                    String [] nsbExpert = {"embarrass", "puncture", "sustainable", "acknowledge",  "wriggle", "grease", "harass", "puncture", "deceive", "guarantee"};

                    int nivelSpellingBee;

                    System.out.println("Ingresa el nivel que deseas cursas (recuerda que se dara por hecho que ya has cursado los niveles anterirores a él):");
                    System.out.println("1- Básico\n2- Medio\n3- Normal\n4- Difícil\n5- Expert");

                    do {
                        nivelSpellingBee = sc.nextInt();
                        switch (nivelSpellingBee) {
                            case 1:
                                nnombre = "Básico";
                                break;
                            case 2:
                                nnombre = "Medio";
                                break;
                            case 3:
                                nnombre = "Normal";
                                break;
                            case 4:
                                nnombre = "Difícil";
                                break;
                            case 5:
                                nnombre = "Expert";
                                break;
                            default:
                                System.out.print("Opción invalida. Ese número no corresponde a ningún nivel. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while(nivelSpellingBee<1 || nivelSpellingBee>5);

                    /*Preguntar modalidad Spelling Bee */
                    System.out.print("Ahora elige la modalidad\n1. Modalidad Tradicional\n2. Modalidad Retos y Juegos\nIngresa 1 o 2: ");
                    int modalidadSpellingBee;
                    /*leer modalidad Spelling Bee*/
                    do {
                        modalidadSpellingBee = sc.nextInt();
                        switch (modalidadSpellingBee) {
                            case 1:
                                allnombre = "Spellin Bee Modalidad Tradicional";
                                modalidadTradicionalSpellingBee();
                                break;
                            case 2:
                                modalidadRetosyJuegosSpellingBee();
                                break;
                            default:
                                System.out.print("Opción invalida, debes ingresar 1 o 2. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while (modalidadSpellingBee != 1 && modalidadSpellingBee != 2);
                    break;

                case 2:
                    nivel ="la categoría gramatical";
                    /*Preguntar modalidad Vocabulario*/
                    System.out.println(usuario + ", elegiste: Vocabulario.");

                    /*DECLARACION DE NIVELES SPELLING BEE*/
                    String [] nvVerbo = {"manage", "expect", "suggest", "borrow", "lend", "give up", "happen", "improve", "worry", "look for"};
                    String [] nvSustantivo = {"career", "skill", "knowledge", "solution", "environment", "experience", "luggage", "customer", "opinion", "traffic"};
                    String [] nvPreposiciones = {"across", "against", "through", "except for", "towards", "unlike", "in spite of", "by", "during", "untill"};
                    String [] nvAdjetivos = {"crowded", "comfortable", "polite", "rude", "easy", "available", "necessary", "successful", "tired", "exciting"};
                    String [] nvExpresionescomunes = {"I suppose so", "hold on a minute", "never mind", "to be honest", "looking forward to", "how about", "by the way", "at least", "as far as I know", "it's up to you"};

                    int nivelVocabulario;
                    System.out.println("Ingresa la categoría gramatical que deseas estudiar (recuerda que se dara por hecho que ya has cursado las categorías gramaticales anterirores a ella):");
                    System.out.println("1.Verbo\n" + "2.Sustantivo\n" + "3.Preposiciones\n" + "4.Adjetivos\n" + "5.Expresiones comunes");

                    do {
                        nivelVocabulario= sc.nextInt();
                        switch (nivelVocabulario) {
                            case 1:
                                nnombre = "Verbo";
                                break;
                            case 2:
                                nnombre = "Sustantivo";
                                break;
                            case 3:
                                nnombre = "Preposiciones";
                                break;
                            case 4:
                                nnombre = "Adjetivos";
                                break;
                            case 5:
                                nnombre = "Expresiones comunes";
                                break;
                            default:
                                System.out.print("Opción invalida. Ese número no corresponde a ninguna categoría gramatical. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while(nivelVocabulario<1 || nivelVocabulario>5);

                    /*Preguntar modalidad Spelling Bee */
                    System.out.print("Ahora elige la modalidad\n1. Modalidad Tradicional\n2. Modalidad Juegos\nIngresa 1 o 2: ");
                    int modalidadVocabulario;
                    /*Leer modalidad Vocabulario*/
                    do {
                        modalidadVocabulario = sc.nextInt();
                        switch (modalidadVocabulario) {
                            case 1:
                                allnombre ="Vocabulario Modalidad Tradicional";
                                modalidadTradicionalVocabulario();
                                break;
                            case 2:
                                modalidadJuegosVocabulario();
                                break;
                            default:
                                System.out.print("Opción invalida, Esa opción no corresponde a ninguna modalidad. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while (modalidadVocabulario != 1 && modalidadVocabulario != 2);
                    break;
                default:
                    System.out.print("Opción invalida, debes ingresar 1 o 2. Intenta de nuevo: ");
            }
        }
        while (opcionprincipal != 1 && opcionprincipal != 2);
    }

    public static void pause(long ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException e){}
    }

    public static void contador(){
        pause(4000);
        System.out.println("¿Estas list@?...");
        sc.nextLine();
        sc.nextLine();
        System.out.println("Mucha Suerte!!");
        pause(800);
        System.out.println("Ronda Inicia en...");
        pause(1200);
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            pause(1200);
        }
        System.out.println("Inicia!!");
    }

    public static void bienvenida(){
        pause(800);
        System.out.println("cargando instrucciones...");
        pause(1500);
        System.out.println("¡Bienvenid@ " + usuario + " :D!\nA continuación iniciará la ronda de "+ allnombre + ", en "+ nivel +" "+ nnombre);
        System.out.println("Instrucciones:");
    }

    public static void modalidadTradicionalSpellingBee() {
        bienvenida();
        System.out.println("1- Se te mostrará la traducción, la definición en inglés de una palabra, o una oración con un espacio en blanco donde falta la palabra.\n2- Escribe la palabra en inglés correcta que corresponda a lo que se muestra.\n 3- Cada intento recibirá retroalimentación inmediata para saber si acertaste o no.\n4- Al terminar la ronda, verás un resumen con tus aciertos y errores para evaluar tu desempeño.");
        contador();
    }

    public static void modalidadRetosyJuegosSpellingBee() {
        System.out.println("Has elegido la Modalidad Retos y Juegos, en el nivel " + nnombre);
        System.out.println("¿Deseas cursar 1- Retos o 2-Juegos?");
        int sbRetoJuego;
        do{
            sbRetoJuego= sc.nextInt();
            switch (sbRetoJuego){
                case 1:
                    System.out.println("¡Excelente decisión! Ahora porfavor ingresa el numero de reto que te gustaría jugar\n1- Deletreo Rápido\n2- Desafío de Precisión");
                    int sbReto;
                    do{
                        sbReto = sc.nextInt();
                        switch (sbReto){
                            case 1:
                                allnombre ="reto Deletreo Rápido";
                                sbrDeletreoRapido();
                                break;
                            case 2:
                                allnombre ="reto Desafio de Precisión";
                                sbrDesafioPrecision();
                                break;
                            default:
                                System.out.print("Opción invalida. Ese número no corresponde a ningun reto. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while(sbReto < 1 || sbReto > 3);
                    break;
                case 2:
                    System.out.println("¡Excelente decisión! Ahora porfavor ingresa el numero de juego que te gustaría jugar\n1- Ahorcado\n2- Completar letras faltantes\n3- Ordenar letras");
                    int sbJuego;
                    do{
                        sbJuego = sc.nextInt();
                        switch (sbJuego){
                            case 1:
                                allnombre ="juego Ahorcado";
                                sbjAhorcado();
                                break;
                            case 2:
                                allnombre ="juego Completar Letras Faltantes";
                                sbjCompletarLetrasFaltantes();
                                break;
                            case 3:
                                allnombre ="juego Ordenar Letras";
                                sbjOrdenarLetras();
                                break;
                            default:
                                System.out.print("Opción invalida. Ese número no corresponde a ningun juego. Intenta de nuevo: ");
                                break;
                        }
                    }
                    while(sbJuego < 1 || sbJuego > 3);
                    break;
                default:
                    System.out.print("Opción invalida. Ese número no corresponde a ninguna opcion. Intenta de nuevo: ");
                    break;
            }
        }
        while(sbRetoJuego!= 1 && sbRetoJuego != 2);
    }

    public static void sbrDeletreoRapido(){
        bienvenida();
        System.out.println("En este reto deberás:\n-Escribir la mayor cantidad de palabras correctamente en 3 minutos.\n-Escribir cada palabra en inglés a partir de su traducción al español, de manera consecutiva, antes de pasar a la siguiente. \n-Al terminar el tiempo, revisar un resumen de resultados que muestra tus aciertos, errores y palabras falladas.");
        contador();
    }

    public static void sbrDesafioPrecision(){
        bienvenida();
        System.out.println("En este reto deberás:\n-Deletrear la mayor cantidad de palabras posible, pero solo puedes cometer tres errores.\n-Cuando cometas el tercer error, el reto terminará automáticamente y verás un resumen con tus aciertos y errores.\n-Este reto te ayudará a mejorar tu precisión y concentración mientras escribes.");
        contador();
    }

    public static void sbjAhorcado(){
        bienvenida();
        System.out.println("En este juego deberás:\n"+ "1. Adivinar la palabra letra por letra, completándola antes de que se terminen tus intentos.\n" + "2. Cada letra correcta se mostrará en su posición correspondiente, mientras que los errores se contabilizan.\n" + "3. Recibirás retroalimentación inmediata, y si no logras adivinar la palabra, al finalizar se mostrará la palabra completa.");
        contador();
    }

    public static void sbjCompletarLetrasFaltantes(){
        bienvenida();
        System.out.println("En este juego deberás:\n1. Completar la palabra escribiendo las letras que faltan en los espacios correspondientes.\n2. Cada intento recibirá retroalimentación inmediata, y se contabilizarán tus aciertos y errores.\n3. Presta atención a la posición de cada letra, ya que solo contará si la colocas en el lugar correcto.");
        contador();
    }

    public static void sbjOrdenarLetras(){
        bienvenida();
        System.out.println("En este juego deberás:\n1. Recibirás una palabra con las letras desordenadas y deberás escribirla en su forma correcta.\n2. Cada intento recibirá retroalimentación inmediata, y se contabilizarán tus aciertos y errores.");
        contador();
    }

    public static void modalidadTradicionalVocabulario(){
        bienvenida();
        System.out.println("En cada ronda, usted deberá:\n1- Escribir el significado en español de una palabra que se muestre en inglés,\n2- Escribir la palabra en inglés a partir de su significado en español, o\n3- Seleccionar la traducción correcta entre varias opciones.\nAdemás:\nCada palabra incluirá ejemplos contextualizados, como frases o fragmentos de conversación, para ayudarle a comprender y usar correctamente el vocabulario.\nRecibirá retroalimentación inmediata en cada intento, y al finalizar un nivel o categoría, podrá revisar un resumen con sus aciertos y errores.\nLas palabras que no domine serán retomadas automáticamente por el sistema en repaso.");
        contador();
    }

    public static void modalidadJuegosVocabulario() {
        System.out.println("Has elegido la Modalidad Juegos, en el nivel " + nnombre);
        int vjuego;
        System.out.println("Ingresa el juego que te gustaría jugar\n1- Palabras relacionadas\n2- Completar oraciones\n3- Adivinar la palabra");
        do{
            vjuego= sc.nextInt();
            switch (vjuego){
                case 1:
                    allnombre = "juego Palabras Relacionadas";
                    vjPalabrasRelacionadas();
                    break;
                case 2:
                    allnombre = "juego Completar Oraciones";
                    vjCompletarOraciones();
                    break;
                case 3:
                    allnombre = "juego Adivinar Palabras";
                    vjAdiviniarPalabras();
                    break;
                default:
                    System.out.print("Opción invalida. Ese número no corresponde a ningun juego. Intenta de nuevo: ");
                    break;
            }
        }
        while(vjuego<1 || vjuego>3);
    }

    public static void vjPalabrasRelacionadas(){
        bienvenida();
        System.out.println("En este juego deberás:\n1. Escribir el sinónimo o antónimo en inglés de la palabra que se te presente, según indique el ejercicio.\n2. La respuesta correcta debe ser una palabra que ya hayas aprendido previamente en el submódulo de vocabulario, modalidad tradicional.\n3. Cada intento recibirá retroalimentación inmediata, indicándote si acertaste o no.\n4. Al finalizar el juego, verás un resumen de resultados con tus aciertos y errores, para identificar qué palabras necesitas repasar.");
        contador();
    }

    public static void vjCompletarOraciones(){
        bienvenida();
        System.out.println("En este juego deberás:\n1. Completar oraciones incompletas en inglés escribiendo la palabra correcta en los espacios, usando el vocabulario que ya has aprendido.\n2. El sistema validará tu respuesta en tiempo real, indicándote si es correcta o incorrecta.\n3. Al finalizar cada ronda, verás un resumen de resultados con tus aciertos y errores, para reforzar las palabras que aún no dominas.");
        contador();
    }

    public static void vjAdiviniarPalabras() {
        bienvenida();
        System.out.println("En este juego deberás:\n1. Adivinar la palabra en inglés que se te presenta escribiéndola correctamente, usando las pistas que recibas.\n2. Cada intento recibirá retroalimentación inmediata, y si fallas, el sistema mostrará la palabra correcta.\n3. Al finalizar la ronda, verás un resumen de resultados con tus aciertos y errores.");
        contador();
    }

}
