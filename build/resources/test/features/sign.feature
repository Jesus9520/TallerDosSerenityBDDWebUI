# new feature
# Tags: optional

Feature: crear usuario
  como persona natural
  quiero crear un usuario para ingresar a la pagina
  para tener mi perfir de usuario

  Scenario: registrar usuario
    Given la persona crea el usuario
    When deligencio el formulario de registro
    Then quedo registro en la bases de datos de la pagina

    Scenario: registro informacion incompleta
      Given la persona desea crear un usuario
      When no diligencio el formulario de la manera correcta
      Then no se crea registro