Feature: Navegando Saucelabs
  Yo como usuario quiero ingresar a saucelabs para validar mis credenciales de acceso

  @base
  Scenario:Login
    Given ingresa a la apk saucelabs
    When Digita las credenciales de acceso "standard_user" y "secret_sauce"
    Then verifica que ingreso correctamente