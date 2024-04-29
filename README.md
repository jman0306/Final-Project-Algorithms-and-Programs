# Final-Project-Algorithms-and-Programs
## Party planner
The program comprises a total of eight classes plus an executable, in which the functionality of the Fiesta class is tested but is not included in the final functionality of the program. The basic classes of the program are Person and Waiter, which are included in an array and a matrix whose attribute is the Fiesta class. In the Fiesta class, the Generic Array Handler class is used to add and remove a waiter, and the Generic Matrix Handler class is used to identify the largest one at the table. Finally, the Fiesta View class was created, which along with the Fiesta View Controller class and the Fiesta View Executable class, generates a functional graphical interface that solves the problem.

## UML Mesero
| Atributo     | Tipo    |
|--------------|---------|
| nombre       | String  |
| genero       | char    |
| mesa         | int     |

| Método                      | Tipo de retorno | Parámetros          |
|-----------------------------|-----------------|---------------------|
| Mesero(String, char, int)   | -               | nombre: String, genero: char, mesa: int |
| getMesa()                   | int             | -                   |
| getNombre()                 | String          | -                   |
| getGenero()                 | char            | -                   |
| setMesa(mesa: int)          | void            | mesa: int           |
| hasCode()                   | int             | -                   |
| equals(obj: Object)         | boolean         | obj: Object         |
| compareTo(otro: Mesero)     | int             | otro: Mesero        |
| toString()                  | String          | -                   |

## UML Persona
| Atributo     | Tipo    |
|--------------|---------|
| nombre       | String  |
| edad         | int     |
| edoCivil     | char    |

| Método                      | Tipo de retorno | Parámetros          |
|-----------------------------|-----------------|---------------------|
| Persona(String, int, char)  | -               | nombre: String, edad: int, edoCivil: char |
| getNombre()                 | String          | -                   |
| getEdad()                   | int             | -                   |
| getEdoCivil()               | char            | -                   |
| setEdoCivil(edoCivil: char) | void            | edoCivil: char      |
| hasCode()                   | int             | -                   |
| equals(obj: Object)         | boolean         | obj: Object         |
| compareTo(otra: Persona)    | int             | otra: Persona       |
| toString()                  | String          | -                   |

## UML Fiesta
| Atributo        | Tipo           |
|-----------------|----------------|
| nombre          | String         |
| direccion       | String         |
| lugares[][]     | Persona[][]    |
| meseros[]       | Mesero[]       |
| ocupados        | int            |
| MAXF            | final int      |
| MAXC            | final int      |

| Método                              | Tipo de retorno | Parámetros                                        |
|-------------------------------------|-----------------|---------------------------------------------------|
| Fiesta()                            | -               | -                                                 |
| Fiesta(String, String)              | -               | nombre: String, direccion: String                 |
| getNombre()                         | String          | -                                                 |
| getDireccion()                      | String          | -                                                 |
| getElementMatriz(fila: int, col: int) | String       | fila: int, col: int                               |
| getElementArreglo(lugar: int)       | String          | lugar: int                                        |
| hasCode()                           | int             | -                                                 |
| equals(obj: Object)                 | boolean         | obj: Object                                       |
| compareTo(otra: Fiesta)             | int             | otra: Fiesta                                      |
| toString()                          | String          | -                                                 |
| altaInvitado(nombre: String, edad: int, edoCivil: char) | boolean | nombre: String, edad: int, edoCivil: char   |
| bajaInvitado(nombre: String, edad: int) | boolean     | nombre: String, edad: int                         |
| altaMesero(nombre: String, genero: char, mesa: int) | boolean | nombre: String, genero: char, mesa: int      |
| bajaMesero(nombre: String, mesa int) | boolean        | nombre: String, mesa: int                         |
| indicaTotalInvitados()              | int             | -                                                 |
| indicaMayorPorMesa(mesa: int)       | String          | mesa: int                                         |
| encuentraAsiento(nombre: String, edad: int) | int [] | nombre: String, edad: int                         |
| retiraNoLlegaron()                  | boolean         | -                                                 |

## Implementation
When running the program, a window will appear containing in the upper left corner four labels with four text boxes, which will be used to enter the necessary information for some functions. In the upper right corner, there are some blue buttons indicating the functions they perform, such as: adding a waiter, removing a waiter, the assigned seat for each person, the total number of people at the event, the person with the oldest age, and one that says "clean," which is used to remove all the people who did not arrive from the matrix. There is also a blank field where all the information we request with the buttons will appear. Before filling in the fields, it is necessary to press the button that will be used to know which fields need to be filled. Finally, there are fields representing a matrix and an array, in which the names of the waiters appear in the case of the array, and the names of the people in the case of the matrix.

