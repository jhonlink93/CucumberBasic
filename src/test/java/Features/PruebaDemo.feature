Feature:Escenarios de prueba prueba de ingreso en la pagina demoqa

  Scenario Outline: Crea elemento en la tabla y permite eliminar cualquiera
    Given  El usuario ingresa a la pagina demoqa
    And Selecciona el card con la opcion elements
    And Da click en la opcion WebTables
    And Da click en el boton Add
    And Llena el formulario <primerNombre>, <apellido>, <email>, <edad>, <salario>, <departamento>
    And Elimina la columna numero <eliminarColumna>
    Examples:
      | eliminarColumna | primerNombre | apellido | email               | edad | salario | departamento |
      | 0               | jhonatan     | ortega   | jhon.93@yopmail.com | 20   | 150000  | Valle        |

  Scenario Outline: Puede seleccionar una fecha
    Given  El usuario ingresa a la pagina demoqa
    And Selecciona el card con la opcion Widgets
    And Da click en la opcion Date Picker
    And Selecciona la fecha <fecha>
    And Selecciona fecha con hora <fechaHora>
    Examples:
      | fecha      | fechaHora                 |
      | 03/21/2020 | January 21, 1993 11:22 PM |

  Scenario: Interaccion con alertas
    Given  El usuario ingresa a la pagina demoqa
    And Selecciona el card con la opcion Alerts
    And Da click en la opcion Alerts
    And Maneja la primera alerta
    And Maneja la alerta de cinco segundos
    And Maneja la alerta confirm box
    And Maneja la alerta promt box

