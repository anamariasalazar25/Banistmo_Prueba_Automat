Feature: Automatización de descarga del documento en Banistmo

	@EscenarioPrincipal
  Scenario: Acceso al sitio web de banistmo y realizar el evento
    Given que el usuario accede a la página de Banistmo
    When el usuario selecciona la opción "aprender es fácil" en el pie de la página
    And el usuario selecciona la opción "Descubre más" en el apartado "Legales"
    And el usuario selecciona la opción "Conoce más" en el apartado "FATCA & CRS"
    And el usuario selecciona el botón PDF del documento "PJ-Autocertificación unificado- Fatca y CRS.pdf"
    Then el usuario valida que el documento generado sea el correcto